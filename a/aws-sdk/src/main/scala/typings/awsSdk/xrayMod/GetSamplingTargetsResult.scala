package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSamplingTargetsResult extends StObject {
  
  /**
    * The last time a user changed the sampling rule configuration. If the sampling rule configuration changed since the service last retrieved it, the service should call GetSamplingRules to get the latest version.
    */
  var LastRuleModification: js.UndefOr[js.Date] = js.undefined
  
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
  
  inline def apply(): GetSamplingTargetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSamplingTargetsResult]
  }
  
  extension [Self <: GetSamplingTargetsResult](x: Self) {
    
    inline def setLastRuleModification(value: js.Date): Self = StObject.set(x, "LastRuleModification", value.asInstanceOf[js.Any])
    
    inline def setLastRuleModificationUndefined: Self = StObject.set(x, "LastRuleModification", js.undefined)
    
    inline def setSamplingTargetDocuments(value: SamplingTargetDocumentList): Self = StObject.set(x, "SamplingTargetDocuments", value.asInstanceOf[js.Any])
    
    inline def setSamplingTargetDocumentsUndefined: Self = StObject.set(x, "SamplingTargetDocuments", js.undefined)
    
    inline def setSamplingTargetDocumentsVarargs(value: SamplingTargetDocument*): Self = StObject.set(x, "SamplingTargetDocuments", js.Array(value*))
    
    inline def setUnprocessedStatistics(value: UnprocessedStatisticsList): Self = StObject.set(x, "UnprocessedStatistics", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedStatisticsUndefined: Self = StObject.set(x, "UnprocessedStatistics", js.undefined)
    
    inline def setUnprocessedStatisticsVarargs(value: UnprocessedStatistics*): Self = StObject.set(x, "UnprocessedStatistics", js.Array(value*))
  }
}
