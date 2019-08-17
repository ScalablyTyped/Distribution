package typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscorePullRequestTargetMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreMergeMetadataMod._MergeMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _PullRequestTarget extends js.Object {
  /**
    * <p>The full commit ID that is the tip of the destination branch. This is the commit where the pull request was or will be merged.</p>
    */
  var destinationCommit: js.UndefOr[String] = js.undefined
  /**
    * <p>The branch of the repository where the pull request changes will be merged into. Also known as the destination branch. </p>
    */
  var destinationReference: js.UndefOr[String] = js.undefined
  /**
    * <p>The commit ID of the most recent commit that the source branch and the destination branch have in common.</p>
    */
  var mergeBase: js.UndefOr[String] = js.undefined
  /**
    * <p>Returns metadata about the state of the merge, including whether the merge has been made.</p>
    */
  var mergeMetadata: js.UndefOr[_MergeMetadata] = js.undefined
  /**
    * <p>The name of the repository that contains the pull request source and destination branches.</p>
    */
  var repositoryName: js.UndefOr[String] = js.undefined
  /**
    * <p>The full commit ID of the tip of the source branch used to create the pull request. If the pull request branch is updated by a push while the pull request is open, the commit ID will change to reflect the new tip of the branch.</p>
    */
  var sourceCommit: js.UndefOr[String] = js.undefined
  /**
    * <p>The branch of the repository that contains the changes for the pull request. Also known as the source branch.</p>
    */
  var sourceReference: js.UndefOr[String] = js.undefined
}

object _PullRequestTarget {
  @scala.inline
  def apply(
    destinationCommit: String = null,
    destinationReference: String = null,
    mergeBase: String = null,
    mergeMetadata: _MergeMetadata = null,
    repositoryName: String = null,
    sourceCommit: String = null,
    sourceReference: String = null
  ): _PullRequestTarget = {
    val __obj = js.Dynamic.literal()
    if (destinationCommit != null) __obj.updateDynamic("destinationCommit")(destinationCommit)
    if (destinationReference != null) __obj.updateDynamic("destinationReference")(destinationReference)
    if (mergeBase != null) __obj.updateDynamic("mergeBase")(mergeBase)
    if (mergeMetadata != null) __obj.updateDynamic("mergeMetadata")(mergeMetadata)
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName)
    if (sourceCommit != null) __obj.updateDynamic("sourceCommit")(sourceCommit)
    if (sourceReference != null) __obj.updateDynamic("sourceReference")(sourceReference)
    __obj.asInstanceOf[_PullRequestTarget]
  }
}

