package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesListRepositoriesExceptionsUnionMod.ListRepositoriesExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidSortByExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidSortByExceptionDetails> * / any */ trait InvalidSortByException
    extends StObject
       with ListRepositoriesExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidSortByException
  }
  object InvalidSortByException {
    
    inline def apply(): InvalidSortByException = {
      val __obj = js.Dynamic.literal(name = "InvalidSortByException")
      __obj.asInstanceOf[InvalidSortByException]
    }
    
    extension [Self <: InvalidSortByException](x: Self) {
      
      inline def setName(value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidSortByException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidSortByExceptionDetails extends StObject
}
