package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.typesAddPermissionExceptionsUnionMod.AddPermissionExceptionsUnion
import typings.awsSdkClientLambdaNode.typesCreateAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typings.awsSdkClientLambdaNode.typesCreateEventSourceMappingExceptionsUnionMod.CreateEventSourceMappingExceptionsUnion
import typings.awsSdkClientLambdaNode.typesCreateFunctionExceptionsUnionMod.CreateFunctionExceptionsUnion
import typings.awsSdkClientLambdaNode.typesDeleteAliasExceptionsUnionMod.DeleteAliasExceptionsUnion
import typings.awsSdkClientLambdaNode.typesDeleteEventSourceMappingExceptionsUnionMod.DeleteEventSourceMappingExceptionsUnion
import typings.awsSdkClientLambdaNode.typesDeleteFunctionConcurrencyExceptionsUnionMod.DeleteFunctionConcurrencyExceptionsUnion
import typings.awsSdkClientLambdaNode.typesDeleteFunctionExceptionsUnionMod.DeleteFunctionExceptionsUnion
import typings.awsSdkClientLambdaNode.typesGetAliasExceptionsUnionMod.GetAliasExceptionsUnion
import typings.awsSdkClientLambdaNode.typesGetEventSourceMappingExceptionsUnionMod.GetEventSourceMappingExceptionsUnion
import typings.awsSdkClientLambdaNode.typesGetFunctionConfigurationExceptionsUnionMod.GetFunctionConfigurationExceptionsUnion
import typings.awsSdkClientLambdaNode.typesGetFunctionExceptionsUnionMod.GetFunctionExceptionsUnion
import typings.awsSdkClientLambdaNode.typesGetPolicyExceptionsUnionMod.GetPolicyExceptionsUnion
import typings.awsSdkClientLambdaNode.typesInvokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.awsSdkClientLambdaNode.typesListAliasesExceptionsUnionMod.ListAliasesExceptionsUnion
import typings.awsSdkClientLambdaNode.typesListEventSourceMappingsExceptionsUnionMod.ListEventSourceMappingsExceptionsUnion
import typings.awsSdkClientLambdaNode.typesListFunctionsExceptionsUnionMod.ListFunctionsExceptionsUnion
import typings.awsSdkClientLambdaNode.typesListTagsExceptionsUnionMod.ListTagsExceptionsUnion
import typings.awsSdkClientLambdaNode.typesListVersionsByFunctionExceptionsUnionMod.ListVersionsByFunctionExceptionsUnion
import typings.awsSdkClientLambdaNode.typesPublishVersionExceptionsUnionMod.PublishVersionExceptionsUnion
import typings.awsSdkClientLambdaNode.typesPutFunctionConcurrencyExceptionsUnionMod.PutFunctionConcurrencyExceptionsUnion
import typings.awsSdkClientLambdaNode.typesRemovePermissionExceptionsUnionMod.RemovePermissionExceptionsUnion
import typings.awsSdkClientLambdaNode.typesTagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typings.awsSdkClientLambdaNode.typesUntagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typings.awsSdkClientLambdaNode.typesUpdateAliasExceptionsUnionMod.UpdateAliasExceptionsUnion
import typings.awsSdkClientLambdaNode.typesUpdateEventSourceMappingExceptionsUnionMod.UpdateEventSourceMappingExceptionsUnion
import typings.awsSdkClientLambdaNode.typesUpdateFunctionCodeExceptionsUnionMod.UpdateFunctionCodeExceptionsUnion
import typings.awsSdkClientLambdaNode.typesUpdateFunctionConfigurationExceptionsUnionMod.UpdateFunctionConfigurationExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidParameterValueExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidParameterValueExceptionDetails> * / any */ trait InvalidParameterValueException
    extends StObject
       with AddPermissionExceptionsUnion
       with CreateAliasExceptionsUnion
       with CreateEventSourceMappingExceptionsUnion
       with CreateFunctionExceptionsUnion
       with DeleteAliasExceptionsUnion
       with DeleteEventSourceMappingExceptionsUnion
       with DeleteFunctionConcurrencyExceptionsUnion
       with DeleteFunctionExceptionsUnion
       with GetAliasExceptionsUnion
       with GetEventSourceMappingExceptionsUnion
       with GetFunctionConfigurationExceptionsUnion
       with GetFunctionExceptionsUnion
       with GetPolicyExceptionsUnion
       with InvokeExceptionsUnion
       with ListAliasesExceptionsUnion
       with ListEventSourceMappingsExceptionsUnion
       with ListFunctionsExceptionsUnion
       with ListTagsExceptionsUnion
       with ListVersionsByFunctionExceptionsUnion
       with PublishVersionExceptionsUnion
       with PutFunctionConcurrencyExceptionsUnion
       with RemovePermissionExceptionsUnion
       with TagResourceExceptionsUnion
       with UntagResourceExceptionsUnion
       with UpdateAliasExceptionsUnion
       with UpdateEventSourceMappingExceptionsUnion
       with UpdateFunctionCodeExceptionsUnion
       with UpdateFunctionConfigurationExceptionsUnion {
    
    var name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidParameterValueException
  }
  object InvalidParameterValueException {
    
    inline def apply(): InvalidParameterValueException = {
      val __obj = js.Dynamic.literal(name = "InvalidParameterValueException")
      __obj.asInstanceOf[InvalidParameterValueException]
    }
    
    extension [Self <: InvalidParameterValueException](x: Self) {
      
      inline def setName(value: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidParameterValueException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidParameterValueExceptionDetails extends StObject {
    
    /**
      * <p>The exception type.</p>
      */
    var Type: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The exception message.</p>
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object InvalidParameterValueExceptionDetails {
    
    inline def apply(): InvalidParameterValueExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvalidParameterValueExceptionDetails]
    }
    
    extension [Self <: InvalidParameterValueExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
}
