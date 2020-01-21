package typings.awsSdkClientCodecommitNode.typesPullRequestMergedStateChangedEventMetadataMod

import typings.awsSdkClientCodecommitNode.typesMergeMetadataMod.MergeMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullRequestMergedStateChangedEventMetadata extends js.Object {
  /**
    * <p>The name of the branch that the pull request will be merged into.</p>
    */
  var destinationReference: js.UndefOr[String] = js.undefined
  /**
    * <p>Information about the merge state change event.</p>
    */
  var mergeMetadata: js.UndefOr[MergeMetadata] = js.undefined
  /**
    * <p>The name of the repository where the pull request was created.</p>
    */
  var repositoryName: js.UndefOr[String] = js.undefined
}

object PullRequestMergedStateChangedEventMetadata {
  @scala.inline
  def apply(
    destinationReference: String = null,
    mergeMetadata: MergeMetadata = null,
    repositoryName: String = null
  ): PullRequestMergedStateChangedEventMetadata = {
    val __obj = js.Dynamic.literal()
    if (destinationReference != null) __obj.updateDynamic("destinationReference")(destinationReference.asInstanceOf[js.Any])
    if (mergeMetadata != null) __obj.updateDynamic("mergeMetadata")(mergeMetadata.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequestMergedStateChangedEventMetadata]
  }
}

