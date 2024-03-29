package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesPutRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesTestRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRepositoryTriggersListRequiredExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_RepositoryTriggersListRequiredExceptionDetails> * / any */ trait RepositoryTriggersListRequiredException
    extends StObject
       with PutRepositoryTriggersExceptionsUnion
       with TestRepositoryTriggersExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryTriggersListRequiredException
  }
  object RepositoryTriggersListRequiredException {
    
    inline def apply(): RepositoryTriggersListRequiredException = {
      val __obj = js.Dynamic.literal(name = "RepositoryTriggersListRequiredException")
      __obj.asInstanceOf[RepositoryTriggersListRequiredException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RepositoryTriggersListRequiredException] (val x: Self) extends AnyVal {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryTriggersListRequiredException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait RepositoryTriggersListRequiredExceptionDetails extends StObject
}
