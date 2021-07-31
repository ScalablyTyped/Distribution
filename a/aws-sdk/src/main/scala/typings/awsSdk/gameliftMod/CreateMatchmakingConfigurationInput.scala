package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMatchmakingConfigurationInput extends StObject {
  
  /**
    * A flag that determines whether a match that was created with this configuration must be accepted by the matched players. To require acceptance, set to TRUE.
    */
  var AcceptanceRequired: BooleanModel
  
  /**
    * The length of time (in seconds) to wait for players to accept a proposed match. If any player rejects the match or fails to accept before the timeout, the ticket continues to look for an acceptable match.
    */
  var AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger] = js.undefined
  
  /**
    * The number of player slots in a match to keep open for future players. For example, assume that the configuration's rule set specifies a match for a single 12-person team. If the additional player count is set to 2, only 10 players are initially selected for the match.
    */
  var AdditionalPlayerCount: js.UndefOr[WholeNumber] = js.undefined
  
  /**
    * The method used to backfill game sessions that are created with this matchmaking configuration. Specify MANUAL when your game manages backfill requests manually or does not use the match backfill feature. Specify AUTOMATIC to have GameLift create a StartMatchBackfill request whenever a game session has one or more open slots. Learn more about manual and automatic backfill in  Backfill Existing Games with FlexMatch. 
    */
  var BackfillMode: js.UndefOr[typings.awsSdk.gameliftMod.BackfillMode] = js.undefined
  
  /**
    * Information to be added to all events related to this matchmaking configuration. 
    */
  var CustomEventData: js.UndefOr[typings.awsSdk.gameliftMod.CustomEventData] = js.undefined
  
  /**
    * A human-readable description of the matchmaking configuration. 
    */
  var Description: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * A set of custom properties for a game session, formatted as key-value pairs. These properties are passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session). This information is added to the new GameSession object that is created for a successful match. 
    */
  var GameProperties: js.UndefOr[GamePropertyList] = js.undefined
  
  /**
    * A set of custom game session properties, formatted as a single string value. This data is passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session). This information is added to the new GameSession object that is created for a successful match.
    */
  var GameSessionData: js.UndefOr[typings.awsSdk.gameliftMod.GameSessionData] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) that is assigned to a GameLift game session queue resource and uniquely identifies it. ARNs are unique across all Regions. These queues are used when placing game sessions for matches that are created with this matchmaking configuration. Queues can be located in any Region.
    */
  var GameSessionQueueArns: QueueArnsList
  
  /**
    * A unique identifier for a matchmaking configuration. This name is used to identify the configuration associated with a matchmaking request or ticket.
    */
  var Name: MatchmakingIdStringModel
  
  /**
    * An SNS topic ARN that is set up to receive matchmaking notifications.
    */
  var NotificationTarget: js.UndefOr[SnsArnStringModel] = js.undefined
  
  /**
    * The maximum duration, in seconds, that a matchmaking ticket can remain in process before timing out. Requests that fail due to timing out can be resubmitted as needed.
    */
  var RequestTimeoutSeconds: MatchmakingRequestTimeoutInteger
  
  /**
    * A unique identifier for a matchmaking rule set to use with this configuration. You can use either the rule set name or ARN value. A matchmaking configuration can only use rule sets that are defined in the same Region.
    */
  var RuleSetName: MatchmakingRuleSetName
  
  /**
    * A list of labels to assign to the new matchmaking configuration resource. Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource management, access management and cost allocation. For more information, see  Tagging AWS Resources in the AWS General Reference. Once the resource is created, you can use TagResource, UntagResource, and ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateMatchmakingConfigurationInput {
  
  @scala.inline
  def apply(
    AcceptanceRequired: BooleanModel,
    GameSessionQueueArns: QueueArnsList,
    Name: MatchmakingIdStringModel,
    RequestTimeoutSeconds: MatchmakingRequestTimeoutInteger,
    RuleSetName: MatchmakingRuleSetName
  ): CreateMatchmakingConfigurationInput = {
    val __obj = js.Dynamic.literal(AcceptanceRequired = AcceptanceRequired.asInstanceOf[js.Any], GameSessionQueueArns = GameSessionQueueArns.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RequestTimeoutSeconds = RequestTimeoutSeconds.asInstanceOf[js.Any], RuleSetName = RuleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMatchmakingConfigurationInput]
  }
  
  @scala.inline
  implicit class CreateMatchmakingConfigurationInputMutableBuilder[Self <: CreateMatchmakingConfigurationInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptanceRequired(value: BooleanModel): Self = StObject.set(x, "AcceptanceRequired", value.asInstanceOf[js.Any])
    
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
    def setGameSessionQueueArnsVarargs(value: ArnStringModel*): Self = StObject.set(x, "GameSessionQueueArns", js.Array(value :_*))
    
    @scala.inline
    def setName(value: MatchmakingIdStringModel): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationTarget(value: SnsArnStringModel): Self = StObject.set(x, "NotificationTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationTargetUndefined: Self = StObject.set(x, "NotificationTarget", js.undefined)
    
    @scala.inline
    def setRequestTimeoutSeconds(value: MatchmakingRequestTimeoutInteger): Self = StObject.set(x, "RequestTimeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleSetName(value: MatchmakingRuleSetName): Self = StObject.set(x, "RuleSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
