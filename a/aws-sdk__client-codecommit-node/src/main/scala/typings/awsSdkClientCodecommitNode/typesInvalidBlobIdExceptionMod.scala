package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesGetBlobExceptionsUnionMod.GetBlobExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidBlobIdExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidBlobIdExceptionDetails> * / any */ trait InvalidBlobIdException
    extends StObject
       with GetBlobExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidBlobIdException
  }
  object InvalidBlobIdException {
    
    inline def apply(): InvalidBlobIdException = {
      val __obj = js.Dynamic.literal(name = "InvalidBlobIdException")
      __obj.asInstanceOf[InvalidBlobIdException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InvalidBlobIdException] (val x: Self) extends AnyVal {
      
      inline def setName(value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidBlobIdException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidBlobIdExceptionDetails extends StObject
}
