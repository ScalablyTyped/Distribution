package typings.backlogDashJs.backlogDashJsMod

import org.scalablytyped.runtime.StringDictionary
import typings.backlogDashJs.backlogDashJsMod.OptionNs.ActivityType
import typings.backlogDashJs.backlogDashJsMod.OptionNs.IssueNs.ParentChildType
import typings.backlogDashJs.backlogDashJsMod.OptionNs.IssueNs.SortKey
import typings.backlogDashJs.backlogDashJsMod.OptionNs.Order
import typings.backlogDashJs.backlogDashJsMod.OptionNs.ProjectNs.FieldType
import typings.backlogDashJs.backlogDashJsMod.OptionNs.ProjectNs.IssueTypeColor
import typings.backlogDashJs.backlogDashJsMod.OptionNs.ProjectNs.PatchCustomFieldParams
import typings.backlogDashJs.backlogDashJsMod.OptionNs.ProjectNs.PostCustomFieldParams
import typings.backlogDashJs.backlogDashJsMod.OptionNs.ProjectNs.TextFormattingRule
import typings.backlogDashJs.backlogDashJsMod.OptionNs.UserNs.RoleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backlog-js", "Option")
@js.native
object OptionNs extends js.Object {
  @js.native
  sealed trait ActivityType extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.backlogDashJs.backlogDashJsStrings.asc
    - typings.backlogDashJs.backlogDashJsStrings.desc
  */
  trait Order extends js.Object
  
  @js.native
  object ActivityType extends js.Object {
    @js.native
    sealed trait FileAdded extends ActivityType
    
    @js.native
    sealed trait FileDeleted extends ActivityType
    
    @js.native
    sealed trait FileUpdated extends ActivityType
    
    @js.native
    sealed trait GitPushed extends ActivityType
    
    @js.native
    sealed trait GitRepositoryCreated extends ActivityType
    
    @js.native
    sealed trait IssueCommented extends ActivityType
    
    @js.native
    sealed trait IssueCreated extends ActivityType
    
    @js.native
    sealed trait IssueDeleted extends ActivityType
    
    @js.native
    sealed trait IssueMultiUpdated extends ActivityType
    
    @js.native
    sealed trait IssueUpdated extends ActivityType
    
    @js.native
    sealed trait NotifyAdded extends ActivityType
    
    @js.native
    sealed trait ProjectUserAdded extends ActivityType
    
    @js.native
    sealed trait ProjectUserRemoved extends ActivityType
    
    @js.native
    sealed trait PullRequestAdded extends ActivityType
    
    @js.native
    sealed trait PullRequestCommented extends ActivityType
    
    @js.native
    sealed trait PullRequestMerged extends ActivityType
    
    @js.native
    sealed trait PullRequestUpdated extends ActivityType
    
    @js.native
    sealed trait SvnCommitted extends ActivityType
    
    @js.native
    sealed trait Undefined extends ActivityType
    
    @js.native
    sealed trait WikiCreated extends ActivityType
    
    @js.native
    sealed trait WikiDeleted extends ActivityType
    
    @js.native
    sealed trait WikiUpdated extends ActivityType
    
