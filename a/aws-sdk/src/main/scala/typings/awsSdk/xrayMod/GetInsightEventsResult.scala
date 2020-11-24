package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInsightEventsResult extends js.Object {
  
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
  implicit class GetInsightEventsResultOps[Self <: GetInsightEventsResult] (val x: Self) extends AnyVal {
    
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
    def setInsightEventsVarargs(value: InsightEvent*): Self = this.set("InsightEvents", js.Array(value :_*))
    
    @scala.inline
    def setInsightEvents(value: InsightEventList): Self = this.set("InsightEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsightEvents: Self = this.set("InsightEvents", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
