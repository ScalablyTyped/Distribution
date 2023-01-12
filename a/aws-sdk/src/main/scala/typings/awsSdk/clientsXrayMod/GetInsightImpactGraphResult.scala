package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInsightImpactGraphResult extends StObject {
  
  /**
    * The provided end time. 
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The insight's unique identifier.
    */
  var InsightId: js.UndefOr[typings.awsSdk.clientsXrayMod.InsightId] = js.undefined
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * The time, in Unix seconds, at which the service graph ended.
    */
  var ServiceGraphEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time, in Unix seconds, at which the service graph started.
    */
  var ServiceGraphStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Web Services instrumented services related to the insight.
    */
  var Services: js.UndefOr[InsightImpactGraphServiceList] = js.undefined
  
  /**
    * The provided start time.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object GetInsightImpactGraphResult {
  
  inline def apply(): GetInsightImpactGraphResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInsightImpactGraphResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInsightImpactGraphResult] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setInsightId(value: InsightId): Self = StObject.set(x, "InsightId", value.asInstanceOf[js.Any])
    
    inline def setInsightIdUndefined: Self = StObject.set(x, "InsightId", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServiceGraphEndTime(value: js.Date): Self = StObject.set(x, "ServiceGraphEndTime", value.asInstanceOf[js.Any])
    
    inline def setServiceGraphEndTimeUndefined: Self = StObject.set(x, "ServiceGraphEndTime", js.undefined)
    
    inline def setServiceGraphStartTime(value: js.Date): Self = StObject.set(x, "ServiceGraphStartTime", value.asInstanceOf[js.Any])
    
    inline def setServiceGraphStartTimeUndefined: Self = StObject.set(x, "ServiceGraphStartTime", js.undefined)
    
    inline def setServices(value: InsightImpactGraphServiceList): Self = StObject.set(x, "Services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "Services", js.undefined)
    
    inline def setServicesVarargs(value: InsightImpactGraphService*): Self = StObject.set(x, "Services", js.Array(value*))
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
