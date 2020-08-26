package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchmakingConfiguration extends js.Object {
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
  implicit class MatchmakingConfigurationOps[Self <: MatchmakingConfiguration] (val x: Self) extends AnyVal {
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
    def setAcceptanceRequired(value: BooleanModel): Self = this.set("AcceptanceRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptanceRequired: Self = this.set("AcceptanceRequired", js.undefined)
    @scala.inline
    def setAcceptanceTimeoutSeconds(value: MatchmakingAcceptanceTimeoutInteger): Self = this.set("AcceptanceTimeoutSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptanceTimeoutSeconds: Self = this.set("AcceptanceTimeoutSeconds", js.undefined)
    @scala.inline
    def setAdditionalPlayerCount(value: WholeNumber): Self = this.set("AdditionalPlayerCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalPlayerCount: Self = this.set("AdditionalPlayerCount", js.undefined)
    @scala.inline
    def setBackfillMode(value: BackfillMode): Self = this.set("BackfillMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackfillMode: Self = this.set("BackfillMode", js.undefined)
    @scala.inline
    def setConfigurationArn(value: MatchmakingConfigurationArn): Self = this.set("ConfigurationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationArn: Self = this.set("ConfigurationArn", js.undefined)
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setCustomEventData(value: CustomEventData): Self = this.set("CustomEventData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomEventData: Self = this.set("CustomEventData", js.undefined)
    @scala.inline
    def setDescription(value: NonZeroAndMaxString): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
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
    def setGameSessionQueueArnsVarargs(value: ArnStringModel*): Self = this.set("GameSessionQueueArns", js.Array(value :_*))
    @scala.inline
    def setGameSessionQueueArns(value: QueueArnsList): Self = this.set("GameSessionQueueArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGameSessionQueueArns: Self = this.set("GameSessionQueueArns", js.undefined)
    @scala.inline
    def setName(value: MatchmakingIdStringModel): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setNotificationTarget(value: SnsArnStringModel): Self = this.set("NotificationTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationTarget: Self = this.set("NotificationTarget", js.undefined)
    @scala.inline
    def setRequestTimeoutSeconds(value: MatchmakingRequestTimeoutInteger): Self = this.set("RequestTimeoutSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestTimeoutSeconds: Self = this.set("RequestTimeoutSeconds", js.undefined)
    @scala.inline
    def setRuleSetArn(value: MatchmakingRuleSetArn): Self = this.set("RuleSetArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleSetArn: Self = this.set("RuleSetArn", js.undefined)
    @scala.inline
    def setRuleSetName(value: MatchmakingIdStringModel): Self = this.set("RuleSetName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleSetName: Self = this.set("RuleSetName", js.undefined)
  }
  
}

