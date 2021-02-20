package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchmakingConfiguration extends StObject {
  
  /**
    * A flag that indicates whether a match that was created with this configuration must be accepted by the matched players. To require acceptance, set to TRUE.
    */
  var AcceptanceRequired: js.UndefOr[BooleanModel] = js.native
  
  /**
    * The length of time (in seconds) to wait for players to accept a proposed match. If any player rejects the match or fails to accept before the timeout, the ticket continues to look for an acceptable match.
    */
  var AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger] = js.native
  
  /**
    * The number of player slots in a match to keep open for future players. For example, assume that the configuration's rule set specifies a match for a single 12-person team. If the additional player count is set to 2, only 10 players are initially selected for the match.
    */
  var AdditionalPlayerCount: js.UndefOr[WholeNumber] = js.native
  
  /**
    * The method used to backfill game sessions created with this matchmaking configuration. MANUAL indicates that the game makes backfill requests or does not use the match backfill feature. AUTOMATIC indicates that GameLift creates StartMatchBackfill requests whenever a game session has one or more open slots. Learn more about manual and automatic backfill in Backfill Existing Games with FlexMatch.
    */
  var BackfillMode: js.UndefOr[typings.awsSdk.gameliftMod.BackfillMode] = js.native
  
  /**
    * Amazon Resource Name (ARN) that is assigned to a GameLift matchmaking configuration resource and uniquely identifies it. ARNs are unique across all Regions. In a GameLift configuration ARN, the resource ID matches the Name value.
    */
  var ConfigurationArn: js.UndefOr[MatchmakingConfigurationArn] = js.native
  
  /**
    * The time stamp indicating when this data object was created. The format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * Information to attach to all events related to the matchmaking configuration. 
    */
  var CustomEventData: js.UndefOr[typings.awsSdk.gameliftMod.CustomEventData] = js.native
  
  /**
    * A descriptive label that is associated with matchmaking configuration.
    */
  var Description: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * A set of custom properties for a game session, formatted as key-value pairs. These properties are passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session). This information is added to the new GameSession object that is created for a successful match. 
    */
  var GameProperties: js.UndefOr[GamePropertyList] = js.native
  
  /**
    * A set of custom game session properties, formatted as a single string value. This data is passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session). This information is added to the new GameSession object that is created for a successful match. 
    */
  var GameSessionData: js.UndefOr[typings.awsSdk.gameliftMod.GameSessionData] = js.native
  
  /**
    * Amazon Resource Name (ARN) that is assigned to a GameLift game session queue resource and uniquely identifies it. ARNs are unique across all Regions. GameLift uses the listed queues when placing game sessions for matches that are created with this matchmaking configuration. Queues can be located in any Region.
    */
  var GameSessionQueueArns: js.UndefOr[QueueArnsList] = js.native
  
  /**
    * A unique identifier for a matchmaking configuration. This name is used to identify the configuration associated with a matchmaking request or ticket.
    */
  var Name: js.UndefOr[MatchmakingIdStringModel] = js.native
  
  /**
    * An SNS topic ARN that is set up to receive matchmaking notifications.
    */
  var NotificationTarget: js.UndefOr[SnsArnStringModel] = js.native
  
  /**
    * The maximum duration, in seconds, that a matchmaking ticket can remain in process before timing out. Requests that fail due to timing out can be resubmitted as needed.
    */
  var RequestTimeoutSeconds: js.UndefOr[MatchmakingRequestTimeoutInteger] = js.native
  
  /**
    * The Amazon Resource Name (ARN) associated with the GameLift matchmaking rule set resource that this configuration uses.
    */
  var RuleSetArn: js.UndefOr[MatchmakingRuleSetArn] = js.native
  
  /**
    * A unique identifier for a matchmaking rule set to use with this configuration. A matchmaking configuration can only use rule sets that are defined in the same Region.
    */
  var RuleSetName: js.UndefOr[MatchmakingIdStringModel] = js.native
}
object MatchmakingConfiguration {
  
  @scala.inline
  def apply(): MatchmakingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchmakingConfiguration]
  }
  
  @scala.inline
  implicit class MatchmakingConfigurationMutableBuilder[Self <: MatchmakingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptanceRequired(value: BooleanModel): Self = StObject.set(x, "AcceptanceRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptanceRequiredUndefined: Self = StObject.set(x, "AcceptanceRequired", js.undefined)
    
    @scala.inline
    def setAcceptanceTimeoutSeconds(value: MatchmakingAcceptanceTimeoutInteger): Self = StObject.set(x, "AcceptanceTimeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptanceTimeoutSecondsUndefined: Self = StObject.set(x, "AcceptanceTimeoutSeconds", js.undefined)
    
    @scala.inline
    def setAdditionalPlayerCount(value: WholeNumber): Self = StObject.set(x, "AdditionalPlayerCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalPlayerCountUndefined: Self = StObject.set(x, "AdditionalPlayerCount", js.undefined)
    
    @scala.inline
    def setBackfillMode(value: BackfillMode): Self = StObject.set(x, "BackfillMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackfillModeUndefined: Self = StObject.set(x, "BackfillMode", js.undefined)
    
    @scala.inline
    def setConfigurationArn(value: MatchmakingConfigurationArn): Self = StObject.set(x, "ConfigurationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationArnUndefined: Self = StObject.set(x, "ConfigurationArn", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setCustomEventData(value: CustomEventData): Self = StObject.set(x, "CustomEventData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomEventDataUndefined: Self = StObject.set(x, "CustomEventData", js.undefined)
    
    @scala.inline
    def setDescription(value: NonZeroAndMaxString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
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
    def setGameSessionQueueArns(value: QueueArnsList): Self = StObject.set(x, "GameSessionQueueArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameSessionQueueArnsUndefined: Self = StObject.set(x, "GameSessionQueueArns", js.undefined)
    
    @scala.inline
    def setGameSessionQueueArnsVarargs(value: ArnStringModel*): Self = StObject.set(x, "GameSessionQueueArns", js.Array(value :_*))
    
    @scala.inline
    def setName(value: MatchmakingIdStringModel): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setNotificationTarget(value: SnsArnStringModel): Self = StObject.set(x, "NotificationTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationTargetUndefined: Self = StObject.set(x, "NotificationTarget", js.undefined)
    
    @scala.inline
    def setRequestTimeoutSeconds(value: MatchmakingRequestTimeoutInteger): Self = StObject.set(x, "RequestTimeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTimeoutSecondsUndefined: Self = StObject.set(x, "RequestTimeoutSeconds", js.undefined)
    
    @scala.inline
    def setRuleSetArn(value: MatchmakingRuleSetArn): Self = StObject.set(x, "RuleSetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleSetArnUndefined: Self = StObject.set(x, "RuleSetArn", js.undefined)
    
    @scala.inline
    def setRuleSetName(value: MatchmakingIdStringModel): Self = StObject.set(x, "RuleSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleSetNameUndefined: Self = StObject.set(x, "RuleSetName", js.undefined)
  }
}
