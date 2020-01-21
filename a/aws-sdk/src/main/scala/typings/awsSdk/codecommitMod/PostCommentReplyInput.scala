package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostCommentReplyInput extends js.Object {
  /**
    * A unique, client-generated idempotency token that, when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request returns information about the initial request that used that token.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  /**
    * The contents of your reply to a comment.
    */
  var content: Content = js.native
  /**
    * The system-generated ID of the comment to which you want to reply. To get this ID, use GetCommentsForComparedCommit or GetCommentsForPullRequest.
    */
  var inReplyTo: CommentId = js.native
}

object PostCommentReplyInput {
  @scala.inline
  def apply(content: Content, inReplyTo: CommentId, clientRequestToken: ClientRequestToken = null): PostCommentReplyInput = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], inReplyTo = inReplyTo.asInstanceOf[js.Any])
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCommentReplyInput]
  }
}

