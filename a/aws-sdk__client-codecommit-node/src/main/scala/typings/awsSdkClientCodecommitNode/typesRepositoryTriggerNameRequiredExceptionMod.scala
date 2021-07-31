package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.putRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typings.awsSdkClientCodecommitNode.testRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRepositoryTriggerNameRequiredExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_RepositoryTriggerNameRequiredExceptionDetails> * / any */ trait RepositoryTriggerNameRequiredException
    extends StObject
       with PutRepositoryTriggersExceptionsUnion
       with TestRepositoryTriggersExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryTriggerNameRequiredException
  }
  object RepositoryTriggerNameRequiredException {
    
    @scala.inline
    def apply(): RepositoryTriggerNameRequiredException = {
      val __obj = js.Dynamic.literal(name = "RepositoryTriggerNameRequiredException")
      __obj.asInstanceOf[RepositoryTriggerNameRequiredException]
    }
    
    @scala.inline
    implicit class RepositoryTriggerNameRequiredExceptionMutableBuilder[Self <: RepositoryTriggerNameRequiredException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryTriggerNameRequiredException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait RepositoryTriggerNameRequiredExceptionDetails extends StObject
}
