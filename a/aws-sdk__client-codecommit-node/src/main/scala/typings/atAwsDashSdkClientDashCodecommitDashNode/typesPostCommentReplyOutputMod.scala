package typings.atAwsDashSdkClientDashCodecommitDashNode

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreCommentMod._UnmarshalledComment
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/PostCommentReplyOutput", JSImport.Namespace)
@js.native
object typesPostCommentReplyOutputMod extends js.Object {
  @js.native
  trait PostCommentReplyOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Information about the reply to a comment.</p>
      */
    var comment: js.UndefOr[_UnmarshalledComment] = js.native
  }
  
}

