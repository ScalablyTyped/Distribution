package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateGameSessionInput extends js.Object {
  
  /**
    * A unique identifier for an alias associated with the fleet to create a game session in. You can use either the alias ID or ARN value. Each request must reference either a fleet ID or alias ID, but not both.
    */
  var AliasId: js.UndefOr[AliasIdOrArn] = js.native
  
  /**
    * A unique identifier for a player or entity creating the game session. This ID is used to enforce a resource protection policy (if one exists) that limits the number of concurrent active game sessions one player can have.
    */
  var CreatorId: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * A unique identifier for a fleet to create a game session in. You can use either the fleet ID or ARN value. Each request must reference either a fleet ID or alias ID, but not both.
    */
  var FleetId: js.UndefOr[FleetIdOrArn] = js.native
  
  /**
    * Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
    */
  var GameProperties: js.UndefOr[GamePropertyList] = js.native
  
  /**
    * Set of custom game session properties, formatted as a single string value. This data is passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
    */
  var GameSessionData: js.UndefOr[typings.awsSdk.gameliftMod.GameSessionData] = js.native
  
  /**
    *  This parameter is no longer preferred. Please use IdempotencyToken instead. Custom string that uniquely identifies a request for a new game session. Maximum token length is 48 characters. If provided, this string is included in the new game session's ID. (A game session ARN has the following format: arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;custom ID string or idempotency token&gt;.) 
    */
  var GameSessionId: js.UndefOr[IdStringModel] = js.native
  
  /**
    * Custom string that uniquely identifies a request for a new game session. Maximum token length is 48 characters. If provided, this string is included in the new game session's ID. (A game session ARN has the following format: arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;custom ID string or idempotency token&gt;.) Idempotency tokens remain in use for 30 days after a game session has ended; game session objects are retained for this time period and then deleted.
    */
  var IdempotencyToken: js.UndefOr[IdStringModel] = js.native
  
  /**
    * The maximum number of players that can be connected simultaneously to the game session.
    */
  var MaximumPlayerSessionCount: WholeNumber = js.native
  
  /**
    * A descriptive label that is associated with a game session. Session names do not need to be unique.
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.native
}
object CreateGameSessionInput {
  
  @scala.inline
  def apply(MaximumPlayerSessionCount: WholeNumber): CreateGameSessionInput = {
    val __obj = js.Dynamic.literal(MaximumPlayerSessionCount = MaximumPlayerSessionCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGameSessionInput]
  }
  
  @scala.inline
  implicit class CreateGameSessionInputOps[Self <: CreateGameSessionInput] (val x: Self) extends AnyVal {
    
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
    def setMaximumPlayerSessionCount(value: WholeNumber): Self = this.set("MaximumPlayerSessionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasId(value: AliasIdOrArn): Self = this.set("AliasId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliasId: Self = this.set("AliasId", js.undefined)
    
    @scala.inline
    def setCreatorId(value: NonZeroAndMaxString): Self = this.set("CreatorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatorId: Self = this.set("CreatorId", js.undefined)
    
    @scala.inline
    def setFleetId(value: FleetIdOrArn): Self = this.set("FleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetId: Self = this.set("FleetId", js.undefined)
    
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
    def setGameSessionId(value: IdStringModel): Self = this.set("GameSessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameSessionId: Self = this.set("GameSessionId", js.undefined)
    
    @scala.inline
    def setIdempotencyToken(value: IdStringModel): Self = this.set("IdempotencyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdempotencyToken: Self = this.set("IdempotencyToken", js.undefined)
    
    @scala.inline
    def setName(value: NonZeroAndMaxString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
