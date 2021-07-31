package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.putRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typings.awsSdkClientCodecommitNode.testRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidRepositoryTriggerRegionExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidRepositoryTriggerRegionExceptionDetails> * / any */ trait InvalidRepositoryTriggerRegionException
    extends StObject
       with PutRepositoryTriggersExceptionsUnion
       with TestRepositoryTriggersExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryTriggerRegionException
  }
  object InvalidRepositoryTriggerRegionException {
    
    @scala.inline
    def apply(): InvalidRepositoryTriggerRegionException = {
      val __obj = js.Dynamic.literal(name = "InvalidRepositoryTriggerRegionException")
      __obj.asInstanceOf[InvalidRepositoryTriggerRegionException]
    }
    
    @scala.inline
    implicit class InvalidRepositoryTriggerRegionExceptionMutableBuilder[Self <: InvalidRepositoryTriggerRegionException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryTriggerRegionException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidRepositoryTriggerRegionExceptionDetails extends StObject
}
