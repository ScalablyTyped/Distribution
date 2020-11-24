package typings.backlogJs.mod.Option

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActivityType extends js.Object
@JSImport("backlog-js", "Option.ActivityType")
@js.native
object ActivityType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ActivityType with Double] = js.native
  
  @js.native
  sealed trait FileAdded extends ActivityType
  /* 8 */ @js.native
  object FileAdded extends TopLevel[FileAdded with Double]
  
  @js.native
  sealed trait FileDeleted extends ActivityType
  /* 10 */ @js.native
  object FileDeleted extends TopLevel[FileDeleted with Double]
  
  @js.native
  sealed trait FileUpdated extends ActivityType
  /* 9 */ @js.native
  object FileUpdated extends TopLevel[FileUpdated with Double]
  
  @js.native
  sealed trait GitPushed extends ActivityType
  /* 12 */ @js.native
  object GitPushed extends TopLevel[GitPushed with Double]
  
  @js.native
  sealed trait GitRepositoryCreated extends ActivityType
  /* 13 */ @js.native
  object GitRepositoryCreated extends TopLevel[GitRepositoryCreated with Double]
  
  @js.native
  sealed trait IssueCommented extends ActivityType
  /* 3 */ @js.native
  object IssueCommented extends TopLevel[IssueCommented with Double]
  
  @js.native
  sealed trait IssueCreated extends ActivityType
  /* 1 */ @js.native
  object IssueCreated extends TopLevel[IssueCreated with Double]
  
  @js.native
  sealed trait IssueDeleted extends ActivityType
  /* 4 */ @js.native
  object IssueDeleted extends TopLevel[IssueDeleted with Double]
  
  @js.native
  sealed trait IssueMultiUpdated extends ActivityType
  /* 14 */ @js.native
  object IssueMultiUpdated extends TopLevel[IssueMultiUpdated with Double]
  
  @js.native
  sealed trait IssueUpdated extends ActivityType
  /* 2 */ @js.native
  object IssueUpdated extends TopLevel[IssueUpdated with Double]
  
  @js.native
  sealed trait NotifyAdded extends ActivityType
  /* 17 */ @js.native
  object NotifyAdded extends TopLevel[NotifyAdded with Double]
  
  @js.native
  sealed trait ProjectUserAdded extends ActivityType
  /* 15 */ @js.native
  object ProjectUserAdded extends TopLevel[ProjectUserAdded with Double]
  
  @js.native
  sealed trait ProjectUserRemoved extends ActivityType
  /* 16 */ @js.native
  object ProjectUserRemoved extends TopLevel[ProjectUserRemoved with Double]
  
  @js.native
  sealed trait PullRequestAdded extends ActivityType
  /* 18 */ @js.native
  object PullRequestAdded extends TopLevel[PullRequestAdded with Double]
  
  @js.native
  sealed trait PullRequestCommented extends ActivityType
  /* 20 */ @js.native
  object PullRequestCommented extends TopLevel[PullRequestCommented with Double]
  
  @js.native
  sealed trait PullRequestMerged extends ActivityType
  /* 21 */ @js.native
  object PullRequestMerged extends TopLevel[PullRequestMerged with Double]
  
  @js.native
  sealed trait PullRequestUpdated extends ActivityType
  /* 19 */ @js.native
  object PullRequestUpdated extends TopLevel[PullRequestUpdated with Double]
  
  @js.native
  sealed trait SvnCommitted extends ActivityType
  /* 11 */ @js.native
  object SvnCommitted extends TopLevel[SvnCommitted with Double]
  
  @js.native
  sealed trait Undefined extends ActivityType
  /* -1 */ @js.native
  object Undefined extends TopLevel[Undefined with Double]
  
  @js.native
  sealed trait WikiCreated extends ActivityType
  /* 5 */ @js.native
  object WikiCreated extends TopLevel[WikiCreated with Double]
  
  @js.native
  sealed trait WikiDeleted extends ActivityType
  /* 7 */ @js.native
  object WikiDeleted extends TopLevel[WikiDeleted with Double]
  
  @js.native
  sealed trait WikiUpdated extends ActivityType
  /* 6 */ @js.native
  object WikiUpdated extends TopLevel[WikiUpdated with Double]
}
