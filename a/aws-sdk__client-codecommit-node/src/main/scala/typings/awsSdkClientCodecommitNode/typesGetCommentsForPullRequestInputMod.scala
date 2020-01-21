package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/GetCommentsForPullRequestInput", JSImport.Namespace)
@js.native
object typesGetCommentsForPullRequestInputMod extends js.Object {
  @js.native
  trait GetCommentsForPullRequestInput extends InputTypesUnion {
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
      * <p>The full commit ID of the commit in the source branch that was the tip of the branch at the time the comment was made.</p>
      */
    var afterCommitId: js.UndefOr[String] = js.native
    /**
      * <p>The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull request was created.</p>
      */
    var beforeCommitId: js.UndefOr[String] = js.native
    /**
      * <p>A non-negative integer used to limit the number of returned results. The default is 100 comments. You can return up to 500 comments with a single request.</p>
      */
    var maxResults: js.UndefOr[Double] = js.native
    /**
      * <p>An enumeration token that when provided in a request, returns the next batch of the results.</p>
      */
    var nextToken: js.UndefOr[String] = js.native
    /**
      * <p>The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.</p>
      */
    var pullRequestId: String = js.native
    /**
      * <p>The name of the repository that contains the pull request.</p>
      */
    var repositoryName: js.UndefOr[String] = js.native
  }
  
}

