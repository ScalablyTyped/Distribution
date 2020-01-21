package typings.backlogJs.mod.Option

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ActivityType with Double] = js.native
  /* 8 */ @js.native
  object FileAdded extends TopLevel[FileAdded with Double]
  
  /* 10 */ @js.native
  object FileDeleted extends TopLevel[FileDeleted with Double]
  
  /* 9 */ @js.native
  object FileUpdated extends TopLevel[FileUpdated with Double]
  
  /* 12 */ @js.native
  object GitPushed extends TopLevel[GitPushed with Double]
  
  /* 13 */ @js.native
  object GitRepositoryCreated extends TopLevel[GitRepositoryCreated with Double]
  
  /* 3 */ @js.native
  object IssueCommented extends TopLevel[IssueCommented with Double]
  
  /* 1 */ @js.native
  object IssueCreated extends TopLevel[IssueCreated with Double]
  
  /* 4 */ @js.native
  object IssueDeleted extends TopLevel[IssueDeleted with Double]
  
  /* 14 */ @js.native
  object IssueMultiUpdated extends TopLevel[IssueMultiUpdated with Double]
  
  /* 2 */ @js.native
  object IssueUpdated extends TopLevel[IssueUpdated with Double]
  
  /* 17 */ @js.native
  object NotifyAdded extends TopLevel[NotifyAdded with Double]
  
  /* 15 */ @js.native
  object ProjectUserAdded extends TopLevel[ProjectUserAdded with Double]
  
  /* 16 */ @js.native
  object ProjectUserRemoved extends TopLevel[ProjectUserRemoved with Double]
  
  /* 18 */ @js.native
  object PullRequestAdded extends TopLevel[PullRequestAdded with Double]
  
  /* 20 */ @js.native
  object PullRequestCommented extends TopLevel[PullRequestCommented with Double]
  
  /* 21 */ @js.native
  object PullRequestMerged extends TopLevel[PullRequestMerged with Double]
  
  /* 19 */ @js.native
  object PullRequestUpdated extends TopLevel[PullRequestUpdated with Double]
  
  /* 11 */ @js.native
  object SvnCommitted extends TopLevel[SvnCommitted with Double]
  
  /* -1 */ @js.native
  object Undefined extends TopLevel[Undefined with Double]
  
  /* 5 */ @js.native
  object WikiCreated extends TopLevel[WikiCreated with Double]
  
  /* 7 */ @js.native
  object WikiDeleted extends TopLevel[WikiDeleted with Double]
  
  /* 6 */ @js.native
  object WikiUpdated extends TopLevel[WikiUpdated with Double]
  
}

