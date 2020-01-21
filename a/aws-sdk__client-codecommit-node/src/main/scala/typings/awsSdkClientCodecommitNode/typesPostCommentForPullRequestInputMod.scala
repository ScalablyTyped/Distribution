package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.typesLocationMod.Location
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/PostCommentForPullRequestInput", JSImport.Namespace)
@js.native
object typesPostCommentForPullRequestInputMod extends js.Object {
  @js.native
  trait PostCommentForPullRequestInput extends InputTypesUnion {
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
      * <p>The full commit ID of the commit in the source branch that is the current tip of the branch for the pull request when you post the comment.</p>
      */
    var afterCommitId: String = js.native
    /**
      * <p>The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull request was created.</p>
      */
    var beforeCommitId: String = js.native
    /**
      * <p>A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request will return information about the initial request that used that token.</p>
      */
    var clientRequestToken: js.UndefOr[String] = js.native
    /**
      * <p>The content of your comment on the change.</p>
      */
    var content: String = js.native
    /**
      * <p>The location of the change where you want to post your comment. If no location is provided, the comment will be posted as a general comment on the pull request difference between the before commit ID and the after commit ID.</p>
      */
    var location: js.UndefOr[Location] = js.native
    /**
      * <p>The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.</p>
      */
    var pullRequestId: String = js.native
    /**
      * <p>The name of the repository where you want to post a comment on a pull request.</p>
      */
    var repositoryName: String = js.native
  }
  
}

