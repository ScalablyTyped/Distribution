package typings.awsSdkClientCodecommitNode.typesPullRequestMergedStateChangedEventMetadataMod

import typings.awsSdkClientCodecommitNode.typesMergeMetadataMod.UnmarshalledMergeMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledPullRequestMergedStateChangedEventMetadata extends PullRequestMergedStateChangedEventMetadata {
  /**
    * <p>Information about the merge state change event.</p>
    */
  @JSName("mergeMetadata")
  var mergeMetadata_UnmarshalledPullRequestMergedStateChangedEventMetadata: js.UndefOr[UnmarshalledMergeMetadata] = js.undefined
}

object UnmarshalledPullRequestMergedStateChangedEventMetadata {
  @scala.inline
  def apply(
    destinationReference: String = null,
    mergeMetadata: UnmarshalledMergeMetadata = null,
    repositoryName: String = null
  ): UnmarshalledPullRequestMergedStateChangedEventMetadata = {
    val __obj = js.Dynamic.literal()
    if (destinationReference != null) __obj.updateDynamic("destinationReference")(destinationReference.asInstanceOf[js.Any])
    if (mergeMetadata != null) __obj.updateDynamic("mergeMetadata")(mergeMetadata.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledPullRequestMergedStateChangedEventMetadata]
  }
}

