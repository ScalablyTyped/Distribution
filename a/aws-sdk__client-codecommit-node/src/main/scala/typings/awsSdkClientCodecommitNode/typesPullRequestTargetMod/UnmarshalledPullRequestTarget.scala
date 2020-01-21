package typings.awsSdkClientCodecommitNode.typesPullRequestTargetMod

import typings.awsSdkClientCodecommitNode.typesMergeMetadataMod.UnmarshalledMergeMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledPullRequestTarget extends PullRequestTarget {
  /**
    * <p>Returns metadata about the state of the merge, including whether the merge has been made.</p>
    */
  @JSName("mergeMetadata")
  var mergeMetadata_UnmarshalledPullRequestTarget: js.UndefOr[UnmarshalledMergeMetadata] = js.undefined
}

object UnmarshalledPullRequestTarget {
  @scala.inline
  def apply(
    destinationCommit: String = null,
    destinationReference: String = null,
    mergeBase: String = null,
    mergeMetadata: UnmarshalledMergeMetadata = null,
    repositoryName: String = null,
    sourceCommit: String = null,
    sourceReference: String = null
  ): UnmarshalledPullRequestTarget = {
    val __obj = js.Dynamic.literal()
    if (destinationCommit != null) __obj.updateDynamic("destinationCommit")(destinationCommit.asInstanceOf[js.Any])
    if (destinationReference != null) __obj.updateDynamic("destinationReference")(destinationReference.asInstanceOf[js.Any])
    if (mergeBase != null) __obj.updateDynamic("mergeBase")(mergeBase.asInstanceOf[js.Any])
    if (mergeMetadata != null) __obj.updateDynamic("mergeMetadata")(mergeMetadata.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    if (sourceCommit != null) __obj.updateDynamic("sourceCommit")(sourceCommit.asInstanceOf[js.Any])
    if (sourceReference != null) __obj.updateDynamic("sourceReference")(sourceReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledPullRequestTarget]
  }
}

