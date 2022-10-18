package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesPutRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesTestRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidRepositoryTriggerBranchNameExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidRepositoryTriggerBranchNameExceptionDetails> * / any */ trait InvalidRepositoryTriggerBranchNameException
    extends StObject
       with PutRepositoryTriggersExceptionsUnion
       with TestRepositoryTriggersExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryTriggerBranchNameException
  }
  object InvalidRepositoryTriggerBranchNameException {
    
    inline def apply(): InvalidRepositoryTriggerBranchNameException = {
      val __obj = js.Dynamic.literal(name = "InvalidRepositoryTriggerBranchNameException")
      __obj.asInstanceOf[InvalidRepositoryTriggerBranchNameException]
    }
    
    extension [Self <: InvalidRepositoryTriggerBranchNameException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryTriggerBranchNameException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidRepositoryTriggerBranchNameExceptionDetails extends StObject
}
