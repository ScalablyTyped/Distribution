package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.typesBatchGetTracesExceptionsUnionMod.BatchGetTracesExceptionsUnion
import typings.awsSdkClientXrayNode.typesCreateSamplingRuleExceptionsUnionMod.CreateSamplingRuleExceptionsUnion
import typings.awsSdkClientXrayNode.typesDeleteSamplingRuleExceptionsUnionMod.DeleteSamplingRuleExceptionsUnion
import typings.awsSdkClientXrayNode.typesGetEncryptionConfigExceptionsUnionMod.GetEncryptionConfigExceptionsUnion
import typings.awsSdkClientXrayNode.typesGetSamplingRulesExceptionsUnionMod.GetSamplingRulesExceptionsUnion
import typings.awsSdkClientXrayNode.typesGetSamplingStatisticSummariesExceptionsUnionMod.GetSamplingStatisticSummariesExceptionsUnion
import typings.awsSdkClientXrayNode.typesGetSamplingTargetsExceptionsUnionMod.GetSamplingTargetsExceptionsUnion
import typings.awsSdkClientXrayNode.typesGetServiceGraphExceptionsUnionMod.GetServiceGraphExceptionsUnion
import typings.awsSdkClientXrayNode.typesGetTraceGraphExceptionsUnionMod.GetTraceGraphExceptionsUnion
import typings.awsSdkClientXrayNode.typesGetTraceSummariesExceptionsUnionMod.GetTraceSummariesExceptionsUnion
import typings.awsSdkClientXrayNode.typesPutEncryptionConfigExceptionsUnionMod.PutEncryptionConfigExceptionsUnion
import typings.awsSdkClientXrayNode.typesPutTelemetryRecordsExceptionsUnionMod.PutTelemetryRecordsExceptionsUnion
import typings.awsSdkClientXrayNode.typesPutTraceSegmentsExceptionsUnionMod.PutTraceSegmentsExceptionsUnion
import typings.awsSdkClientXrayNode.typesUpdateSamplingRuleExceptionsUnionMod.UpdateSamplingRuleExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesThrottledExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ThrottledExceptionDetails> * / any */ trait ThrottledException
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
    
    var name: typings.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.ThrottledException
  }
  object ThrottledException {
    
    inline def apply(): ThrottledException = {
      val __obj = js.Dynamic.literal(name = "ThrottledException")
      __obj.asInstanceOf[ThrottledException]
    }
    
    extension [Self <: ThrottledException](x: Self) {
      
      inline def setName(value: typings.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.ThrottledException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThrottledExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var Message: js.UndefOr[String] = js.undefined
  }
  object ThrottledExceptionDetails {
    
    inline def apply(): ThrottledExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThrottledExceptionDetails]
    }
    
    extension [Self <: ThrottledExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    }
  }
}
