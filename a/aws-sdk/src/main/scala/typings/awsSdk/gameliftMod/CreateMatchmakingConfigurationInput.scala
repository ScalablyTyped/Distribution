package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMatchmakingConfigurationInput extends js.Object {
  /**
    * A flag that determines whether a match that was created with this configuration must be accepted by the matched players. To require acceptance, set to TRUE.
    */
  var AcceptanceRequired: BooleanModel = js.native
  /**
    * The length of time (in seconds) to wait for players to accept a proposed match. If any player rejects the match or fails to accept before the timeout, the ticket continues to look for an acceptable match.
    */
  var AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger] = js.native
  /**
    * The number of player slots in a match to keep open for future players. For example, assume that the configuration's rule set specifies a match for a single 12-person team. If the additional player count is set to 2, only 10 players are initially selected for the match.
    */
  var AdditionalPlayerCount: js.UndefOr[WholeNumber] = js.native
  /**
    * The method used to backfill game sessions that are created with this matchmaking configuration. Specify MANUAL when your game manages backfill requests manually or does not use the match backfill feature. Specify AUTOMATIC to have GameLift create a StartMatchBackfill request whenever a game session has one or more open slots. Learn more about manual and automatic backfill in  Backfill Existing Games with FlexMatch. 
    */
  var BackfillMode: js.UndefOr[typings.awsSdk.gameliftMod.BackfillMode] = js.native
  /**
    * Information to be added to all events related to this matchmaking configuration. 
    */
  var CustomEventData: js.UndefOr[typings.awsSdk.gameliftMod.CustomEventData] = js.native
  /**
    * A human-readable description of the matchmaking configuration. 
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
  var GameSessionQueueArns: QueueArnsList = js.native
  /**
    * A unique identifier for a matchmaking configuration. This name is used to identify the configuration associated with a matchmaking request or ticket.
    */
  var Name: MatchmakingIdStringModel = js.native
  /**
    * An SNS topic ARN that is set up to receive matchmaking notifications.
    */
  var NotificationTarget: js.UndefOr[SnsArnStringModel] = js.native
  /**
    * The maximum duration, in seconds, that a matchmaking ticket can remain in process before timing out. Requests that fail due to timing out can be resubmitted as needed.
    */
  var RequestTimeoutSeconds: MatchmakingRequestTimeoutInteger = js.native
  /**
    * A unique identifier for a matchmaking rule set to use with this configuration. You can use either the rule set name or ARN value. A matchmaking configuration can only use rule sets that are defined in the same Region.
    */
  var RuleSetName: MatchmakingRuleSetName = js.native
  /**
    * A list of labels to assign to the new matchmaking configuration resource. Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource management, access management and cost allocation. For more information, see  Tagging AWS Resources in the AWS General Reference. Once the resource is created, you can use TagResource, UntagResource, and ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateMatchmakingConfigurationInput {
  @scala.inline
  def apply(
    AcceptanceRequired: BooleanModel,
    GameSessionQueueArns: QueueArnsList,
    Name: MatchmakingIdStringModel,
    RequestTimeoutSeconds: MatchmakingRequestTimeoutInteger,
    RuleSetName: MatchmakingRuleSetName,
    AcceptanceTimeoutSeconds: Int | scala.Double = null,
    AdditionalPlayerCount: Int | scala.Double = null,
    BackfillMode: BackfillMode = null,
    CustomEventData: CustomEventData = null,
    Description: NonZeroAndMaxString = null,
    GameProperties: GamePropertyList = null,
    GameSessionData: GameSessionData = null,
    NotificationTarget: SnsArnStringModel = null,
    Tags: TagList = null
  ): CreateMatchmakingConfigurationInput = {
    val __obj = js.Dynamic.literal(AcceptanceRequired = AcceptanceRequired.asInstanceOf[js.Any], GameSessionQueueArns = GameSessionQueueArns.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RequestTimeoutSeconds = RequestTimeoutSeconds.asInstanceOf[js.Any], RuleSetName = RuleSetName.asInstanceOf[js.Any])
    if (AcceptanceTimeoutSeconds != null) __obj.updateDynamic("AcceptanceTimeoutSeconds")(AcceptanceTimeoutSeconds.asInstanceOf[js.Any])
    if (AdditionalPlayerCount != null) __obj.updateDynamic("AdditionalPlayerCount")(AdditionalPlayerCount.asInstanceOf[js.Any])
    if (BackfillMode != null) __obj.updateDynamic("BackfillMode")(BackfillMode.asInstanceOf[js.Any])
    if (CustomEventData != null) __obj.updateDynamic("CustomEventData")(CustomEventData.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (GameProperties != null) __obj.updateDynamic("GameProperties")(GameProperties.asInstanceOf[js.Any])
    if (GameSessionData != null) __obj.updateDynamic("GameSessionData")(GameSessionData.asInstanceOf[js.Any])
    if (NotificationTarget != null) __obj.updateDynamic("NotificationTarget")(NotificationTarget.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMatchmakingConfigurationInput]
  }
}

