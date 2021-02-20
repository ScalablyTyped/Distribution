package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesUserInfoMod.UnmarshalledUserInfo
import typings.awsSdkClientCodecommitNode.typesUserInfoMod.UserInfo
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCommitMod {
  
  @js.native
  trait Commit extends StObject {
    
    /**
      * <p>Any additional data associated with the specified commit.</p>
      */
    var additionalData: js.UndefOr[String] = js.native
    
    /**
      * <p>Information about the author of the specified commit. Information includes the date in timestamp format with GMT offset, the name of the author, and the email address for the author, as configured in Git.</p>
      */
    var author: js.UndefOr[UserInfo] = js.native
    
    /**
      * <p>The full SHA of the specified commit. </p>
      */
    var commitId: js.UndefOr[String] = js.native
    
    /**
      * <p>Information about the person who committed the specified commit, also known as the committer. Information includes the date in timestamp format with GMT offset, the name of the committer, and the email address for the committer, as configured in Git.</p> <p>For more information about the difference between an author and a committer in Git, see <a href="http://git-scm.com/book/ch2-3.html">Viewing the Commit History</a> in Pro Git by Scott Chacon and Ben Straub.</p>
      */
    var committer: js.UndefOr[UserInfo] = js.native
    
    /**
      * <p>The commit message associated with the specified commit.</p>
      */
    var message: js.UndefOr[String] = js.native
    
    /**
      * <p>A list of parent commits for the specified commit. Each parent commit ID is the full commit ID.</p>
      */
    var parents: js.UndefOr[js.Array[String] | Iterable[String]] = js.native
    
    /**
      * <p>Tree information for the specified commit.</p>
      */
    var treeId: js.UndefOr[String] = js.native
  }
  object Commit {
    
    @scala.inline
    def apply(): Commit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Commit]
    }
    
    @scala.inline
    implicit class CommitMutableBuilder[Self <: Commit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalData(value: String): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalDataUndefined: Self = StObject.set(x, "additionalData", js.undefined)
      
      @scala.inline
      def setAuthor(value: UserInfo): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      @scala.inline
      def setCommitId(value: String): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitIdUndefined: Self = StObject.set(x, "commitId", js.undefined)
      
      @scala.inline
      def setCommitter(value: UserInfo): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitterUndefined: Self = StObject.set(x, "committer", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setParents(value: js.Array[String] | Iterable[String]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentsUndefined: Self = StObject.set(x, "parents", js.undefined)
      
      @scala.inline
      def setParentsVarargs(value: String*): Self = StObject.set(x, "parents", js.Array(value :_*))
      
      @scala.inline
      def setTreeId(value: String): Self = StObject.set(x, "treeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeIdUndefined: Self = StObject.set(x, "treeId", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledCommit extends Commit {
    
    /**
      * <p>Information about the author of the specified commit. Information includes the date in timestamp format with GMT offset, the name of the author, and the email address for the author, as configured in Git.</p>
      */
    @JSName("author")
    var author_UnmarshalledCommit: js.UndefOr[UnmarshalledUserInfo] = js.native
    
    /**
      * <p>Information about the person who committed the specified commit, also known as the committer. Information includes the date in timestamp format with GMT offset, the name of the committer, and the email address for the committer, as configured in Git.</p> <p>For more information about the difference between an author and a committer in Git, see <a href="http://git-scm.com/book/ch2-3.html">Viewing the Commit History</a> in Pro Git by Scott Chacon and Ben Straub.</p>
      */
    @JSName("committer")
    var committer_UnmarshalledCommit: js.UndefOr[UnmarshalledUserInfo] = js.native
    
    /**
      * <p>A list of parent commits for the specified commit. Each parent commit ID is the full commit ID.</p>
      */
    @JSName("parents")
    var parents_UnmarshalledCommit: js.UndefOr[js.Array[String]] = js.native
  }
  object UnmarshalledCommit {
    
    @scala.inline
    def apply(): UnmarshalledCommit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledCommit]
    }
    
    @scala.inline
    implicit class UnmarshalledCommitMutableBuilder[Self <: UnmarshalledCommit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: UnmarshalledUserInfo): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      @scala.inline
      def setCommitter(value: UnmarshalledUserInfo): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitterUndefined: Self = StObject.set(x, "committer", js.undefined)
      
      @scala.inline
      def setParents(value: js.Array[String]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentsUndefined: Self = StObject.set(x, "parents", js.undefined)
      
      @scala.inline
      def setParentsVarargs(value: String*): Self = StObject.set(x, "parents", js.Array(value :_*))
    }
  }
}
