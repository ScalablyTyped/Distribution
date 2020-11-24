package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * Name of the queue to use to place the new game session. You can use either the queue name or ARN value. 
    */
  var GameSessionQueueName: GameSessionQueueNameOrArn = js.native
  
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
    GameSessionQueueName: GameSessionQueueNameOrArn,
    MaximumPlayerSessionCount: WholeNumber,
    PlacementId: IdStringModel
  ): StartGameSessionPlacementInput = {
    val __obj = js.Dynamic.literal(GameSessionQueueName = GameSessionQueueName.asInstanceOf[js.Any], MaximumPlayerSessionCount = MaximumPlayerSessionCount.asInstanceOf[js.Any], PlacementId = PlacementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartGameSessionPlacementInput]
  }
  
  @scala.inline
  implicit class StartGameSessionPlacementInputOps[Self <: StartGameSessionPlacementInput] (val x: Self) extends AnyVal {
    
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
    def setGameSessionQueueName(value: GameSessionQueueNameOrArn): Self = this.set("GameSessionQueueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumPlayerSessionCount(value: WholeNumber): Self = this.set("MaximumPlayerSessionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementId(value: IdStringModel): Self = this.set("PlacementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredPlayerSessionsVarargs(value: DesiredPlayerSession*): Self = this.set("DesiredPlayerSessions", js.Array(value :_*))
    
    @scala.inline
    def setDesiredPlayerSessions(value: DesiredPlayerSessionList): Self = this.set("DesiredPlayerSessions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesiredPlayerSessions: Self = this.set("DesiredPlayerSessions", js.undefined)
    
    @scala.inline
    def setGamePropertiesVarargs(value: GameProperty*): Self = this.set("GameProperties", js.Array(value :_*))
    
    @scala.inline
    def setGameProperties(value: GamePropertyList): Self = this.set("GameProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameProperties: Self = this.set("GameProperties", js.undefined)
    
    @scala.inline
    def setGameSessionData(value: GameSessionData): Self = this.set("GameSessionData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameSessionData: Self = this.set("GameSessionData", js.undefined)
    
    @scala.inline
    def setGameSessionName(value: NonZeroAndMaxString): Self = this.set("GameSessionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameSessionName: Self = this.set("GameSessionName", js.undefined)
    
    @scala.inline
    def setPlayerLatenciesVarargs(value: PlayerLatency*): Self = this.set("PlayerLatencies", js.Array(value :_*))
    
    @scala.inline
    def setPlayerLatencies(value: PlayerLatencyList): Self = this.set("PlayerLatencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayerLatencies: Self = this.set("PlayerLatencies", js.undefined)
  }
}
