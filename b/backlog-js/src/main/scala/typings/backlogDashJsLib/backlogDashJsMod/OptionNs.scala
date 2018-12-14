package typings
package backlogDashJsLib.backlogDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backlog-js", "Option")
@js.native
object OptionNs extends js.Object {
  @js.native
  sealed trait ActivityType extends js.Object
  
  @js.native
  object ActivityType extends js.Object {
    @js.native
    sealed trait FileAdded
      extends backlogDashJsLib.backlogDashJsMod.OptionNs.ActivityType
    
    @js.native
    sealed trait FileDeleted
      extends backlogDashJsLib.backlogDashJsMod.OptionNs.ActivityType
    
    @js.native
    sealed trait FileUpdated
      extends backlogDashJsLib.backlogDashJsMod.OptionNs.ActivityType
    
    @js.native
    sealed trait GitPushed
      extends backlogDashJsLib.backlogDashJsMod.OptionNs.ActivityType
    
    @js.native
    sealed trait GitRepositoryCreated
      extends backlogDashJsLib.backlogDashJsMod.OptionNs.ActivityType
    
    @js.native
    sealed trait IssueCommented
      extends backlogDashJsLib.backlogDashJsMod.OptionNs.ActivityType
    
    @js.native
    sealed trait IssueCreated
      extends backlogDashJsLib.backlogDashJsMod.OptionNs.ActivityType
    
    @js.native
    sealed trait IssueDeleted
      extends backlogDashJsLib.backlogDashJsMod.OptionNs.ActivityType
    
    @js.native
    sealed trait IssueMultiUpdated
      extends backlogDashJsLib.backlogDashJsMod.OptionNs.ActivityType
    
    @js.native
    sealed trait IssueUpdated
      extends backlogDashJsLib.backlogDashJsMod.OptionNs.ActivityType
    
    @js.native
    sealed trait NotifyAdded
      extends backlogDashJsLib.backlogDashJsMod.OptionNs.ActivityType
    
    @js.native
    sealed trait ProjectUserAdded
      extends backlogDashJsLib.backlogDashJsMod.OptionNs.ActivityType
    
    @js.native
    sealed trait ProjectUserRemoved
      extends backlogDashJsLib.backlogDashJsMod.OptionNs.ActivityType
    
    @js.native
    sealed trait PullRequestAdded
      extends backlogDashJsLib.backlogDashJsMod.OptionNs.ActivityType
    
    @js.native
    sealed trait PullRequestCommented
      extends backlogDashJsLib.backlogDashJsMod.OptionNs.ActivityType
    
    @js.native
    sealed trait PullRequestMerged
      extends backlogDashJsLib.backlogDashJsMod.OptionNs.ActivityType
    
    @js.native
    sealed trait PullRequestUpdated
      extends backlogDashJsLib.backlogDashJsMod.OptionNs.ActivityType
    
    @js.native
    sealed trait SvnCommitted
      extends backlogDashJsLib.backlogDashJsMod.OptionNs.ActivityType
    
    @js.native
    sealed trait Undefined
      extends backlogDashJsLib.backlogDashJsMod.OptionNs.ActivityType
    
    @js.native
    sealed trait WikiCreated
      extends backlogDashJsLib.backlogDashJsMod.OptionNs.ActivityType
    
    @js.native
    sealed trait WikiDeleted
      extends backlogDashJsLib.backlogDashJsMod.OptionNs.ActivityType
    
    @js.native
    sealed trait WikiUpdated
      extends backlogDashJsLib.backlogDashJsMod.OptionNs.ActivityType
    
