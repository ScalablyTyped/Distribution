package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGameSessionInput extends StObject {
  
  /**
    * A unique identifier for an alias associated with the fleet to create a game session in. You can use either the alias ID or ARN value. Each request must reference either a fleet ID or alias ID, but not both.
    */
  var AliasId: js.UndefOr[AliasIdOrArn] = js.undefined
  
  /**
    * A unique identifier for a player or entity creating the game session. This ID is used to enforce a resource protection policy (if one exists) that limits the number of concurrent active game sessions one player can have.
    */
  var CreatorId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * A unique identifier for a fleet to create a game session in. You can use either the fleet ID or ARN value. Each request must reference either a fleet ID or alias ID, but not both.
    */
  var FleetId: js.UndefOr[FleetIdOrArn] = js.undefined
  
  /**
    * Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
    */
  var GameProperties: js.UndefOr[GamePropertyList] = js.undefined
  
  /**
    * Set of custom game session properties, formatted as a single string value. This data is passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
    */
  var GameSessionData: js.UndefOr[typings.awsSdk.gameliftMod.GameSessionData] = js.undefined
  
  /**
    *  This parameter is no longer preferred. Please use IdempotencyToken instead. Custom string that uniquely identifies a request for a new game session. Maximum token length is 48 characters. If provided, this string is included in the new game session's ID. (A game session ARN has the following format: arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;custom ID string or idempotency token&gt;.) 
    */
  var GameSessionId: js.UndefOr[IdStringModel] = js.undefined
  
  /**
    * Custom string that uniquely identifies a request for a new game session. Maximum token length is 48 characters. If provided, this string is included in the new game session's ID. (A game session ARN has the following format: arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;custom ID string or idempotency token&gt;.) Idempotency tokens remain in use for 30 days after a game session has ended; game session objects are retained for this time period and then deleted.
    */
  var IdempotencyToken: js.UndefOr[IdStringModel] = js.undefined
  
  /**
    * The maximum number of players that can be connected simultaneously to the game session.
    */
  var MaximumPlayerSessionCount: WholeNumber
  
  /**
    * A descriptive label that is associated with a game session. Session names do not need to be unique.
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object CreateGameSessionInput {
  
  @scala.inline
  def apply(MaximumPlayerSessionCount: WholeNumber): CreateGameSessionInput = {
    val __obj = js.Dynamic.literal(MaximumPlayerSessionCount = MaximumPlayerSessionCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGameSessionInput]
  }
  
  @scala.inline
  implicit class CreateGameSessionInputMutableBuilder[Self <: CreateGameSessionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasId(value: AliasIdOrArn): Self = StObject.set(x, "AliasId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasIdUndefined: Self = StObject.set(x, "AliasId", js.undefined)
    
    @scala.inline
    def setCreatorId(value: NonZeroAndMaxString): Self = StObject.set(x, "CreatorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorIdUndefined: Self = StObject.set(x, "CreatorId", js.undefined)
    
    @scala.inline
    def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
    
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
    def setGameSessionId(value: IdStringModel): Self = StObject.set(x, "GameSessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameSessionIdUndefined: Self = StObject.set(x, "GameSessionId", js.undefined)
    
    @scala.inline
    def setIdempotencyToken(value: IdStringModel): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdempotencyTokenUndefined: Self = StObject.set(x, "IdempotencyToken", js.undefined)
    
    @scala.inline
    def setMaximumPlayerSessionCount(value: WholeNumber): Self = StObject.set(x, "MaximumPlayerSessionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: NonZeroAndMaxString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
