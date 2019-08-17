package typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscorePullRequestEventMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.PULL_REQUEST_CREATED
import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.PULL_REQUEST_MERGE_STATE_CHANGED
import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.PULL_REQUEST_SOURCE_REFERENCE_UPDATED
import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.PULL_REQUEST_STATUS_CHANGED
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscorePullRequestCreatedEventMetadataMod._PullRequestCreatedEventMetadata
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscorePullRequestMergedStateChangedEventMetadataMod._PullRequestMergedStateChangedEventMetadata
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscorePullRequestSourceReferenceUpdatedEventMetadataMod._PullRequestSourceReferenceUpdatedEventMetadata
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscorePullRequestStatusChangedEventMetadataMod._PullRequestStatusChangedEventMetadata
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _PullRequestEvent extends js.Object {
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
  var pullRequestCreatedEventMetadata: js.UndefOr[_PullRequestCreatedEventMetadata] = js.undefined
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
  var pullRequestMergedStateChangedEventMetadata: js.UndefOr[_PullRequestMergedStateChangedEventMetadata] = js.undefined
  /**
    * <p>Information about the updated source branch for the pull request event. </p>
    */
  var pullRequestSourceReferenceUpdatedEventMetadata: js.UndefOr[_PullRequestSourceReferenceUpdatedEventMetadata] = js.undefined
  /**
    * <p>Information about the change in status for the pull request event.</p>
    */
  var pullRequestStatusChangedEventMetadata: js.UndefOr[_PullRequestStatusChangedEventMetadata] = js.undefined
}

object _PullRequestEvent {
  @scala.inline
  def apply(
    actorArn: String = null,
    eventDate: Date | String | Double = null,
    pullRequestCreatedEventMetadata: _PullRequestCreatedEventMetadata = null,
    pullRequestEventType: PULL_REQUEST_CREATED | PULL_REQUEST_STATUS_CHANGED | PULL_REQUEST_SOURCE_REFERENCE_UPDATED | PULL_REQUEST_MERGE_STATE_CHANGED | String = null,
    pullRequestId: String = null,
    pullRequestMergedStateChangedEventMetadata: _PullRequestMergedStateChangedEventMetadata = null,
    pullRequestSourceReferenceUpdatedEventMetadata: _PullRequestSourceReferenceUpdatedEventMetadata = null,
    pullRequestStatusChangedEventMetadata: _PullRequestStatusChangedEventMetadata = null
  ): _PullRequestEvent = {
    val __obj = js.Dynamic.literal()
    if (actorArn != null) __obj.updateDynamic("actorArn")(actorArn)
    if (eventDate != null) __obj.updateDynamic("eventDate")(eventDate.asInstanceOf[js.Any])
    if (pullRequestCreatedEventMetadata != null) __obj.updateDynamic("pullRequestCreatedEventMetadata")(pullRequestCreatedEventMetadata)
    if (pullRequestEventType != null) __obj.updateDynamic("pullRequestEventType")(pullRequestEventType.asInstanceOf[js.Any])
    if (pullRequestId != null) __obj.updateDynamic("pullRequestId")(pullRequestId)
    if (pullRequestMergedStateChangedEventMetadata != null) __obj.updateDynamic("pullRequestMergedStateChangedEventMetadata")(pullRequestMergedStateChangedEventMetadata)
    if (pullRequestSourceReferenceUpdatedEventMetadata != null) __obj.updateDynamic("pullRequestSourceReferenceUpdatedEventMetadata")(pullRequestSourceReferenceUpdatedEventMetadata)
    if (pullRequestStatusChangedEventMetadata != null) __obj.updateDynamic("pullRequestStatusChangedEventMetadata")(pullRequestStatusChangedEventMetadata)
    __obj.asInstanceOf[_PullRequestEvent]
  }
}