    /* 8 */ val FileAdded: typings.backlogDashJs.backlogDashJsMod.OptionNs.ActivityType.FileAdded with Double = js.native
    /* 10 */ val FileDeleted: typings.backlogDashJs.backlogDashJsMod.OptionNs.ActivityType.FileDeleted with Double = js.native
    /* 9 */ val FileUpdated: typings.backlogDashJs.backlogDashJsMod.OptionNs.ActivityType.FileUpdated with Double = js.native
    /* 12 */ val GitPushed: typings.backlogDashJs.backlogDashJsMod.OptionNs.ActivityType.GitPushed with Double = js.native
    /* 13 */ val GitRepositoryCreated: typings.backlogDashJs.backlogDashJsMod.OptionNs.ActivityType.GitRepositoryCreated with Double = js.native
    /* 3 */ val IssueCommented: typings.backlogDashJs.backlogDashJsMod.OptionNs.ActivityType.IssueCommented with Double = js.native
    /* 1 */ val IssueCreated: typings.backlogDashJs.backlogDashJsMod.OptionNs.ActivityType.IssueCreated with Double = js.native
    /* 4 */ val IssueDeleted: typings.backlogDashJs.backlogDashJsMod.OptionNs.ActivityType.IssueDeleted with Double = js.native
    /* 14 */ val IssueMultiUpdated: typings.backlogDashJs.backlogDashJsMod.OptionNs.ActivityType.IssueMultiUpdated with Double = js.native
    /* 2 */ val IssueUpdated: typings.backlogDashJs.backlogDashJsMod.OptionNs.ActivityType.IssueUpdated with Double = js.native
    /* 17 */ val NotifyAdded: typings.backlogDashJs.backlogDashJsMod.OptionNs.ActivityType.NotifyAdded with Double = js.native
    /* 15 */ val ProjectUserAdded: typings.backlogDashJs.backlogDashJsMod.OptionNs.ActivityType.ProjectUserAdded with Double = js.native
    /* 16 */ val ProjectUserRemoved: typings.backlogDashJs.backlogDashJsMod.OptionNs.ActivityType.ProjectUserRemoved with Double = js.native
    /* 18 */ val PullRequestAdded: typings.backlogDashJs.backlogDashJsMod.OptionNs.ActivityType.PullRequestAdded with Double = js.native
    /* 20 */ val PullRequestCommented: typings.backlogDashJs.backlogDashJsMod.OptionNs.ActivityType.PullRequestCommented with Double = js.native
    /* 21 */ val PullRequestMerged: typings.backlogDashJs.backlogDashJsMod.OptionNs.ActivityType.PullRequestMerged with Double = js.native
    /* 19 */ val PullRequestUpdated: typings.backlogDashJs.backlogDashJsMod.OptionNs.ActivityType.PullRequestUpdated with Double = js.native
    /* 11 */ val SvnCommitted: typings.backlogDashJs.backlogDashJsMod.OptionNs.ActivityType.SvnCommitted with Double = js.native
    /* -1 */ val Undefined: typings.backlogDashJs.backlogDashJsMod.OptionNs.ActivityType.Undefined with Double = js.native
    /* 5 */ val WikiCreated: typings.backlogDashJs.backlogDashJsMod.OptionNs.ActivityType.WikiCreated with Double = js.native
    /* 7 */ val WikiDeleted: typings.backlogDashJs.backlogDashJsMod.OptionNs.ActivityType.WikiDeleted with Double = js.native
    /* 6 */ val WikiUpdated: typings.backlogDashJs.backlogDashJsMod.OptionNs.ActivityType.WikiUpdated with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ActivityType with Double] = js.native
  }
  
  @JSName("Group")
  @js.native
  object GroupNs extends js.Object {
    trait GetGroupsParams extends js.Object {
      var count: js.UndefOr[Double] = js.undefined
      var offset: js.UndefOr[Double] = js.undefined
      var order: js.UndefOr[Order] = js.undefined
    }
    
    trait PatchGroupParams extends js.Object {
      var members: js.UndefOr[js.Array[String]] = js.undefined
      var name: js.UndefOr[String] = js.undefined
    }
    
    trait PostGroupsParams extends js.Object {
      var members: js.UndefOr[js.Array[String]] = js.undefined
      var name: String
    }
    
  }
  
  @JSName("Issue")
  @js.native
  object IssueNs extends js.Object {
    trait GetIssueCommentsParams extends js.Object {
      var count: js.UndefOr[Double] = js.undefined
      var maxId: js.UndefOr[Double] = js.undefined
      var minId: js.UndefOr[Double] = js.undefined
      var order: js.UndefOr[Order] = js.undefined
    }
    
    trait GetIssuesParams
      extends /* customField_ */ StringDictionary[js.Any] {
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
      var keyword: String
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
    
    trait IssueCommentNotifications extends js.Object {
      var notifiedUserId: js.Array[Double]
    }
    
    trait LinkIssueSharedFilesParams extends js.Object {
      var fileId: js.Array[Double]
    }
    
    @js.native
    sealed trait ParentChildType extends js.Object
    
    trait PatchIssueCommentParams extends js.Object {
      var content: String
    }
    
    trait PatchIssueParams
      extends /* customField_ */ StringDictionary[js.Any] {
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
    
    trait PostIssueCommentsParams extends js.Object {
      var attachmentId: js.UndefOr[js.Array[Double]] = js.undefined
      var content: String
      var notifiedUserId: js.UndefOr[js.Array[Double]] = js.undefined
    }
    
    trait PostIssueParams
      extends /* customField_ */ StringDictionary[js.Any] {
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
    
    /* Rewritten from type alias, can be one of: 
      - typings.backlogDashJs.backlogDashJsStrings.issueType
      - typings.backlogDashJs.backlogDashJsStrings.category
      - typings.backlogDashJs.backlogDashJsStrings.version
      - typings.backlogDashJs.backlogDashJsStrings.milestone
      - typings.backlogDashJs.backlogDashJsStrings.summary
      - typings.backlogDashJs.backlogDashJsStrings.status
      - typings.backlogDashJs.backlogDashJsStrings.priority
      - typings.backlogDashJs.backlogDashJsStrings.attachment
      - typings.backlogDashJs.backlogDashJsStrings.sharedFile
      - typings.backlogDashJs.backlogDashJsStrings.created
      - typings.backlogDashJs.backlogDashJsStrings.createdUser
      - typings.backlogDashJs.backlogDashJsStrings.updated
      - typings.backlogDashJs.backlogDashJsStrings.updatedUser
      - typings.backlogDashJs.backlogDashJsStrings.assignee
      - typings.backlogDashJs.backlogDashJsStrings.startDate
      - typings.backlogDashJs.backlogDashJsStrings.dueDate
      - typings.backlogDashJs.backlogDashJsStrings.estimatedHours
      - typings.backlogDashJs.backlogDashJsStrings.actualHours
      - typings.backlogDashJs.backlogDashJsStrings.childIssue
    */
    trait SortKey extends js.Object
    
    @js.native
    object ParentChildType extends js.Object {
      @js.native
      sealed trait All extends ParentChildType
      
      @js.native
      sealed trait Child extends ParentChildType
      
      @js.native
      sealed trait NotChild extends ParentChildType
      
      @js.native
      sealed trait NotChildNotParent extends ParentChildType
      
      @js.native
      sealed trait Parent extends ParentChildType
      
      /* 0 */ val All: typings.backlogDashJs.backlogDashJsMod.OptionNs.IssueNs.ParentChildType.All with Double = js.native
      /* 2 */ val Child: typings.backlogDashJs.backlogDashJsMod.OptionNs.IssueNs.ParentChildType.Child with Double = js.native
      /* 1 */ val NotChild: typings.backlogDashJs.backlogDashJsMod.OptionNs.IssueNs.ParentChildType.NotChild with Double = js.native
      /* 3 */ val NotChildNotParent: typings.backlogDashJs.backlogDashJsMod.OptionNs.IssueNs.ParentChildType.NotChildNotParent with Double = js.native
      /* 4 */ val Parent: typings.backlogDashJs.backlogDashJsMod.OptionNs.IssueNs.ParentChildType.Parent with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[ParentChildType with Double] = js.native
    }
    
  }
  
  @JSName("Notification")
  @js.native
  object NotificationNs extends js.Object {
    trait GetNotificationsCountParams extends js.Object {
      var alreadyRead: Boolean
      var resourceAlreadyRead: Boolean
    }
    
    trait GetNotificationsParams extends js.Object {
      var count: js.UndefOr[Double] = js.undefined
      var maxId: js.UndefOr[Double] = js.undefined
      var minId: js.UndefOr[Double] = js.undefined
      var order: js.UndefOr[Order] = js.undefined
    }
    
  }
  
  @JSName("OAuth2")
  @js.native
  object OAuth2Ns extends js.Object {
    trait Credentials extends js.Object {
      var clientId: String
      var clientSecret: String
    }
    
  }
  
  @JSName("Project")
  @js.native
  object ProjectNs extends js.Object {
    trait DeleteIssueTypeParams extends js.Object {
      var substituteIssueTypeId: Double
    }
    
    trait DeleteProjectAdministrators extends js.Object {
      var userId: Double
    }
    
    trait DeleteProjectUsersParams extends js.Object {
      var userId: Double
    }
    
    @js.native
    sealed trait FieldType extends js.Object
    
    trait GetProjectsParams extends js.Object {
      var all: js.UndefOr[Boolean] = js.undefined
      var archived: js.UndefOr[Boolean] = js.undefined
    }
    
    trait GetSharedFilesParams extends js.Object {
      var count: js.UndefOr[Double] = js.undefined
      var offset: js.UndefOr[Double] = js.undefined
      var order: js.UndefOr[Order] = js.undefined
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.backlogDashJs.backlogDashJsStrings.`#e30000`
      - typings.backlogDashJs.backlogDashJsStrings.`#990000`
      - typings.backlogDashJs.backlogDashJsStrings.`#934981`
      - typings.backlogDashJs.backlogDashJsStrings.`#814fbc`
      - typings.backlogDashJs.backlogDashJsStrings.`#2779ca`
      - typings.backlogDashJs.backlogDashJsStrings.`#007e9a`
      - typings.backlogDashJs.backlogDashJsStrings.`#7ea800`
      - typings.backlogDashJs.backlogDashJsStrings.`#ff9200`
      - typings.backlogDashJs.backlogDashJsStrings.`#ff3265`
      - typings.backlogDashJs.backlogDashJsStrings.`#666665`
    */
    trait IssueTypeColor extends js.Object
    
    trait PatchCategoriesParams extends js.Object {
      var name: String
    }
    
    trait PatchCustomFieldItemParams extends js.Object {
      var name: String
    }
    
    trait PatchCustomFieldParams extends js.Object {
      var applicableIssueTypes: js.UndefOr[js.Array[Double]] = js.undefined
      var description: js.UndefOr[String] = js.undefined
      var name: js.UndefOr[String] = js.undefined
      var required: js.UndefOr[Boolean] = js.undefined
    }
    
    trait PatchCustomFieldWithDateParams extends PatchCustomFieldParams {
      var initialDate: js.UndefOr[String] = js.undefined
      var initialShift: js.UndefOr[Double] = js.undefined
      var initialValueType: js.UndefOr[Double] = js.undefined
      var max: js.UndefOr[String] = js.undefined
      var min: js.UndefOr[String] = js.undefined
    }
    
    trait PatchCustomFieldWithListParams extends PatchCustomFieldParams {
      var allowAddItem: js.UndefOr[Boolean] = js.undefined
      var allowInput: js.UndefOr[Boolean] = js.undefined
      var items: js.UndefOr[js.Array[String]] = js.undefined
    }
    
    trait PatchCustomFieldWithNumericParams extends PatchCustomFieldParams {
      var initialValue: js.UndefOr[Double] = js.undefined
      var max: js.UndefOr[Double] = js.undefined
      var min: js.UndefOr[Double] = js.undefined
      var unit: js.UndefOr[String] = js.undefined
    }
    
    trait PatchIssueTypeParams extends js.Object {
      var color: js.UndefOr[IssueTypeColor] = js.undefined
      var name: js.UndefOr[String] = js.undefined
    }
    
    trait PatchProjectParams extends js.Object {
      var archived: js.UndefOr[Boolean] = js.undefined
      var chartEnabled: js.UndefOr[Boolean] = js.undefined
      var key: js.UndefOr[String] = js.undefined
      var name: js.UndefOr[String] = js.undefined
      var projectLeaderCanEditProjectLeader: js.UndefOr[Boolean] = js.undefined
      var subtaskingEnabled: js.UndefOr[Boolean] = js.undefined
      var textFormattingRule: js.UndefOr[TextFormattingRule] = js.undefined
    }
    
    trait PatchVersionsParams extends js.Object {
      var archived: js.UndefOr[Boolean] = js.undefined
      var description: js.UndefOr[String] = js.undefined
      var name: String
      var releaseDueDate: js.UndefOr[String] = js.undefined
      var startDate: js.UndefOr[String] = js.undefined
    }
    
    trait PatchWebhookParams extends js.Object {
      var activityTypeIds: js.UndefOr[js.Array[Double]] = js.undefined
      var allEvent: js.UndefOr[Boolean] = js.undefined
      var description: js.UndefOr[String] = js.undefined
      var hookUrl: js.UndefOr[String] = js.undefined
      var name: js.UndefOr[String] = js.undefined
    }
    
    trait PostCategoriesParams extends js.Object {
      var name: String
    }
    
    trait PostCustomFieldItemParams extends js.Object {
      var name: String
    }
    
    trait PostCustomFieldParams extends js.Object {
      var applicableIssueTypes: js.UndefOr[js.Array[Double]] = js.undefined
      var description: js.UndefOr[String] = js.undefined
      var name: String
      var required: js.UndefOr[Boolean] = js.undefined
      var typeId: FieldType
    }
    
    trait PostCustomFieldWithDateParams extends PostCustomFieldParams {
      var initialDate: js.UndefOr[String] = js.undefined
      var initialShift: js.UndefOr[Double] = js.undefined
      var initialValueType: js.UndefOr[Double] = js.undefined
      var max: js.UndefOr[String] = js.undefined
      var min: js.UndefOr[String] = js.undefined
    }
    
    trait PostCustomFieldWithListParams extends PostCustomFieldParams {
      var allowAddItem: js.UndefOr[Boolean] = js.undefined
      var allowInput: js.UndefOr[Boolean] = js.undefined
      var items: js.UndefOr[js.Array[String]] = js.undefined
    }
    
    trait PostCustomFieldWithNumericParams extends PostCustomFieldParams {
      var initialValue: js.UndefOr[Double] = js.undefined
      var max: js.UndefOr[Double] = js.undefined
      var min: js.UndefOr[Double] = js.undefined
      var unit: js.UndefOr[String] = js.undefined
    }
    
    trait PostIssueTypeParams extends js.Object {
      var color: IssueTypeColor
      var name: String
    }
    
    trait PostProjectAdministrators extends js.Object {
      var userId: Double
    }
    
    trait PostProjectParams extends js.Object {
      var chartEnabled: Boolean
      var key: String
      var name: String
      var projectLeaderCanEditProjectLeader: js.UndefOr[Boolean] = js.undefined
      var subtaskingEnabled: Boolean
      var textFormattingRule: TextFormattingRule
    }
    
    trait PostStarParams extends js.Object {
      var commentId: js.UndefOr[Double] = js.undefined
      var issueId: js.UndefOr[Double] = js.undefined
      var pullRequestCommentId: js.UndefOr[Double] = js.undefined
      var pullRequestId: js.UndefOr[Double] = js.undefined
      var wikiId: js.UndefOr[Double] = js.undefined
    }
    
    trait PostVersionsParams extends js.Object {
      var description: String
      var name: String
      var releaseDueDate: String
      var startDate: String
    }
    
    trait PostWebhookParams extends js.Object {
      var activityTypeIds: js.UndefOr[js.Array[Double]] = js.undefined
      var allEvent: js.UndefOr[Boolean] = js.undefined
      var description: js.UndefOr[String] = js.undefined
      var hookUrl: js.UndefOr[String] = js.undefined
      var name: js.UndefOr[String] = js.undefined
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.backlogDashJs.backlogDashJsStrings.backlog
      - typings.backlogDashJs.backlogDashJsStrings.markdown
    */
    trait TextFormattingRule extends js.Object
    
    @js.native
    object FieldType extends js.Object {
      @js.native
      sealed trait CheckBox extends FieldType
      
      @js.native
      sealed trait Date extends FieldType
      
      @js.native
      sealed trait MultipleList extends FieldType
      
      @js.native
      sealed trait Numeric extends FieldType
      
      @js.native
      sealed trait Radio extends FieldType
      
      @js.native
      sealed trait SingleList extends FieldType
      
      @js.native
      sealed trait Text extends FieldType
      
      @js.native
      sealed trait TextArea extends FieldType
      
      /* 7 */ val CheckBox: typings.backlogDashJs.backlogDashJsMod.OptionNs.ProjectNs.FieldType.CheckBox with Double = js.native
      /* 4 */ val Date: typings.backlogDashJs.backlogDashJsMod.OptionNs.ProjectNs.FieldType.Date with Double = js.native
      /* 6 */ val MultipleList: typings.backlogDashJs.backlogDashJsMod.OptionNs.ProjectNs.FieldType.MultipleList with Double = js.native
      /* 3 */ val Numeric: typings.backlogDashJs.backlogDashJsMod.OptionNs.ProjectNs.FieldType.Numeric with Double = js.native
      /* 8 */ val Radio: typings.backlogDashJs.backlogDashJsMod.OptionNs.ProjectNs.FieldType.Radio with Double = js.native
      /* 5 */ val SingleList: typings.backlogDashJs.backlogDashJsMod.OptionNs.ProjectNs.FieldType.SingleList with Double = js.native
      /* 1 */ val Text: typings.backlogDashJs.backlogDashJsMod.OptionNs.ProjectNs.FieldType.Text with Double = js.native
      /* 2 */ val TextArea: typings.backlogDashJs.backlogDashJsMod.OptionNs.ProjectNs.FieldType.TextArea with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[FieldType with Double] = js.native
    }
    
  }
  
  @JSName("PullRequest")
  @js.native
  object PullRequestNs extends js.Object {
    trait GetPullRequestCommentsParams extends js.Object {
      var count: js.UndefOr[Double] = js.undefined
      var maxId: js.UndefOr[Double] = js.undefined
      var minId: js.UndefOr[Double] = js.undefined
      var order: js.UndefOr[Order] = js.undefined
    }
    
    trait GetPullRequestsParams extends js.Object {
      var assigneeId: js.UndefOr[js.Array[Double]] = js.undefined
      var count: js.UndefOr[Double] = js.undefined
      var createdUserId: js.UndefOr[js.Array[Double]] = js.undefined
      var issueId: js.UndefOr[js.Array[Double]] = js.undefined
      var offset: js.UndefOr[Double] = js.undefined
      var statusId: js.UndefOr[js.Array[Double]] = js.undefined
    }
    
    trait PatchPullRequestCommentsParams extends js.Object {
      var content: String
    }
    
    trait PatchPullRequestParams extends js.Object {
      var assigneeId: js.UndefOr[Double] = js.undefined
      var comment: js.UndefOr[js.Array[String]] = js.undefined
      var description: js.UndefOr[String] = js.undefined
      var issueId: js.UndefOr[Double] = js.undefined
      var notifiedUserId: js.UndefOr[js.Array[Double]] = js.undefined
      var summary: js.UndefOr[String] = js.undefined
    }
    
    trait PostPullRequestCommentsParams extends js.Object {
      var content: String
      var notifiedUserId: js.UndefOr[js.Array[Double]] = js.undefined
    }
    
    trait PostPullRequestParams extends js.Object {
      var assigneeId: js.UndefOr[Double] = js.undefined
      var attachmentId: js.UndefOr[js.Array[Double]] = js.undefined
      var base: String
      var branch: String
      var description: String
      var issueId: js.UndefOr[Double] = js.undefined
      var notifiedUserId: js.UndefOr[js.Array[Double]] = js.undefined
      var summary: String
    }
    
  }
  
  @JSName("Space")
  @js.native
  object SpaceNs extends js.Object {
    trait GetActivitiesParams extends js.Object {
      var activityTypeId: js.UndefOr[js.Array[ActivityType]] = js.undefined
      var count: js.UndefOr[Double] = js.undefined
      var maxId: js.UndefOr[Double] = js.undefined
      var minId: js.UndefOr[Double] = js.undefined
      var order: js.UndefOr[Order] = js.undefined
    }
    
    trait PutSpaceNotificationParams extends js.Object {
      var content: String
    }
    
  }
  
  @JSName("User")
  @js.native
  object UserNs extends js.Object {
    trait GetRecentlyViewedParams extends js.Object {
      var count: js.UndefOr[Double] = js.undefined
      var offset: js.UndefOr[Double] = js.undefined
      var order: js.UndefOr[Order] = js.undefined
    }
    
    trait GetUserActivitiesParams extends js.Object {
      var activityTypeId: js.UndefOr[js.Array[ActivityType]] = js.undefined
      var count: js.UndefOr[Double] = js.undefined
      var maxId: js.UndefOr[Double] = js.undefined
      var minId: js.UndefOr[Double] = js.undefined
      var order: js.UndefOr[Order] = js.undefined
    }
    
    trait GetUserStarsCountParams extends js.Object {
      var since: js.UndefOr[String] = js.undefined
      var until: js.UndefOr[String] = js.undefined
    }
    
    trait GetUserStarsParams extends js.Object {
      var count: js.UndefOr[Double] = js.undefined
      var maxId: js.UndefOr[Double] = js.undefined
      var minId: js.UndefOr[Double] = js.undefined
      var order: js.UndefOr[Order] = js.undefined
    }
    
    trait PatchUserParams extends js.Object {
      var mailAddress: js.UndefOr[String] = js.undefined
      var name: js.UndefOr[String] = js.undefined
      var password: js.UndefOr[String] = js.undefined
      var roleType: js.UndefOr[RoleType] = js.undefined
    }
    
    trait PostUserParams extends js.Object {
      var mailAddress: String
      var name: String
      var password: String
      var roleType: RoleType
      var userId: String
    }
    
    @js.native
    sealed trait RoleType extends js.Object
    
    @js.native
    object RoleType extends js.Object {
      @js.native
      sealed trait Admin extends RoleType
      
      @js.native
      sealed trait GuestReporter extends RoleType
      
      @js.native
      sealed trait GuestViewer extends RoleType
      
      @js.native
      sealed trait Reporter extends RoleType
      
      @js.native
      sealed trait User extends RoleType
      
      @js.native
      sealed trait Viewer extends RoleType
      
      /* 1 */ val Admin: typings.backlogDashJs.backlogDashJsMod.OptionNs.UserNs.RoleType.Admin with Double = js.native
      /* 5 */ val GuestReporter: typings.backlogDashJs.backlogDashJsMod.OptionNs.UserNs.RoleType.GuestReporter with Double = js.native
      /* 6 */ val GuestViewer: typings.backlogDashJs.backlogDashJsMod.OptionNs.UserNs.RoleType.GuestViewer with Double = js.native
      /* 3 */ val Reporter: typings.backlogDashJs.backlogDashJsMod.OptionNs.UserNs.RoleType.Reporter with Double = js.native
      /* 2 */ val User: typings.backlogDashJs.backlogDashJsMod.OptionNs.UserNs.RoleType.User with Double = js.native
      /* 4 */ val Viewer: typings.backlogDashJs.backlogDashJsMod.OptionNs.UserNs.RoleType.Viewer with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[RoleType with Double] = js.native
    }
    
  }
  
  @JSName("Wiki")
  @js.native
  object WikiNs extends js.Object {
    trait GetWikisHistoryParams extends js.Object {
      var count: js.UndefOr[Double] = js.undefined
      var maxId: js.UndefOr[Double] = js.undefined
      var minId: js.UndefOr[Double] = js.undefined
      var order: js.UndefOr[Order] = js.undefined
    }
    
    trait PatchWikiParams extends js.Object {
      var content: js.UndefOr[String] = js.undefined
      var mailNotify: js.UndefOr[Boolean] = js.undefined
      var name: js.UndefOr[String] = js.undefined
    }
    
    trait PostWikiParams extends js.Object {
      var content: String
      var mailNotify: js.UndefOr[Boolean] = js.undefined
      var name: String
      var projectId: Double
    }
    
  }
  
}