    /* 8 */ val FileAdded: FileAdded with scala.Double = js.native
    /* 10 */ val FileDeleted: FileDeleted with scala.Double = js.native
    /* 9 */ val FileUpdated: FileUpdated with scala.Double = js.native
    /* 12 */ val GitPushed: GitPushed with scala.Double = js.native
    /* 13 */ val GitRepositoryCreated: GitRepositoryCreated with scala.Double = js.native
    /* 3 */ val IssueCommented: IssueCommented with scala.Double = js.native
    /* 1 */ val IssueCreated: IssueCreated with scala.Double = js.native
    /* 4 */ val IssueDeleted: IssueDeleted with scala.Double = js.native
    /* 14 */ val IssueMultiUpdated: IssueMultiUpdated with scala.Double = js.native
    /* 2 */ val IssueUpdated: IssueUpdated with scala.Double = js.native
    /* 17 */ val NotifyAdded: NotifyAdded with scala.Double = js.native
    /* 15 */ val ProjectUserAdded: ProjectUserAdded with scala.Double = js.native
    /* 16 */ val ProjectUserRemoved: ProjectUserRemoved with scala.Double = js.native
    /* 18 */ val PullRequestAdded: PullRequestAdded with scala.Double = js.native
    /* 20 */ val PullRequestCommented: PullRequestCommented with scala.Double = js.native
    /* 21 */ val PullRequestMerged: PullRequestMerged with scala.Double = js.native
    /* 19 */ val PullRequestUpdated: PullRequestUpdated with scala.Double = js.native
    /* 11 */ val SvnCommitted: SvnCommitted with scala.Double = js.native
    /* -1 */ val Undefined: Undefined with scala.Double = js.native
    /* 5 */ val WikiCreated: WikiCreated with scala.Double = js.native
    /* 7 */ val WikiDeleted: WikiDeleted with scala.Double = js.native
    /* 6 */ val WikiUpdated: WikiUpdated with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[backlogDashJsLib.backlogDashJsMod.OptionNs.ActivityType with scala.Double] = js.native
  }
  
  @JSName("Group")
  @js.native
  object GroupNs extends js.Object {
    
    trait GetGroupsParams extends js.Object {
      var count: js.UndefOr[scala.Double] = js.undefined
      var offset: js.UndefOr[scala.Double] = js.undefined
      var order: js.UndefOr[backlogDashJsLib.backlogDashJsMod.OptionNs.Order] = js.undefined
    }
    
    
    trait PatchGroupParams extends js.Object {
      var members: js.UndefOr[js.Array[java.lang.String]] = js.undefined
      var name: js.UndefOr[java.lang.String] = js.undefined
    }
    
    
    trait PostGroupsParams extends js.Object {
      var members: js.UndefOr[js.Array[java.lang.String]] = js.undefined
      var name: java.lang.String
    }
    
  }
  
  @JSName("Issue")
  @js.native
  object IssueNs extends js.Object {
    
    trait GetIssueCommentsParams extends js.Object {
      var count: js.UndefOr[scala.Double] = js.undefined
      var maxId: js.UndefOr[scala.Double] = js.undefined
      var minId: js.UndefOr[scala.Double] = js.undefined
      var order: js.UndefOr[backlogDashJsLib.backlogDashJsMod.OptionNs.Order] = js.undefined
    }
    
    
    trait GetIssuesParams
      extends /* customField_ */ org.scalablytyped.runtime.StringDictionary[js.Any] {
      var assigneeId: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var attachment: js.UndefOr[scala.Boolean] = js.undefined
      var categoryId: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var count: js.UndefOr[scala.Double] = js.undefined
      var createdSince: js.UndefOr[java.lang.String] = js.undefined
      var createdUntil: js.UndefOr[java.lang.String] = js.undefined
      var createdUserId: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var dueDateSince: js.UndefOr[java.lang.String] = js.undefined
      var dueDateUntil: js.UndefOr[java.lang.String] = js.undefined
      var id: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var issueTypeId: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var keyword: java.lang.String
      var milestoneId: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var offset: js.UndefOr[scala.Double] = js.undefined
      var order: js.UndefOr[backlogDashJsLib.backlogDashJsMod.OptionNs.Order] = js.undefined
      var parentChild: js.UndefOr[ParentChildType] = js.undefined
      var parentIssueId: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var priorityId: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var projectId: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var resolutionId: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var sharedFile: js.UndefOr[scala.Boolean] = js.undefined
      var sort: js.UndefOr[SortKey] = js.undefined
      var startDateSince: js.UndefOr[java.lang.String] = js.undefined
      var startDateUntil: js.UndefOr[java.lang.String] = js.undefined
      var statusId: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var updatedSince: js.UndefOr[java.lang.String] = js.undefined
      var updatedUntil: js.UndefOr[java.lang.String] = js.undefined
      var versionId: js.UndefOr[js.Array[scala.Double]] = js.undefined
    }
    
    
    trait IssueCommentNotifications extends js.Object {
      var notifiedUserId: js.Array[scala.Double]
    }
    
    
    trait LinkIssueSharedFilesParams extends js.Object {
      var fileId: js.Array[scala.Double]
    }
    
