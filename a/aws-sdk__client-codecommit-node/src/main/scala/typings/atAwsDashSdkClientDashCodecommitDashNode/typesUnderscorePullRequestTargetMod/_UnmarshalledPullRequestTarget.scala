package typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscorePullRequestTargetMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreMergeMetadataMod._UnmarshalledMergeMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledPullRequestTarget extends _PullRequestTarget {
  /**
    * <p>Returns metadata about the state of the merge, including whether the merge has been made.</p>
    */
  @JSName("mergeMetadata")
  var mergeMetadata__UnmarshalledPullRequestTarget: js.UndefOr[_UnmarshalledMergeMetadata] = js.undefined
}

object _UnmarshalledPullRequestTarget {
  @scala.inline
  def apply(
    destinationCommit: String = null,
    destinationReference: String = null,
    mergeBase: String = null,
    mergeMetadata: _UnmarshalledMergeMetadata = null,
    repositoryName: String = null,
    sourceCommit: String = null,
    sourceReference: String = null
  ): _UnmarshalledPullRequestTarget = {
    val __obj = js.Dynamic.literal()
    if (destinationCommit != null) __obj.updateDynamic("destinationCommit")(destinationCommit)
    if (destinationReference != null) __obj.updateDynamic("destinationReference")(destinationReference)
    if (mergeBase != null) __obj.updateDynamic("mergeBase")(mergeBase)
    if (mergeMetadata != null) __obj.updateDynamic("mergeMetadata")(mergeMetadata)
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName)
    if (sourceCommit != null) __obj.updateDynamic("sourceCommit")(sourceCommit)
    if (sourceReference != null) __obj.updateDynamic("sourceReference")(sourceReference)
    __obj.asInstanceOf[_UnmarshalledPullRequestTarget]
  }
}

