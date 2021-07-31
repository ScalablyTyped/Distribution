package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.getDifferencesExceptionsUnionMod.GetDifferencesExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPathDoesNotExistExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_PathDoesNotExistExceptionDetails> * / any */ trait PathDoesNotExistException
    extends StObject
       with GetDifferencesExceptionsUnion
       with PostCommentForComparedCommitExceptionsUnion
       with PostCommentForPullRequestExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PathDoesNotExistException
  }
  object PathDoesNotExistException {
    
    @scala.inline
    def apply(): PathDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = "PathDoesNotExistException")
      __obj.asInstanceOf[PathDoesNotExistException]
    }
    
    @scala.inline
    implicit class PathDoesNotExistExceptionMutableBuilder[Self <: PathDoesNotExistException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PathDoesNotExistException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait PathDoesNotExistExceptionDetails extends StObject
}
