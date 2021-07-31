package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.postCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidRelativeFileVersionEnumExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidRelativeFileVersionEnumExceptionDetails> * / any */ trait InvalidRelativeFileVersionEnumException
    extends StObject
       with PostCommentForComparedCommitExceptionsUnion
       with PostCommentForPullRequestExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRelativeFileVersionEnumException
  }
  object InvalidRelativeFileVersionEnumException {
    
    @scala.inline
    def apply(): InvalidRelativeFileVersionEnumException = {
      val __obj = js.Dynamic.literal(name = "InvalidRelativeFileVersionEnumException")
      __obj.asInstanceOf[InvalidRelativeFileVersionEnumException]
    }
    
    @scala.inline
    implicit class InvalidRelativeFileVersionEnumExceptionMutableBuilder[Self <: InvalidRelativeFileVersionEnumException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRelativeFileVersionEnumException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidRelativeFileVersionEnumExceptionDetails extends StObject
}
