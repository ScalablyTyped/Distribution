package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesCommentMod.Comment
import typings.awsSdkClientCodecommitNode.typesCommentMod.UnmarshalledComment
import typings.awsSdkClientCodecommitNode.typesLocationMod.Location
import typings.awsSdkClientCodecommitNode.typesLocationMod.UnmarshalledLocation
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCommentsForComparedCommitMod {
  
  @js.native
  trait CommentsForComparedCommit extends StObject {
    
    /**
      * <p>The full blob ID of the commit used to establish the 'after' of the comparison.</p>
      */
    var afterBlobId: js.UndefOr[String] = js.native
    
    /**
      * <p>The full commit ID of the commit used to establish the 'after' of the comparison.</p>
      */
    var afterCommitId: js.UndefOr[String] = js.native
    
    /**
      * <p>The full blob ID of the commit used to establish the 'before' of the comparison.</p>
      */
    var beforeBlobId: js.UndefOr[String] = js.native
    
    /**
      * <p>The full commit ID of the commit used to establish the 'before' of the comparison.</p>
      */
    var beforeCommitId: js.UndefOr[String] = js.native
    
    /**
      * <p>An array of comment objects. Each comment object contains information about a comment on the comparison between commits.</p>
      */
    var comments: js.UndefOr[js.Array[Comment] | Iterable[Comment]] = js.native
    
    /**
      * <p>Location information about the comment on the comparison, including the file name, line number, and whether the version of the file where the comment was made is 'BEFORE' or 'AFTER'.</p>
      */
    var location: js.UndefOr[Location] = js.native
    
    /**
      * <p>The name of the repository that contains the compared commits.</p>
      */
    var repositoryName: js.UndefOr[String] = js.native
  }
  object CommentsForComparedCommit {
    
    @scala.inline
    def apply(): CommentsForComparedCommit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentsForComparedCommit]
    }
    
    @scala.inline
    implicit class CommentsForComparedCommitMutableBuilder[Self <: CommentsForComparedCommit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterBlobId(value: String): Self = StObject.set(x, "afterBlobId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterBlobIdUndefined: Self = StObject.set(x, "afterBlobId", js.undefined)
      
      @scala.inline
      def setAfterCommitId(value: String): Self = StObject.set(x, "afterCommitId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterCommitIdUndefined: Self = StObject.set(x, "afterCommitId", js.undefined)
      
      @scala.inline
      def setBeforeBlobId(value: String): Self = StObject.set(x, "beforeBlobId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeBlobIdUndefined: Self = StObject.set(x, "beforeBlobId", js.undefined)
      
      @scala.inline
      def setBeforeCommitId(value: String): Self = StObject.set(x, "beforeCommitId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeCommitIdUndefined: Self = StObject.set(x, "beforeCommitId", js.undefined)
      
      @scala.inline
      def setComments(value: js.Array[Comment] | Iterable[Comment]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      @scala.inline
      def setCommentsVarargs(value: Comment*): Self = StObject.set(x, "comments", js.Array(value :_*))
      
      @scala.inline
      def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledCommentsForComparedCommit extends CommentsForComparedCommit {
    
    /**
      * <p>An array of comment objects. Each comment object contains information about a comment on the comparison between commits.</p>
      */
    @JSName("comments")
    var comments_UnmarshalledCommentsForComparedCommit: js.UndefOr[js.Array[UnmarshalledComment]] = js.native
    
    /**
      * <p>Location information about the comment on the comparison, including the file name, line number, and whether the version of the file where the comment was made is 'BEFORE' or 'AFTER'.</p>
      */
    @JSName("location")
    var location_UnmarshalledCommentsForComparedCommit: js.UndefOr[UnmarshalledLocation] = js.native
  }
  object UnmarshalledCommentsForComparedCommit {
    
    @scala.inline
    def apply(): UnmarshalledCommentsForComparedCommit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledCommentsForComparedCommit]
    }
    
    @scala.inline
    implicit class UnmarshalledCommentsForComparedCommitMutableBuilder[Self <: UnmarshalledCommentsForComparedCommit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComments(value: js.Array[UnmarshalledComment]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      @scala.inline
      def setCommentsVarargs(value: UnmarshalledComment*): Self = StObject.set(x, "comments", js.Array(value :_*))
      
      @scala.inline
      def setLocation(value: UnmarshalledLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
}
