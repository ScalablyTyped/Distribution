package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCommentsForPullRequestOutput extends js.Object {
  
  /**
    * An array of comment objects on the pull request.
    */
  var commentsForPullRequestData: js.UndefOr[CommentsForPullRequestData] = js.native
  
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object GetCommentsForPullRequestOutput {
  
  @scala.inline
  def apply(): GetCommentsForPullRequestOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCommentsForPullRequestOutput]
  }
  
  @scala.inline
  implicit class GetCommentsForPullRequestOutputOps[Self <: GetCommentsForPullRequestOutput] (val x: Self) extends AnyVal {
    
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
    def setCommentsForPullRequestDataVarargs(value: CommentsForPullRequest*): Self = this.set("commentsForPullRequestData", js.Array(value :_*))
    
    @scala.inline
    def setCommentsForPullRequestData(value: CommentsForPullRequestData): Self = this.set("commentsForPullRequestData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentsForPullRequestData: Self = this.set("commentsForPullRequestData", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
