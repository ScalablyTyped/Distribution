package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCommentReactionsOutput extends StObject {
  
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An array of reactions to the specified comment.
    */
  var reactionsForComment: ReactionsForCommentList
}
object GetCommentReactionsOutput {
  
  @scala.inline
  def apply(reactionsForComment: ReactionsForCommentList): GetCommentReactionsOutput = {
    val __obj = js.Dynamic.literal(reactionsForComment = reactionsForComment.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommentReactionsOutput]
  }
  
  @scala.inline
  implicit class GetCommentReactionsOutputMutableBuilder[Self <: GetCommentReactionsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setReactionsForComment(value: ReactionsForCommentList): Self = StObject.set(x, "reactionsForComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReactionsForCommentVarargs(value: ReactionForComment*): Self = StObject.set(x, "reactionsForComment", js.Array(value :_*))
  }
}
