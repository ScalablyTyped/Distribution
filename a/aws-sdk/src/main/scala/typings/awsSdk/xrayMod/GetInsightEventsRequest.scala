package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInsightEventsRequest extends js.Object {
  
  /**
    * The insight's unique identifier. Use the GetInsightSummaries action to retrieve an InsightId.
    */
  var InsightId: typings.awsSdk.xrayMod.InsightId = js.native
  
  /**
    * Used to retrieve at most the specified value of events.
    */
  var MaxResults: js.UndefOr[GetInsightEventsMaxResults] = js.native
  
  /**
    * Specify the pagination token returned by a previous request to retrieve the next page of events. 
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object GetInsightEventsRequest {
  
  @scala.inline
  def apply(InsightId: InsightId): GetInsightEventsRequest = {
    val __obj = js.Dynamic.literal(InsightId = InsightId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInsightEventsRequest]
  }
  
  @scala.inline
  implicit class GetInsightEventsRequestOps[Self <: GetInsightEventsRequest] (val x: Self) extends AnyVal {
    
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
    def setInsightId(value: InsightId): Self = this.set("InsightId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: GetInsightEventsMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
