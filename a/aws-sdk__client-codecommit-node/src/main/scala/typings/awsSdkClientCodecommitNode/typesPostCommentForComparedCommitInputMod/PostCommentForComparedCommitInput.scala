package typings.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitInputMod

import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.typesLocationMod.Location
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostCommentForComparedCommitInput extends InputTypesUnion {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[NodeHttpOptions] = js.undefined
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.undefined
  /**
    * <p>To establish the directionality of the comparison, the full commit ID of the 'after' commit.</p>
    */
  var afterCommitId: String
  /**
    * <p>To establish the directionality of the comparison, the full commit ID of the 'before' commit.</p>
    */
  var beforeCommitId: js.UndefOr[String] = js.undefined
  /**
    * <p>A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request will return information about the initial request that used that token.</p>
    */
  var clientRequestToken: js.UndefOr[String] = js.undefined
  /**
    * <p>The content of the comment you want to make.</p>
    */
  var content: String
  /**
    * <p>The location of the comparison where you want to comment.</p>
    */
  var location: js.UndefOr[Location] = js.undefined
  /**
    * <p>The name of the repository where you want to post a comment on the comparison between commits.</p>
    */
  var repositoryName: String
}

object PostCommentForComparedCommitInput {
  @scala.inline
  def apply(
    afterCommitId: String,
    content: String,
    repositoryName: String,
    $abortSignal: AbortSignal = null,
    $httpOptions: NodeHttpOptions = null,
    $maxRetries: Int | Double = null,
    beforeCommitId: String = null,
    clientRequestToken: String = null,
    location: Location = null
  ): PostCommentForComparedCommitInput = {
    val __obj = js.Dynamic.literal(afterCommitId = afterCommitId.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    if (beforeCommitId != null) __obj.updateDynamic("beforeCommitId")(beforeCommitId.asInstanceOf[js.Any])
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCommentForComparedCommitInput]
  }
}

