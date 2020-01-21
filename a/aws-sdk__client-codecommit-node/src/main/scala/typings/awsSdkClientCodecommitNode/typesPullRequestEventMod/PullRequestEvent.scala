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

trait PullRequestEvent extends js.Object {
  /**
    * <p>The Amazon Resource Name (ARN) of the user whose actions resulted in the event. Examples include updating the pull request with additional commits or changing the status of a pull request.</p>
    */
  var actorArn: js.UndefOr[String] = js.undefined
  /**
    * <p>The day and time of the pull request event, in timestamp format.</p>
    */
  var eventDate: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * <p>Information about the source and destination branches for the pull request.</p>
    */
  var pullRequestCreatedEventMetadata: js.UndefOr[PullRequestCreatedEventMetadata] = js.undefined
  /**
    * <p>The type of the pull request event, for example a status change event (PULL_REQUEST_STATUS_CHANGED) or update event (PULL_REQUEST_SOURCE_REFERENCE_UPDATED).</p>
    */
  var pullRequestEventType: js.UndefOr[
    PULL_REQUEST_CREATED | PULL_REQUEST_STATUS_CHANGED | PULL_REQUEST_SOURCE_REFERENCE_UPDATED | PULL_REQUEST_MERGE_STATE_CHANGED | String
  ] = js.undefined
  /**
    * <p>The system-generated ID of the pull request.</p>
    */
  var pullRequestId: js.UndefOr[String] = js.undefined
  /**
    * <p>Information about the change in mergability state for the pull request event.</p>
    */
  var pullRequestMergedStateChangedEventMetadata: js.UndefOr[PullRequestMergedStateChangedEventMetadata] = js.undefined
  /**
    * <p>Information about the updated source branch for the pull request event. </p>
    */
  var pullRequestSourceReferenceUpdatedEventMetadata: js.UndefOr[PullRequestSourceReferenceUpdatedEventMetadata] = js.undefined
  /**
    * <p>Information about the change in status for the pull request event.</p>
    */
  var pullRequestStatusChangedEventMetadata: js.UndefOr[PullRequestStatusChangedEventMetadata] = js.undefined
}

object PullRequestEvent {
  @scala.inline
  def apply(
    actorArn: String = null,
    eventDate: Date | String | Double = null,
    pullRequestCreatedEventMetadata: PullRequestCreatedEventMetadata = null,
    pullRequestEventType: PULL_REQUEST_CREATED | PULL_REQUEST_STATUS_CHANGED | PULL_REQUEST_SOURCE_REFERENCE_UPDATED | PULL_REQUEST_MERGE_STATE_CHANGED | String = null,
    pullRequestId: String = null,
    pullRequestMergedStateChangedEventMetadata: PullRequestMergedStateChangedEventMetadata = null,
    pullRequestSourceReferenceUpdatedEventMetadata: PullRequestSourceReferenceUpdatedEventMetadata = null,
    pullRequestStatusChangedEventMetadata: PullRequestStatusChangedEventMetadata = null
  ): PullRequestEvent = {
    val __obj = js.Dynamic.literal()
    if (actorArn != null) __obj.updateDynamic("actorArn")(actorArn.asInstanceOf[js.Any])
    if (eventDate != null) __obj.updateDynamic("eventDate")(eventDate.asInstanceOf[js.Any])
    if (pullRequestCreatedEventMetadata != null) __obj.updateDynamic("pullRequestCreatedEventMetadata")(pullRequestCreatedEventMetadata.asInstanceOf[js.Any])
    if (pullRequestEventType != null) __obj.updateDynamic("pullRequestEventType")(pullRequestEventType.asInstanceOf[js.Any])
    if (pullRequestId != null) __obj.updateDynamic("pullRequestId")(pullRequestId.asInstanceOf[js.Any])
    if (pullRequestMergedStateChangedEventMetadata != null) __obj.updateDynamic("pullRequestMergedStateChangedEventMetadata")(pullRequestMergedStateChangedEventMetadata.asInstanceOf[js.Any])
    if (pullRequestSourceReferenceUpdatedEventMetadata != null) __obj.updateDynamic("pullRequestSourceReferenceUpdatedEventMetadata")(pullRequestSourceReferenceUpdatedEventMetadata.asInstanceOf[js.Any])
    if (pullRequestStatusChangedEventMetadata != null) __obj.updateDynamic("pullRequestStatusChangedEventMetadata")(pullRequestStatusChangedEventMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequestEvent]
  }
}

