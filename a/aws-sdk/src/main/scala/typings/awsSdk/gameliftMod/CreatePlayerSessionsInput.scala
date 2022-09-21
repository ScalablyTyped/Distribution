package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePlayerSessionsInput extends StObject {
  
  /**
    * A unique identifier for the game session to add players to.
    */
  var GameSessionId: ArnStringModel
  
  /**
    * Map of string pairs, each specifying a player ID and a set of developer-defined information related to the player. Amazon GameLift does not use this data, so it can be formatted as needed for use in the game. Any player data strings for player IDs that are not included in the PlayerIds parameter are ignored. 
    */
  var PlayerDataMap: js.UndefOr[typings.awsSdk.gameliftMod.PlayerDataMap] = js.undefined
  
  /**
    * List of unique identifiers for the players to be added.
    */
  var PlayerIds: PlayerIdList
}
object CreatePlayerSessionsInput {
  
  inline def apply(GameSessionId: ArnStringModel, PlayerIds: PlayerIdList): CreatePlayerSessionsInput = {
    val __obj = js.Dynamic.literal(GameSessionId = GameSessionId.asInstanceOf[js.Any], PlayerIds = PlayerIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlayerSessionsInput]
  }
  
  extension [Self <: CreatePlayerSessionsInput](x: Self) {
    
    inline def setGameSessionId(value: ArnStringModel): Self = StObject.set(x, "GameSessionId", value.asInstanceOf[js.Any])
    
    inline def setPlayerDataMap(value: PlayerDataMap): Self = StObject.set(x, "PlayerDataMap", value.asInstanceOf[js.Any])
    
    inline def setPlayerDataMapUndefined: Self = StObject.set(x, "PlayerDataMap", js.undefined)
    
    inline def setPlayerIds(value: PlayerIdList): Self = StObject.set(x, "PlayerIds", value.asInstanceOf[js.Any])
    
    inline def setPlayerIdsVarargs(value: NonZeroAndMaxString*): Self = StObject.set(x, "PlayerIds", js.Array(value*))
  }
}