    @js.native
    sealed trait ParentChildType extends js.Object
    
    
    trait PatchIssueCommentParams extends js.Object {
      var content: java.lang.String
    }
    
    
    trait PatchIssueParams
      extends /* customField_ */ org.scalablytyped.runtime.StringDictionary[js.Any] {
      var actualHours: js.UndefOr[scala.Double] = js.undefined
      var assigneeId: js.UndefOr[scala.Double] = js.undefined
      var attachmentId: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var categoryId: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var comment: js.UndefOr[java.lang.String] = js.undefined
      var description: js.UndefOr[java.lang.String] = js.undefined
      var dueDate: js.UndefOr[java.lang.String] = js.undefined
      var estimatedHours: js.UndefOr[scala.Double] = js.undefined
      var issueTypeId: js.UndefOr[scala.Double] = js.undefined
      var milestoneId: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var notifiedUserId: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var parentIssueId: js.UndefOr[scala.Double] = js.undefined
      var priorityId: js.UndefOr[scala.Double] = js.undefined
      var resolutionId: js.UndefOr[scala.Double] = js.undefined
      var startDate: js.UndefOr[java.lang.String] = js.undefined
      var statusId: js.UndefOr[scala.Double] = js.undefined
      var summary: js.UndefOr[java.lang.String] = js.undefined
      var versionId: js.UndefOr[js.Array[scala.Double]] = js.undefined
    }
    
    
    trait PostIssueCommentsParams extends js.Object {
      var attachmentId: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var content: java.lang.String
      var notifiedUserId: js.UndefOr[js.Array[scala.Double]] = js.undefined
    }
    
    
    trait PostIssueParams
      extends /* customField_ */ org.scalablytyped.runtime.StringDictionary[js.Any] {
      var actualHours: js.UndefOr[scala.Double] = js.undefined
      var assigneeId: js.UndefOr[scala.Double] = js.undefined
      var attachmentId: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var categoryId: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var description: js.UndefOr[java.lang.String] = js.undefined
      var dueDate: js.UndefOr[java.lang.String] = js.undefined
      var estimatedHours: js.UndefOr[scala.Double] = js.undefined
      var issueTypeId: scala.Double
      var milestoneId: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var notifiedUserId: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var parentIssueId: js.UndefOr[scala.Double] = js.undefined
      var priorityId: scala.Double
      var projectId: scala.Double
      var startDate: js.UndefOr[java.lang.String] = js.undefined
      var summary: java.lang.String
      var versionId: js.UndefOr[js.Array[scala.Double]] = js.undefined
    }
    
    @js.native
    object ParentChildType extends js.Object {
      @js.native
      sealed trait All
        extends backlogDashJsLib.backlogDashJsMod.OptionNs.IssueNs.ParentChildType
      
      @js.native
      sealed trait Child
        extends backlogDashJsLib.backlogDashJsMod.OptionNs.IssueNs.ParentChildType
      
      @js.native
      sealed trait NotChild
        extends backlogDashJsLib.backlogDashJsMod.OptionNs.IssueNs.ParentChildType
      
      @js.native
      sealed trait NotChildNotParent
        extends backlogDashJsLib.backlogDashJsMod.OptionNs.IssueNs.ParentChildType
      
