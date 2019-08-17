package typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscorePullRequestEventMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.PULL_REQUEST_CREATED
import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.PULL_REQUEST_MERGE_STATE_CHANGED
import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.PULL_REQUEST_SOURCE_REFERENCE_UPDATED
import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.PULL_REQUEST_STATUS_CHANGED
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscorePullRequestCreatedEventMetadataMod._UnmarshalledPullRequestCreatedEventMetadata
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscorePullRequestMergedStateChangedEventMetadataMod._UnmarshalledPullRequestMergedStateChangedEventMetadata
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscorePullRequestSourceReferenceUpdatedEventMetadataMod._UnmarshalledPullRequestSourceReferenceUpdatedEventMetadata
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscorePullRequestStatusChangedEventMetadataMod._UnmarshalledPullRequestStatusChangedEventMetadata
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledPullRequestEvent extends _PullRequestEvent {
  /**
    * <p>The day and time of the pull request event, in timestamp format.</p>
    */
  @JSName("eventDate")
  var eventDate__UnmarshalledPullRequestEvent: js.UndefOr[Date] = js.undefined
  /**
    * <p>Information about the source and destination branches for the pull request.</p>
    */
  @JSName("pullRequestCreatedEventMetadata")
  var pullRequestCreatedEventMetadata__UnmarshalledPullRequestEvent: js.UndefOr[_UnmarshalledPullRequestCreatedEventMetadata] = js.undefined
  /**
    * <p>Information about the change in mergability state for the pull request event.</p>
    */
  @JSName("pullRequestMergedStateChangedEventMetadata")
  var pullRequestMergedStateChangedEventMetadata__UnmarshalledPullRequestEvent: js.UndefOr[_UnmarshalledPullRequestMergedStateChangedEventMetadata] = js.undefined
  /**
    * <p>Information about the updated source branch for the pull request event. </p>
    */
  @JSName("pullRequestSourceReferenceUpdatedEventMetadata")
  var pullRequestSourceReferenceUpdatedEventMetadata__UnmarshalledPullRequestEvent: js.UndefOr[_UnmarshalledPullRequestSourceReferenceUpdatedEventMetadata] = js.undefined
  /**
    * <p>Information about the change in status for the pull request event.</p>
    */
  @JSName("pullRequestStatusChangedEventMetadata")
  var pullRequestStatusChangedEventMetadata__UnmarshalledPullRequestEvent: js.UndefOr[_UnmarshalledPullRequestStatusChangedEventMetadata] = js.undefined
}

object _UnmarshalledPullRequestEvent {
  @scala.inline
  def apply(
    actorArn: String = null,
    eventDate: Date = null,
    pullRequestCreatedEventMetadata: _UnmarshalledPullRequestCreatedEventMetadata = null,
    pullRequestEventType: PULL_REQUEST_CREATED | PULL_REQUEST_STATUS_CHANGED | PULL_REQUEST_SOURCE_REFERENCE_UPDATED | PULL_REQUEST_MERGE_STATE_CHANGED | String = null,
    pullRequestId: String = null,
    pullRequestMergedStateChangedEventMetadata: _UnmarshalledPullRequestMergedStateChangedEventMetadata = null,
    pullRequestSourceReferenceUpdatedEventMetadata: _UnmarshalledPullRequestSourceReferenceUpdatedEventMetadata = null,
    pullRequestStatusChangedEventMetadata: _UnmarshalledPullRequestStatusChangedEventMetadata = null
  ): _UnmarshalledPullRequestEvent = {
    val __obj = js.Dynamic.literal()
    if (actorArn != null) __obj.updateDynamic("actorArn")(actorArn)
    if (eventDate != null) __obj.updateDynamic("eventDate")(eventDate)
    if (pullRequestCreatedEventMetadata != null) __obj.updateDynamic("pullRequestCreatedEventMetadata")(pullRequestCreatedEventMetadata)
    if (pullRequestEventType != null) __obj.updateDynamic("pullRequestEventType")(pullRequestEventType.asInstanceOf[js.Any])
    if (pullRequestId != null) __obj.updateDynamic("pullRequestId")(pullRequestId)
    if (pullRequestMergedStateChangedEventMetadata != null) __obj.updateDynamic("pullRequestMergedStateChangedEventMetadata")(pullRequestMergedStateChangedEventMetadata)
    if (pullRequestSourceReferenceUpdatedEventMetadata != null) __obj.updateDynamic("pullRequestSourceReferenceUpdatedEventMetadata")(pullRequestSourceReferenceUpdatedEventMetadata)
    if (pullRequestStatusChangedEventMetadata != null) __obj.updateDynamic("pullRequestStatusChangedEventMetadata")(pullRequestStatusChangedEventMetadata)
    __obj.asInstanceOf[_UnmarshalledPullRequestEvent]
  }
}

