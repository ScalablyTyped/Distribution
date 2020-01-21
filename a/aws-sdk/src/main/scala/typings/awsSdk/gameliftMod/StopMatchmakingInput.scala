package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopMatchmakingInput extends js.Object {
  /**
    * A unique identifier for a matchmaking ticket.
    */
  var TicketId: MatchmakingIdStringModel = js.native
}

object StopMatchmakingInput {
  @scala.inline
  def apply(TicketId: MatchmakingIdStringModel): StopMatchmakingInput = {
    val __obj = js.Dynamic.literal(TicketId = TicketId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopMatchmakingInput]
  }
}

