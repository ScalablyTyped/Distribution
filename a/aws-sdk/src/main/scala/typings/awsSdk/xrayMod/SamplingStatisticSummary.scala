package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SamplingStatisticSummary extends StObject {
  
  /**
    * The number of requests recorded with borrowed reservoir quota.
    */
  var BorrowCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of requests that matched the rule.
    */
  var RequestCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The name of the sampling rule.
    */
  var RuleName: js.UndefOr[String] = js.undefined
  
  /**
    * The number of requests recorded.
    */
  var SampledCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The start time of the reporting window.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.xrayMod.Timestamp] = js.undefined
}
object SamplingStatisticSummary {
  
  @scala.inline
  def apply(): SamplingStatisticSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SamplingStatisticSummary]
  }
  
  @scala.inline
  implicit class SamplingStatisticSummaryMutableBuilder[Self <: SamplingStatisticSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorrowCount(value: Integer): Self = StObject.set(x, "BorrowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorrowCountUndefined: Self = StObject.set(x, "BorrowCount", js.undefined)
    
    @scala.inline
    def setRequestCount(value: Integer): Self = StObject.set(x, "RequestCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestCountUndefined: Self = StObject.set(x, "RequestCount", js.undefined)
    
    @scala.inline
    def setRuleName(value: String): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleNameUndefined: Self = StObject.set(x, "RuleName", js.undefined)
    
    @scala.inline
    def setSampledCount(value: Integer): Self = StObject.set(x, "SampledCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampledCountUndefined: Self = StObject.set(x, "SampledCount", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
