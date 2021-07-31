package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.deleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidParentCommitIdExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidParentCommitIdExceptionDetails> * / any */ trait InvalidParentCommitIdException
    extends StObject
       with DeleteFileExceptionsUnion
       with PutFileExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidParentCommitIdException
  }
  object InvalidParentCommitIdException {
    
    @scala.inline
    def apply(): InvalidParentCommitIdException = {
      val __obj = js.Dynamic.literal(name = "InvalidParentCommitIdException")
      __obj.asInstanceOf[InvalidParentCommitIdException]
    }
    
    @scala.inline
    implicit class InvalidParentCommitIdExceptionMutableBuilder[Self <: InvalidParentCommitIdException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidParentCommitIdException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidParentCommitIdExceptionDetails extends StObject
}
