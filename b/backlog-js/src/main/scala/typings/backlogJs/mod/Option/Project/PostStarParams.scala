package typings.backlogJs.mod.Option.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostStarParams extends StObject {
  
  var commentId: js.UndefOr[Double] = js.undefined
  
  var issueId: js.UndefOr[Double] = js.undefined
  
  var pullRequestCommentId: js.UndefOr[Double] = js.undefined
  
  var pullRequestId: js.UndefOr[Double] = js.undefined
  
  var wikiId: js.UndefOr[Double] = js.undefined
}
object PostStarParams {
  
  @scala.inline
  def apply(): PostStarParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostStarParams]
  }
  
  @scala.inline
  implicit class PostStarParamsMutableBuilder[Self <: PostStarParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommentId(value: Double): Self = StObject.set(x, "commentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentIdUndefined: Self = StObject.set(x, "commentId", js.undefined)
    
    @scala.inline
    def setIssueId(value: Double): Self = StObject.set(x, "issueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssueIdUndefined: Self = StObject.set(x, "issueId", js.undefined)
    
    @scala.inline
    def setPullRequestCommentId(value: Double): Self = StObject.set(x, "pullRequestCommentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestCommentIdUndefined: Self = StObject.set(x, "pullRequestCommentId", js.undefined)
    
    @scala.inline
    def setPullRequestId(value: Double): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestIdUndefined: Self = StObject.set(x, "pullRequestId", js.undefined)
    
    @scala.inline
    def setWikiId(value: Double): Self = StObject.set(x, "wikiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWikiIdUndefined: Self = StObject.set(x, "wikiId", js.undefined)
  }
}
