package typings.awsSdkClientCodecommitNode.typesPullRequestEventMod

import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PULL_REQUEST_CREATED
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PULL_REQUEST_MERGE_STATE_CHANGED
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PULL_REQUEST_SOURCE_REFERENCE_UPDATED
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PULL_REQUEST_STATUS_CHANGED
import typings.awsSdkClientCodecommitNode.typesPullRequestCreatedEventMetadataMod.PullRequestCreatedEventMetadata
import typings.awsSdkClientCodecommitNode.typesPullRequestMergedStateChangedEventMetadataMod.PullRequestMergedStateChangedEventMetadata
import typings.awsSdkClientCodecommitNode.typesPullRequestSourceReferenceUpdatedEventMetadataMod.PullRequestSourceReferenceUpdatedEventMetadata
import typings.awsSdkClientCodecommitNode.typesPullRequestStatusChangedEventMetadataMod.PullRequestStatusChangedEventMetadata
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRequestEvent extends js.Object {
  /**
    * <p>The Amazon Resource Name (ARN) of the user whose actions resulted in the event. Examples include updating the pull request with additional commits or changing the status of a pull request.</p>
    */
  var actorArn: js.UndefOr[String] = js.native
  /**
    * <p>The day and time of the pull request event, in timestamp format.</p>
    */
  var eventDate: js.UndefOr[Date | String | Double] = js.native
  /**
    * <p>Information about the source and destination branches for the pull request.</p>
    */
  var pullRequestCreatedEventMetadata: js.UndefOr[PullRequestCreatedEventMetadata] = js.native
  /**
    * <p>The type of the pull request event, for example a status change event (PULL_REQUEST_STATUS_CHANGED) or update event (PULL_REQUEST_SOURCE_REFERENCE_UPDATED).</p>
    */
  var pullRequestEventType: js.UndefOr[
    PULL_REQUEST_CREATED | PULL_REQUEST_STATUS_CHANGED | PULL_REQUEST_SOURCE_REFERENCE_UPDATED | PULL_REQUEST_MERGE_STATE_CHANGED | String
  ] = js.native
  /**
    * <p>The system-generated ID of the pull request.</p>
    */
  var pullRequestId: js.UndefOr[String] = js.native
  /**
    * <p>Information about the change in mergability state for the pull request event.</p>
    */
  var pullRequestMergedStateChangedEventMetadata: js.UndefOr[PullRequestMergedStateChangedEventMetadata] = js.native
  /**
    * <p>Information about the updated source branch for the pull request event. </p>
    */
  var pullRequestSourceReferenceUpdatedEventMetadata: js.UndefOr[PullRequestSourceReferenceUpdatedEventMetadata] = js.native
  /**
    * <p>Information about the change in status for the pull request event.</p>
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
    def setActorArn(value: String): Self = this.set("actorArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActorArn: Self = this.set("actorArn", js.undefined)
    @scala.inline
    def setEventDate(value: Date | String | Double): Self = this.set("eventDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventDate: Self = this.set("eventDate", js.undefined)
    @scala.inline
    def setPullRequestCreatedEventMetadata(value: PullRequestCreatedEventMetadata): Self = this.set("pullRequestCreatedEventMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullRequestCreatedEventMetadata: Self = this.set("pullRequestCreatedEventMetadata", js.undefined)
    @scala.inline
    def setPullRequestEventType(
      value: PULL_REQUEST_CREATED | PULL_REQUEST_STATUS_CHANGED | PULL_REQUEST_SOURCE_REFERENCE_UPDATED | PULL_REQUEST_MERGE_STATE_CHANGED | String
    ): Self = this.set("pullRequestEventType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullRequestEventType: Self = this.set("pullRequestEventType", js.undefined)
    @scala.inline
    def setPullRequestId(value: String): Self = this.set("pullRequestId", value.asInstanceOf[js.Any])
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

