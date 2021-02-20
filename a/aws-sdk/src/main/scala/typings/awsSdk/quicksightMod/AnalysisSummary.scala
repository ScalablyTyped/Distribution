package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalysisSummary extends StObject {
  
  /**
    * The ID of the analysis. This ID displays in the URL.
    */
  var AnalysisId: js.UndefOr[RestrictiveResourceId] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the analysis.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  
  /**
    * The time that the analysis was created.
    */
  var CreatedTime: js.UndefOr[Timestamp_] = js.native
  
  /**
    * The time that the analysis was last updated.
    */
  var LastUpdatedTime: js.UndefOr[Timestamp_] = js.native
  
  /**
    * The name of the analysis. This name is displayed in the QuickSight console. 
    */
  var Name: js.UndefOr[AnalysisName] = js.native
  
  /**
    * The last known status for the analysis.
    */
  var Status: js.UndefOr[ResourceStatus] = js.native
}
object AnalysisSummary {
  
  @scala.inline
  def apply(): AnalysisSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisSummary]
  }
  
  @scala.inline
  implicit class AnalysisSummaryMutableBuilder[Self <: AnalysisSummary] (val x: Self) extends AnyVal {
    
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
    def setLastUpdatedTime(value: Timestamp_): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    @scala.inline
    def setName(value: AnalysisName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setStatus(value: ResourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
