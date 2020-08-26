package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMatchmakingInput extends js.Object {
  /**
    * A unique identifier for a matchmaking ticket. You can include up to 10 ID values. 
    */
  var TicketIds: MatchmakingIdList = js.native
}

object DescribeMatchmakingInput {
  @scala.inline
  def apply(TicketIds: MatchmakingIdList): DescribeMatchmakingInput = {
    val __obj = js.Dynamic.literal(TicketIds = TicketIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMatchmakingInput]
  }
  @scala.inline
  implicit class DescribeMatchmakingInputOps[Self <: DescribeMatchmakingInput] (val x: Self) extends AnyVal {
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
    def setTicketIdsVarargs(value: MatchmakingIdStringModel*): Self = this.set("TicketIds", js.Array(value :_*))
    @scala.inline
    def setTicketIds(value: MatchmakingIdList): Self = this.set("TicketIds", value.asInstanceOf[js.Any])
  }
  
}

