package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateVersion extends StObject {
  
  /**
    * The time that this template version was created.
    */
  var CreatedTime: js.UndefOr[Timestamp_] = js.native
  
  /**
    * Schema of the dataset identified by the placeholder. Any dashboard created from this template should be bound to new datasets matching the same schema described through this API operation.
    */
  var DataSetConfigurations: js.UndefOr[DataSetConfigurationList] = js.native
  
  /**
    * The description of the template.
    */
  var Description: js.UndefOr[VersionDescription] = js.native
  
  /**
    * Errors associated with this template version.
    */
  var Errors: js.UndefOr[TemplateErrorList] = js.native
  
  /**
    * A list of the associated sheets with the unique identifier and name of each sheet.
    */
  var Sheets: js.UndefOr[SheetList] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of an analysis or template that was used to create this template.
    */
  var SourceEntityArn: js.UndefOr[Arn] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[ResourceStatus] = js.native
  
  /**
    * The ARN of the theme associated with this version of the template.
    */
  var ThemeArn: js.UndefOr[Arn] = js.native
  
  /**
    * The version number of the template version.
    */
  var VersionNumber: js.UndefOr[typings.awsSdk.quicksightMod.VersionNumber] = js.native
}
object TemplateVersion {
  
  @scala.inline
  def apply(): TemplateVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateVersion]
  }
  
  @scala.inline
  implicit class TemplateVersionMutableBuilder[Self <: TemplateVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedTime(value: Timestamp_): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setDataSetConfigurations(value: DataSetConfigurationList): Self = StObject.set(x, "DataSetConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetConfigurationsUndefined: Self = StObject.set(x, "DataSetConfigurations", js.undefined)
    
    @scala.inline
    def setDataSetConfigurationsVarargs(value: DataSetConfiguration*): Self = StObject.set(x, "DataSetConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: VersionDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setErrors(value: TemplateErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: TemplateError*): Self = StObject.set(x, "Errors", js.Array(value :_*))
    
    @scala.inline
    def setSheets(value: SheetList): Self = StObject.set(x, "Sheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetsUndefined: Self = StObject.set(x, "Sheets", js.undefined)
    
    @scala.inline
    def setSheetsVarargs(value: Sheet*): Self = StObject.set(x, "Sheets", js.Array(value :_*))
    
    @scala.inline
    def setSourceEntityArn(value: Arn): Self = StObject.set(x, "SourceEntityArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceEntityArnUndefined: Self = StObject.set(x, "SourceEntityArn", js.undefined)
    
    @scala.inline
    def setStatus(value: ResourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setThemeArn(value: Arn): Self = StObject.set(x, "ThemeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeArnUndefined: Self = StObject.set(x, "ThemeArn", js.undefined)
    
    @scala.inline
    def setVersionNumber(value: VersionNumber): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
