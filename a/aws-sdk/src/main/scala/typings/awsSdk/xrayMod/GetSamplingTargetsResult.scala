package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSamplingTargetsResult extends StObject {
  
  /**
    * The last time a user changed the sampling rule configuration. If the sampling rule configuration changed since the service last retrieved it, the service should call GetSamplingRules to get the latest version.
    */
  var LastRuleModification: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * Updated rules that the service should use to sample requests.
    */
  var SamplingTargetDocuments: js.UndefOr[SamplingTargetDocumentList] = js.undefined
  
  /**
    * Information about SamplingStatisticsDocument that X-Ray could not process.
    */
  var UnprocessedStatistics: js.UndefOr[UnprocessedStatisticsList] = js.undefined
}
object GetSamplingTargetsResult {
  
  @scala.inline
  def apply(): GetSamplingTargetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSamplingTargetsResult]
  }
  
  @scala.inline
  implicit class GetSamplingTargetsResultMutableBuilder[Self <: GetSamplingTargetsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastRuleModification(value: Timestamp): Self = StObject.set(x, "LastRuleModification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRuleModificationUndefined: Self = StObject.set(x, "LastRuleModification", js.undefined)
    
    @scala.inline
    def setSamplingTargetDocuments(value: SamplingTargetDocumentList): Self = StObject.set(x, "SamplingTargetDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingTargetDocumentsUndefined: Self = StObject.set(x, "SamplingTargetDocuments", js.undefined)
    
    @scala.inline
    def setSamplingTargetDocumentsVarargs(value: SamplingTargetDocument*): Self = StObject.set(x, "SamplingTargetDocuments", js.Array(value :_*))
    
    @scala.inline
    def setUnprocessedStatistics(value: UnprocessedStatisticsList): Self = StObject.set(x, "UnprocessedStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedStatisticsUndefined: Self = StObject.set(x, "UnprocessedStatistics", js.undefined)
    
    @scala.inline
    def setUnprocessedStatisticsVarargs(value: UnprocessedStatistics*): Self = StObject.set(x, "UnprocessedStatistics", js.Array(value :_*))
  }
}
