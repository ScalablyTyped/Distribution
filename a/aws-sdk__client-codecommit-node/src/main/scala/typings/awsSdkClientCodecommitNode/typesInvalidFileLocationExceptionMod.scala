package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.postCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidFileLocationExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidFileLocationExceptionDetails> * / any */ trait InvalidFileLocationException
    extends StObject
       with PostCommentForComparedCommitExceptionsUnion
       with PostCommentForPullRequestExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidFileLocationException
  }
  object InvalidFileLocationException {
    
    @scala.inline
    def apply(): InvalidFileLocationException = {
      val __obj = js.Dynamic.literal(name = "InvalidFileLocationException")
      __obj.asInstanceOf[InvalidFileLocationException]
    }
    
    @scala.inline
    implicit class InvalidFileLocationExceptionMutableBuilder[Self <: InvalidFileLocationException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidFileLocationException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidFileLocationExceptionDetails extends StObject
}
