package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesListRepositoriesExceptionsUnionMod.ListRepositoriesExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidOrderExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidOrderExceptionDetails> * / any */ trait InvalidOrderException
    extends StObject
       with ListRepositoriesExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidOrderException
  }
  object InvalidOrderException {
    
    inline def apply(): InvalidOrderException = {
      val __obj = js.Dynamic.literal(name = "InvalidOrderException")
      __obj.asInstanceOf[InvalidOrderException]
    }
    
    extension [Self <: InvalidOrderException](x: Self) {
      
      inline def setName(value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidOrderException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidOrderExceptionDetails extends StObject
}
