package typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscorePullRequestMergedStateChangedEventMetadataMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreMergeMetadataMod._UnmarshalledMergeMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledPullRequestMergedStateChangedEventMetadata extends _PullRequestMergedStateChangedEventMetadata {
  /**
    * <p>Information about the merge state change event.</p>
    */
  @JSName("mergeMetadata")
  var mergeMetadata__UnmarshalledPullRequestMergedStateChangedEventMetadata: js.UndefOr[_UnmarshalledMergeMetadata] = js.undefined
}

object _UnmarshalledPullRequestMergedStateChangedEventMetadata {
  @scala.inline
  def apply(
    destinationReference: String = null,
    mergeMetadata: _UnmarshalledMergeMetadata = null,
    repositoryName: String = null
  ): _UnmarshalledPullRequestMergedStateChangedEventMetadata = {
    val __obj = js.Dynamic.literal()
    if (destinationReference != null) __obj.updateDynamic("destinationReference")(destinationReference)
    if (mergeMetadata != null) __obj.updateDynamic("mergeMetadata")(mergeMetadata)
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName)
    __obj.asInstanceOf[_UnmarshalledPullRequestMergedStateChangedEventMetadata]
  }
}