      @js.native
      sealed trait Parent
        extends backlogDashJsLib.backlogDashJsMod.OptionNs.IssueNs.ParentChildType
      
      /* 0 */ val All: All with scala.Double = js.native
      /* 2 */ val Child: Child with scala.Double = js.native
      /* 1 */ val NotChild: NotChild with scala.Double = js.native
      /* 3 */ val NotChildNotParent: NotChildNotParent with scala.Double = js.native
      /* 4 */ val Parent: Parent with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            backlogDashJsLib.backlogDashJsMod.OptionNs.IssueNs.ParentChildType with scala.Double
          ] = js.native
    }
    
    type SortKey = backlogDashJsLib.backlogDashJsLibStrings.issueType | backlogDashJsLib.backlogDashJsLibStrings.category | backlogDashJsLib.backlogDashJsLibStrings.version | backlogDashJsLib.backlogDashJsLibStrings.milestone | backlogDashJsLib.backlogDashJsLibStrings.summary | backlogDashJsLib.backlogDashJsLibStrings.status | backlogDashJsLib.backlogDashJsLibStrings.priority | backlogDashJsLib.backlogDashJsLibStrings.attachment | backlogDashJsLib.backlogDashJsLibStrings.sharedFile | backlogDashJsLib.backlogDashJsLibStrings.created | backlogDashJsLib.backlogDashJsLibStrings.createdUser | backlogDashJsLib.backlogDashJsLibStrings.updated | backlogDashJsLib.backlogDashJsLibStrings.updatedUser | backlogDashJsLib.backlogDashJsLibStrings.assignee | backlogDashJsLib.backlogDashJsLibStrings.startDate | backlogDashJsLib.backlogDashJsLibStrings.dueDate | backlogDashJsLib.backlogDashJsLibStrings.estimatedHours | backlogDashJsLib.backlogDashJsLibStrings.actualHours | backlogDashJsLib.backlogDashJsLibStrings.childIssue
  }
  
  @JSName("Notification")
  @js.native
  object NotificationNs extends js.Object {
    
    trait GetNotificationsCountParams extends js.Object {
      var alreadyRead: scala.Boolean
      var resourceAlreadyRead: scala.Boolean
    }
    
    
    trait GetNotificationsParams extends js.Object {
      var count: js.UndefOr[scala.Double] = js.undefined
      var maxId: js.UndefOr[scala.Double] = js.undefined
      var minId: js.UndefOr[scala.Double] = js.undefined
      var order: js.UndefOr[backlogDashJsLib.backlogDashJsMod.OptionNs.Order] = js.undefined
    }
    
  }
  
  @JSName("OAuth2")
  @js.native
  object OAuth2Ns extends js.Object {
    
    trait Credentials extends js.Object {
      var clientId: java.lang.String
      var clientSecret: java.lang.String
    }
    
  }
  
  @JSName("Project")
  @js.native
  object ProjectNs extends js.Object {
    
    trait DeleteIssueTypeParams extends js.Object {
      var substituteIssueTypeId: scala.Double
    }
    
    
    trait DeleteProjectAdministrators extends js.Object {
      var userId: scala.Double
    }
    
    
    trait DeleteProjectUsersParams extends js.Object {
      var userId: scala.Double
    }
    
    @js.native
    sealed trait FieldType extends js.Object
    
    
    trait GetProjectsParams extends js.Object {
      var all: js.UndefOr[scala.Boolean] = js.undefined
      var archived: js.UndefOr[scala.Boolean] = js.undefined
    }
    
    
    trait GetSharedFilesParams extends js.Object {
      var count: js.UndefOr[scala.Double] = js.undefined
      var offset: js.UndefOr[scala.Double] = js.undefined
      var order: js.UndefOr[backlogDashJsLib.backlogDashJsMod.OptionNs.Order] = js.undefined
    }
    
    
    trait PatchCategoriesParams extends js.Object {
      var name: java.lang.String
    }
    
    
    trait PatchCustomFieldItemParams extends js.Object {
      var name: java.lang.String
    }
    
    
    trait PatchCustomFieldParams extends js.Object {
      var applicableIssueTypes: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var description: js.UndefOr[java.lang.String] = js.undefined
      var name: js.UndefOr[java.lang.String] = js.undefined
      var required: js.UndefOr[scala.Boolean] = js.undefined
    }
    
    
    trait PatchCustomFieldWithDateParams extends PatchCustomFieldParams {
      var initialDate: js.UndefOr[java.lang.String] = js.undefined
      var initialShift: js.UndefOr[scala.Double] = js.undefined
      var initialValueType: js.UndefOr[scala.Double] = js.undefined
      var max: js.UndefOr[java.lang.String] = js.undefined
      var min: js.UndefOr[java.lang.String] = js.undefined
    }
    
    
    trait PatchCustomFieldWithListParams extends PatchCustomFieldParams {
      var allowAddItem: js.UndefOr[scala.Boolean] = js.undefined
      var allowInput: js.UndefOr[scala.Boolean] = js.undefined
      var items: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    }
    
    
    trait PatchCustomFieldWithNumericParams extends PatchCustomFieldParams {
      var initialValue: js.UndefOr[scala.Double] = js.undefined
      var max: js.UndefOr[scala.Double] = js.undefined
      var min: js.UndefOr[scala.Double] = js.undefined
      var unit: js.UndefOr[java.lang.String] = js.undefined
    }
    
    
    trait PatchIssueTypeParams extends js.Object {
      var color: js.UndefOr[IssueTypeColor] = js.undefined
      var name: js.UndefOr[java.lang.String] = js.undefined
    }
    
    
    trait PatchProjectParams extends js.Object {
      var archived: js.UndefOr[scala.Boolean] = js.undefined
      var chartEnabled: js.UndefOr[scala.Boolean] = js.undefined
      var key: js.UndefOr[java.lang.String] = js.undefined
      var name: js.UndefOr[java.lang.String] = js.undefined
      var projectLeaderCanEditProjectLeader: js.UndefOr[scala.Boolean] = js.undefined
      var subtaskingEnabled: js.UndefOr[scala.Boolean] = js.undefined
      var textFormattingRule: js.UndefOr[TextFormattingRule] = js.undefined
    }
    
    
    trait PatchVersionsParams extends js.Object {
      var archived: js.UndefOr[scala.Boolean] = js.undefined
      var description: js.UndefOr[java.lang.String] = js.undefined
      var name: java.lang.String
      var releaseDueDate: js.UndefOr[java.lang.String] = js.undefined
      var startDate: js.UndefOr[java.lang.String] = js.undefined
    }
    
    
    trait PatchWebhookParams extends js.Object {
      var activityTypeIds: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var allEvent: js.UndefOr[scala.Boolean] = js.undefined
      var description: js.UndefOr[java.lang.String] = js.undefined
      var hookUrl: js.UndefOr[java.lang.String] = js.undefined
      var name: js.UndefOr[java.lang.String] = js.undefined
    }
    
    
    trait PostCategoriesParams extends js.Object {
      var name: java.lang.String
    }
    
    
    trait PostCustomFieldItemParams extends js.Object {
      var name: java.lang.String
    }
    
    
    trait PostCustomFieldParams extends js.Object {
      var applicableIssueTypes: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var description: js.UndefOr[java.lang.String] = js.undefined
      var name: java.lang.String
      var required: js.UndefOr[scala.Boolean] = js.undefined
      var typeId: FieldType
    }
    
    
    trait PostCustomFieldWithDateParams extends PostCustomFieldParams {
      var initialDate: js.UndefOr[java.lang.String] = js.undefined
      var initialShift: js.UndefOr[scala.Double] = js.undefined
      var initialValueType: js.UndefOr[scala.Double] = js.undefined
      var max: js.UndefOr[java.lang.String] = js.undefined
      var min: js.UndefOr[java.lang.String] = js.undefined
    }
    
    
    trait PostCustomFieldWithListParams extends PostCustomFieldParams {
      var allowAddItem: js.UndefOr[scala.Boolean] = js.undefined
      var allowInput: js.UndefOr[scala.Boolean] = js.undefined
      var items: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    }
    
    
    trait PostCustomFieldWithNumericParams extends PostCustomFieldParams {
      var initialValue: js.UndefOr[scala.Double] = js.undefined
      var max: js.UndefOr[scala.Double] = js.undefined
      var min: js.UndefOr[scala.Double] = js.undefined
      var unit: js.UndefOr[java.lang.String] = js.undefined
    }
    
    
    trait PostIssueTypeParams extends js.Object {
      var color: IssueTypeColor
      var name: java.lang.String
    }
    
    
    trait PostProjectAdministrators extends js.Object {
      var userId: scala.Double
    }
    
    
    trait PostProjectParams extends js.Object {
      var chartEnabled: scala.Boolean
      var key: java.lang.String
      var name: java.lang.String
      var projectLeaderCanEditProjectLeader: js.UndefOr[scala.Boolean] = js.undefined
      var subtaskingEnabled: scala.Boolean
      var textFormattingRule: TextFormattingRule
    }
    
    
    trait PostStarParams extends js.Object {
      var commentId: js.UndefOr[scala.Double] = js.undefined
      var issueId: js.UndefOr[scala.Double] = js.undefined
      var pullRequestCommentId: js.UndefOr[scala.Double] = js.undefined
      var pullRequestId: js.UndefOr[scala.Double] = js.undefined
      var wikiId: js.UndefOr[scala.Double] = js.undefined
    }
    
    
    trait PostVersionsParams extends js.Object {
      var description: java.lang.String
      var name: java.lang.String
      var releaseDueDate: java.lang.String
      var startDate: java.lang.String
    }
    
    
    trait PostWebhookParams extends js.Object {
      var activityTypeIds: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var allEvent: js.UndefOr[scala.Boolean] = js.undefined
      var description: js.UndefOr[java.lang.String] = js.undefined
      var hookUrl: js.UndefOr[java.lang.String] = js.undefined
      var name: js.UndefOr[java.lang.String] = js.undefined
    }
    
    @js.native
    object FieldType extends js.Object {
      @js.native
      sealed trait CheckBox
        extends backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.FieldType
      
      @js.native
      sealed trait Date
        extends backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.FieldType
      
      @js.native
      sealed trait MultipleList
        extends backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.FieldType
      
      @js.native
      sealed trait Numeric
        extends backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.FieldType
      
      @js.native
      sealed trait Radio
        extends backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.FieldType
      
      @js.native
      sealed trait SingleList
        extends backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.FieldType
      
      @js.native
      sealed trait Text
        extends backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.FieldType
      
      @js.native
      sealed trait TextArea
        extends backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.FieldType
      
      /* 7 */ val CheckBox: CheckBox with scala.Double = js.native
      /* 4 */ val Date: Date with scala.Double = js.native
      /* 6 */ val MultipleList: MultipleList with scala.Double = js.native
      /* 3 */ val Numeric: Numeric with scala.Double = js.native
      /* 8 */ val Radio: Radio with scala.Double = js.native
      /* 5 */ val SingleList: SingleList with scala.Double = js.native
      /* 1 */ val Text: Text with scala.Double = js.native
      /* 2 */ val TextArea: TextArea with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.FieldType with scala.Double] = js.native
    }
    
    type IssueTypeColor = backlogDashJsLib.backlogDashJsLibStrings.`#e30000` | backlogDashJsLib.backlogDashJsLibStrings.`#990000` | backlogDashJsLib.backlogDashJsLibStrings.`#934981` | backlogDashJsLib.backlogDashJsLibStrings.`#814fbc` | backlogDashJsLib.backlogDashJsLibStrings.`#2779ca` | backlogDashJsLib.backlogDashJsLibStrings.`#007e9a` | backlogDashJsLib.backlogDashJsLibStrings.`#7ea800` | backlogDashJsLib.backlogDashJsLibStrings.`#ff9200` | backlogDashJsLib.backlogDashJsLibStrings.`#ff3265` | backlogDashJsLib.backlogDashJsLibStrings.`#666665`
    type TextFormattingRule = backlogDashJsLib.backlogDashJsLibStrings.backlog | backlogDashJsLib.backlogDashJsLibStrings.markdown
  }
  
  @JSName("PullRequest")
  @js.native
  object PullRequestNs extends js.Object {
    
    trait GetPullRequestCommentsParams extends js.Object {
      var count: js.UndefOr[scala.Double] = js.undefined
      var maxId: js.UndefOr[scala.Double] = js.undefined
      var minId: js.UndefOr[scala.Double] = js.undefined
      var order: js.UndefOr[backlogDashJsLib.backlogDashJsMod.OptionNs.Order] = js.undefined
    }
    
    
    trait GetPullRequestsParams extends js.Object {
      var assigneeId: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var count: js.UndefOr[scala.Double] = js.undefined
      var createdUserId: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var issueId: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var offset: js.UndefOr[scala.Double] = js.undefined
      var statusId: js.UndefOr[js.Array[scala.Double]] = js.undefined
    }
    
    
    trait PatchPullRequestCommentsParams extends js.Object {
      var content: java.lang.String
    }
    
    
    trait PatchPullRequestParams extends js.Object {
      var assigneeId: js.UndefOr[scala.Double] = js.undefined
      var comment: js.UndefOr[js.Array[java.lang.String]] = js.undefined
      var description: js.UndefOr[java.lang.String] = js.undefined
      var issueId: js.UndefOr[scala.Double] = js.undefined
      var notifiedUserId: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var summary: js.UndefOr[java.lang.String] = js.undefined
    }
    
    
    trait PostPullRequestCommentsParams extends js.Object {
      var content: java.lang.String
      var notifiedUserId: js.UndefOr[js.Array[scala.Double]] = js.undefined
    }
    
    
    trait PostPullRequestParams extends js.Object {
      var assigneeId: js.UndefOr[scala.Double] = js.undefined
      var attachmentId: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var base: java.lang.String
      var branch: java.lang.String
      var description: java.lang.String
      var issueId: js.UndefOr[scala.Double] = js.undefined
      var notifiedUserId: js.UndefOr[js.Array[scala.Double]] = js.undefined
      var summary: java.lang.String
    }
    
  }
  
  @JSName("Space")
  @js.native
  object SpaceNs extends js.Object {
    
    trait GetActivitiesParams extends js.Object {
      var activityTypeId: js.UndefOr[js.Array[backlogDashJsLib.backlogDashJsMod.OptionNs.ActivityType]] = js.undefined
      var count: js.UndefOr[scala.Double] = js.undefined
      var maxId: js.UndefOr[scala.Double] = js.undefined
      var minId: js.UndefOr[scala.Double] = js.undefined
      var order: js.UndefOr[backlogDashJsLib.backlogDashJsMod.OptionNs.Order] = js.undefined
    }
    
    
    trait PutSpaceNotificationParams extends js.Object {
      var content: java.lang.String
    }
    
  }
  
  @JSName("User")
  @js.native
  object UserNs extends js.Object {
    
    trait GetRecentlyViewedParams extends js.Object {
      var count: js.UndefOr[scala.Double] = js.undefined
      var offset: js.UndefOr[scala.Double] = js.undefined
      var order: js.UndefOr[backlogDashJsLib.backlogDashJsMod.OptionNs.Order] = js.undefined
    }
    
    
    trait GetUserActivitiesParams extends js.Object {
      var activityTypeId: js.UndefOr[js.Array[backlogDashJsLib.backlogDashJsMod.OptionNs.ActivityType]] = js.undefined
      var count: js.UndefOr[scala.Double] = js.undefined
      var maxId: js.UndefOr[scala.Double] = js.undefined
      var minId: js.UndefOr[scala.Double] = js.undefined
      var order: js.UndefOr[backlogDashJsLib.backlogDashJsMod.OptionNs.Order] = js.undefined
    }
    
    
    trait GetUserStarsCountParams extends js.Object {
      var since: js.UndefOr[java.lang.String] = js.undefined
      var until: js.UndefOr[java.lang.String] = js.undefined
    }
    
    
    trait GetUserStarsParams extends js.Object {
      var count: js.UndefOr[scala.Double] = js.undefined
      var maxId: js.UndefOr[scala.Double] = js.undefined
      var minId: js.UndefOr[scala.Double] = js.undefined
      var order: js.UndefOr[backlogDashJsLib.backlogDashJsMod.OptionNs.Order] = js.undefined
    }
    
    
    trait PatchUserParams extends js.Object {
      var mailAddress: js.UndefOr[java.lang.String] = js.undefined
      var name: js.UndefOr[java.lang.String] = js.undefined
      var password: js.UndefOr[java.lang.String] = js.undefined
      var roleType: js.UndefOr[RoleType] = js.undefined
    }
    
    
    trait PostUserParams extends js.Object {
      var mailAddress: java.lang.String
      var name: java.lang.String
      var password: java.lang.String
      var roleType: RoleType
      var userId: java.lang.String
    }
    
    @js.native
    sealed trait RoleType extends js.Object
    
    @js.native
    object RoleType extends js.Object {
      @js.native
      sealed trait Admin
        extends backlogDashJsLib.backlogDashJsMod.OptionNs.UserNs.RoleType
      
      @js.native
      sealed trait GuestReporter
        extends backlogDashJsLib.backlogDashJsMod.OptionNs.UserNs.RoleType
      
      @js.native
      sealed trait GuestViewer
        extends backlogDashJsLib.backlogDashJsMod.OptionNs.UserNs.RoleType
      
      @js.native
      sealed trait Reporter
        extends backlogDashJsLib.backlogDashJsMod.OptionNs.UserNs.RoleType
      
      @js.native
      sealed trait User
        extends backlogDashJsLib.backlogDashJsMod.OptionNs.UserNs.RoleType
      
      @js.native
      sealed trait Viewer
        extends backlogDashJsLib.backlogDashJsMod.OptionNs.UserNs.RoleType
      
      /* 1 */ val Admin: Admin with scala.Double = js.native
      /* 5 */ val GuestReporter: GuestReporter with scala.Double = js.native
      /* 6 */ val GuestViewer: GuestViewer with scala.Double = js.native
      /* 3 */ val Reporter: Reporter with scala.Double = js.native
      /* 2 */ val User: User with scala.Double = js.native
      /* 4 */ val Viewer: Viewer with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[backlogDashJsLib.backlogDashJsMod.OptionNs.UserNs.RoleType with scala.Double] = js.native
    }
    
  }
  
  @JSName("Wiki")
  @js.native
  object WikiNs extends js.Object {
    
    trait GetWikisHistoryParams extends js.Object {
      var count: js.UndefOr[scala.Double] = js.undefined
      var maxId: js.UndefOr[scala.Double] = js.undefined
      var minId: js.UndefOr[scala.Double] = js.undefined
      var order: js.UndefOr[backlogDashJsLib.backlogDashJsMod.OptionNs.Order] = js.undefined
    }
    
    
    trait PatchWikiParams extends js.Object {
      var content: js.UndefOr[java.lang.String] = js.undefined
      var mailNotify: js.UndefOr[scala.Boolean] = js.undefined
      var name: js.UndefOr[java.lang.String] = js.undefined
    }
    
    
    trait PostWikiParams extends js.Object {
      var content: java.lang.String
      var mailNotify: js.UndefOr[scala.Boolean] = js.undefined
      var name: java.lang.String
      var projectId: scala.Double
    }
    
  }
  
  type Order = backlogDashJsLib.backlogDashJsLibStrings.asc | backlogDashJsLib.backlogDashJsLibStrings.desc
}

