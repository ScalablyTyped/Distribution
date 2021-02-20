package typings.backlogJs.mod.Option

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PullRequest {
  
  @js.native
  trait GetPullRequestCommentsParams extends StObject {
    
    var count: js.UndefOr[Double] = js.native
    
    var maxId: js.UndefOr[Double] = js.native
    
    var minId: js.UndefOr[Double] = js.native
    
    var order: js.UndefOr[Order] = js.native
  }
  object GetPullRequestCommentsParams {
    
    @scala.inline
    def apply(): GetPullRequestCommentsParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPullRequestCommentsParams]
    }
    
    @scala.inline
    implicit class GetPullRequestCommentsParamsMutableBuilder[Self <: GetPullRequestCommentsParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setMaxId(value: Double): Self = StObject.set(x, "maxId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxIdUndefined: Self = StObject.set(x, "maxId", js.undefined)
      
      @scala.inline
      def setMinId(value: Double): Self = StObject.set(x, "minId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinIdUndefined: Self = StObject.set(x, "minId", js.undefined)
      
      @scala.inline
      def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  @js.native
  trait GetPullRequestsParams extends StObject {
    
    var assigneeId: js.UndefOr[js.Array[Double]] = js.native
    
    var count: js.UndefOr[Double] = js.native
    
    var createdUserId: js.UndefOr[js.Array[Double]] = js.native
    
    var issueId: js.UndefOr[js.Array[Double]] = js.native
    
    var offset: js.UndefOr[Double] = js.native
    
    var statusId: js.UndefOr[js.Array[Double]] = js.native
  }
  object GetPullRequestsParams {
    
    @scala.inline
    def apply(): GetPullRequestsParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPullRequestsParams]
    }
    
    @scala.inline
    implicit class GetPullRequestsParamsMutableBuilder[Self <: GetPullRequestsParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssigneeId(value: js.Array[Double]): Self = StObject.set(x, "assigneeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssigneeIdUndefined: Self = StObject.set(x, "assigneeId", js.undefined)
      
      @scala.inline
      def setAssigneeIdVarargs(value: Double*): Self = StObject.set(x, "assigneeId", js.Array(value :_*))
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setCreatedUserId(value: js.Array[Double]): Self = StObject.set(x, "createdUserId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedUserIdUndefined: Self = StObject.set(x, "createdUserId", js.undefined)
      
      @scala.inline
      def setCreatedUserIdVarargs(value: Double*): Self = StObject.set(x, "createdUserId", js.Array(value :_*))
      
      @scala.inline
      def setIssueId(value: js.Array[Double]): Self = StObject.set(x, "issueId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssueIdUndefined: Self = StObject.set(x, "issueId", js.undefined)
      
      @scala.inline
      def setIssueIdVarargs(value: Double*): Self = StObject.set(x, "issueId", js.Array(value :_*))
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setStatusId(value: js.Array[Double]): Self = StObject.set(x, "statusId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusIdUndefined: Self = StObject.set(x, "statusId", js.undefined)
      
      @scala.inline
      def setStatusIdVarargs(value: Double*): Self = StObject.set(x, "statusId", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PatchPullRequestCommentsParams extends StObject {
    
    var content: String = js.native
  }
  object PatchPullRequestCommentsParams {
    
    @scala.inline
    def apply(content: String): PatchPullRequestCommentsParams = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[PatchPullRequestCommentsParams]
    }
    
    @scala.inline
    implicit class PatchPullRequestCommentsParamsMutableBuilder[Self <: PatchPullRequestCommentsParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PatchPullRequestParams extends StObject {
    
    var assigneeId: js.UndefOr[Double] = js.native
    
    var comment: js.UndefOr[js.Array[String]] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var issueId: js.UndefOr[Double] = js.native
    
    var notifiedUserId: js.UndefOr[js.Array[Double]] = js.native
    
    var summary: js.UndefOr[String] = js.native
  }
  object PatchPullRequestParams {
    
    @scala.inline
    def apply(): PatchPullRequestParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatchPullRequestParams]
    }
    
    @scala.inline
    implicit class PatchPullRequestParamsMutableBuilder[Self <: PatchPullRequestParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssigneeId(value: Double): Self = StObject.set(x, "assigneeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssigneeIdUndefined: Self = StObject.set(x, "assigneeId", js.undefined)
      
      @scala.inline
      def setComment(value: js.Array[String]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setCommentVarargs(value: String*): Self = StObject.set(x, "comment", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setIssueId(value: Double): Self = StObject.set(x, "issueId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssueIdUndefined: Self = StObject.set(x, "issueId", js.undefined)
      
      @scala.inline
      def setNotifiedUserId(value: js.Array[Double]): Self = StObject.set(x, "notifiedUserId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotifiedUserIdUndefined: Self = StObject.set(x, "notifiedUserId", js.undefined)
      
      @scala.inline
      def setNotifiedUserIdVarargs(value: Double*): Self = StObject.set(x, "notifiedUserId", js.Array(value :_*))
      
      @scala.inline
      def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    }
  }
  
  @js.native
  trait PostPullRequestCommentsParams extends StObject {
    
    var content: String = js.native
    
    var notifiedUserId: js.UndefOr[js.Array[Double]] = js.native
  }
  object PostPullRequestCommentsParams {
    
    @scala.inline
    def apply(content: String): PostPullRequestCommentsParams = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostPullRequestCommentsParams]
    }
    
    @scala.inline
    implicit class PostPullRequestCommentsParamsMutableBuilder[Self <: PostPullRequestCommentsParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotifiedUserId(value: js.Array[Double]): Self = StObject.set(x, "notifiedUserId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotifiedUserIdUndefined: Self = StObject.set(x, "notifiedUserId", js.undefined)
      
      @scala.inline
      def setNotifiedUserIdVarargs(value: Double*): Self = StObject.set(x, "notifiedUserId", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PostPullRequestParams extends StObject {
    
    var assigneeId: js.UndefOr[Double] = js.native
    
    var attachmentId: js.UndefOr[js.Array[Double]] = js.native
    
    var base: String = js.native
    
    var branch: String = js.native
    
    var description: String = js.native
    
    var issueId: js.UndefOr[Double] = js.native
    
    var notifiedUserId: js.UndefOr[js.Array[Double]] = js.native
    
    var summary: String = js.native
  }
  object PostPullRequestParams {
    
    @scala.inline
    def apply(base: String, branch: String, description: String, summary: String): PostPullRequestParams = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostPullRequestParams]
    }
    
    @scala.inline
    implicit class PostPullRequestParamsMutableBuilder[Self <: PostPullRequestParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssigneeId(value: Double): Self = StObject.set(x, "assigneeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssigneeIdUndefined: Self = StObject.set(x, "assigneeId", js.undefined)
      
      @scala.inline
      def setAttachmentId(value: js.Array[Double]): Self = StObject.set(x, "attachmentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachmentIdUndefined: Self = StObject.set(x, "attachmentId", js.undefined)
      
      @scala.inline
      def setAttachmentIdVarargs(value: Double*): Self = StObject.set(x, "attachmentId", js.Array(value :_*))
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssueId(value: Double): Self = StObject.set(x, "issueId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssueIdUndefined: Self = StObject.set(x, "issueId", js.undefined)
      
      @scala.inline
      def setNotifiedUserId(value: js.Array[Double]): Self = StObject.set(x, "notifiedUserId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotifiedUserIdUndefined: Self = StObject.set(x, "notifiedUserId", js.undefined)
      
      @scala.inline
      def setNotifiedUserIdVarargs(value: Double*): Self = StObject.set(x, "notifiedUserId", js.Array(value :_*))
      
      @scala.inline
      def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    }
  }
}
