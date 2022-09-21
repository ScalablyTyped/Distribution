package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInsightEventsResult extends StObject {
  
  /**
    * A detailed description of the event. This includes the time of the event, client and root cause impact statistics, and the top anomalous service at the time of the event.
    */
  var InsightEvents: js.UndefOr[InsightEventList] = js.undefined
  
  /**
    * Use this token to retrieve the next page of insight events.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object GetInsightEventsResult {
  
  inline def apply(): GetInsightEventsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInsightEventsResult]
  }
  
  extension [Self <: GetInsightEventsResult](x: Self) {
    
    inline def setInsightEvents(value: InsightEventList): Self = StObject.set(x, "InsightEvents", value.asInstanceOf[js.Any])
    
    inline def setInsightEventsUndefined: Self = StObject.set(x, "InsightEvents", js.undefined)
    
    inline def setInsightEventsVarargs(value: InsightEvent*): Self = StObject.set(x, "InsightEvents", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
