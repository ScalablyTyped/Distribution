package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopMatchmakingInput extends StObject {
  
  /**
    * A unique identifier for a matchmaking ticket.
    */
  var TicketId: MatchmakingIdStringModel
}
object StopMatchmakingInput {
  
  @scala.inline
  def apply(TicketId: MatchmakingIdStringModel): StopMatchmakingInput = {
    val __obj = js.Dynamic.literal(TicketId = TicketId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopMatchmakingInput]
  }
  
  @scala.inline
  implicit class StopMatchmakingInputMutableBuilder[Self <: StopMatchmakingInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTicketId(value: MatchmakingIdStringModel): Self = StObject.set(x, "TicketId", value.asInstanceOf[js.Any])
  }
}
