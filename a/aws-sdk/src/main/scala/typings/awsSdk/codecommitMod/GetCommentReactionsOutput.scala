package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCommentReactionsOutput extends js.Object {
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * An array of reactions to the specified comment.
    */
  var reactionsForComment: ReactionsForCommentList = js.native
}

object GetCommentReactionsOutput {
  @scala.inline
  def apply(reactionsForComment: ReactionsForCommentList, nextToken: NextToken = null): GetCommentReactionsOutput = {
    val __obj = js.Dynamic.literal(reactionsForComment = reactionsForComment.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommentReactionsOutput]
  }
}

