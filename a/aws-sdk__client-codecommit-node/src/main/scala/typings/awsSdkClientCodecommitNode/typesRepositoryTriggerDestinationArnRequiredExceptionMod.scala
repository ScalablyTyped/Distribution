package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.putRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typings.awsSdkClientCodecommitNode.testRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRepositoryTriggerDestinationArnRequiredExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_RepositoryTriggerDestinationArnRequiredExceptionDetails> * / any */ trait RepositoryTriggerDestinationArnRequiredException
    extends StObject
       with PutRepositoryTriggersExceptionsUnion
       with TestRepositoryTriggersExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryTriggerDestinationArnRequiredException
  }
  object RepositoryTriggerDestinationArnRequiredException {
    
    inline def apply(): RepositoryTriggerDestinationArnRequiredException = {
      val __obj = js.Dynamic.literal(name = "RepositoryTriggerDestinationArnRequiredException")
      __obj.asInstanceOf[RepositoryTriggerDestinationArnRequiredException]
    }
    
    extension [Self <: RepositoryTriggerDestinationArnRequiredException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryTriggerDestinationArnRequiredException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait RepositoryTriggerDestinationArnRequiredExceptionDetails extends StObject
}
