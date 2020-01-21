package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartGameSessionPlacementInput extends js.Object {
  /**
    * Set of information on each player to create a player session for.
    */
  var DesiredPlayerSessions: js.UndefOr[DesiredPlayerSessionList] = js.native
  /**
    * Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
    */
  var GameProperties: js.UndefOr[GamePropertyList] = js.native
  /**
    * Set of custom game session properties, formatted as a single string value. This data is passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
    */
  var GameSessionData: js.UndefOr[typings.awsSdk.gameliftMod.GameSessionData] = js.native
  /**
    * A descriptive label that is associated with a game session. Session names do not need to be unique.
    */
  var GameSessionName: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * Name of the queue to use to place the new game session. You can use either the qieue name or ARN value. 
    */
  var GameSessionQueueName: typings.awsSdk.gameliftMod.GameSessionQueueName = js.native
  /**
    * The maximum number of players that can be connected simultaneously to the game session.
    */
  var MaximumPlayerSessionCount: WholeNumber = js.native
  /**
    * A unique identifier to assign to the new game session placement. This value is developer-defined. The value must be unique across all Regions and cannot be reused unless you are resubmitting a canceled or timed-out placement request.
    */
  var PlacementId: IdStringModel = js.native
  /**
    * Set of values, expressed in milliseconds, indicating the amount of latency that a player experiences when connected to AWS Regions. This information is used to try to place the new game session where it can offer the best possible gameplay experience for the players. 
    */
  var PlayerLatencies: js.UndefOr[PlayerLatencyList] = js.native
}

object StartGameSessionPlacementInput {
  @scala.inline
  def apply(
    GameSessionQueueName: GameSessionQueueName,
    MaximumPlayerSessionCount: WholeNumber,
    PlacementId: IdStringModel,
    DesiredPlayerSessions: DesiredPlayerSessionList = null,
    GameProperties: GamePropertyList = null,
    GameSessionData: GameSessionData = null,
    GameSessionName: NonZeroAndMaxString = null,
    PlayerLatencies: PlayerLatencyList = null
  ): StartGameSessionPlacementInput = {
    val __obj = js.Dynamic.literal(GameSessionQueueName = GameSessionQueueName.asInstanceOf[js.Any], MaximumPlayerSessionCount = MaximumPlayerSessionCount.asInstanceOf[js.Any], PlacementId = PlacementId.asInstanceOf[js.Any])
    if (DesiredPlayerSessions != null) __obj.updateDynamic("DesiredPlayerSessions")(DesiredPlayerSessions.asInstanceOf[js.Any])
    if (GameProperties != null) __obj.updateDynamic("GameProperties")(GameProperties.asInstanceOf[js.Any])
    if (GameSessionData != null) __obj.updateDynamic("GameSessionData")(GameSessionData.asInstanceOf[js.Any])
    if (GameSessionName != null) __obj.updateDynamic("GameSessionName")(GameSessionName.asInstanceOf[js.Any])
    if (PlayerLatencies != null) __obj.updateDynamic("PlayerLatencies")(PlayerLatencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartGameSessionPlacementInput]
  }
}

