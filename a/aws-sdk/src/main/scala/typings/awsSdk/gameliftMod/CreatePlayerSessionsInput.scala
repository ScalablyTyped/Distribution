package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(GameSessionId: ArnStringModel, PlayerIds: PlayerIdList, PlayerDataMap: PlayerDataMap = null): CreatePlayerSessionsInput = {
    val __obj = js.Dynamic.literal(GameSessionId = GameSessionId.asInstanceOf[js.Any], PlayerIds = PlayerIds.asInstanceOf[js.Any])
    if (PlayerDataMap != null) __obj.updateDynamic("PlayerDataMap")(PlayerDataMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlayerSessionsInput]
  }
}

