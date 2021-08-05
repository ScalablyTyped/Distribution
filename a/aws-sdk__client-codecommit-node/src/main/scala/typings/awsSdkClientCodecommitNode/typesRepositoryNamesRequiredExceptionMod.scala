package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.batchGetRepositoriesExceptionsUnionMod.BatchGetRepositoriesExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRepositoryNamesRequiredExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_RepositoryNamesRequiredExceptionDetails> * / any */ trait RepositoryNamesRequiredException
    extends StObject
       with BatchGetRepositoriesExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryNamesRequiredException
  }
  object RepositoryNamesRequiredException {
    
    inline def apply(): RepositoryNamesRequiredException = {
      val __obj = js.Dynamic.literal(name = "RepositoryNamesRequiredException")
      __obj.asInstanceOf[RepositoryNamesRequiredException]
    }
    
    extension [Self <: RepositoryNamesRequiredException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryNamesRequiredException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait RepositoryNamesRequiredExceptionDetails extends StObject
}
