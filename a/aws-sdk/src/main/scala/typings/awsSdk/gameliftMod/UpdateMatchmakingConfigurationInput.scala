package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMatchmakingConfigurationInput extends StObject {
  
  /**
    * A flag that indicates whether a match that was created with this configuration must be accepted by the matched players. To require acceptance, set to TRUE. With this option enabled, matchmaking tickets use the status REQUIRES_ACCEPTANCE to indicate when a completed potential match is waiting for player acceptance. 
    */
  var AcceptanceRequired: js.UndefOr[BooleanModel] = js.undefined
  
  /**
    * The length of time (in seconds) to wait for players to accept a proposed match, if acceptance is required.
    */
  var AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger] = js.undefined
  
  /**
    * The number of player slots in a match to keep open for future players. For example, if the configuration's rule set specifies a match for a single 12-person team, and the additional player count is set to 2, only 10 players are selected for the match. This parameter is not used if FlexMatchMode is set to STANDALONE.
    */
  var AdditionalPlayerCount: js.UndefOr[WholeNumber] = js.undefined
  
  /**
    * The method that is used to backfill game sessions created with this matchmaking configuration. Specify MANUAL when your game manages backfill requests manually or does not use the match backfill feature. Specify AUTOMATIC to have GameLift create a StartMatchBackfill request whenever a game session has one or more open slots. Learn more about manual and automatic backfill in Backfill Existing Games with FlexMatch. Automatic backfill is not available when FlexMatchMode is set to STANDALONE.
    */
  var BackfillMode: js.UndefOr[typings.awsSdk.gameliftMod.BackfillMode] = js.undefined
  
  /**
    * Information to add to all events related to the matchmaking configuration. 
    */
  var CustomEventData: js.UndefOr[typings.awsSdk.gameliftMod.CustomEventData] = js.undefined
  
  /**
    * A descriptive label that is associated with matchmaking configuration.
    */
  var Description: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * Indicates whether this matchmaking configuration is being used with GameLift hosting or as a standalone matchmaking solution.     STANDALONE - FlexMatch forms matches and returns match information, including players and team assignments, in a  MatchmakingSucceeded event.    WITH_QUEUE - FlexMatch forms matches and uses the specified GameLift queue to start a game session for the match.   
    */
  var FlexMatchMode: js.UndefOr[typings.awsSdk.gameliftMod.FlexMatchMode] = js.undefined
  
  /**
    * A set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session). This information is added to the new GameSession object that is created for a successful match. This parameter is not used if FlexMatchMode is set to STANDALONE.
    */
  var GameProperties: js.UndefOr[GamePropertyList] = js.undefined
  
  /**
    * A set of custom game session properties, formatted as a single string value. This data is passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session). This information is added to the new GameSession object that is created for a successful match. This parameter is not used if FlexMatchMode is set to STANDALONE.
    */
  var GameSessionData: js.UndefOr[typings.awsSdk.gameliftMod.GameSessionData] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that is assigned to a GameLift game session queue resource and uniquely identifies it. ARNs are unique across all Regions. Format is arn:aws:gamelift:&lt;region&gt;::gamesessionqueue/&lt;queue name&gt;. Queues can be located in any Region. Queues are used to start new GameLift-hosted game sessions for matches that are created with this matchmaking configuration. If FlexMatchMode is set to STANDALONE, do not set this parameter.
    */
  var GameSessionQueueArns: js.UndefOr[QueueArnsList] = js.undefined
  
  /**
    * A unique identifier for the matchmaking configuration to update. You can use either the configuration name or ARN value. 
    */
  var Name: MatchmakingConfigurationName
  
  /**
    * An SNS topic ARN that is set up to receive matchmaking notifications. See  Setting up notifications for matchmaking for more information.
    */
  var NotificationTarget: js.UndefOr[SnsArnStringModel] = js.undefined
  
  /**
    * The maximum duration, in seconds, that a matchmaking ticket can remain in process before timing out. Requests that fail due to timing out can be resubmitted as needed.
    */
  var RequestTimeoutSeconds: js.UndefOr[MatchmakingRequestTimeoutInteger] = js.undefined
  
  /**
    * A unique identifier for the matchmaking rule set to use with this configuration. You can use either the rule set name or ARN value. A matchmaking configuration can only use rule sets that are defined in the same Region.
    */
  var RuleSetName: js.UndefOr[MatchmakingRuleSetName] = js.undefined
}
object UpdateMatchmakingConfigurationInput {
  
