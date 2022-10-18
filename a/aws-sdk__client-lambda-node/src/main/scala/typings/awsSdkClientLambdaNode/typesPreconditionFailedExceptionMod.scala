package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.typesAddPermissionExceptionsUnionMod.AddPermissionExceptionsUnion
import typings.awsSdkClientLambdaNode.typesPublishVersionExceptionsUnionMod.PublishVersionExceptionsUnion
import typings.awsSdkClientLambdaNode.typesRemovePermissionExceptionsUnionMod.RemovePermissionExceptionsUnion
import typings.awsSdkClientLambdaNode.typesUpdateAliasExceptionsUnionMod.UpdateAliasExceptionsUnion
import typings.awsSdkClientLambdaNode.typesUpdateFunctionCodeExceptionsUnionMod.UpdateFunctionCodeExceptionsUnion
import typings.awsSdkClientLambdaNode.typesUpdateFunctionConfigurationExceptionsUnionMod.UpdateFunctionConfigurationExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPreconditionFailedExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_PreconditionFailedExceptionDetails> * / any */ trait PreconditionFailedException
    extends StObject
       with AddPermissionExceptionsUnion
       with PublishVersionExceptionsUnion
       with RemovePermissionExceptionsUnion
       with UpdateAliasExceptionsUnion
       with UpdateFunctionCodeExceptionsUnion
       with UpdateFunctionConfigurationExceptionsUnion {
    
    var name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.PreconditionFailedException
  }
  object PreconditionFailedException {
    
    inline def apply(): PreconditionFailedException = {
      val __obj = js.Dynamic.literal(name = "PreconditionFailedException")
      __obj.asInstanceOf[PreconditionFailedException]
    }
    
    extension [Self <: PreconditionFailedException](x: Self) {
      
      inline def setName(value: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.PreconditionFailedException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait PreconditionFailedExceptionDetails extends StObject {
    
    /**
      * <p>The exception type.</p>
      */
    var Type: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The exception message.</p>
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object PreconditionFailedExceptionDetails {
    
    inline def apply(): PreconditionFailedExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreconditionFailedExceptionDetails]
    }
    
    extension [Self <: PreconditionFailedExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
}
