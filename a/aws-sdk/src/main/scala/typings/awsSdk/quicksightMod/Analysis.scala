package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Analysis extends StObject {
  
  /**
    * The ID of the analysis.
    */
  var AnalysisId: js.UndefOr[RestrictiveResourceId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the analysis.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.undefined
  
  /**
    * The time that the analysis was created.
    */
  var CreatedTime: js.UndefOr[Timestamp_] = js.undefined
  
  /**
    * The ARNs of the datasets of the analysis.
    */
  var DataSetArns: js.UndefOr[DataSetArnsList] = js.undefined
  
  /**
    * Errors associated with the analysis.
    */
  var Errors: js.UndefOr[AnalysisErrorList] = js.undefined
  
  /**
    * The time that the analysis was last updated.
    */
  var LastUpdatedTime: js.UndefOr[Timestamp_] = js.undefined
  
  /**
    * The descriptive name of the analysis.
    */
  var Name: js.UndefOr[AnalysisName] = js.undefined
  
  /**
    * A list of the associated sheets with the unique identifier and name of each sheet.
    */
  var Sheets: js.UndefOr[SheetList] = js.undefined
  
  /**
    * Status associated with the analysis.
    */
  var Status: js.UndefOr[ResourceStatus] = js.undefined
  
  /**
    * The ARN of the theme of the analysis.
    */
  var ThemeArn: js.UndefOr[Arn] = js.undefined
}
object Analysis {
  
  @scala.inline
  def apply(): Analysis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Analysis]
  }
  
  @scala.inline
  implicit class AnalysisMutableBuilder[Self <: Analysis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisId(value: RestrictiveResourceId): Self = StObject.set(x, "AnalysisId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalysisIdUndefined: Self = StObject.set(x, "AnalysisId", js.undefined)
    
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
    def setErrors(value: AnalysisErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: AnalysisError*): Self = StObject.set(x, "Errors", js.Array(value :_*))
    
    @scala.inline
    def setLastUpdatedTime(value: Timestamp_): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    @scala.inline
    def setName(value: AnalysisName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setSheets(value: SheetList): Self = StObject.set(x, "Sheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetsUndefined: Self = StObject.set(x, "Sheets", js.undefined)
    
    @scala.inline
    def setSheetsVarargs(value: Sheet*): Self = StObject.set(x, "Sheets", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: ResourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setThemeArn(value: Arn): Self = StObject.set(x, "ThemeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeArnUndefined: Self = StObject.set(x, "ThemeArn", js.undefined)
  }
}
