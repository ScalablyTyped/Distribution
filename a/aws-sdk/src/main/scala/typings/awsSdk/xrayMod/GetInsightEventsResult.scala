package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInsightEventsResult extends StObject {
  
  /**
    * A detailed description of the event. This includes the time of the event, client and root cause impact statistics, and the top anomalous service at the time of the event.
    */
  var InsightEvents: js.UndefOr[InsightEventList] = js.native
  
  /**
    * Use this token to retrieve the next page of insight events.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object GetInsightEventsResult {
  
  @scala.inline
  def apply(): GetInsightEventsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInsightEventsResult]
  }
  
  @scala.inline
  implicit class GetInsightEventsResultMutableBuilder[Self <: GetInsightEventsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsightEvents(value: InsightEventList): Self = StObject.set(x, "InsightEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsightEventsUndefined: Self = StObject.set(x, "InsightEvents", js.undefined)
    
    @scala.inline
    def setInsightEventsVarargs(value: InsightEvent*): Self = StObject.set(x, "InsightEvents", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
