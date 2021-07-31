package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartGameSessionPlacementInput extends StObject {
  
  /**
    * Set of information on each player to create a player session for.
    */
  var DesiredPlayerSessions: js.UndefOr[DesiredPlayerSessionList] = js.undefined
  
  /**
    * Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
    */
  var GameProperties: js.UndefOr[GamePropertyList] = js.undefined
  
  /**
    * Set of custom game session properties, formatted as a single string value. This data is passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
    */
  var GameSessionData: js.UndefOr[typings.awsSdk.gameliftMod.GameSessionData] = js.undefined
  
  /**
    * A descriptive label that is associated with a game session. Session names do not need to be unique.
    */
  var GameSessionName: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * Name of the queue to use to place the new game session. You can use either the queue name or ARN value. 
    */
  var GameSessionQueueName: GameSessionQueueNameOrArn
  
  /**
    * The maximum number of players that can be connected simultaneously to the game session.
    */
  var MaximumPlayerSessionCount: WholeNumber
  
  /**
    * A unique identifier to assign to the new game session placement. This value is developer-defined. The value must be unique across all Regions and cannot be reused unless you are resubmitting a canceled or timed-out placement request.
    */
  var PlacementId: IdStringModel
  
  /**
    * Set of values, expressed in milliseconds, indicating the amount of latency that a player experiences when connected to AWS Regions. This information is used to try to place the new game session where it can offer the best possible gameplay experience for the players. 
    */
  var PlayerLatencies: js.UndefOr[PlayerLatencyList] = js.undefined
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
  implicit class StartGameSessionPlacementInputMutableBuilder[Self <: StartGameSessionPlacementInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesiredPlayerSessions(value: DesiredPlayerSessionList): Self = StObject.set(x, "DesiredPlayerSessions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredPlayerSessionsUndefined: Self = StObject.set(x, "DesiredPlayerSessions", js.undefined)
    
    @scala.inline
    def setDesiredPlayerSessionsVarargs(value: DesiredPlayerSession*): Self = StObject.set(x, "DesiredPlayerSessions", js.Array(value :_*))
    
    @scala.inline
    def setGameProperties(value: GamePropertyList): Self = StObject.set(x, "GameProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGamePropertiesUndefined: Self = StObject.set(x, "GameProperties", js.undefined)
    
    @scala.inline
    def setGamePropertiesVarargs(value: GameProperty*): Self = StObject.set(x, "GameProperties", js.Array(value :_*))
    
    @scala.inline
    def setGameSessionData(value: GameSessionData): Self = StObject.set(x, "GameSessionData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameSessionDataUndefined: Self = StObject.set(x, "GameSessionData", js.undefined)
    
    @scala.inline
    def setGameSessionName(value: NonZeroAndMaxString): Self = StObject.set(x, "GameSessionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameSessionNameUndefined: Self = StObject.set(x, "GameSessionName", js.undefined)
    
    @scala.inline
    def setGameSessionQueueName(value: GameSessionQueueNameOrArn): Self = StObject.set(x, "GameSessionQueueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumPlayerSessionCount(value: WholeNumber): Self = StObject.set(x, "MaximumPlayerSessionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementId(value: IdStringModel): Self = StObject.set(x, "PlacementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerLatencies(value: PlayerLatencyList): Self = StObject.set(x, "PlayerLatencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerLatenciesUndefined: Self = StObject.set(x, "PlayerLatencies", js.undefined)
    
    @scala.inline
    def setPlayerLatenciesVarargs(value: PlayerLatency*): Self = StObject.set(x, "PlayerLatencies", js.Array(value :_*))
  }
}
