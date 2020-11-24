package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateVersion extends js.Object {
  
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
  implicit class TemplateVersionOps[Self <: TemplateVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreatedTime(value: Timestamp_): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    
    @scala.inline
    def setDataSetConfigurationsVarargs(value: DataSetConfiguration*): Self = this.set("DataSetConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setDataSetConfigurations(value: DataSetConfigurationList): Self = this.set("DataSetConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSetConfigurations: Self = this.set("DataSetConfigurations", js.undefined)
    
    @scala.inline
    def setDescription(value: VersionDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: TemplateError*): Self = this.set("Errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: TemplateErrorList): Self = this.set("Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("Errors", js.undefined)
    
    @scala.inline
    def setSheetsVarargs(value: Sheet*): Self = this.set("Sheets", js.Array(value :_*))
    
    @scala.inline
    def setSheets(value: SheetList): Self = this.set("Sheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheets: Self = this.set("Sheets", js.undefined)
    
    @scala.inline
    def setSourceEntityArn(value: Arn): Self = this.set("SourceEntityArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceEntityArn: Self = this.set("SourceEntityArn", js.undefined)
    
    @scala.inline
    def setStatus(value: ResourceStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setThemeArn(value: Arn): Self = this.set("ThemeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThemeArn: Self = this.set("ThemeArn", js.undefined)
    
    @scala.inline
    def setVersionNumber(value: VersionNumber): Self = this.set("VersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionNumber: Self = this.set("VersionNumber", js.undefined)
  }
}
