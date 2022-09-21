package typings.backlogJs

import typings.backlogJs.anon.AccessToken
import typings.backlogJs.anon.Errors
import typings.backlogJs.backlogMod.default
import typings.backlogJs.errorMod.BacklogErrorNameType
import typings.backlogJs.optionMod.OAuth2.Credentials
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("backlog-js", "Backlog")
  @js.native
  open class Backlog protected () extends default {
    def this(configure: AccessToken) = this()
  }
  
  object Error {
    
    @JSImport("backlog-js", "Error.BacklogApiError")
    @js.native
    open class BacklogApiError protected ()
      extends typings.backlogJs.errorMod.BacklogApiError {
      def this(response: Response) = this()
      def this(response: Response, body: Errors) = this()
    }
    
    @JSImport("backlog-js", "Error.BacklogAuthError")
    @js.native
    open class BacklogAuthError protected ()
      extends typings.backlogJs.errorMod.BacklogAuthError {
      def this(response: Response) = this()
      def this(response: Response, body: Errors) = this()
    }
    
    @JSImport("backlog-js", "Error.BacklogError")
    @js.native
    open class BacklogError protected ()
      extends typings.backlogJs.errorMod.BacklogError {
      def this(name: BacklogErrorNameType, response: Response) = this()
      def this(name: BacklogErrorNameType, response: Response, body: Errors) = this()
    }
    
    @JSImport("backlog-js", "Error.UnexpectedError")
    @js.native
    open class UnexpectedError protected ()
      extends typings.backlogJs.errorMod.UnexpectedError {
      def this(response: Response) = this()
    }
  }
  
  @JSImport("backlog-js", "OAuth2")
  @js.native
  open class OAuth2 protected ()
    extends typings.backlogJs.oauth2Mod.default {
    def this(credentials: Credentials) = this()
    def this(credentials: Credentials, timeout: Double) = this()
  }
  
  object Option {
    
    @JSImport("backlog-js", "Option.ActivityType")
    @js.native
    object ActivityType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.backlogJs.optionMod.ActivityType & Double] = js.native
      
      /* 8 */ val FileAdded: typings.backlogJs.optionMod.ActivityType.FileAdded & Double = js.native
      
      /* 10 */ val FileDeleted: typings.backlogJs.optionMod.ActivityType.FileDeleted & Double = js.native
      
      /* 9 */ val FileUpdated: typings.backlogJs.optionMod.ActivityType.FileUpdated & Double = js.native
      
      /* 12 */ val GitPushed: typings.backlogJs.optionMod.ActivityType.GitPushed & Double = js.native
      
      /* 13 */ val GitRepositoryCreated: typings.backlogJs.optionMod.ActivityType.GitRepositoryCreated & Double = js.native
      
      /* 3 */ val IssueCommented: typings.backlogJs.optionMod.ActivityType.IssueCommented & Double = js.native
      
      /* 1 */ val IssueCreated: typings.backlogJs.optionMod.ActivityType.IssueCreated & Double = js.native
      
      /* 4 */ val IssueDeleted: typings.backlogJs.optionMod.ActivityType.IssueDeleted & Double = js.native
      
      /* 14 */ val IssueMultiUpdated: typings.backlogJs.optionMod.ActivityType.IssueMultiUpdated & Double = js.native
      
      /* 2 */ val IssueUpdated: typings.backlogJs.optionMod.ActivityType.IssueUpdated & Double = js.native
      
      /* 17 */ val NotifyAdded: typings.backlogJs.optionMod.ActivityType.NotifyAdded & Double = js.native
      
      /* 15 */ val ProjectUserAdded: typings.backlogJs.optionMod.ActivityType.ProjectUserAdded & Double = js.native
      
      /* 16 */ val ProjectUserRemoved: typings.backlogJs.optionMod.ActivityType.ProjectUserRemoved & Double = js.native
      
      /* 18 */ val PullRequestAdded: typings.backlogJs.optionMod.ActivityType.PullRequestAdded & Double = js.native
      
      /* 20 */ val PullRequestCommented: typings.backlogJs.optionMod.ActivityType.PullRequestCommented & Double = js.native
      
      /* 21 */ val PullRequestMerged: typings.backlogJs.optionMod.ActivityType.PullRequestMerged & Double = js.native
      
      /* 19 */ val PullRequestUpdated: typings.backlogJs.optionMod.ActivityType.PullRequestUpdated & Double = js.native
      
      /* 11 */ val SvnCommitted: typings.backlogJs.optionMod.ActivityType.SvnCommitted & Double = js.native
      
      /* -1 */ val Undefined: typings.backlogJs.optionMod.ActivityType.Undefined & Double = js.native
      
      /* 5 */ val WikiCreated: typings.backlogJs.optionMod.ActivityType.WikiCreated & Double = js.native
      
      /* 7 */ val WikiDeleted: typings.backlogJs.optionMod.ActivityType.WikiDeleted & Double = js.native
      
      /* 6 */ val WikiUpdated: typings.backlogJs.optionMod.ActivityType.WikiUpdated & Double = js.native
    }
    
    object Issue {
      
      @JSImport("backlog-js", "Option.Issue.ParentChildType")
      @js.native
      object ParentChildType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.backlogJs.optionMod.Issue.ParentChildType & Double] = js.native
        
        /* 0 */ val All: typings.backlogJs.optionMod.Issue.ParentChildType.All & Double = js.native
        
        /* 2 */ val Child: typings.backlogJs.optionMod.Issue.ParentChildType.Child & Double = js.native
        
        /* 1 */ val NotChild: typings.backlogJs.optionMod.Issue.ParentChildType.NotChild & Double = js.native
        
        /* 3 */ val NotChildNotParent: typings.backlogJs.optionMod.Issue.ParentChildType.NotChildNotParent & Double = js.native
        
        /* 4 */ val Parent: typings.backlogJs.optionMod.Issue.ParentChildType.Parent & Double = js.native
      }
    }
    
    object Project {
      
      @JSImport("backlog-js", "Option.Project.FieldType")
      @js.native
      object FieldType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.backlogJs.optionMod.Project.FieldType & Double] = js.native
        
        /* 7 */ val CheckBox: typings.backlogJs.optionMod.Project.FieldType.CheckBox & Double = js.native
        
        /* 4 */ val Date: typings.backlogJs.optionMod.Project.FieldType.Date & Double = js.native
        
        /* 6 */ val MultipleList: typings.backlogJs.optionMod.Project.FieldType.MultipleList & Double = js.native
        
        /* 3 */ val Numeric: typings.backlogJs.optionMod.Project.FieldType.Numeric & Double = js.native
        
        /* 8 */ val Radio: typings.backlogJs.optionMod.Project.FieldType.Radio & Double = js.native
        
        /* 5 */ val SingleList: typings.backlogJs.optionMod.Project.FieldType.SingleList & Double = js.native
        
        /* 1 */ val Text: typings.backlogJs.optionMod.Project.FieldType.Text & Double = js.native
        
        /* 2 */ val TextArea: typings.backlogJs.optionMod.Project.FieldType.TextArea & Double = js.native
      }
    }
    
    object User {
      
      @JSImport("backlog-js", "Option.User.RoleType")
      @js.native
      object RoleType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.backlogJs.optionMod.User.RoleType & Double] = js.native
        
        /* 1 */ val Admin: typings.backlogJs.optionMod.User.RoleType.Admin & Double = js.native
        
        /* 5 */ val GuestReporter: typings.backlogJs.optionMod.User.RoleType.GuestReporter & Double = js.native
        
        /* 6 */ val GuestViewer: typings.backlogJs.optionMod.User.RoleType.GuestViewer & Double = js.native
        
        /* 3 */ val Reporter: typings.backlogJs.optionMod.User.RoleType.Reporter & Double = js.native
        
        /* 2 */ val User: typings.backlogJs.optionMod.User.RoleType.User & Double = js.native
        
        /* 4 */ val Viewer: typings.backlogJs.optionMod.User.RoleType.Viewer & Double = js.native
      }
    }
  }
}
