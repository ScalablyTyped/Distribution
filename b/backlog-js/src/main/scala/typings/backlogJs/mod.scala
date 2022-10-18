package typings.backlogJs

import typings.backlogJs.anon.AccessToken
import typings.backlogJs.anon.Errors
import typings.backlogJs.distTypesBacklogMod.default
import typings.backlogJs.distTypesErrorMod.BacklogErrorNameType
import typings.backlogJs.distTypesOptionMod.OAuth2.Credentials
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
      extends typings.backlogJs.distTypesErrorMod.BacklogApiError {
      def this(response: Response) = this()
      def this(response: Response, body: Errors) = this()
    }
    
    @JSImport("backlog-js", "Error.BacklogAuthError")
    @js.native
    open class BacklogAuthError protected ()
      extends typings.backlogJs.distTypesErrorMod.BacklogAuthError {
      def this(response: Response) = this()
      def this(response: Response, body: Errors) = this()
    }
    
    @JSImport("backlog-js", "Error.BacklogError")
    @js.native
    open class BacklogError protected ()
      extends typings.backlogJs.distTypesErrorMod.BacklogError {
      def this(name: BacklogErrorNameType, response: Response) = this()
      def this(name: BacklogErrorNameType, response: Response, body: Errors) = this()
    }
    
    @JSImport("backlog-js", "Error.UnexpectedError")
    @js.native
    open class UnexpectedError protected ()
      extends typings.backlogJs.distTypesErrorMod.UnexpectedError {
      def this(response: Response) = this()
    }
  }
  
  @JSImport("backlog-js", "OAuth2")
  @js.native
  open class OAuth2 protected ()
    extends typings.backlogJs.distTypesOauth2Mod.default {
    def this(credentials: Credentials) = this()
    def this(credentials: Credentials, timeout: Double) = this()
  }
  
  object Option {
    
    @JSImport("backlog-js", "Option.ActivityType")
    @js.native
    object ActivityType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.backlogJs.distTypesOptionMod.ActivityType & Double] = js.native
      
      /* 8 */ val FileAdded: typings.backlogJs.distTypesOptionMod.ActivityType.FileAdded & Double = js.native
      
      /* 10 */ val FileDeleted: typings.backlogJs.distTypesOptionMod.ActivityType.FileDeleted & Double = js.native
      
      /* 9 */ val FileUpdated: typings.backlogJs.distTypesOptionMod.ActivityType.FileUpdated & Double = js.native
      
      /* 12 */ val GitPushed: typings.backlogJs.distTypesOptionMod.ActivityType.GitPushed & Double = js.native
      
      /* 13 */ val GitRepositoryCreated: typings.backlogJs.distTypesOptionMod.ActivityType.GitRepositoryCreated & Double = js.native
      
      /* 3 */ val IssueCommented: typings.backlogJs.distTypesOptionMod.ActivityType.IssueCommented & Double = js.native
      
      /* 1 */ val IssueCreated: typings.backlogJs.distTypesOptionMod.ActivityType.IssueCreated & Double = js.native
      
      /* 4 */ val IssueDeleted: typings.backlogJs.distTypesOptionMod.ActivityType.IssueDeleted & Double = js.native
      
      /* 14 */ val IssueMultiUpdated: typings.backlogJs.distTypesOptionMod.ActivityType.IssueMultiUpdated & Double = js.native
      
      /* 2 */ val IssueUpdated: typings.backlogJs.distTypesOptionMod.ActivityType.IssueUpdated & Double = js.native
      
      /* 17 */ val NotifyAdded: typings.backlogJs.distTypesOptionMod.ActivityType.NotifyAdded & Double = js.native
      
      /* 15 */ val ProjectUserAdded: typings.backlogJs.distTypesOptionMod.ActivityType.ProjectUserAdded & Double = js.native
      
      /* 16 */ val ProjectUserRemoved: typings.backlogJs.distTypesOptionMod.ActivityType.ProjectUserRemoved & Double = js.native
      
      /* 18 */ val PullRequestAdded: typings.backlogJs.distTypesOptionMod.ActivityType.PullRequestAdded & Double = js.native
      
      /* 20 */ val PullRequestCommented: typings.backlogJs.distTypesOptionMod.ActivityType.PullRequestCommented & Double = js.native
      
      /* 21 */ val PullRequestMerged: typings.backlogJs.distTypesOptionMod.ActivityType.PullRequestMerged & Double = js.native
      
      /* 19 */ val PullRequestUpdated: typings.backlogJs.distTypesOptionMod.ActivityType.PullRequestUpdated & Double = js.native
      
      /* 11 */ val SvnCommitted: typings.backlogJs.distTypesOptionMod.ActivityType.SvnCommitted & Double = js.native
      
      /* -1 */ val Undefined: typings.backlogJs.distTypesOptionMod.ActivityType.Undefined & Double = js.native
      
      /* 5 */ val WikiCreated: typings.backlogJs.distTypesOptionMod.ActivityType.WikiCreated & Double = js.native
      
      /* 7 */ val WikiDeleted: typings.backlogJs.distTypesOptionMod.ActivityType.WikiDeleted & Double = js.native
      
      /* 6 */ val WikiUpdated: typings.backlogJs.distTypesOptionMod.ActivityType.WikiUpdated & Double = js.native
    }
    
    object Issue {
      
      @JSImport("backlog-js", "Option.Issue.ParentChildType")
      @js.native
      object ParentChildType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.backlogJs.distTypesOptionMod.Issue.ParentChildType & Double] = js.native
        
        /* 0 */ val All: typings.backlogJs.distTypesOptionMod.Issue.ParentChildType.All & Double = js.native
        
        /* 2 */ val Child: typings.backlogJs.distTypesOptionMod.Issue.ParentChildType.Child & Double = js.native
        
        /* 1 */ val NotChild: typings.backlogJs.distTypesOptionMod.Issue.ParentChildType.NotChild & Double = js.native
        
        /* 3 */ val NotChildNotParent: typings.backlogJs.distTypesOptionMod.Issue.ParentChildType.NotChildNotParent & Double = js.native
        
        /* 4 */ val Parent: typings.backlogJs.distTypesOptionMod.Issue.ParentChildType.Parent & Double = js.native
      }
    }
    
    object Project {
      
      @JSImport("backlog-js", "Option.Project.FieldType")
      @js.native
      object FieldType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.backlogJs.distTypesOptionMod.Project.FieldType & Double] = js.native
        
        /* 7 */ val CheckBox: typings.backlogJs.distTypesOptionMod.Project.FieldType.CheckBox & Double = js.native
        
        /* 4 */ val Date: typings.backlogJs.distTypesOptionMod.Project.FieldType.Date & Double = js.native
        
        /* 6 */ val MultipleList: typings.backlogJs.distTypesOptionMod.Project.FieldType.MultipleList & Double = js.native
        
        /* 3 */ val Numeric: typings.backlogJs.distTypesOptionMod.Project.FieldType.Numeric & Double = js.native
        
        /* 8 */ val Radio: typings.backlogJs.distTypesOptionMod.Project.FieldType.Radio & Double = js.native
        
        /* 5 */ val SingleList: typings.backlogJs.distTypesOptionMod.Project.FieldType.SingleList & Double = js.native
        
        /* 1 */ val Text: typings.backlogJs.distTypesOptionMod.Project.FieldType.Text & Double = js.native
        
        /* 2 */ val TextArea: typings.backlogJs.distTypesOptionMod.Project.FieldType.TextArea & Double = js.native
      }
    }
    
    object User {
      
      @JSImport("backlog-js", "Option.User.RoleType")
      @js.native
      object RoleType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.backlogJs.distTypesOptionMod.User.RoleType & Double] = js.native
        
        /* 1 */ val Admin: typings.backlogJs.distTypesOptionMod.User.RoleType.Admin & Double = js.native
        
        /* 5 */ val GuestReporter: typings.backlogJs.distTypesOptionMod.User.RoleType.GuestReporter & Double = js.native
        
        /* 6 */ val GuestViewer: typings.backlogJs.distTypesOptionMod.User.RoleType.GuestViewer & Double = js.native
        
        /* 3 */ val Reporter: typings.backlogJs.distTypesOptionMod.User.RoleType.Reporter & Double = js.native
        
        /* 2 */ val User: typings.backlogJs.distTypesOptionMod.User.RoleType.User & Double = js.native
        
        /* 4 */ val Viewer: typings.backlogJs.distTypesOptionMod.User.RoleType.Viewer & Double = js.native
      }
    }
  }
}
