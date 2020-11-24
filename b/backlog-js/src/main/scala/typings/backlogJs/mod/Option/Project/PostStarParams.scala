package typings.backlogJs.mod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostStarParams extends js.Object {
  
  var commentId: js.UndefOr[Double] = js.native
  
  var issueId: js.UndefOr[Double] = js.native
  
  var pullRequestCommentId: js.UndefOr[Double] = js.native
  
  var pullRequestId: js.UndefOr[Double] = js.native
  
  var wikiId: js.UndefOr[Double] = js.native
}
object PostStarParams {
  
  @scala.inline
  def apply(): PostStarParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostStarParams]
  }
  
  @scala.inline
  implicit class PostStarParamsOps[Self <: PostStarParams] (val x: Self) extends AnyVal {
    
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
    def setCommentId(value: Double): Self = this.set("commentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentId: Self = this.set("commentId", js.undefined)
    
    @scala.inline
    def setIssueId(value: Double): Self = this.set("issueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssueId: Self = this.set("issueId", js.undefined)
    
    @scala.inline
    def setPullRequestCommentId(value: Double): Self = this.set("pullRequestCommentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullRequestCommentId: Self = this.set("pullRequestCommentId", js.undefined)
    
    @scala.inline
    def setPullRequestId(value: Double): Self = this.set("pullRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullRequestId: Self = this.set("pullRequestId", js.undefined)
    
    @scala.inline
    def setWikiId(value: Double): Self = this.set("wikiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWikiId: Self = this.set("wikiId", js.undefined)
  }
}
