package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePlayerSessionInput extends StObject {
  
  /**
    * A unique identifier for the game session to add a player to.
    */
  var GameSessionId: ArnStringModel
  
  /**
    * Developer-defined information related to a player. Amazon GameLift does not use this data, so it can be formatted as needed for use in the game.
    */
  var PlayerData: js.UndefOr[typings.awsSdk.gameliftMod.PlayerData] = js.undefined
  
  /**
    * A unique identifier for a player. Player IDs are developer-defined.
    */
  var PlayerId: NonZeroAndMaxString
}
object CreatePlayerSessionInput {
  
  @scala.inline
  def apply(GameSessionId: ArnStringModel, PlayerId: NonZeroAndMaxString): CreatePlayerSessionInput = {
    val __obj = js.Dynamic.literal(GameSessionId = GameSessionId.asInstanceOf[js.Any], PlayerId = PlayerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlayerSessionInput]
  }
  
  @scala.inline
  implicit class CreatePlayerSessionInputMutableBuilder[Self <: CreatePlayerSessionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameSessionId(value: ArnStringModel): Self = StObject.set(x, "GameSessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerData(value: PlayerData): Self = StObject.set(x, "PlayerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerDataUndefined: Self = StObject.set(x, "PlayerData", js.undefined)
    
    @scala.inline
    def setPlayerId(value: NonZeroAndMaxString): Self = StObject.set(x, "PlayerId", value.asInstanceOf[js.Any])
  }
}
