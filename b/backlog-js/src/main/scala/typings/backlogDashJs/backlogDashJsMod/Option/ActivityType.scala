package typings.backlogDashJs.backlogDashJsMod.Option

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActivityType extends js.Object

@JSImport("backlog-js", "Option.ActivityType")
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
  
  /* 8 */ val FileAdded: typings.backlogDashJs.backlogDashJsMod.Option.ActivityType.FileAdded with Double = js.native
  /* 10 */ val FileDeleted: typings.backlogDashJs.backlogDashJsMod.Option.ActivityType.FileDeleted with Double = js.native
  /* 9 */ val FileUpdated: typings.backlogDashJs.backlogDashJsMod.Option.ActivityType.FileUpdated with Double = js.native
  /* 12 */ val GitPushed: typings.backlogDashJs.backlogDashJsMod.Option.ActivityType.GitPushed with Double = js.native
  /* 13 */ val GitRepositoryCreated: typings.backlogDashJs.backlogDashJsMod.Option.ActivityType.GitRepositoryCreated with Double = js.native
  /* 3 */ val IssueCommented: typings.backlogDashJs.backlogDashJsMod.Option.ActivityType.IssueCommented with Double = js.native
  /* 1 */ val IssueCreated: typings.backlogDashJs.backlogDashJsMod.Option.ActivityType.IssueCreated with Double = js.native
  /* 4 */ val IssueDeleted: typings.backlogDashJs.backlogDashJsMod.Option.ActivityType.IssueDeleted with Double = js.native
  /* 14 */ val IssueMultiUpdated: typings.backlogDashJs.backlogDashJsMod.Option.ActivityType.IssueMultiUpdated with Double = js.native
  /* 2 */ val IssueUpdated: typings.backlogDashJs.backlogDashJsMod.Option.ActivityType.IssueUpdated with Double = js.native
  /* 17 */ val NotifyAdded: typings.backlogDashJs.backlogDashJsMod.Option.ActivityType.NotifyAdded with Double = js.native
  /* 15 */ val ProjectUserAdded: typings.backlogDashJs.backlogDashJsMod.Option.ActivityType.ProjectUserAdded with Double = js.native
  /* 16 */ val ProjectUserRemoved: typings.backlogDashJs.backlogDashJsMod.Option.ActivityType.ProjectUserRemoved with Double = js.native
  /* 18 */ val PullRequestAdded: typings.backlogDashJs.backlogDashJsMod.Option.ActivityType.PullRequestAdded with Double = js.native
  /* 20 */ val PullRequestCommented: typings.backlogDashJs.backlogDashJsMod.Option.ActivityType.PullRequestCommented with Double = js.native
  /* 21 */ val PullRequestMerged: typings.backlogDashJs.backlogDashJsMod.Option.ActivityType.PullRequestMerged with Double = js.native
  /* 19 */ val PullRequestUpdated: typings.backlogDashJs.backlogDashJsMod.Option.ActivityType.PullRequestUpdated with Double = js.native
  /* 11 */ val SvnCommitted: typings.backlogDashJs.backlogDashJsMod.Option.ActivityType.SvnCommitted with Double = js.native
  /* -1 */ val Undefined: typings.backlogDashJs.backlogDashJsMod.Option.ActivityType.Undefined with Double = js.native
  /* 5 */ val WikiCreated: typings.backlogDashJs.backlogDashJsMod.Option.ActivityType.WikiCreated with Double = js.native
  /* 7 */ val WikiDeleted: typings.backlogDashJs.backlogDashJsMod.Option.ActivityType.WikiDeleted with Double = js.native
  /* 6 */ val WikiUpdated: typings.backlogDashJs.backlogDashJsMod.Option.ActivityType.WikiUpdated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ActivityType with Double] = js.native
}

