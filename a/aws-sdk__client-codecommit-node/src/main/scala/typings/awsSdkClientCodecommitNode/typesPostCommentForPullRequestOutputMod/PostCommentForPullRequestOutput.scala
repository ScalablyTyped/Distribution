package typings.awsSdkClientCodecommitNode.typesPostCommentForPullRequestOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesCommentMod.UnmarshalledComment
import typings.awsSdkClientCodecommitNode.typesLocationMod.UnmarshalledLocation
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostCommentForPullRequestOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>In the directionality of the pull request, the blob ID of the 'after' blob.</p>
    */
  var afterBlobId: js.UndefOr[String] = js.native
  /**
    * <p>The full commit ID of the commit in the destination branch where the pull request will be merged.</p>
    */
  var afterCommitId: js.UndefOr[String] = js.native
  /**
    * <p>In the directionality of the pull request, the blob ID of the 'before' blob.</p>
    */
  var beforeBlobId: js.UndefOr[String] = js.native
  /**
    * <p>The full commit ID of the commit in the source branch used to create the pull request, or in the case of an updated pull request, the full commit ID of the commit used to update the pull request.</p>
    */
  var beforeCommitId: js.UndefOr[String] = js.native
  /**
    * <p>The content of the comment you posted.</p>
    */
  var comment: js.UndefOr[UnmarshalledComment] = js.native
  /**
    * <p>The location of the change where you posted your comment.</p>
    */
  var location: js.UndefOr[UnmarshalledLocation] = js.native
  /**
    * <p>The system-generated ID of the pull request. </p>
    */
  var pullRequestId: js.UndefOr[String] = js.native
  /**
    * <p>The name of the repository where you posted a comment on a pull request.</p>
    */
  var repositoryName: js.UndefOr[String] = js.native
}

object PostCommentForPullRequestOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PostCommentForPullRequestOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCommentForPullRequestOutput]
  }
  @scala.inline
  implicit class PostCommentForPullRequestOutputOps[Self <: PostCommentForPullRequestOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setAfterBlobId(value: String): Self = this.set("afterBlobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterBlobId: Self = this.set("afterBlobId", js.undefined)
    @scala.inline
    def setAfterCommitId(value: String): Self = this.set("afterCommitId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterCommitId: Self = this.set("afterCommitId", js.undefined)
    @scala.inline
    def setBeforeBlobId(value: String): Self = this.set("beforeBlobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeBlobId: Self = this.set("beforeBlobId", js.undefined)
    @scala.inline
    def setBeforeCommitId(value: String): Self = this.set("beforeCommitId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeCommitId: Self = this.set("beforeCommitId", js.undefined)
    @scala.inline
    def setComment(value: UnmarshalledComment): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setLocation(value: UnmarshalledLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setPullRequestId(value: String): Self = this.set("pullRequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullRequestId: Self = this.set("pullRequestId", js.undefined)
    @scala.inline
    def setRepositoryName(value: String): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepositoryName: Self = this.set("repositoryName", js.undefined)
  }
  
}

