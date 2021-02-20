package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartMatchBackfillInput extends StObject {
  
  /**
    * Name of the matchmaker to use for this request. You can use either the configuration name or ARN value. The ARN of the matchmaker that was used with the original game session is listed in the GameSession object, MatchmakerData property.
    */
  var ConfigurationName: MatchmakingConfigurationName = js.native
  
  /**
    * Amazon Resource Name (ARN) that is assigned to a game session and uniquely identifies it. This is the same as the game session ID.
    */
  var GameSessionArn: ArnStringModel = js.native
  
  /**
    * Match information on all players that are currently assigned to the game session. This information is used by the matchmaker to find new players and add them to the existing game.   PlayerID, PlayerAttributes, Team -\\- This information is maintained in the GameSession object, MatchmakerData property, for all players who are currently assigned to the game session. The matchmaker data is in JSON syntax, formatted as a string. For more details, see  Match Data.    LatencyInMs -\\- If the matchmaker uses player latency, include a latency value, in milliseconds, for the Region that the game session is currently in. Do not include latency values for any other Region.  
    */
  var Players: PlayerList = js.native
  
  /**
    * A unique identifier for a matchmaking ticket. If no ticket ID is specified here, Amazon GameLift will generate one in the form of a UUID. Use this identifier to track the match backfill ticket status and retrieve match results.
    */
  var TicketId: js.UndefOr[MatchmakingIdStringModel] = js.native
}
object StartMatchBackfillInput {
  
  @scala.inline
  def apply(
    ConfigurationName: MatchmakingConfigurationName,
    GameSessionArn: ArnStringModel,
    Players: PlayerList
  ): StartMatchBackfillInput = {
    val __obj = js.Dynamic.literal(ConfigurationName = ConfigurationName.asInstanceOf[js.Any], GameSessionArn = GameSessionArn.asInstanceOf[js.Any], Players = Players.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMatchBackfillInput]
  }
  
  @scala.inline
  implicit class StartMatchBackfillInputMutableBuilder[Self <: StartMatchBackfillInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationName(value: MatchmakingConfigurationName): Self = StObject.set(x, "ConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameSessionArn(value: ArnStringModel): Self = StObject.set(x, "GameSessionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayers(value: PlayerList): Self = StObject.set(x, "Players", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayersVarargs(value: Player*): Self = StObject.set(x, "Players", js.Array(value :_*))
    
    @scala.inline
    def setTicketId(value: MatchmakingIdStringModel): Self = StObject.set(x, "TicketId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicketIdUndefined: Self = StObject.set(x, "TicketId", js.undefined)
  }
}
