package typings.awsSdk.iotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTunnelsResponse extends js.Object {
  /**
    * A token to used to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A short description of the tunnels in an AWS account.
    */
  var tunnelSummaries: js.UndefOr[TunnelSummaryList] = js.native
}

object ListTunnelsResponse {
  @scala.inline
  def apply(): ListTunnelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTunnelsResponse]
  }
  @scala.inline
  implicit class ListTunnelsResponseOps[Self <: ListTunnelsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setTunnelSummariesVarargs(value: TunnelSummary*): Self = this.set("tunnelSummaries", js.Array(value :_*))
    @scala.inline
    def setTunnelSummaries(value: TunnelSummaryList): Self = this.set("tunnelSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnelSummaries: Self = this.set("tunnelSummaries", js.undefined)
  }
  
}

