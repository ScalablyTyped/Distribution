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
  def apply(reactionsForComment: ReactionsForCommentList): GetCommentReactionsOutput = {
    val __obj = js.Dynamic.literal(reactionsForComment = reactionsForComment.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommentReactionsOutput]
  }
  @scala.inline
  implicit class GetCommentReactionsOutputOps[Self <: GetCommentReactionsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReactionsForCommentVarargs(value: ReactionForComment*): Self = this.set("reactionsForComment", js.Array(value :_*))
    @scala.inline
    def setReactionsForComment(value: ReactionsForCommentList): Self = this.set("reactionsForComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

