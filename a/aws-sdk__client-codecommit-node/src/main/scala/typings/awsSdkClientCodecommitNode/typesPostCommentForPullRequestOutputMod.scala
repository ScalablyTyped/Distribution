package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesCommentMod.UnmarshalledComment
import typings.awsSdkClientCodecommitNode.typesLocationMod.UnmarshalledLocation
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/PostCommentForPullRequestOutput", JSImport.Namespace)
@js.native
object typesPostCommentForPullRequestOutputMod extends js.Object {
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
  
}

