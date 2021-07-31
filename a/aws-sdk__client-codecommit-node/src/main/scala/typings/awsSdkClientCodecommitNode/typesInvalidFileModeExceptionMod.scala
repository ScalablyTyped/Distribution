package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidFileModeExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidFileModeExceptionDetails> * / any */ trait InvalidFileModeException
    extends StObject
       with PutFileExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidFileModeException
  }
  object InvalidFileModeException {
    
    @scala.inline
    def apply(): InvalidFileModeException = {
      val __obj = js.Dynamic.literal(name = "InvalidFileModeException")
      __obj.asInstanceOf[InvalidFileModeException]
    }
    
    @scala.inline
    implicit class InvalidFileModeExceptionMutableBuilder[Self <: InvalidFileModeException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidFileModeException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidFileModeExceptionDetails extends StObject
}
