package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCommentsForComparedCommitOutput extends js.Object {
  
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
  implicit class GetCommentsForComparedCommitOutputOps[Self <: GetCommentsForComparedCommitOutput] (val x: Self) extends AnyVal {
    
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
    def setCommentsForComparedCommitDataVarargs(value: CommentsForComparedCommit*): Self = this.set("commentsForComparedCommitData", js.Array(value :_*))
    
    @scala.inline
    def setCommentsForComparedCommitData(value: CommentsForComparedCommitData): Self = this.set("commentsForComparedCommitData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentsForComparedCommitData: Self = this.set("commentsForComparedCommitData", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
