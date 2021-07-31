package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashboardVersion extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.undefined
  
  /**
    * The time that this dashboard version was created.
    */
  var CreatedTime: js.UndefOr[Timestamp_] = js.undefined
  
  /**
    * The Amazon Resource Numbers (ARNs) for the datasets that are associated with this version of the dashboard.
    */
  var DataSetArns: js.UndefOr[DataSetArnsList] = js.undefined
  
  /**
    * Description.
    */
  var Description: js.UndefOr[VersionDescription] = js.undefined
  
  /**
    * Errors associated with this dashboard version.
    */
  var Errors: js.UndefOr[DashboardErrorList] = js.undefined
  
  /**
    * A list of the associated sheets with the unique identifier and name of each sheet.
    */
  var Sheets: js.UndefOr[SheetList] = js.undefined
  
  /**
    * Source entity ARN.
    */
  var SourceEntityArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[ResourceStatus] = js.undefined
  
  /**
    * The ARN of the theme associated with a version of the dashboard.
    */
  var ThemeArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * Version number for this version of the dashboard.
    */
  var VersionNumber: js.UndefOr[typings.awsSdk.quicksightMod.VersionNumber] = js.undefined
}
object DashboardVersion {
  
  @scala.inline
  def apply(): DashboardVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashboardVersion]
  }
  
  @scala.inline
  implicit class DashboardVersionMutableBuilder[Self <: DashboardVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: Timestamp_): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setDataSetArns(value: DataSetArnsList): Self = StObject.set(x, "DataSetArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetArnsUndefined: Self = StObject.set(x, "DataSetArns", js.undefined)
    
    @scala.inline
    def setDataSetArnsVarargs(value: Arn*): Self = StObject.set(x, "DataSetArns", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: VersionDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setErrors(value: DashboardErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: DashboardError*): Self = StObject.set(x, "Errors", js.Array(value :_*))
    
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
