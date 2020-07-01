package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCommentReactionsInput extends js.Object {
  /**
    * The ID of the comment for which you want to get reactions information.
    */
  var commentId: CommentId = js.native
  /**
    * A non-zero, non-negative integer used to limit the number of returned results. The default is the same as the allowed maximum, 1,000.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * Optional. The Amazon Resource Name (ARN) of the user or identity for which you want to get reaction information.
    */
  var reactionUserArn: js.UndefOr[Arn] = js.native
}

object GetCommentReactionsInput {
  @scala.inline
  def apply(
    commentId: CommentId,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null,
    reactionUserArn: Arn = null
  ): GetCommentReactionsInput = {
    val __obj = js.Dynamic.literal(commentId = commentId.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (reactionUserArn != null) __obj.updateDynamic("reactionUserArn")(reactionUserArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommentReactionsInput]
  }
}

