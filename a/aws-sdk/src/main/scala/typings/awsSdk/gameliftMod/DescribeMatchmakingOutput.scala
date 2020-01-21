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
  def apply(TicketList: MatchmakingTicketList = null): DescribeMatchmakingOutput = {
    val __obj = js.Dynamic.literal()
    if (TicketList != null) __obj.updateDynamic("TicketList")(TicketList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMatchmakingOutput]
  }
}

