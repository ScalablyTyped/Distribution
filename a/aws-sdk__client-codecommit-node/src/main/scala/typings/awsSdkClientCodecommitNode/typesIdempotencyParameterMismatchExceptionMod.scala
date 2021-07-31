package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentReplyExceptionsUnionMod.PostCommentReplyExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIdempotencyParameterMismatchExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_IdempotencyParameterMismatchExceptionDetails> * / any */ trait IdempotencyParameterMismatchException
    extends StObject
       with CreatePullRequestExceptionsUnion
       with PostCommentForComparedCommitExceptionsUnion
       with PostCommentForPullRequestExceptionsUnion
       with PostCommentReplyExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.IdempotencyParameterMismatchException
  }
  object IdempotencyParameterMismatchException {
    
    @scala.inline
    def apply(): IdempotencyParameterMismatchException = {
      val __obj = js.Dynamic.literal(name = "IdempotencyParameterMismatchException")
      __obj.asInstanceOf[IdempotencyParameterMismatchException]
    }
    
    @scala.inline
    implicit class IdempotencyParameterMismatchExceptionMutableBuilder[Self <: IdempotencyParameterMismatchException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.IdempotencyParameterMismatchException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait IdempotencyParameterMismatchExceptionDetails extends StObject
}
