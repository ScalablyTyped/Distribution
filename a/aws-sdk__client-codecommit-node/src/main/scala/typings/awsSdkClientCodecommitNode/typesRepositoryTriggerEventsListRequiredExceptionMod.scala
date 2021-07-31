package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.putRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typings.awsSdkClientCodecommitNode.testRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRepositoryTriggerEventsListRequiredExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_RepositoryTriggerEventsListRequiredExceptionDetails> * / any */ trait RepositoryTriggerEventsListRequiredException
    extends StObject
       with PutRepositoryTriggersExceptionsUnion
       with TestRepositoryTriggersExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryTriggerEventsListRequiredException
  }
  object RepositoryTriggerEventsListRequiredException {
    
    @scala.inline
    def apply(): RepositoryTriggerEventsListRequiredException = {
      val __obj = js.Dynamic.literal(name = "RepositoryTriggerEventsListRequiredException")
      __obj.asInstanceOf[RepositoryTriggerEventsListRequiredException]
    }
    
    @scala.inline
    implicit class RepositoryTriggerEventsListRequiredExceptionMutableBuilder[Self <: RepositoryTriggerEventsListRequiredException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryTriggerEventsListRequiredException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait RepositoryTriggerEventsListRequiredExceptionDetails extends StObject
}
