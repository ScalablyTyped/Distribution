package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.deleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCommitMessageLengthExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_CommitMessageLengthExceededExceptionDetails> * / any */ trait CommitMessageLengthExceededException
    extends StObject
       with DeleteFileExceptionsUnion
       with PutFileExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommitMessageLengthExceededException
  }
  object CommitMessageLengthExceededException {
    
    @scala.inline
    def apply(): CommitMessageLengthExceededException = {
      val __obj = js.Dynamic.literal(name = "CommitMessageLengthExceededException")
      __obj.asInstanceOf[CommitMessageLengthExceededException]
    }
    
    @scala.inline
    implicit class CommitMessageLengthExceededExceptionMutableBuilder[Self <: CommitMessageLengthExceededException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommitMessageLengthExceededException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommitMessageLengthExceededExceptionDetails extends StObject
}
