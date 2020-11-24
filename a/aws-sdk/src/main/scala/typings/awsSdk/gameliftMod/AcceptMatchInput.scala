package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceptMatchInput extends js.Object {
  
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
  implicit class AcceptMatchInputOps[Self <: AcceptMatchInput] (val x: Self) extends AnyVal {
    
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
    def setAcceptanceType(value: AcceptanceType): Self = this.set("AcceptanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerIdsVarargs(value: NonZeroAndMaxString*): Self = this.set("PlayerIds", js.Array(value :_*))
    
    @scala.inline
    def setPlayerIds(value: StringList): Self = this.set("PlayerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicketId(value: MatchmakingIdStringModel): Self = this.set("TicketId", value.asInstanceOf[js.Any])
  }
}
