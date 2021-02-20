package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCommentsForComparedCommitOutput extends StObject {
  
  /**
    * A list of comment objects on the compared commit.
    */
  var commentsForComparedCommitData: js.UndefOr[CommentsForComparedCommitData] = js.native
  
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object GetCommentsForComparedCommitOutput {
  
  @scala.inline
  def apply(): GetCommentsForComparedCommitOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCommentsForComparedCommitOutput]
  }
  
  @scala.inline
  implicit class GetCommentsForComparedCommitOutputMutableBuilder[Self <: GetCommentsForComparedCommitOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommentsForComparedCommitData(value: CommentsForComparedCommitData): Self = StObject.set(x, "commentsForComparedCommitData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsForComparedCommitDataUndefined: Self = StObject.set(x, "commentsForComparedCommitData", js.undefined)
    
    @scala.inline
    def setCommentsForComparedCommitDataVarargs(value: CommentsForComparedCommit*): Self = StObject.set(x, "commentsForComparedCommitData", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
