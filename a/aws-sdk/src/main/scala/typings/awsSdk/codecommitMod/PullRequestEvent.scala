package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRequestEvent extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the user whose actions resulted in the event. Examples include updating the pull request with more commits or changing the status of a pull request.
    */
  var actorArn: js.UndefOr[Arn] = js.native
  /**
    * Information about a pull request event.
    */
  var approvalRuleEventMetadata: js.UndefOr[ApprovalRuleEventMetadata] = js.native
  /**
    * Information about an approval rule override event for a pull request.
    */
  var approvalRuleOverriddenEventMetadata: js.UndefOr[ApprovalRuleOverriddenEventMetadata] = js.native
  /**
    * Information about an approval state change for a pull request.
    */
  var approvalStateChangedEventMetadata: js.UndefOr[ApprovalStateChangedEventMetadata] = js.native
  /**
    * The day and time of the pull request event, in timestamp format.
    */
  var eventDate: js.UndefOr[EventDate] = js.native
  /**
    * Information about the source and destination branches for the pull request.
    */
  var pullRequestCreatedEventMetadata: js.UndefOr[PullRequestCreatedEventMetadata] = js.native
  /**
    * The type of the pull request event (for example, a status change event (PULL_REQUEST_STATUS_CHANGED) or update event (PULL_REQUEST_SOURCE_REFERENCE_UPDATED)).
    */
  var pullRequestEventType: js.UndefOr[PullRequestEventType] = js.native
  /**
    * The system-generated ID of the pull request.
    */
  var pullRequestId: js.UndefOr[PullRequestId] = js.native
  /**
    * Information about the change in mergability state for the pull request event.
    */
  var pullRequestMergedStateChangedEventMetadata: js.UndefOr[PullRequestMergedStateChangedEventMetadata] = js.native
  /**
    * Information about the updated source branch for the pull request event. 
    */
  var pullRequestSourceReferenceUpdatedEventMetadata: js.UndefOr[PullRequestSourceReferenceUpdatedEventMetadata] = js.native
  /**
    * Information about the change in status for the pull request event.
    */
  var pullRequestStatusChangedEventMetadata: js.UndefOr[PullRequestStatusChangedEventMetadata] = js.native
}

object PullRequestEvent {
  @scala.inline
  def apply(): PullRequestEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullRequestEvent]
  }
  @scala.inline
  implicit class PullRequestEventOps[Self <: PullRequestEvent] (val x: Self) extends AnyVal {
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
    def setActorArn(value: Arn): Self = this.set("actorArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActorArn: Self = this.set("actorArn", js.undefined)
    @scala.inline
    def setApprovalRuleEventMetadata(value: ApprovalRuleEventMetadata): Self = this.set("approvalRuleEventMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovalRuleEventMetadata: Self = this.set("approvalRuleEventMetadata", js.undefined)
    @scala.inline
    def setApprovalRuleOverriddenEventMetadata(value: ApprovalRuleOverriddenEventMetadata): Self = this.set("approvalRuleOverriddenEventMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovalRuleOverriddenEventMetadata: Self = this.set("approvalRuleOverriddenEventMetadata", js.undefined)
    @scala.inline
    def setApprovalStateChangedEventMetadata(value: ApprovalStateChangedEventMetadata): Self = this.set("approvalStateChangedEventMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovalStateChangedEventMetadata: Self = this.set("approvalStateChangedEventMetadata", js.undefined)
    @scala.inline
    def setEventDate(value: EventDate): Self = this.set("eventDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventDate: Self = this.set("eventDate", js.undefined)
    @scala.inline
    def setPullRequestCreatedEventMetadata(value: PullRequestCreatedEventMetadata): Self = this.set("pullRequestCreatedEventMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullRequestCreatedEventMetadata: Self = this.set("pullRequestCreatedEventMetadata", js.undefined)
    @scala.inline
    def setPullRequestEventType(value: PullRequestEventType): Self = this.set("pullRequestEventType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullRequestEventType: Self = this.set("pullRequestEventType", js.undefined)
    @scala.inline
    def setPullRequestId(value: PullRequestId): Self = this.set("pullRequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullRequestId: Self = this.set("pullRequestId", js.undefined)
    @scala.inline
    def setPullRequestMergedStateChangedEventMetadata(value: PullRequestMergedStateChangedEventMetadata): Self = this.set("pullRequestMergedStateChangedEventMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullRequestMergedStateChangedEventMetadata: Self = this.set("pullRequestMergedStateChangedEventMetadata", js.undefined)
    @scala.inline
    def setPullRequestSourceReferenceUpdatedEventMetadata(value: PullRequestSourceReferenceUpdatedEventMetadata): Self = this.set("pullRequestSourceReferenceUpdatedEventMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullRequestSourceReferenceUpdatedEventMetadata: Self = this.set("pullRequestSourceReferenceUpdatedEventMetadata", js.undefined)
    @scala.inline
    def setPullRequestStatusChangedEventMetadata(value: PullRequestStatusChangedEventMetadata): Self = this.set("pullRequestStatusChangedEventMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullRequestStatusChangedEventMetadata: Self = this.set("pullRequestStatusChangedEventMetadata", js.undefined)
  }
  
}

