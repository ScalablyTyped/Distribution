package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceptMatchInput extends StObject {
  
  /**
    * Player response to the proposed match.
    */
  var AcceptanceType: typings.awsSdk.gameliftMod.AcceptanceType = js.native
  
  /**
    * A unique identifier for a player delivering the response. This parameter can include one or multiple player IDs.
    */
  var PlayerIds: StringList = js.native
  
  /**
    * A unique identifier for a matchmaking ticket. The ticket must be in status REQUIRES_ACCEPTANCE; otherwise this request will fail.
    */
  var TicketId: MatchmakingIdStringModel = js.native
}
object AcceptMatchInput {
  
  @scala.inline
  def apply(AcceptanceType: AcceptanceType, PlayerIds: StringList, TicketId: MatchmakingIdStringModel): AcceptMatchInput = {
    val __obj = js.Dynamic.literal(AcceptanceType = AcceptanceType.asInstanceOf[js.Any], PlayerIds = PlayerIds.asInstanceOf[js.Any], TicketId = TicketId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptMatchInput]
  }
  
  @scala.inline
  implicit class AcceptMatchInputMutableBuilder[Self <: AcceptMatchInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptanceType(value: AcceptanceType): Self = StObject.set(x, "AcceptanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerIds(value: StringList): Self = StObject.set(x, "PlayerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerIdsVarargs(value: NonZeroAndMaxString*): Self = StObject.set(x, "PlayerIds", js.Array(value :_*))
    
    @scala.inline
    def setTicketId(value: MatchmakingIdStringModel): Self = StObject.set(x, "TicketId", value.asInstanceOf[js.Any])
  }
}
