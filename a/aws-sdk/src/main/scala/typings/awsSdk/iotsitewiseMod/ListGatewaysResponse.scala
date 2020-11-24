package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGatewaysResponse extends js.Object {
  
  /**
    * A list that summarizes each gateway.
    */
  var gatewaySummaries: GatewaySummaries = js.native
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListGatewaysResponse {
  
  @scala.inline
  def apply(gatewaySummaries: GatewaySummaries): ListGatewaysResponse = {
    val __obj = js.Dynamic.literal(gatewaySummaries = gatewaySummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGatewaysResponse]
  }
  
  @scala.inline
  implicit class ListGatewaysResponseOps[Self <: ListGatewaysResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGatewaySummariesVarargs(value: GatewaySummary*): Self = this.set("gatewaySummaries", js.Array(value :_*))
    
    @scala.inline
    def setGatewaySummaries(value: GatewaySummaries): Self = this.set("gatewaySummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
