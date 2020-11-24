package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePlayerSessionInput extends js.Object {
  
  /**
    * A unique identifier for the game session to add a player to.
    */
  var GameSessionId: ArnStringModel = js.native
  
  /**
    * Developer-defined information related to a player. Amazon GameLift does not use this data, so it can be formatted as needed for use in the game.
    */
  var PlayerData: js.UndefOr[typings.awsSdk.gameliftMod.PlayerData] = js.native
  
  /**
    * A unique identifier for a player. Player IDs are developer-defined.
    */
  var PlayerId: NonZeroAndMaxString = js.native
}
object CreatePlayerSessionInput {
  
  @scala.inline
  def apply(GameSessionId: ArnStringModel, PlayerId: NonZeroAndMaxString): CreatePlayerSessionInput = {
    val __obj = js.Dynamic.literal(GameSessionId = GameSessionId.asInstanceOf[js.Any], PlayerId = PlayerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlayerSessionInput]
  }
  
  @scala.inline
  implicit class CreatePlayerSessionInputOps[Self <: CreatePlayerSessionInput] (val x: Self) extends AnyVal {
    
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
    def setPlayerId(value: NonZeroAndMaxString): Self = this.set("PlayerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerData(value: PlayerData): Self = this.set("PlayerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayerData: Self = this.set("PlayerData", js.undefined)
  }
}
