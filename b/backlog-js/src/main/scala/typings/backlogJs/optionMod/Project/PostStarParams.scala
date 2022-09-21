package typings.backlogJs.optionMod.Project

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
  
  inline def apply(): PostStarParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostStarParams]
  }
  
  extension [Self <: PostStarParams](x: Self) {
    
    inline def setCommentId(value: Double): Self = StObject.set(x, "commentId", value.asInstanceOf[js.Any])
    
    inline def setCommentIdUndefined: Self = StObject.set(x, "commentId", js.undefined)
    
    inline def setIssueId(value: Double): Self = StObject.set(x, "issueId", value.asInstanceOf[js.Any])
    
    inline def setIssueIdUndefined: Self = StObject.set(x, "issueId", js.undefined)
    
    inline def setPullRequestCommentId(value: Double): Self = StObject.set(x, "pullRequestCommentId", value.asInstanceOf[js.Any])
    
    inline def setPullRequestCommentIdUndefined: Self = StObject.set(x, "pullRequestCommentId", js.undefined)
    
    inline def setPullRequestId(value: Double): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
    
    inline def setPullRequestIdUndefined: Self = StObject.set(x, "pullRequestId", js.undefined)
    
    inline def setWikiId(value: Double): Self = StObject.set(x, "wikiId", value.asInstanceOf[js.Any])
    
    inline def setWikiIdUndefined: Self = StObject.set(x, "wikiId", js.undefined)
  }
}
