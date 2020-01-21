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
}

