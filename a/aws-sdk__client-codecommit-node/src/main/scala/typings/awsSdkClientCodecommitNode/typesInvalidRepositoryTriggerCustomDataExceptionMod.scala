package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesPutRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesTestRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidRepositoryTriggerCustomDataExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidRepositoryTriggerCustomDataExceptionDetails> * / any */ trait InvalidRepositoryTriggerCustomDataException
    extends StObject
       with PutRepositoryTriggersExceptionsUnion
       with TestRepositoryTriggersExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryTriggerCustomDataException
  }
  object InvalidRepositoryTriggerCustomDataException {
    
    inline def apply(): InvalidRepositoryTriggerCustomDataException = {
      val __obj = js.Dynamic.literal(name = "InvalidRepositoryTriggerCustomDataException")
      __obj.asInstanceOf[InvalidRepositoryTriggerCustomDataException]
    }
    
    extension [Self <: InvalidRepositoryTriggerCustomDataException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryTriggerCustomDataException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidRepositoryTriggerCustomDataExceptionDetails extends StObject
}
