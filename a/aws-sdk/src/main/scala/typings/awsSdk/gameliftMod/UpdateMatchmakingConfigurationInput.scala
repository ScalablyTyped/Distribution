package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMatchmakingConfigurationInput extends js.Object {
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
    * The method that is used to backfill game sessions created with this matchmaking configuration. Specify MANUAL when your game manages backfill requests manually or does not use the match backfill feature. Specify AUTOMATIC to have GameLift create a StartMatchBackfill request whenever a game session has one or more open slots. Learn more about manual and automatic backfill in Backfill Existing Games with FlexMatch.
    */
  var BackfillMode: js.UndefOr[typings.awsSdk.gameliftMod.BackfillMode] = js.native
  /**
    * Information to add to all events related to the matchmaking configuration. 
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
    * Amazon Resource Name (ARN) that is assigned to a GameLift game session queue resource and uniquely identifies it. ARNs are unique across all Regions. These queues are used when placing game sessions for matches that are created with this matchmaking configuration. Queues can be located in any Region.
    */
  var GameSessionQueueArns: js.UndefOr[QueueArnsList] = js.native
  /**
    * A unique identifier for a matchmaking configuration to update. You can use either the configuration name or ARN value. 
    */
  var Name: MatchmakingConfigurationName = js.native
  /**
    * An SNS topic ARN that is set up to receive matchmaking notifications. See  Setting up Notifications for Matchmaking for more information.
    */
  var NotificationTarget: js.UndefOr[SnsArnStringModel] = js.native
  /**
    * The maximum duration, in seconds, that a matchmaking ticket can remain in process before timing out. Requests that fail due to timing out can be resubmitted as needed.
    */
  var RequestTimeoutSeconds: js.UndefOr[MatchmakingRequestTimeoutInteger] = js.native
  /**
    * A unique identifier for a matchmaking rule set to use with this configuration. You can use either the rule set name or ARN value. A matchmaking configuration can only use rule sets that are defined in the same Region.
    */
  var RuleSetName: js.UndefOr[MatchmakingRuleSetName] = js.native
}

object UpdateMatchmakingConfigurationInput {
  @scala.inline
  def apply(
    Name: MatchmakingConfigurationName,
    AcceptanceRequired: js.UndefOr[BooleanModel] = js.undefined,
    AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger] = js.undefined,
    AdditionalPlayerCount: js.UndefOr[WholeNumber] = js.undefined,
    BackfillMode: BackfillMode = null,
    CustomEventData: CustomEventData = null,
    Description: NonZeroAndMaxString = null,
    GameProperties: GamePropertyList = null,
    GameSessionData: GameSessionData = null,
    GameSessionQueueArns: QueueArnsList = null,
    NotificationTarget: SnsArnStringModel = null,
    RequestTimeoutSeconds: js.UndefOr[MatchmakingRequestTimeoutInteger] = js.undefined,
    RuleSetName: MatchmakingRuleSetName = null
  ): UpdateMatchmakingConfigurationInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (!js.isUndefined(AcceptanceRequired)) __obj.updateDynamic("AcceptanceRequired")(AcceptanceRequired.get.asInstanceOf[js.Any])
    if (!js.isUndefined(AcceptanceTimeoutSeconds)) __obj.updateDynamic("AcceptanceTimeoutSeconds")(AcceptanceTimeoutSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(AdditionalPlayerCount)) __obj.updateDynamic("AdditionalPlayerCount")(AdditionalPlayerCount.get.asInstanceOf[js.Any])
    if (BackfillMode != null) __obj.updateDynamic("BackfillMode")(BackfillMode.asInstanceOf[js.Any])
    if (CustomEventData != null) __obj.updateDynamic("CustomEventData")(CustomEventData.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (GameProperties != null) __obj.updateDynamic("GameProperties")(GameProperties.asInstanceOf[js.Any])
    if (GameSessionData != null) __obj.updateDynamic("GameSessionData")(GameSessionData.asInstanceOf[js.Any])
    if (GameSessionQueueArns != null) __obj.updateDynamic("GameSessionQueueArns")(GameSessionQueueArns.asInstanceOf[js.Any])
    if (NotificationTarget != null) __obj.updateDynamic("NotificationTarget")(NotificationTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(RequestTimeoutSeconds)) __obj.updateDynamic("RequestTimeoutSeconds")(RequestTimeoutSeconds.get.asInstanceOf[js.Any])
    if (RuleSetName != null) __obj.updateDynamic("RuleSetName")(RuleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMatchmakingConfigurationInput]
  }
}