  inline def apply(Name: MatchmakingConfigurationName): UpdateMatchmakingConfigurationInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMatchmakingConfigurationInput]
  }
  
  extension [Self <: UpdateMatchmakingConfigurationInput](x: Self) {
    
    inline def setAcceptanceRequired(value: BooleanModel): Self = StObject.set(x, "AcceptanceRequired", value.asInstanceOf[js.Any])
    
    inline def setAcceptanceRequiredUndefined: Self = StObject.set(x, "AcceptanceRequired", js.undefined)
    
    inline def setAcceptanceTimeoutSeconds(value: MatchmakingAcceptanceTimeoutInteger): Self = StObject.set(x, "AcceptanceTimeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setAcceptanceTimeoutSecondsUndefined: Self = StObject.set(x, "AcceptanceTimeoutSeconds", js.undefined)
    
    inline def setAdditionalPlayerCount(value: WholeNumber): Self = StObject.set(x, "AdditionalPlayerCount", value.asInstanceOf[js.Any])
    
    inline def setAdditionalPlayerCountUndefined: Self = StObject.set(x, "AdditionalPlayerCount", js.undefined)
    
    inline def setBackfillMode(value: BackfillMode): Self = StObject.set(x, "BackfillMode", value.asInstanceOf[js.Any])
    
    inline def setBackfillModeUndefined: Self = StObject.set(x, "BackfillMode", js.undefined)
    
    inline def setCustomEventData(value: CustomEventData): Self = StObject.set(x, "CustomEventData", value.asInstanceOf[js.Any])
    
    inline def setCustomEventDataUndefined: Self = StObject.set(x, "CustomEventData", js.undefined)
    
    inline def setDescription(value: NonZeroAndMaxString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFlexMatchMode(value: FlexMatchMode): Self = StObject.set(x, "FlexMatchMode", value.asInstanceOf[js.Any])
    
    inline def setFlexMatchModeUndefined: Self = StObject.set(x, "FlexMatchMode", js.undefined)
    
    inline def setGameProperties(value: GamePropertyList): Self = StObject.set(x, "GameProperties", value.asInstanceOf[js.Any])
    
    inline def setGamePropertiesUndefined: Self = StObject.set(x, "GameProperties", js.undefined)
    
    inline def setGamePropertiesVarargs(value: GameProperty*): Self = StObject.set(x, "GameProperties", js.Array(value*))
    
    inline def setGameSessionData(value: GameSessionData): Self = StObject.set(x, "GameSessionData", value.asInstanceOf[js.Any])
    
    inline def setGameSessionDataUndefined: Self = StObject.set(x, "GameSessionData", js.undefined)
    
    inline def setGameSessionQueueArns(value: QueueArnsList): Self = StObject.set(x, "GameSessionQueueArns", value.asInstanceOf[js.Any])
    
    inline def setGameSessionQueueArnsUndefined: Self = StObject.set(x, "GameSessionQueueArns", js.undefined)
    
    inline def setGameSessionQueueArnsVarargs(value: ArnStringModel*): Self = StObject.set(x, "GameSessionQueueArns", js.Array(value*))
    
    inline def setName(value: MatchmakingConfigurationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNotificationTarget(value: SnsArnStringModel): Self = StObject.set(x, "NotificationTarget", value.asInstanceOf[js.Any])
    
    inline def setNotificationTargetUndefined: Self = StObject.set(x, "NotificationTarget", js.undefined)
    
    inline def setRequestTimeoutSeconds(value: MatchmakingRequestTimeoutInteger): Self = StObject.set(x, "RequestTimeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeoutSecondsUndefined: Self = StObject.set(x, "RequestTimeoutSeconds", js.undefined)
    
    inline def setRuleSetName(value: MatchmakingRuleSetName): Self = StObject.set(x, "RuleSetName", value.asInstanceOf[js.Any])
    
    inline def setRuleSetNameUndefined: Self = StObject.set(x, "RuleSetName", js.undefined)
  }
}
