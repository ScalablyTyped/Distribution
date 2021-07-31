package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSameFileContentExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_SameFileContentExceptionDetails> * / any */ trait SameFileContentException
    extends StObject
       with PutFileExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SameFileContentException
  }
  object SameFileContentException {
    
    @scala.inline
    def apply(): SameFileContentException = {
      val __obj = js.Dynamic.literal(name = "SameFileContentException")
      __obj.asInstanceOf[SameFileContentException]
    }
    
    @scala.inline
    implicit class SameFileContentExceptionMutableBuilder[Self <: SameFileContentException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SameFileContentException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait SameFileContentExceptionDetails extends StObject
}
