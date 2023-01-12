package typings.backlogJs.distTypesOptionMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Issue {
  
  @js.native
  sealed trait ParentChildType extends StObject
  @JSImport("backlog-js/dist/types/option", "Issue.ParentChildType")
  @js.native
  object ParentChildType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ParentChildType & Double] = js.native
    
    @js.native
    sealed trait All
      extends StObject
         with ParentChildType
    /* 0 */ val All: typings.backlogJs.distTypesOptionMod.Issue.ParentChildType.All & Double = js.native
    
    @js.native
    sealed trait Child
      extends StObject
         with ParentChildType
    /* 2 */ val Child: typings.backlogJs.distTypesOptionMod.Issue.ParentChildType.Child & Double = js.native
    
    @js.native
    sealed trait NotChild
      extends StObject
         with ParentChildType
    /* 1 */ val NotChild: typings.backlogJs.distTypesOptionMod.Issue.ParentChildType.NotChild & Double = js.native
    
    @js.native
    sealed trait NotChildNotParent
      extends StObject
         with ParentChildType
    /* 3 */ val NotChildNotParent: typings.backlogJs.distTypesOptionMod.Issue.ParentChildType.NotChildNotParent & Double = js.native
    
    @js.native
    sealed trait Parent
      extends StObject
         with ParentChildType
    /* 4 */ val Parent: typings.backlogJs.distTypesOptionMod.Issue.ParentChildType.Parent & Double = js.native
  }
  
  trait GetIssueCommentsParams extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var maxId: js.UndefOr[Double] = js.undefined
    
    var minId: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[Order] = js.undefined
  }
  object GetIssueCommentsParams {
    
    inline def apply(): GetIssueCommentsParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetIssueCommentsParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetIssueCommentsParams] (val x: Self) extends AnyVal {
      
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
  
  trait GetIssuesParams
    extends StObject
       with /* customField_ */ StringDictionary[Any] {
    
    var assigneeId: js.UndefOr[js.Array[Double]] = js.undefined
    
    var attachment: js.UndefOr[Boolean] = js.undefined
    
    var categoryId: js.UndefOr[js.Array[Double]] = js.undefined
    
    var count: js.UndefOr[Double] = js.undefined
    
    var createdSince: js.UndefOr[String] = js.undefined
    
    var createdUntil: js.UndefOr[String] = js.undefined
    
    var createdUserId: js.UndefOr[js.Array[Double]] = js.undefined
    
    var dueDateSince: js.UndefOr[String] = js.undefined
    
    var dueDateUntil: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[js.Array[Double]] = js.undefined
    
    var issueTypeId: js.UndefOr[js.Array[Double]] = js.undefined
    
    var keyword: js.UndefOr[String] = js.undefined
    
    var milestoneId: js.UndefOr[js.Array[Double]] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[Order] = js.undefined
    
    var parentChild: js.UndefOr[ParentChildType] = js.undefined
    
    var parentIssueId: js.UndefOr[js.Array[Double]] = js.undefined
    
    var priorityId: js.UndefOr[js.Array[Double]] = js.undefined
    
    var projectId: js.UndefOr[js.Array[Double]] = js.undefined
    
    var resolutionId: js.UndefOr[js.Array[Double]] = js.undefined
    
    var sharedFile: js.UndefOr[Boolean] = js.undefined
    
    var sort: js.UndefOr[SortKey] = js.undefined
    
    var startDateSince: js.UndefOr[String] = js.undefined
    
    var startDateUntil: js.UndefOr[String] = js.undefined
    
    var statusId: js.UndefOr[js.Array[Double]] = js.undefined
    
    var updatedSince: js.UndefOr[String] = js.undefined
    
    var updatedUntil: js.UndefOr[String] = js.undefined
    
    var versionId: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object GetIssuesParams {
    
    inline def apply(): GetIssuesParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetIssuesParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetIssuesParams] (val x: Self) extends AnyVal {
      
      inline def setAssigneeId(value: js.Array[Double]): Self = StObject.set(x, "assigneeId", value.asInstanceOf[js.Any])
      
      inline def setAssigneeIdUndefined: Self = StObject.set(x, "assigneeId", js.undefined)
      
      inline def setAssigneeIdVarargs(value: Double*): Self = StObject.set(x, "assigneeId", js.Array(value*))
      
      inline def setAttachment(value: Boolean): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
      
      inline def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
      
      inline def setCategoryId(value: js.Array[Double]): Self = StObject.set(x, "categoryId", value.asInstanceOf[js.Any])
      
      inline def setCategoryIdUndefined: Self = StObject.set(x, "categoryId", js.undefined)
      
      inline def setCategoryIdVarargs(value: Double*): Self = StObject.set(x, "categoryId", js.Array(value*))
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setCreatedSince(value: String): Self = StObject.set(x, "createdSince", value.asInstanceOf[js.Any])
      
      inline def setCreatedSinceUndefined: Self = StObject.set(x, "createdSince", js.undefined)
      
      inline def setCreatedUntil(value: String): Self = StObject.set(x, "createdUntil", value.asInstanceOf[js.Any])
      
      inline def setCreatedUntilUndefined: Self = StObject.set(x, "createdUntil", js.undefined)
      
      inline def setCreatedUserId(value: js.Array[Double]): Self = StObject.set(x, "createdUserId", value.asInstanceOf[js.Any])
      
      inline def setCreatedUserIdUndefined: Self = StObject.set(x, "createdUserId", js.undefined)
      
      inline def setCreatedUserIdVarargs(value: Double*): Self = StObject.set(x, "createdUserId", js.Array(value*))
      
      inline def setDueDateSince(value: String): Self = StObject.set(x, "dueDateSince", value.asInstanceOf[js.Any])
      
      inline def setDueDateSinceUndefined: Self = StObject.set(x, "dueDateSince", js.undefined)
      
      inline def setDueDateUntil(value: String): Self = StObject.set(x, "dueDateUntil", value.asInstanceOf[js.Any])
      
      inline def setDueDateUntilUndefined: Self = StObject.set(x, "dueDateUntil", js.undefined)
      
      inline def setId(value: js.Array[Double]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIdVarargs(value: Double*): Self = StObject.set(x, "id", js.Array(value*))
      
      inline def setIssueTypeId(value: js.Array[Double]): Self = StObject.set(x, "issueTypeId", value.asInstanceOf[js.Any])
      
      inline def setIssueTypeIdUndefined: Self = StObject.set(x, "issueTypeId", js.undefined)
      
      inline def setIssueTypeIdVarargs(value: Double*): Self = StObject.set(x, "issueTypeId", js.Array(value*))
      
      inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
      
      inline def setMilestoneId(value: js.Array[Double]): Self = StObject.set(x, "milestoneId", value.asInstanceOf[js.Any])
      
      inline def setMilestoneIdUndefined: Self = StObject.set(x, "milestoneId", js.undefined)
      
      inline def setMilestoneIdVarargs(value: Double*): Self = StObject.set(x, "milestoneId", js.Array(value*))
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setParentChild(value: ParentChildType): Self = StObject.set(x, "parentChild", value.asInstanceOf[js.Any])
      
      inline def setParentChildUndefined: Self = StObject.set(x, "parentChild", js.undefined)
      
      inline def setParentIssueId(value: js.Array[Double]): Self = StObject.set(x, "parentIssueId", value.asInstanceOf[js.Any])
      
      inline def setParentIssueIdUndefined: Self = StObject.set(x, "parentIssueId", js.undefined)
      
      inline def setParentIssueIdVarargs(value: Double*): Self = StObject.set(x, "parentIssueId", js.Array(value*))
      
      inline def setPriorityId(value: js.Array[Double]): Self = StObject.set(x, "priorityId", value.asInstanceOf[js.Any])
      
      inline def setPriorityIdUndefined: Self = StObject.set(x, "priorityId", js.undefined)
      
      inline def setPriorityIdVarargs(value: Double*): Self = StObject.set(x, "priorityId", js.Array(value*))
      
      inline def setProjectId(value: js.Array[Double]): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
      
      inline def setProjectIdVarargs(value: Double*): Self = StObject.set(x, "projectId", js.Array(value*))
      
      inline def setResolutionId(value: js.Array[Double]): Self = StObject.set(x, "resolutionId", value.asInstanceOf[js.Any])
      
      inline def setResolutionIdUndefined: Self = StObject.set(x, "resolutionId", js.undefined)
      
      inline def setResolutionIdVarargs(value: Double*): Self = StObject.set(x, "resolutionId", js.Array(value*))
      
      inline def setSharedFile(value: Boolean): Self = StObject.set(x, "sharedFile", value.asInstanceOf[js.Any])
      
      inline def setSharedFileUndefined: Self = StObject.set(x, "sharedFile", js.undefined)
      
      inline def setSort(value: SortKey): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setStartDateSince(value: String): Self = StObject.set(x, "startDateSince", value.asInstanceOf[js.Any])
      
      inline def setStartDateSinceUndefined: Self = StObject.set(x, "startDateSince", js.undefined)
      
      inline def setStartDateUntil(value: String): Self = StObject.set(x, "startDateUntil", value.asInstanceOf[js.Any])
      
      inline def setStartDateUntilUndefined: Self = StObject.set(x, "startDateUntil", js.undefined)
      
      inline def setStatusId(value: js.Array[Double]): Self = StObject.set(x, "statusId", value.asInstanceOf[js.Any])
      
      inline def setStatusIdUndefined: Self = StObject.set(x, "statusId", js.undefined)
      
      inline def setStatusIdVarargs(value: Double*): Self = StObject.set(x, "statusId", js.Array(value*))
      
      inline def setUpdatedSince(value: String): Self = StObject.set(x, "updatedSince", value.asInstanceOf[js.Any])
      
      inline def setUpdatedSinceUndefined: Self = StObject.set(x, "updatedSince", js.undefined)
      
      inline def setUpdatedUntil(value: String): Self = StObject.set(x, "updatedUntil", value.asInstanceOf[js.Any])
      
      inline def setUpdatedUntilUndefined: Self = StObject.set(x, "updatedUntil", js.undefined)
      
      inline def setVersionId(value: js.Array[Double]): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
      
      inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
      
      inline def setVersionIdVarargs(value: Double*): Self = StObject.set(x, "versionId", js.Array(value*))
    }
  }
  
  trait IssueCommentNotifications extends StObject {
    
    var notifiedUserId: js.Array[Double]
  }
  object IssueCommentNotifications {
    
    inline def apply(notifiedUserId: js.Array[Double]): IssueCommentNotifications = {
      val __obj = js.Dynamic.literal(notifiedUserId = notifiedUserId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IssueCommentNotifications]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IssueCommentNotifications] (val x: Self) extends AnyVal {
      
      inline def setNotifiedUserId(value: js.Array[Double]): Self = StObject.set(x, "notifiedUserId", value.asInstanceOf[js.Any])
      
      inline def setNotifiedUserIdVarargs(value: Double*): Self = StObject.set(x, "notifiedUserId", js.Array(value*))
    }
  }
  
  trait LinkIssueSharedFilesParams extends StObject {
    
    var fileId: js.Array[Double]
  }
  object LinkIssueSharedFilesParams {
    
    inline def apply(fileId: js.Array[Double]): LinkIssueSharedFilesParams = {
      val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkIssueSharedFilesParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkIssueSharedFilesParams] (val x: Self) extends AnyVal {
      
      inline def setFileId(value: js.Array[Double]): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
      
      inline def setFileIdVarargs(value: Double*): Self = StObject.set(x, "fileId", js.Array(value*))
    }
  }
  
  trait PatchIssueCommentParams extends StObject {
    
    var content: String
  }
  object PatchIssueCommentParams {
    
    inline def apply(content: String): PatchIssueCommentParams = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[PatchIssueCommentParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PatchIssueCommentParams] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
  
  trait PatchIssueParams
    extends StObject
       with /* customField_ */ StringDictionary[Any] {
    
    var actualHours: js.UndefOr[Double] = js.undefined
    
    var assigneeId: js.UndefOr[Double] = js.undefined
    
    var attachmentId: js.UndefOr[js.Array[Double]] = js.undefined
    
    var categoryId: js.UndefOr[js.Array[Double]] = js.undefined
    
    var comment: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var dueDate: js.UndefOr[String] = js.undefined
    
    var estimatedHours: js.UndefOr[Double] = js.undefined
    
    var issueTypeId: js.UndefOr[Double] = js.undefined
    
    var milestoneId: js.UndefOr[js.Array[Double]] = js.undefined
    
    var notifiedUserId: js.UndefOr[js.Array[Double]] = js.undefined
    
    var parentIssueId: js.UndefOr[Double] = js.undefined
    
    var priorityId: js.UndefOr[Double] = js.undefined
    
    var resolutionId: js.UndefOr[Double] = js.undefined
    
    var startDate: js.UndefOr[String] = js.undefined
    
    var statusId: js.UndefOr[Double] = js.undefined
    
    var summary: js.UndefOr[String] = js.undefined
    
    var versionId: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object PatchIssueParams {
    
    inline def apply(): PatchIssueParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatchIssueParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PatchIssueParams] (val x: Self) extends AnyVal {
      
      inline def setActualHours(value: Double): Self = StObject.set(x, "actualHours", value.asInstanceOf[js.Any])
      
      inline def setActualHoursUndefined: Self = StObject.set(x, "actualHours", js.undefined)
      
      inline def setAssigneeId(value: Double): Self = StObject.set(x, "assigneeId", value.asInstanceOf[js.Any])
      
      inline def setAssigneeIdUndefined: Self = StObject.set(x, "assigneeId", js.undefined)
      
      inline def setAttachmentId(value: js.Array[Double]): Self = StObject.set(x, "attachmentId", value.asInstanceOf[js.Any])
      
      inline def setAttachmentIdUndefined: Self = StObject.set(x, "attachmentId", js.undefined)
      
      inline def setAttachmentIdVarargs(value: Double*): Self = StObject.set(x, "attachmentId", js.Array(value*))
      
      inline def setCategoryId(value: js.Array[Double]): Self = StObject.set(x, "categoryId", value.asInstanceOf[js.Any])
      
      inline def setCategoryIdUndefined: Self = StObject.set(x, "categoryId", js.undefined)
      
      inline def setCategoryIdVarargs(value: Double*): Self = StObject.set(x, "categoryId", js.Array(value*))
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDueDate(value: String): Self = StObject.set(x, "dueDate", value.asInstanceOf[js.Any])
      
      inline def setDueDateUndefined: Self = StObject.set(x, "dueDate", js.undefined)
      
      inline def setEstimatedHours(value: Double): Self = StObject.set(x, "estimatedHours", value.asInstanceOf[js.Any])
      
      inline def setEstimatedHoursUndefined: Self = StObject.set(x, "estimatedHours", js.undefined)
      
      inline def setIssueTypeId(value: Double): Self = StObject.set(x, "issueTypeId", value.asInstanceOf[js.Any])
      
      inline def setIssueTypeIdUndefined: Self = StObject.set(x, "issueTypeId", js.undefined)
      
      inline def setMilestoneId(value: js.Array[Double]): Self = StObject.set(x, "milestoneId", value.asInstanceOf[js.Any])
      
      inline def setMilestoneIdUndefined: Self = StObject.set(x, "milestoneId", js.undefined)
      
      inline def setMilestoneIdVarargs(value: Double*): Self = StObject.set(x, "milestoneId", js.Array(value*))
      
      inline def setNotifiedUserId(value: js.Array[Double]): Self = StObject.set(x, "notifiedUserId", value.asInstanceOf[js.Any])
      
      inline def setNotifiedUserIdUndefined: Self = StObject.set(x, "notifiedUserId", js.undefined)
      
      inline def setNotifiedUserIdVarargs(value: Double*): Self = StObject.set(x, "notifiedUserId", js.Array(value*))
      
      inline def setParentIssueId(value: Double): Self = StObject.set(x, "parentIssueId", value.asInstanceOf[js.Any])
      
      inline def setParentIssueIdUndefined: Self = StObject.set(x, "parentIssueId", js.undefined)
      
      inline def setPriorityId(value: Double): Self = StObject.set(x, "priorityId", value.asInstanceOf[js.Any])
      
      inline def setPriorityIdUndefined: Self = StObject.set(x, "priorityId", js.undefined)
      
      inline def setResolutionId(value: Double): Self = StObject.set(x, "resolutionId", value.asInstanceOf[js.Any])
      
      inline def setResolutionIdUndefined: Self = StObject.set(x, "resolutionId", js.undefined)
      
      inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setStatusId(value: Double): Self = StObject.set(x, "statusId", value.asInstanceOf[js.Any])
      
      inline def setStatusIdUndefined: Self = StObject.set(x, "statusId", js.undefined)
      
      inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      inline def setVersionId(value: js.Array[Double]): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
      
      inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
      
      inline def setVersionIdVarargs(value: Double*): Self = StObject.set(x, "versionId", js.Array(value*))
    }
  }
  
  trait PostIssueCommentsParams extends StObject {
    
    var attachmentId: js.UndefOr[js.Array[Double]] = js.undefined
    
    var content: String
    
    var notifiedUserId: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object PostIssueCommentsParams {
    
    inline def apply(content: String): PostIssueCommentsParams = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostIssueCommentsParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PostIssueCommentsParams] (val x: Self) extends AnyVal {
      
      inline def setAttachmentId(value: js.Array[Double]): Self = StObject.set(x, "attachmentId", value.asInstanceOf[js.Any])
      
      inline def setAttachmentIdUndefined: Self = StObject.set(x, "attachmentId", js.undefined)
      
      inline def setAttachmentIdVarargs(value: Double*): Self = StObject.set(x, "attachmentId", js.Array(value*))
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setNotifiedUserId(value: js.Array[Double]): Self = StObject.set(x, "notifiedUserId", value.asInstanceOf[js.Any])
      
      inline def setNotifiedUserIdUndefined: Self = StObject.set(x, "notifiedUserId", js.undefined)
      
      inline def setNotifiedUserIdVarargs(value: Double*): Self = StObject.set(x, "notifiedUserId", js.Array(value*))
    }
  }
  
  trait PostIssueParams
    extends StObject
       with /* customField_ */ StringDictionary[Any] {
    
    var actualHours: js.UndefOr[Double] = js.undefined
    
    var assigneeId: js.UndefOr[Double] = js.undefined
    
    var attachmentId: js.UndefOr[js.Array[Double]] = js.undefined
    
    var categoryId: js.UndefOr[js.Array[Double]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var dueDate: js.UndefOr[String] = js.undefined
    
    var estimatedHours: js.UndefOr[Double] = js.undefined
    
    var issueTypeId: Double
    
    var milestoneId: js.UndefOr[js.Array[Double]] = js.undefined
    
    var notifiedUserId: js.UndefOr[js.Array[Double]] = js.undefined
    
    var parentIssueId: js.UndefOr[Double] = js.undefined
    
    var priorityId: Double
    
    var projectId: Double
    
    var startDate: js.UndefOr[String] = js.undefined
    
    var summary: String
    
    var versionId: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object PostIssueParams {
    
    inline def apply(issueTypeId: Double, priorityId: Double, projectId: Double, summary: String): PostIssueParams = {
      val __obj = js.Dynamic.literal(issueTypeId = issueTypeId.asInstanceOf[js.Any], priorityId = priorityId.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostIssueParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PostIssueParams] (val x: Self) extends AnyVal {
      
      inline def setActualHours(value: Double): Self = StObject.set(x, "actualHours", value.asInstanceOf[js.Any])
      
      inline def setActualHoursUndefined: Self = StObject.set(x, "actualHours", js.undefined)
      
      inline def setAssigneeId(value: Double): Self = StObject.set(x, "assigneeId", value.asInstanceOf[js.Any])
      
      inline def setAssigneeIdUndefined: Self = StObject.set(x, "assigneeId", js.undefined)
      
      inline def setAttachmentId(value: js.Array[Double]): Self = StObject.set(x, "attachmentId", value.asInstanceOf[js.Any])
      
      inline def setAttachmentIdUndefined: Self = StObject.set(x, "attachmentId", js.undefined)
      
      inline def setAttachmentIdVarargs(value: Double*): Self = StObject.set(x, "attachmentId", js.Array(value*))
      
      inline def setCategoryId(value: js.Array[Double]): Self = StObject.set(x, "categoryId", value.asInstanceOf[js.Any])
      
      inline def setCategoryIdUndefined: Self = StObject.set(x, "categoryId", js.undefined)
      
      inline def setCategoryIdVarargs(value: Double*): Self = StObject.set(x, "categoryId", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDueDate(value: String): Self = StObject.set(x, "dueDate", value.asInstanceOf[js.Any])
      
      inline def setDueDateUndefined: Self = StObject.set(x, "dueDate", js.undefined)
      
      inline def setEstimatedHours(value: Double): Self = StObject.set(x, "estimatedHours", value.asInstanceOf[js.Any])
      
      inline def setEstimatedHoursUndefined: Self = StObject.set(x, "estimatedHours", js.undefined)
      
      inline def setIssueTypeId(value: Double): Self = StObject.set(x, "issueTypeId", value.asInstanceOf[js.Any])
      
      inline def setMilestoneId(value: js.Array[Double]): Self = StObject.set(x, "milestoneId", value.asInstanceOf[js.Any])
      
      inline def setMilestoneIdUndefined: Self = StObject.set(x, "milestoneId", js.undefined)
      
      inline def setMilestoneIdVarargs(value: Double*): Self = StObject.set(x, "milestoneId", js.Array(value*))
      
      inline def setNotifiedUserId(value: js.Array[Double]): Self = StObject.set(x, "notifiedUserId", value.asInstanceOf[js.Any])
      
      inline def setNotifiedUserIdUndefined: Self = StObject.set(x, "notifiedUserId", js.undefined)
      
      inline def setNotifiedUserIdVarargs(value: Double*): Self = StObject.set(x, "notifiedUserId", js.Array(value*))
      
      inline def setParentIssueId(value: Double): Self = StObject.set(x, "parentIssueId", value.asInstanceOf[js.Any])
      
      inline def setParentIssueIdUndefined: Self = StObject.set(x, "parentIssueId", js.undefined)
      
      inline def setPriorityId(value: Double): Self = StObject.set(x, "priorityId", value.asInstanceOf[js.Any])
      
      inline def setProjectId(value: Double): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setVersionId(value: js.Array[Double]): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
      
      inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
      
      inline def setVersionIdVarargs(value: Double*): Self = StObject.set(x, "versionId", js.Array(value*))
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
    
    inline def actualHours: typings.backlogJs.backlogJsStrings.actualHours = "actualHours".asInstanceOf[typings.backlogJs.backlogJsStrings.actualHours]
    
    inline def assignee: typings.backlogJs.backlogJsStrings.assignee = "assignee".asInstanceOf[typings.backlogJs.backlogJsStrings.assignee]
    
    inline def attachment: typings.backlogJs.backlogJsStrings.attachment = "attachment".asInstanceOf[typings.backlogJs.backlogJsStrings.attachment]
    
    inline def category: typings.backlogJs.backlogJsStrings.category = "category".asInstanceOf[typings.backlogJs.backlogJsStrings.category]
    
    inline def childIssue: typings.backlogJs.backlogJsStrings.childIssue = "childIssue".asInstanceOf[typings.backlogJs.backlogJsStrings.childIssue]
    
    inline def created: typings.backlogJs.backlogJsStrings.created = "created".asInstanceOf[typings.backlogJs.backlogJsStrings.created]
    
    inline def createdUser: typings.backlogJs.backlogJsStrings.createdUser = "createdUser".asInstanceOf[typings.backlogJs.backlogJsStrings.createdUser]
    
    inline def dueDate: typings.backlogJs.backlogJsStrings.dueDate = "dueDate".asInstanceOf[typings.backlogJs.backlogJsStrings.dueDate]
    
    inline def estimatedHours: typings.backlogJs.backlogJsStrings.estimatedHours = "estimatedHours".asInstanceOf[typings.backlogJs.backlogJsStrings.estimatedHours]
    
    inline def issueType: typings.backlogJs.backlogJsStrings.issueType = "issueType".asInstanceOf[typings.backlogJs.backlogJsStrings.issueType]
    
    inline def milestone: typings.backlogJs.backlogJsStrings.milestone = "milestone".asInstanceOf[typings.backlogJs.backlogJsStrings.milestone]
    
    inline def priority: typings.backlogJs.backlogJsStrings.priority = "priority".asInstanceOf[typings.backlogJs.backlogJsStrings.priority]
    
    inline def sharedFile: typings.backlogJs.backlogJsStrings.sharedFile = "sharedFile".asInstanceOf[typings.backlogJs.backlogJsStrings.sharedFile]
    
    inline def startDate: typings.backlogJs.backlogJsStrings.startDate = "startDate".asInstanceOf[typings.backlogJs.backlogJsStrings.startDate]
    
    inline def status: typings.backlogJs.backlogJsStrings.status = "status".asInstanceOf[typings.backlogJs.backlogJsStrings.status]
    
    inline def summary: typings.backlogJs.backlogJsStrings.summary = "summary".asInstanceOf[typings.backlogJs.backlogJsStrings.summary]
    
    inline def updated: typings.backlogJs.backlogJsStrings.updated = "updated".asInstanceOf[typings.backlogJs.backlogJsStrings.updated]
    
    inline def updatedUser: typings.backlogJs.backlogJsStrings.updatedUser = "updatedUser".asInstanceOf[typings.backlogJs.backlogJsStrings.updatedUser]
    
    inline def version: typings.backlogJs.backlogJsStrings.version = "version".asInstanceOf[typings.backlogJs.backlogJsStrings.version]
  }
}
