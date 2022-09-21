package typings.backlogJs.optionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActivityType extends StObject
@JSImport("backlog-js/dist/types/option", "ActivityType")
@js.native
object ActivityType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ActivityType & Double] = js.native
  
  @js.native
  sealed trait FileAdded
    extends StObject
       with ActivityType
  /* 8 */ val FileAdded: typings.backlogJs.optionMod.ActivityType.FileAdded & Double = js.native
  
  @js.native
  sealed trait FileDeleted
    extends StObject
       with ActivityType
  /* 10 */ val FileDeleted: typings.backlogJs.optionMod.ActivityType.FileDeleted & Double = js.native
  
  @js.native
  sealed trait FileUpdated
    extends StObject
       with ActivityType
  /* 9 */ val FileUpdated: typings.backlogJs.optionMod.ActivityType.FileUpdated & Double = js.native
  
  @js.native
  sealed trait GitPushed
    extends StObject
       with ActivityType
  /* 12 */ val GitPushed: typings.backlogJs.optionMod.ActivityType.GitPushed & Double = js.native
  
  @js.native
  sealed trait GitRepositoryCreated
    extends StObject
       with ActivityType
  /* 13 */ val GitRepositoryCreated: typings.backlogJs.optionMod.ActivityType.GitRepositoryCreated & Double = js.native
  
  @js.native
  sealed trait IssueCommented
    extends StObject
       with ActivityType
  /* 3 */ val IssueCommented: typings.backlogJs.optionMod.ActivityType.IssueCommented & Double = js.native
  
  @js.native
  sealed trait IssueCreated
    extends StObject
       with ActivityType
  /* 1 */ val IssueCreated: typings.backlogJs.optionMod.ActivityType.IssueCreated & Double = js.native
  
  @js.native
  sealed trait IssueDeleted
    extends StObject
       with ActivityType
  /* 4 */ val IssueDeleted: typings.backlogJs.optionMod.ActivityType.IssueDeleted & Double = js.native
  
  @js.native
  sealed trait IssueMultiUpdated
    extends StObject
       with ActivityType
  /* 14 */ val IssueMultiUpdated: typings.backlogJs.optionMod.ActivityType.IssueMultiUpdated & Double = js.native
  
  @js.native
  sealed trait IssueUpdated
    extends StObject
       with ActivityType
  /* 2 */ val IssueUpdated: typings.backlogJs.optionMod.ActivityType.IssueUpdated & Double = js.native
  
  @js.native
  sealed trait NotifyAdded
    extends StObject
       with ActivityType
  /* 17 */ val NotifyAdded: typings.backlogJs.optionMod.ActivityType.NotifyAdded & Double = js.native
  
  @js.native
  sealed trait ProjectUserAdded
    extends StObject
       with ActivityType
  /* 15 */ val ProjectUserAdded: typings.backlogJs.optionMod.ActivityType.ProjectUserAdded & Double = js.native
  
  @js.native
  sealed trait ProjectUserRemoved
    extends StObject
       with ActivityType
  /* 16 */ val ProjectUserRemoved: typings.backlogJs.optionMod.ActivityType.ProjectUserRemoved & Double = js.native
  
  @js.native
  sealed trait PullRequestAdded
    extends StObject
       with ActivityType
  /* 18 */ val PullRequestAdded: typings.backlogJs.optionMod.ActivityType.PullRequestAdded & Double = js.native
  
  @js.native
  sealed trait PullRequestCommented
    extends StObject
       with ActivityType
  /* 20 */ val PullRequestCommented: typings.backlogJs.optionMod.ActivityType.PullRequestCommented & Double = js.native
  
  @js.native
  sealed trait PullRequestMerged
    extends StObject
       with ActivityType
  /* 21 */ val PullRequestMerged: typings.backlogJs.optionMod.ActivityType.PullRequestMerged & Double = js.native
  
  @js.native
  sealed trait PullRequestUpdated
    extends StObject
       with ActivityType
  /* 19 */ val PullRequestUpdated: typings.backlogJs.optionMod.ActivityType.PullRequestUpdated & Double = js.native
  
  @js.native
  sealed trait SvnCommitted
    extends StObject
       with ActivityType
  /* 11 */ val SvnCommitted: typings.backlogJs.optionMod.ActivityType.SvnCommitted & Double = js.native
  
  @js.native
  sealed trait Undefined
    extends StObject
       with ActivityType
  /* -1 */ val Undefined: typings.backlogJs.optionMod.ActivityType.Undefined & Double = js.native
  
  @js.native
  sealed trait WikiCreated
    extends StObject
       with ActivityType
  /* 5 */ val WikiCreated: typings.backlogJs.optionMod.ActivityType.WikiCreated & Double = js.native
  
  @js.native
  sealed trait WikiDeleted
    extends StObject
       with ActivityType
  /* 7 */ val WikiDeleted: typings.backlogJs.optionMod.ActivityType.WikiDeleted & Double = js.native
  
  @js.native
  sealed trait WikiUpdated
    extends StObject
       with ActivityType
  /* 6 */ val WikiUpdated: typings.backlogJs.optionMod.ActivityType.WikiUpdated & Double = js.native
}
