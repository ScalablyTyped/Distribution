package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.batchGetTracesExceptionsUnionMod.BatchGetTracesExceptionsUnion
import typings.awsSdkClientXrayNode.createSamplingRuleExceptionsUnionMod.CreateSamplingRuleExceptionsUnion
import typings.awsSdkClientXrayNode.deleteSamplingRuleExceptionsUnionMod.DeleteSamplingRuleExceptionsUnion
import typings.awsSdkClientXrayNode.getEncryptionConfigExceptionsUnionMod.GetEncryptionConfigExceptionsUnion
import typings.awsSdkClientXrayNode.getSamplingRulesExceptionsUnionMod.GetSamplingRulesExceptionsUnion
import typings.awsSdkClientXrayNode.getSamplingStatisticSummariesExceptionsUnionMod.GetSamplingStatisticSummariesExceptionsUnion
import typings.awsSdkClientXrayNode.getSamplingTargetsExceptionsUnionMod.GetSamplingTargetsExceptionsUnion
import typings.awsSdkClientXrayNode.getServiceGraphExceptionsUnionMod.GetServiceGraphExceptionsUnion
import typings.awsSdkClientXrayNode.getTraceGraphExceptionsUnionMod.GetTraceGraphExceptionsUnion
import typings.awsSdkClientXrayNode.getTraceSummariesExceptionsUnionMod.GetTraceSummariesExceptionsUnion
import typings.awsSdkClientXrayNode.putEncryptionConfigExceptionsUnionMod.PutEncryptionConfigExceptionsUnion
import typings.awsSdkClientXrayNode.putTelemetryRecordsExceptionsUnionMod.PutTelemetryRecordsExceptionsUnion
import typings.awsSdkClientXrayNode.putTraceSegmentsExceptionsUnionMod.PutTraceSegmentsExceptionsUnion
import typings.awsSdkClientXrayNode.updateSamplingRuleExceptionsUnionMod.UpdateSamplingRuleExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidRequestExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidRequestExceptionDetails> * / any */ trait InvalidRequestException
    extends StObject
       with BatchGetTracesExceptionsUnion
       with CreateSamplingRuleExceptionsUnion
       with DeleteSamplingRuleExceptionsUnion
       with GetEncryptionConfigExceptionsUnion
       with GetSamplingRulesExceptionsUnion
       with GetSamplingStatisticSummariesExceptionsUnion
       with GetSamplingTargetsExceptionsUnion
       with GetServiceGraphExceptionsUnion
       with GetTraceGraphExceptionsUnion
       with GetTraceSummariesExceptionsUnion
       with PutEncryptionConfigExceptionsUnion
       with PutTelemetryRecordsExceptionsUnion
       with PutTraceSegmentsExceptionsUnion
       with UpdateSamplingRuleExceptionsUnion {
    
    var name: typings.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.InvalidRequestException
  }
  object InvalidRequestException {
    
    inline def apply(): InvalidRequestException = {
      val __obj = js.Dynamic.literal(name = "InvalidRequestException")
      __obj.asInstanceOf[InvalidRequestException]
    }
    
    extension [Self <: InvalidRequestException](x: Self) {
      
      inline def setName(value: typings.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.InvalidRequestException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidRequestExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var Message: js.UndefOr[String] = js.undefined
  }
  object InvalidRequestExceptionDetails {
    
    inline def apply(): InvalidRequestExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvalidRequestExceptionDetails]
    }
    
    extension [Self <: InvalidRequestExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    }
  }
}
