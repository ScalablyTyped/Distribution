package typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscorePullRequestMergedStateChangedEventMetadataMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreMergeMetadataMod._MergeMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _PullRequestMergedStateChangedEventMetadata extends js.Object {
  /**
    * <p>The name of the branch that the pull request will be merged into.</p>
    */
  var destinationReference: js.UndefOr[String] = js.undefined
  /**
    * <p>Information about the merge state change event.</p>
    */
  var mergeMetadata: js.UndefOr[_MergeMetadata] = js.undefined
  /**
    * <p>The name of the repository where the pull request was created.</p>
    */
  var repositoryName: js.UndefOr[String] = js.undefined
}

object _PullRequestMergedStateChangedEventMetadata {
  @scala.inline
  def apply(
    destinationReference: String = null,
    mergeMetadata: _MergeMetadata = null,
    repositoryName: String = null
  ): _PullRequestMergedStateChangedEventMetadata = {
    val __obj = js.Dynamic.literal()
    if (destinationReference != null) __obj.updateDynamic("destinationReference")(destinationReference)
    if (mergeMetadata != null) __obj.updateDynamic("mergeMetadata")(mergeMetadata)
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName)
    __obj.asInstanceOf[_PullRequestMergedStateChangedEventMetadata]
  }
}

