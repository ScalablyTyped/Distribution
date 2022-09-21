package typings.backlogJs.optionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PullRequest {
  
  trait GetPullRequestCommentsParams extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var maxId: js.UndefOr[Double] = js.undefined
    
    var minId: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[Order] = js.undefined
  }
  object GetPullRequestCommentsParams {
    
    inline def apply(): GetPullRequestCommentsParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPullRequestCommentsParams]
    }
    
    extension [Self <: GetPullRequestCommentsParams](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setMaxId(value: Double): Self = StObject.set(x, "maxId", value.asInstanceOf[js.Any])
      
      inline def setMaxIdUndefined: Self = StObject.set(x, "maxId", js.undefined)
      
      inline def setMinId(value: Double): Self = StObject.set(x, "minId", value.asInstanceOf[js.Any])
      
      inline def setMinIdUndefined: Self = StObject.set(x, "minId", js.undefined)
      
      inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  trait GetPullRequestsParams extends StObject {
    
    var assigneeId: js.UndefOr[js.Array[Double]] = js.undefined
    
    var count: js.UndefOr[Double] = js.undefined
    
    var createdUserId: js.UndefOr[js.Array[Double]] = js.undefined
    
    var issueId: js.UndefOr[js.Array[Double]] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var statusId: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object GetPullRequestsParams {
    
    inline def apply(): GetPullRequestsParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPullRequestsParams]
    }
    
    extension [Self <: GetPullRequestsParams](x: Self) {
      
      inline def setAssigneeId(value: js.Array[Double]): Self = StObject.set(x, "assigneeId", value.asInstanceOf[js.Any])
      
      inline def setAssigneeIdUndefined: Self = StObject.set(x, "assigneeId", js.undefined)
      
      inline def setAssigneeIdVarargs(value: Double*): Self = StObject.set(x, "assigneeId", js.Array(value*))
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setCreatedUserId(value: js.Array[Double]): Self = StObject.set(x, "createdUserId", value.asInstanceOf[js.Any])
      
      inline def setCreatedUserIdUndefined: Self = StObject.set(x, "createdUserId", js.undefined)
      
      inline def setCreatedUserIdVarargs(value: Double*): Self = StObject.set(x, "createdUserId", js.Array(value*))
      
      inline def setIssueId(value: js.Array[Double]): Self = StObject.set(x, "issueId", value.asInstanceOf[js.Any])
      
      inline def setIssueIdUndefined: Self = StObject.set(x, "issueId", js.undefined)
      
      inline def setIssueIdVarargs(value: Double*): Self = StObject.set(x, "issueId", js.Array(value*))
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setStatusId(value: js.Array[Double]): Self = StObject.set(x, "statusId", value.asInstanceOf[js.Any])
      
      inline def setStatusIdUndefined: Self = StObject.set(x, "statusId", js.undefined)
      
      inline def setStatusIdVarargs(value: Double*): Self = StObject.set(x, "statusId", js.Array(value*))
    }
  }
  
  trait PatchPullRequestCommentsParams extends StObject {
    
    var content: String
  }
  object PatchPullRequestCommentsParams {
    
    inline def apply(content: String): PatchPullRequestCommentsParams = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[PatchPullRequestCommentsParams]
    }
    
    extension [Self <: PatchPullRequestCommentsParams](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
  
  trait PatchPullRequestParams extends StObject {
    
    var assigneeId: js.UndefOr[Double] = js.undefined
    
    var comment: js.UndefOr[js.Array[String]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var issueId: js.UndefOr[Double] = js.undefined
    
    var notifiedUserId: js.UndefOr[js.Array[Double]] = js.undefined
    
    var summary: js.UndefOr[String] = js.undefined
  }
  object PatchPullRequestParams {
    
    inline def apply(): PatchPullRequestParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatchPullRequestParams]
    }
    
    extension [Self <: PatchPullRequestParams](x: Self) {
      
      inline def setAssigneeId(value: Double): Self = StObject.set(x, "assigneeId", value.asInstanceOf[js.Any])
      
      inline def setAssigneeIdUndefined: Self = StObject.set(x, "assigneeId", js.undefined)
      
      inline def setComment(value: js.Array[String]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setCommentVarargs(value: String*): Self = StObject.set(x, "comment", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setIssueId(value: Double): Self = StObject.set(x, "issueId", value.asInstanceOf[js.Any])
      
      inline def setIssueIdUndefined: Self = StObject.set(x, "issueId", js.undefined)
      
      inline def setNotifiedUserId(value: js.Array[Double]): Self = StObject.set(x, "notifiedUserId", value.asInstanceOf[js.Any])
      
      inline def setNotifiedUserIdUndefined: Self = StObject.set(x, "notifiedUserId", js.undefined)
      
      inline def setNotifiedUserIdVarargs(value: Double*): Self = StObject.set(x, "notifiedUserId", js.Array(value*))
      
      inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    }
  }
  
  trait PostPullRequestCommentsParams extends StObject {
    
    var content: String
    
    var notifiedUserId: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object PostPullRequestCommentsParams {
    
    inline def apply(content: String): PostPullRequestCommentsParams = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostPullRequestCommentsParams]
    }
    
    extension [Self <: PostPullRequestCommentsParams](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setNotifiedUserId(value: js.Array[Double]): Self = StObject.set(x, "notifiedUserId", value.asInstanceOf[js.Any])
      
      inline def setNotifiedUserIdUndefined: Self = StObject.set(x, "notifiedUserId", js.undefined)
      
      inline def setNotifiedUserIdVarargs(value: Double*): Self = StObject.set(x, "notifiedUserId", js.Array(value*))
    }
  }
  
  trait PostPullRequestParams extends StObject {
    
    var assigneeId: js.UndefOr[Double] = js.undefined
    
    var attachmentId: js.UndefOr[js.Array[Double]] = js.undefined
    
    var base: String
    
    var branch: String
    
    var description: String
    
    var issueId: js.UndefOr[Double] = js.undefined
    
    var notifiedUserId: js.UndefOr[js.Array[Double]] = js.undefined
    
    var summary: String
  }
  object PostPullRequestParams {
    
    inline def apply(base: String, branch: String, description: String, summary: String): PostPullRequestParams = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostPullRequestParams]
    }
    
    extension [Self <: PostPullRequestParams](x: Self) {
      
      inline def setAssigneeId(value: Double): Self = StObject.set(x, "assigneeId", value.asInstanceOf[js.Any])
      
      inline def setAssigneeIdUndefined: Self = StObject.set(x, "assigneeId", js.undefined)
      
      inline def setAttachmentId(value: js.Array[Double]): Self = StObject.set(x, "attachmentId", value.asInstanceOf[js.Any])
      
      inline def setAttachmentIdUndefined: Self = StObject.set(x, "attachmentId", js.undefined)
      
      inline def setAttachmentIdVarargs(value: Double*): Self = StObject.set(x, "attachmentId", js.Array(value*))
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setIssueId(value: Double): Self = StObject.set(x, "issueId", value.asInstanceOf[js.Any])
      
      inline def setIssueIdUndefined: Self = StObject.set(x, "issueId", js.undefined)
      
      inline def setNotifiedUserId(value: js.Array[Double]): Self = StObject.set(x, "notifiedUserId", value.asInstanceOf[js.Any])
      
      inline def setNotifiedUserIdUndefined: Self = StObject.set(x, "notifiedUserId", js.undefined)
      
      inline def setNotifiedUserIdVarargs(value: Double*): Self = StObject.set(x, "notifiedUserId", js.Array(value*))
      
      inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    }
  }
}
