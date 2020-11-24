package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(commentId: CommentId): GetCommentReactionsInput = {
    val __obj = js.Dynamic.literal(commentId = commentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommentReactionsInput]
  }
  
  @scala.inline
  implicit class GetCommentReactionsInputOps[Self <: GetCommentReactionsInput] (val x: Self) extends AnyVal {
    
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
    def setCommentId(value: CommentId): Self = this.set("commentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setReactionUserArn(value: Arn): Self = this.set("reactionUserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReactionUserArn: Self = this.set("reactionUserArn", js.undefined)
  }
}
