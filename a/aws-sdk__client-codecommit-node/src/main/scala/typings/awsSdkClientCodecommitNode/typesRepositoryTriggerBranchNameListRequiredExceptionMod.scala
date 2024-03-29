package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesPutRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesTestRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRepositoryTriggerBranchNameListRequiredExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_RepositoryTriggerBranchNameListRequiredExceptionDetails> * / any */ trait RepositoryTriggerBranchNameListRequiredException
    extends StObject
       with PutRepositoryTriggersExceptionsUnion
       with TestRepositoryTriggersExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryTriggerBranchNameListRequiredException
  }
  object RepositoryTriggerBranchNameListRequiredException {
    
    inline def apply(): RepositoryTriggerBranchNameListRequiredException = {
      val __obj = js.Dynamic.literal(name = "RepositoryTriggerBranchNameListRequiredException")
      __obj.asInstanceOf[RepositoryTriggerBranchNameListRequiredException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RepositoryTriggerBranchNameListRequiredException] (val x: Self) extends AnyVal {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryTriggerBranchNameListRequiredException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait RepositoryTriggerBranchNameListRequiredExceptionDetails extends StObject
}
