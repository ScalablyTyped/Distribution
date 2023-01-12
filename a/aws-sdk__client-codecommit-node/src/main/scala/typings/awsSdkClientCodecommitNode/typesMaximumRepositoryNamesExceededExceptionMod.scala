package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesBatchGetRepositoriesExceptionsUnionMod.BatchGetRepositoriesExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMaximumRepositoryNamesExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_MaximumRepositoryNamesExceededExceptionDetails> * / any */ trait MaximumRepositoryNamesExceededException
    extends StObject
       with BatchGetRepositoriesExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumRepositoryNamesExceededException
  }
  object MaximumRepositoryNamesExceededException {
    
    inline def apply(): MaximumRepositoryNamesExceededException = {
      val __obj = js.Dynamic.literal(name = "MaximumRepositoryNamesExceededException")
      __obj.asInstanceOf[MaximumRepositoryNamesExceededException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaximumRepositoryNamesExceededException] (val x: Self) extends AnyVal {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumRepositoryNamesExceededException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaximumRepositoryNamesExceededExceptionDetails extends StObject
}
