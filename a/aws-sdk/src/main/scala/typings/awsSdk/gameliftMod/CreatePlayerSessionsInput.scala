package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePlayerSessionsInput extends js.Object {
  
  /**
    * A unique identifier for the game session to add players to.
    */
  var GameSessionId: ArnStringModel = js.native
  
  /**
    * Map of string pairs, each specifying a player ID and a set of developer-defined information related to the player. Amazon GameLift does not use this data, so it can be formatted as needed for use in the game. Player data strings for player IDs not included in the PlayerIds parameter are ignored. 
    */
  var PlayerDataMap: js.UndefOr[typings.awsSdk.gameliftMod.PlayerDataMap] = js.native
  
  /**
    * List of unique identifiers for the players to be added.
    */
  var PlayerIds: PlayerIdList = js.native
}
object CreatePlayerSessionsInput {
  
  @scala.inline
  def apply(GameSessionId: ArnStringModel, PlayerIds: PlayerIdList): CreatePlayerSessionsInput = {
    val __obj = js.Dynamic.literal(GameSessionId = GameSessionId.asInstanceOf[js.Any], PlayerIds = PlayerIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlayerSessionsInput]
  }
  
  @scala.inline
  implicit class CreatePlayerSessionsInputOps[Self <: CreatePlayerSessionsInput] (val x: Self) extends AnyVal {
    
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
    def setGameSessionId(value: ArnStringModel): Self = this.set("GameSessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerIdsVarargs(value: NonZeroAndMaxString*): Self = this.set("PlayerIds", js.Array(value :_*))
    
    @scala.inline
    def setPlayerIds(value: PlayerIdList): Self = this.set("PlayerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerDataMap(value: PlayerDataMap): Self = this.set("PlayerDataMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayerDataMap: Self = this.set("PlayerDataMap", js.undefined)
  }
}
