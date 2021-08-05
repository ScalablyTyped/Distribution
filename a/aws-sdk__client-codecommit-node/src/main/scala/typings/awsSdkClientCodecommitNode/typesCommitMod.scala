package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesUserInfoMod.UnmarshalledUserInfo
import typings.awsSdkClientCodecommitNode.typesUserInfoMod.UserInfo
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCommitMod {
  
  trait Commit extends StObject {
    
    /**
      * <p>Any additional data associated with the specified commit.</p>
      */
    var additionalData: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Information about the author of the specified commit. Information includes the date in timestamp format with GMT offset, the name of the author, and the email address for the author, as configured in Git.</p>
      */
    var author: js.UndefOr[UserInfo] = js.undefined
    
    /**
      * <p>The full SHA of the specified commit. </p>
      */
    var commitId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Information about the person who committed the specified commit, also known as the committer. Information includes the date in timestamp format with GMT offset, the name of the committer, and the email address for the committer, as configured in Git.</p> <p>For more information about the difference between an author and a committer in Git, see <a href="http://git-scm.com/book/ch2-3.html">Viewing the Commit History</a> in Pro Git by Scott Chacon and Ben Straub.</p>
      */
    var committer: js.UndefOr[UserInfo] = js.undefined
    
    /**
      * <p>The commit message associated with the specified commit.</p>
      */
    var message: js.UndefOr[String] = js.undefined
    
    /**
      * <p>A list of parent commits for the specified commit. Each parent commit ID is the full commit ID.</p>
      */
    var parents: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
    
    /**
      * <p>Tree information for the specified commit.</p>
      */
    var treeId: js.UndefOr[String] = js.undefined
  }
  object Commit {
    
    inline def apply(): Commit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Commit]
    }
    
    extension [Self <: Commit](x: Self) {
      
      inline def setAdditionalData(value: String): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
      
      inline def setAdditionalDataUndefined: Self = StObject.set(x, "additionalData", js.undefined)
      
      inline def setAuthor(value: UserInfo): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setCommitId(value: String): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
      
      inline def setCommitIdUndefined: Self = StObject.set(x, "commitId", js.undefined)
      
      inline def setCommitter(value: UserInfo): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
      
      inline def setCommitterUndefined: Self = StObject.set(x, "committer", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setParents(value: js.Array[String] | Iterable[String]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      inline def setParentsUndefined: Self = StObject.set(x, "parents", js.undefined)
      
      inline def setParentsVarargs(value: String*): Self = StObject.set(x, "parents", js.Array(value :_*))
      
      inline def setTreeId(value: String): Self = StObject.set(x, "treeId", value.asInstanceOf[js.Any])
      
      inline def setTreeIdUndefined: Self = StObject.set(x, "treeId", js.undefined)
    }
  }
  
  trait UnmarshalledCommit
    extends StObject
       with Commit {
    
    /**
      * <p>Information about the author of the specified commit. Information includes the date in timestamp format with GMT offset, the name of the author, and the email address for the author, as configured in Git.</p>
      */
    @JSName("author")
    var author_UnmarshalledCommit: js.UndefOr[UnmarshalledUserInfo] = js.undefined
    
    /**
      * <p>Information about the person who committed the specified commit, also known as the committer. Information includes the date in timestamp format with GMT offset, the name of the committer, and the email address for the committer, as configured in Git.</p> <p>For more information about the difference between an author and a committer in Git, see <a href="http://git-scm.com/book/ch2-3.html">Viewing the Commit History</a> in Pro Git by Scott Chacon and Ben Straub.</p>
      */
    @JSName("committer")
    var committer_UnmarshalledCommit: js.UndefOr[UnmarshalledUserInfo] = js.undefined
    
    /**
      * <p>A list of parent commits for the specified commit. Each parent commit ID is the full commit ID.</p>
      */
    @JSName("parents")
    var parents_UnmarshalledCommit: js.UndefOr[js.Array[String]] = js.undefined
  }
  object UnmarshalledCommit {
    
    inline def apply(): UnmarshalledCommit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledCommit]
    }
    
    extension [Self <: UnmarshalledCommit](x: Self) {
      
      inline def setAuthor(value: UnmarshalledUserInfo): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setCommitter(value: UnmarshalledUserInfo): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
      
      inline def setCommitterUndefined: Self = StObject.set(x, "committer", js.undefined)
      
      inline def setParents(value: js.Array[String]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      inline def setParentsUndefined: Self = StObject.set(x, "parents", js.undefined)
      
      inline def setParentsVarargs(value: String*): Self = StObject.set(x, "parents", js.Array(value :_*))
    }
  }
}
