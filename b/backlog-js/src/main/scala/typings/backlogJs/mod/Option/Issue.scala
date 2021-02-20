package typings.backlogJs.mod.Option

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Issue {
  
  @js.native
  sealed trait ParentChildType extends StObject
  @JSImport("backlog-js", "Option.Issue.ParentChildType")
  @js.native
  object ParentChildType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ParentChildType with Double] = js.native
    
    @js.native
    sealed trait All extends ParentChildType
    /* 0 */ val All: typings.backlogJs.mod.Option.Issue.ParentChildType.All with Double = js.native
    
    @js.native
    sealed trait Child extends ParentChildType
    /* 2 */ val Child: typings.backlogJs.mod.Option.Issue.ParentChildType.Child with Double = js.native
    
    @js.native
    sealed trait NotChild extends ParentChildType
    /* 1 */ val NotChild: typings.backlogJs.mod.Option.Issue.ParentChildType.NotChild with Double = js.native
    
    @js.native
    sealed trait NotChildNotParent extends ParentChildType
    /* 3 */ val NotChildNotParent: typings.backlogJs.mod.Option.Issue.ParentChildType.NotChildNotParent with Double = js.native
    
    @js.native
    sealed trait Parent extends ParentChildType
    /* 4 */ val Parent: typings.backlogJs.mod.Option.Issue.ParentChildType.Parent with Double = js.native
  }
  
  @js.native
  trait GetIssueCommentsParams extends StObject {
    
    var count: js.UndefOr[Double] = js.native
    
    var maxId: js.UndefOr[Double] = js.native
    
    var minId: js.UndefOr[Double] = js.native
    
    var order: js.UndefOr[Order] = js.native
  }
  object GetIssueCommentsParams {
    
    @scala.inline
    def apply(): GetIssueCommentsParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetIssueCommentsParams]
    }
    
    @scala.inline
    implicit class GetIssueCommentsParamsMutableBuilder[Self <: GetIssueCommentsParams] (val x: Self) extends AnyVal {
      
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
  trait GetIssuesParams
    extends /* customField_ */ StringDictionary[js.Any] {
    
    var assigneeId: js.UndefOr[js.Array[Double]] = js.native
    
    var attachment: js.UndefOr[Boolean] = js.native
    
    var categoryId: js.UndefOr[js.Array[Double]] = js.native
    
    var count: js.UndefOr[Double] = js.native
    
    var createdSince: js.UndefOr[String] = js.native
    
    var createdUntil: js.UndefOr[String] = js.native
    
    var createdUserId: js.UndefOr[js.Array[Double]] = js.native
    
    var dueDateSince: js.UndefOr[String] = js.native
    
    var dueDateUntil: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[js.Array[Double]] = js.native
    
    var issueTypeId: js.UndefOr[js.Array[Double]] = js.native
    
    var keyword: String = js.native
    
    var milestoneId: js.UndefOr[js.Array[Double]] = js.native
    
    var offset: js.UndefOr[Double] = js.native
    
    var order: js.UndefOr[Order] = js.native
    
    var parentChild: js.UndefOr[ParentChildType] = js.native
    
    var parentIssueId: js.UndefOr[js.Array[Double]] = js.native
    
    var priorityId: js.UndefOr[js.Array[Double]] = js.native
    
    var projectId: js.UndefOr[js.Array[Double]] = js.native
    
    var resolutionId: js.UndefOr[js.Array[Double]] = js.native
    
    var sharedFile: js.UndefOr[Boolean] = js.native
    
    var sort: js.UndefOr[SortKey] = js.native
    
    var startDateSince: js.UndefOr[String] = js.native
    
    var startDateUntil: js.UndefOr[String] = js.native
    
    var statusId: js.UndefOr[js.Array[Double]] = js.native
    
    var updatedSince: js.UndefOr[String] = js.native
    
    var updatedUntil: js.UndefOr[String] = js.native
    
    var versionId: js.UndefOr[js.Array[Double]] = js.native
  }
  object GetIssuesParams {
    
    @scala.inline
    def apply(keyword: String): GetIssuesParams = {
      val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetIssuesParams]
    }
    
    @scala.inline
    implicit class GetIssuesParamsMutableBuilder[Self <: GetIssuesParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssigneeId(value: js.Array[Double]): Self = StObject.set(x, "assigneeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssigneeIdUndefined: Self = StObject.set(x, "assigneeId", js.undefined)
      
      @scala.inline
      def setAssigneeIdVarargs(value: Double*): Self = StObject.set(x, "assigneeId", js.Array(value :_*))
      
      @scala.inline
      def setAttachment(value: Boolean): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
      
      @scala.inline
      def setCategoryId(value: js.Array[Double]): Self = StObject.set(x, "categoryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryIdUndefined: Self = StObject.set(x, "categoryId", js.undefined)
      
      @scala.inline
      def setCategoryIdVarargs(value: Double*): Self = StObject.set(x, "categoryId", js.Array(value :_*))
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setCreatedSince(value: String): Self = StObject.set(x, "createdSince", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedSinceUndefined: Self = StObject.set(x, "createdSince", js.undefined)
      
      @scala.inline
      def setCreatedUntil(value: String): Self = StObject.set(x, "createdUntil", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedUntilUndefined: Self = StObject.set(x, "createdUntil", js.undefined)
      
      @scala.inline
      def setCreatedUserId(value: js.Array[Double]): Self = StObject.set(x, "createdUserId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedUserIdUndefined: Self = StObject.set(x, "createdUserId", js.undefined)
      
      @scala.inline
      def setCreatedUserIdVarargs(value: Double*): Self = StObject.set(x, "createdUserId", js.Array(value :_*))
      
      @scala.inline
      def setDueDateSince(value: String): Self = StObject.set(x, "dueDateSince", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDueDateSinceUndefined: Self = StObject.set(x, "dueDateSince", js.undefined)
      
      @scala.inline
      def setDueDateUntil(value: String): Self = StObject.set(x, "dueDateUntil", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDueDateUntilUndefined: Self = StObject.set(x, "dueDateUntil", js.undefined)
      
      @scala.inline
      def setId(value: js.Array[Double]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIdVarargs(value: Double*): Self = StObject.set(x, "id", js.Array(value :_*))
      
      @scala.inline
      def setIssueTypeId(value: js.Array[Double]): Self = StObject.set(x, "issueTypeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssueTypeIdUndefined: Self = StObject.set(x, "issueTypeId", js.undefined)
      
      @scala.inline
      def setIssueTypeIdVarargs(value: Double*): Self = StObject.set(x, "issueTypeId", js.Array(value :_*))
      
      @scala.inline
      def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMilestoneId(value: js.Array[Double]): Self = StObject.set(x, "milestoneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMilestoneIdUndefined: Self = StObject.set(x, "milestoneId", js.undefined)
      
      @scala.inline
      def setMilestoneIdVarargs(value: Double*): Self = StObject.set(x, "milestoneId", js.Array(value :_*))
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setParentChild(value: ParentChildType): Self = StObject.set(x, "parentChild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentChildUndefined: Self = StObject.set(x, "parentChild", js.undefined)
      
      @scala.inline
      def setParentIssueId(value: js.Array[Double]): Self = StObject.set(x, "parentIssueId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIssueIdUndefined: Self = StObject.set(x, "parentIssueId", js.undefined)
      
      @scala.inline
      def setParentIssueIdVarargs(value: Double*): Self = StObject.set(x, "parentIssueId", js.Array(value :_*))
      
      @scala.inline
      def setPriorityId(value: js.Array[Double]): Self = StObject.set(x, "priorityId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityIdUndefined: Self = StObject.set(x, "priorityId", js.undefined)
      
      @scala.inline
      def setPriorityIdVarargs(value: Double*): Self = StObject.set(x, "priorityId", js.Array(value :_*))
      
      @scala.inline
      def setProjectId(value: js.Array[Double]): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
      
      @scala.inline
      def setProjectIdVarargs(value: Double*): Self = StObject.set(x, "projectId", js.Array(value :_*))
      
      @scala.inline
      def setResolutionId(value: js.Array[Double]): Self = StObject.set(x, "resolutionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolutionIdUndefined: Self = StObject.set(x, "resolutionId", js.undefined)
      
      @scala.inline
      def setResolutionIdVarargs(value: Double*): Self = StObject.set(x, "resolutionId", js.Array(value :_*))
      
      @scala.inline
      def setSharedFile(value: Boolean): Self = StObject.set(x, "sharedFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedFileUndefined: Self = StObject.set(x, "sharedFile", js.undefined)
      
      @scala.inline
      def setSort(value: SortKey): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setStartDateSince(value: String): Self = StObject.set(x, "startDateSince", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDateSinceUndefined: Self = StObject.set(x, "startDateSince", js.undefined)
      
      @scala.inline
      def setStartDateUntil(value: String): Self = StObject.set(x, "startDateUntil", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDateUntilUndefined: Self = StObject.set(x, "startDateUntil", js.undefined)
      
      @scala.inline
      def setStatusId(value: js.Array[Double]): Self = StObject.set(x, "statusId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusIdUndefined: Self = StObject.set(x, "statusId", js.undefined)
      
      @scala.inline
      def setStatusIdVarargs(value: Double*): Self = StObject.set(x, "statusId", js.Array(value :_*))
      
      @scala.inline
      def setUpdatedSince(value: String): Self = StObject.set(x, "updatedSince", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedSinceUndefined: Self = StObject.set(x, "updatedSince", js.undefined)
      
      @scala.inline
      def setUpdatedUntil(value: String): Self = StObject.set(x, "updatedUntil", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedUntilUndefined: Self = StObject.set(x, "updatedUntil", js.undefined)
      
      @scala.inline
      def setVersionId(value: js.Array[Double]): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
      
      @scala.inline
      def setVersionIdVarargs(value: Double*): Self = StObject.set(x, "versionId", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IssueCommentNotifications extends StObject {
    
    var notifiedUserId: js.Array[Double] = js.native
  }
  object IssueCommentNotifications {
    
    @scala.inline
    def apply(notifiedUserId: js.Array[Double]): IssueCommentNotifications = {
      val __obj = js.Dynamic.literal(notifiedUserId = notifiedUserId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IssueCommentNotifications]
    }
    
    @scala.inline
    implicit class IssueCommentNotificationsMutableBuilder[Self <: IssueCommentNotifications] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNotifiedUserId(value: js.Array[Double]): Self = StObject.set(x, "notifiedUserId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotifiedUserIdVarargs(value: Double*): Self = StObject.set(x, "notifiedUserId", js.Array(value :_*))
    }
  }
  
  @js.native
  trait LinkIssueSharedFilesParams extends StObject {
    
    var fileId: js.Array[Double] = js.native
  }
  object LinkIssueSharedFilesParams {
    
    @scala.inline
    def apply(fileId: js.Array[Double]): LinkIssueSharedFilesParams = {
      val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkIssueSharedFilesParams]
    }
    
    @scala.inline
    implicit class LinkIssueSharedFilesParamsMutableBuilder[Self <: LinkIssueSharedFilesParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileId(value: js.Array[Double]): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileIdVarargs(value: Double*): Self = StObject.set(x, "fileId", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PatchIssueCommentParams extends StObject {
    
    var content: String = js.native
  }
  object PatchIssueCommentParams {
    
    @scala.inline
    def apply(content: String): PatchIssueCommentParams = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[PatchIssueCommentParams]
    }
    
    @scala.inline
    implicit class PatchIssueCommentParamsMutableBuilder[Self <: PatchIssueCommentParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PatchIssueParams
    extends /* customField_ */ StringDictionary[js.Any] {
    
    var actualHours: js.UndefOr[Double] = js.native
    
    var assigneeId: js.UndefOr[Double] = js.native
    
    var attachmentId: js.UndefOr[js.Array[Double]] = js.native
    
    var categoryId: js.UndefOr[js.Array[Double]] = js.native
    
    var comment: js.UndefOr[String] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var dueDate: js.UndefOr[String] = js.native
    
    var estimatedHours: js.UndefOr[Double] = js.native
    
    var issueTypeId: js.UndefOr[Double] = js.native
    
    var milestoneId: js.UndefOr[js.Array[Double]] = js.native
    
    var notifiedUserId: js.UndefOr[js.Array[Double]] = js.native
    
    var parentIssueId: js.UndefOr[Double] = js.native
    
    var priorityId: js.UndefOr[Double] = js.native
    
    var resolutionId: js.UndefOr[Double] = js.native
    
    var startDate: js.UndefOr[String] = js.native
    
    var statusId: js.UndefOr[Double] = js.native
    
    var summary: js.UndefOr[String] = js.native
    
    var versionId: js.UndefOr[js.Array[Double]] = js.native
  }
  object PatchIssueParams {
    
    @scala.inline
    def apply(): PatchIssueParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatchIssueParams]
    }
    
    @scala.inline
    implicit class PatchIssueParamsMutableBuilder[Self <: PatchIssueParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActualHours(value: Double): Self = StObject.set(x, "actualHours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActualHoursUndefined: Self = StObject.set(x, "actualHours", js.undefined)
      
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
      def setCategoryId(value: js.Array[Double]): Self = StObject.set(x, "categoryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryIdUndefined: Self = StObject.set(x, "categoryId", js.undefined)
      
      @scala.inline
      def setCategoryIdVarargs(value: Double*): Self = StObject.set(x, "categoryId", js.Array(value :_*))
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDueDate(value: String): Self = StObject.set(x, "dueDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDueDateUndefined: Self = StObject.set(x, "dueDate", js.undefined)
      
      @scala.inline
      def setEstimatedHours(value: Double): Self = StObject.set(x, "estimatedHours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEstimatedHoursUndefined: Self = StObject.set(x, "estimatedHours", js.undefined)
      
      @scala.inline
      def setIssueTypeId(value: Double): Self = StObject.set(x, "issueTypeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssueTypeIdUndefined: Self = StObject.set(x, "issueTypeId", js.undefined)
      
      @scala.inline
      def setMilestoneId(value: js.Array[Double]): Self = StObject.set(x, "milestoneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMilestoneIdUndefined: Self = StObject.set(x, "milestoneId", js.undefined)
      
      @scala.inline
      def setMilestoneIdVarargs(value: Double*): Self = StObject.set(x, "milestoneId", js.Array(value :_*))
      
      @scala.inline
      def setNotifiedUserId(value: js.Array[Double]): Self = StObject.set(x, "notifiedUserId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotifiedUserIdUndefined: Self = StObject.set(x, "notifiedUserId", js.undefined)
      
      @scala.inline
      def setNotifiedUserIdVarargs(value: Double*): Self = StObject.set(x, "notifiedUserId", js.Array(value :_*))
      
      @scala.inline
      def setParentIssueId(value: Double): Self = StObject.set(x, "parentIssueId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIssueIdUndefined: Self = StObject.set(x, "parentIssueId", js.undefined)
      
      @scala.inline
      def setPriorityId(value: Double): Self = StObject.set(x, "priorityId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityIdUndefined: Self = StObject.set(x, "priorityId", js.undefined)
      
      @scala.inline
      def setResolutionId(value: Double): Self = StObject.set(x, "resolutionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolutionIdUndefined: Self = StObject.set(x, "resolutionId", js.undefined)
      
      @scala.inline
      def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      @scala.inline
      def setStatusId(value: Double): Self = StObject.set(x, "statusId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusIdUndefined: Self = StObject.set(x, "statusId", js.undefined)
      
      @scala.inline
      def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      @scala.inline
      def setVersionId(value: js.Array[Double]): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
      
      @scala.inline
      def setVersionIdVarargs(value: Double*): Self = StObject.set(x, "versionId", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PostIssueCommentsParams extends StObject {
    
    var attachmentId: js.UndefOr[js.Array[Double]] = js.native
    
    var content: String = js.native
    
    var notifiedUserId: js.UndefOr[js.Array[Double]] = js.native
  }
  object PostIssueCommentsParams {
    
    @scala.inline
    def apply(content: String): PostIssueCommentsParams = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostIssueCommentsParams]
    }
    
    @scala.inline
    implicit class PostIssueCommentsParamsMutableBuilder[Self <: PostIssueCommentsParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachmentId(value: js.Array[Double]): Self = StObject.set(x, "attachmentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachmentIdUndefined: Self = StObject.set(x, "attachmentId", js.undefined)
      
      @scala.inline
      def setAttachmentIdVarargs(value: Double*): Self = StObject.set(x, "attachmentId", js.Array(value :_*))
      
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
  trait PostIssueParams
    extends /* customField_ */ StringDictionary[js.Any] {
    
    var actualHours: js.UndefOr[Double] = js.native
    
    var assigneeId: js.UndefOr[Double] = js.native
    
    var attachmentId: js.UndefOr[js.Array[Double]] = js.native
    
    var categoryId: js.UndefOr[js.Array[Double]] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var dueDate: js.UndefOr[String] = js.native
    
    var estimatedHours: js.UndefOr[Double] = js.native
    
    var issueTypeId: Double = js.native
    
    var milestoneId: js.UndefOr[js.Array[Double]] = js.native
    
    var notifiedUserId: js.UndefOr[js.Array[Double]] = js.native
    
    var parentIssueId: js.UndefOr[Double] = js.native
    
    var priorityId: Double = js.native
    
    var projectId: Double = js.native
    
    var startDate: js.UndefOr[String] = js.native
    
    var summary: String = js.native
    
    var versionId: js.UndefOr[js.Array[Double]] = js.native
  }
  object PostIssueParams {
    
    @scala.inline
    def apply(issueTypeId: Double, priorityId: Double, projectId: Double, summary: String): PostIssueParams = {
      val __obj = js.Dynamic.literal(issueTypeId = issueTypeId.asInstanceOf[js.Any], priorityId = priorityId.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostIssueParams]
    }
    
    @scala.inline
    implicit class PostIssueParamsMutableBuilder[Self <: PostIssueParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActualHours(value: Double): Self = StObject.set(x, "actualHours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActualHoursUndefined: Self = StObject.set(x, "actualHours", js.undefined)
      
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
      def setCategoryId(value: js.Array[Double]): Self = StObject.set(x, "categoryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryIdUndefined: Self = StObject.set(x, "categoryId", js.undefined)
      
      @scala.inline
      def setCategoryIdVarargs(value: Double*): Self = StObject.set(x, "categoryId", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDueDate(value: String): Self = StObject.set(x, "dueDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDueDateUndefined: Self = StObject.set(x, "dueDate", js.undefined)
      
      @scala.inline
      def setEstimatedHours(value: Double): Self = StObject.set(x, "estimatedHours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEstimatedHoursUndefined: Self = StObject.set(x, "estimatedHours", js.undefined)
      
      @scala.inline
      def setIssueTypeId(value: Double): Self = StObject.set(x, "issueTypeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMilestoneId(value: js.Array[Double]): Self = StObject.set(x, "milestoneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMilestoneIdUndefined: Self = StObject.set(x, "milestoneId", js.undefined)
      
      @scala.inline
      def setMilestoneIdVarargs(value: Double*): Self = StObject.set(x, "milestoneId", js.Array(value :_*))
      
      @scala.inline
      def setNotifiedUserId(value: js.Array[Double]): Self = StObject.set(x, "notifiedUserId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotifiedUserIdUndefined: Self = StObject.set(x, "notifiedUserId", js.undefined)
      
      @scala.inline
      def setNotifiedUserIdVarargs(value: Double*): Self = StObject.set(x, "notifiedUserId", js.Array(value :_*))
      
      @scala.inline
      def setParentIssueId(value: Double): Self = StObject.set(x, "parentIssueId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIssueIdUndefined: Self = StObject.set(x, "parentIssueId", js.undefined)
      
      @scala.inline
      def setPriorityId(value: Double): Self = StObject.set(x, "priorityId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectId(value: Double): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      @scala.inline
      def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionId(value: js.Array[Double]): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
      
      @scala.inline
      def setVersionIdVarargs(value: Double*): Self = StObject.set(x, "versionId", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.backlogJs.backlogJsStrings.issueType
    - typings.backlogJs.backlogJsStrings.category
    - typings.backlogJs.backlogJsStrings.version
    - typings.backlogJs.backlogJsStrings.milestone
    - typings.backlogJs.backlogJsStrings.summary
    - typings.backlogJs.backlogJsStrings.status
    - typings.backlogJs.backlogJsStrings.priority
    - typings.backlogJs.backlogJsStrings.attachment
    - typings.backlogJs.backlogJsStrings.sharedFile
    - typings.backlogJs.backlogJsStrings.created
    - typings.backlogJs.backlogJsStrings.createdUser
    - typings.backlogJs.backlogJsStrings.updated
    - typings.backlogJs.backlogJsStrings.updatedUser
    - typings.backlogJs.backlogJsStrings.assignee
    - typings.backlogJs.backlogJsStrings.startDate
    - typings.backlogJs.backlogJsStrings.dueDate
    - typings.backlogJs.backlogJsStrings.estimatedHours
    - typings.backlogJs.backlogJsStrings.actualHours
    - typings.backlogJs.backlogJsStrings.childIssue
  */
  trait SortKey extends StObject
  object SortKey {
    
    @scala.inline
    def actualHours: typings.backlogJs.backlogJsStrings.actualHours = "actualHours".asInstanceOf[typings.backlogJs.backlogJsStrings.actualHours]
    
    @scala.inline
    def assignee: typings.backlogJs.backlogJsStrings.assignee = "assignee".asInstanceOf[typings.backlogJs.backlogJsStrings.assignee]
    
    @scala.inline
    def attachment: typings.backlogJs.backlogJsStrings.attachment = "attachment".asInstanceOf[typings.backlogJs.backlogJsStrings.attachment]
    
    @scala.inline
    def category: typings.backlogJs.backlogJsStrings.category = "category".asInstanceOf[typings.backlogJs.backlogJsStrings.category]
    
    @scala.inline
    def childIssue: typings.backlogJs.backlogJsStrings.childIssue = "childIssue".asInstanceOf[typings.backlogJs.backlogJsStrings.childIssue]
    
    @scala.inline
    def created: typings.backlogJs.backlogJsStrings.created = "created".asInstanceOf[typings.backlogJs.backlogJsStrings.created]
    
    @scala.inline
    def createdUser: typings.backlogJs.backlogJsStrings.createdUser = "createdUser".asInstanceOf[typings.backlogJs.backlogJsStrings.createdUser]
    
    @scala.inline
    def dueDate: typings.backlogJs.backlogJsStrings.dueDate = "dueDate".asInstanceOf[typings.backlogJs.backlogJsStrings.dueDate]
    
    @scala.inline
    def estimatedHours: typings.backlogJs.backlogJsStrings.estimatedHours = "estimatedHours".asInstanceOf[typings.backlogJs.backlogJsStrings.estimatedHours]
    
    @scala.inline
    def issueType: typings.backlogJs.backlogJsStrings.issueType = "issueType".asInstanceOf[typings.backlogJs.backlogJsStrings.issueType]
    
    @scala.inline
    def milestone: typings.backlogJs.backlogJsStrings.milestone = "milestone".asInstanceOf[typings.backlogJs.backlogJsStrings.milestone]
    
    @scala.inline
    def priority: typings.backlogJs.backlogJsStrings.priority = "priority".asInstanceOf[typings.backlogJs.backlogJsStrings.priority]
    
    @scala.inline
    def sharedFile: typings.backlogJs.backlogJsStrings.sharedFile = "sharedFile".asInstanceOf[typings.backlogJs.backlogJsStrings.sharedFile]
    
    @scala.inline
    def startDate: typings.backlogJs.backlogJsStrings.startDate = "startDate".asInstanceOf[typings.backlogJs.backlogJsStrings.startDate]
    
    @scala.inline
    def status: typings.backlogJs.backlogJsStrings.status = "status".asInstanceOf[typings.backlogJs.backlogJsStrings.status]
    
    @scala.inline
    def summary: typings.backlogJs.backlogJsStrings.summary = "summary".asInstanceOf[typings.backlogJs.backlogJsStrings.summary]
    
    @scala.inline
    def updated: typings.backlogJs.backlogJsStrings.updated = "updated".asInstanceOf[typings.backlogJs.backlogJsStrings.updated]
    
    @scala.inline
    def updatedUser: typings.backlogJs.backlogJsStrings.updatedUser = "updatedUser".asInstanceOf[typings.backlogJs.backlogJsStrings.updatedUser]
    
    @scala.inline
    def version: typings.backlogJs.backlogJsStrings.version = "version".asInstanceOf[typings.backlogJs.backlogJsStrings.version]
  }
}
