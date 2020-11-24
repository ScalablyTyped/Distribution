package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Analysis extends js.Object {
  
  /**
    * The ID of the analysis.
    */
  var AnalysisId: js.UndefOr[RestrictiveResourceId] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the analysis.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  
  /**
    * The time that the analysis was created.
    */
  var CreatedTime: js.UndefOr[Timestamp_] = js.native
  
  /**
    * The ARNs of the datasets of the analysis.
    */
  var DataSetArns: js.UndefOr[DataSetArnsList] = js.native
  
  /**
    * Errors associated with the analysis.
    */
  var Errors: js.UndefOr[AnalysisErrorList] = js.native
  
  /**
    * The time that the analysis was last updated.
    */
  var LastUpdatedTime: js.UndefOr[Timestamp_] = js.native
  
  /**
    * The descriptive name of the analysis.
    */
  var Name: js.UndefOr[AnalysisName] = js.native
  
  /**
    * A list of the associated sheets with the unique identifier and name of each sheet.
    */
  var Sheets: js.UndefOr[SheetList] = js.native
  
  /**
    * Status associated with the analysis.
    */
  var Status: js.UndefOr[ResourceStatus] = js.native
  
  /**
    * The ARN of the theme of the analysis.
    */
  var ThemeArn: js.UndefOr[Arn] = js.native
}
object Analysis {
  
  @scala.inline
  def apply(): Analysis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Analysis]
  }
  
  @scala.inline
  implicit class AnalysisOps[Self <: Analysis] (val x: Self) extends AnyVal {
    
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
    def setAnalysisId(value: RestrictiveResourceId): Self = this.set("AnalysisId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalysisId: Self = this.set("AnalysisId", js.undefined)
    
    @scala.inline
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: Timestamp_): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    
    @scala.inline
    def setDataSetArnsVarargs(value: Arn*): Self = this.set("DataSetArns", js.Array(value :_*))
    
    @scala.inline
    def setDataSetArns(value: DataSetArnsList): Self = this.set("DataSetArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSetArns: Self = this.set("DataSetArns", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: AnalysisError*): Self = this.set("Errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: AnalysisErrorList): Self = this.set("Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("Errors", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: Timestamp_): Self = this.set("LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("LastUpdatedTime", js.undefined)
    
    @scala.inline
    def setName(value: AnalysisName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setSheetsVarargs(value: Sheet*): Self = this.set("Sheets", js.Array(value :_*))
    
    @scala.inline
    def setSheets(value: SheetList): Self = this.set("Sheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheets: Self = this.set("Sheets", js.undefined)
    
    @scala.inline
    def setStatus(value: ResourceStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setThemeArn(value: Arn): Self = this.set("ThemeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThemeArn: Self = this.set("ThemeArn", js.undefined)
  }
}
