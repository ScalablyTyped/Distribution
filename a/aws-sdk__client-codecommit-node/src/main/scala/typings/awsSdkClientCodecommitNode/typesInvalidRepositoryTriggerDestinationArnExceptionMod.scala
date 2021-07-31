package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.putRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typings.awsSdkClientCodecommitNode.testRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidRepositoryTriggerDestinationArnExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidRepositoryTriggerDestinationArnExceptionDetails> * / any */ trait InvalidRepositoryTriggerDestinationArnException
    extends StObject
       with PutRepositoryTriggersExceptionsUnion
       with TestRepositoryTriggersExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryTriggerDestinationArnException
  }
  object InvalidRepositoryTriggerDestinationArnException {
    
    @scala.inline
    def apply(): InvalidRepositoryTriggerDestinationArnException = {
      val __obj = js.Dynamic.literal(name = "InvalidRepositoryTriggerDestinationArnException")
      __obj.asInstanceOf[InvalidRepositoryTriggerDestinationArnException]
    }
    
    @scala.inline
    implicit class InvalidRepositoryTriggerDestinationArnExceptionMutableBuilder[Self <: InvalidRepositoryTriggerDestinationArnException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryTriggerDestinationArnException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidRepositoryTriggerDestinationArnExceptionDetails extends StObject
}
