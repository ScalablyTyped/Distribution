package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesCommentMod.UnmarshalledComment
import typings.awsSdkClientCodecommitNode.typesLocationMod.UnmarshalledLocation
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/PostCommentForComparedCommitOutput", JSImport.Namespace)
@js.native
object typesPostCommentForComparedCommitOutputMod extends js.Object {
  @js.native
  trait PostCommentForComparedCommitOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>In the directionality you established, the blob ID of the 'after' blob.</p>
      */
    var afterBlobId: js.UndefOr[String] = js.native
    /**
      * <p>In the directionality you established, the full commit ID of the 'after' commit.</p>
      */
    var afterCommitId: js.UndefOr[String] = js.native
    /**
      * <p>In the directionality you established, the blob ID of the 'before' blob.</p>
      */
    var beforeBlobId: js.UndefOr[String] = js.native
    /**
      * <p>In the directionality you established, the full commit ID of the 'before' commit.</p>
      */
    var beforeCommitId: js.UndefOr[String] = js.native
    /**
      * <p>The content of the comment you posted.</p>
      */
    var comment: js.UndefOr[UnmarshalledComment] = js.native
    /**
      * <p>The location of the comment in the comparison between the two commits.</p>
      */
    var location: js.UndefOr[UnmarshalledLocation] = js.native
    /**
      * <p>The name of the repository where you posted a comment on the comparison between commits.</p>
      */
    var repositoryName: js.UndefOr[String] = js.native
  }
  
}

