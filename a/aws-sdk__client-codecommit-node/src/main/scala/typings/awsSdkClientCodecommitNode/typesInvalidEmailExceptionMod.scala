package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.deleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidEmailExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidEmailExceptionDetails> * / any */ trait InvalidEmailException
    extends StObject
       with DeleteFileExceptionsUnion
       with PutFileExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidEmailException
  }
  object InvalidEmailException {
    
    @scala.inline
    def apply(): InvalidEmailException = {
      val __obj = js.Dynamic.literal(name = "InvalidEmailException")
      __obj.asInstanceOf[InvalidEmailException]
    }
    
    @scala.inline
    implicit class InvalidEmailExceptionMutableBuilder[Self <: InvalidEmailException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidEmailException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidEmailExceptionDetails extends StObject
}
