package typings.atAwsDashSdkClientDashCodecommitDashNode

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreLocationMod._Location
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/PostCommentForComparedCommitInput", JSImport.Namespace)
@js.native
object typesPostCommentForComparedCommitInputMod extends js.Object {
  @js.native
  trait PostCommentForComparedCommitInput extends InputTypesUnion {
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.native
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[NodeHttpOptions] = js.native
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.native
    /**
      * <p>To establish the directionality of the comparison, the full commit ID of the 'after' commit.</p>
      */
    var afterCommitId: String = js.native
    /**
      * <p>To establish the directionality of the comparison, the full commit ID of the 'before' commit.</p>
      */
    var beforeCommitId: js.UndefOr[String] = js.native
    /**
      * <p>A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request will return information about the initial request that used that token.</p>
      */
    var clientRequestToken: js.UndefOr[String] = js.native
    /**
      * <p>The content of the comment you want to make.</p>
      */
    var content: String = js.native
    /**
      * <p>The location of the comparison where you want to comment.</p>
      */
    var location: js.UndefOr[_Location] = js.native
    /**
      * <p>The name of the repository where you want to post a comment on the comparison between commits.</p>
      */
    var repositoryName: String = js.native
  }
  
}

