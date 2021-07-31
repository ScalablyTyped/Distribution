package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInsightImpactGraphResult extends StObject {
  
  /**
    * The provided end time. 
    */
  var EndTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The insight's unique identifier.
    */
  var InsightId: js.UndefOr[typings.awsSdk.xrayMod.InsightId] = js.undefined
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * The time, in Unix seconds, at which the service graph ended.
    */
  var ServiceGraphEndTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The time, in Unix seconds, at which the service graph started.
    */
  var ServiceGraphStartTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The AWS instrumented services related to the insight.
    */
  var Services: js.UndefOr[InsightImpactGraphServiceList] = js.undefined
  
  /**
    * The provided start time.
    */
  var StartTime: js.UndefOr[Timestamp] = js.undefined
}
object GetInsightImpactGraphResult {
  
  @scala.inline
  def apply(): GetInsightImpactGraphResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInsightImpactGraphResult]
  }
  
  @scala.inline
  implicit class GetInsightImpactGraphResultMutableBuilder[Self <: GetInsightImpactGraphResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setInsightId(value: InsightId): Self = StObject.set(x, "InsightId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsightIdUndefined: Self = StObject.set(x, "InsightId", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setServiceGraphEndTime(value: Timestamp): Self = StObject.set(x, "ServiceGraphEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceGraphEndTimeUndefined: Self = StObject.set(x, "ServiceGraphEndTime", js.undefined)
    
    @scala.inline
    def setServiceGraphStartTime(value: Timestamp): Self = StObject.set(x, "ServiceGraphStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceGraphStartTimeUndefined: Self = StObject.set(x, "ServiceGraphStartTime", js.undefined)
    
    @scala.inline
    def setServices(value: InsightImpactGraphServiceList): Self = StObject.set(x, "Services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesUndefined: Self = StObject.set(x, "Services", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: InsightImpactGraphService*): Self = StObject.set(x, "Services", js.Array(value :_*))
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
