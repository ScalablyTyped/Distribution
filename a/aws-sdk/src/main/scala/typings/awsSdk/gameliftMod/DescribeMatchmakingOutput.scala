package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMatchmakingOutput extends js.Object {
  /**
    * A collection of existing matchmaking ticket objects matching the request.
    */
  var TicketList: js.UndefOr[MatchmakingTicketList] = js.native
}

object DescribeMatchmakingOutput {
  @scala.inline
  def apply(): DescribeMatchmakingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMatchmakingOutput]
  }
  @scala.inline
  implicit class DescribeMatchmakingOutputOps[Self <: DescribeMatchmakingOutput] (val x: Self) extends AnyVal {
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
    def setTicketListVarargs(value: MatchmakingTicket*): Self = this.set("TicketList", js.Array(value :_*))
    @scala.inline
    def setTicketList(value: MatchmakingTicketList): Self = this.set("TicketList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTicketList: Self = this.set("TicketList", js.undefined)
  }
  
}

