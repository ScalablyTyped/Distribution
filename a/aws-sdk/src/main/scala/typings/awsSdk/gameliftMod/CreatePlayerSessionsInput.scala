package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePlayerSessionsInput extends StObject {
  
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
  implicit class CreatePlayerSessionsInputMutableBuilder[Self <: CreatePlayerSessionsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameSessionId(value: ArnStringModel): Self = StObject.set(x, "GameSessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerDataMap(value: PlayerDataMap): Self = StObject.set(x, "PlayerDataMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerDataMapUndefined: Self = StObject.set(x, "PlayerDataMap", js.undefined)
    
    @scala.inline
    def setPlayerIds(value: PlayerIdList): Self = StObject.set(x, "PlayerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerIdsVarargs(value: NonZeroAndMaxString*): Self = StObject.set(x, "PlayerIds", js.Array(value :_*))
  }
}
