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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidRequestExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidRequestExceptionDetails> * / any */ @js.native
  trait InvalidRequestException
    extends BatchGetTracesExceptionsUnion
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
    
    var name: typings.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.InvalidRequestException = js.native
  }
  object InvalidRequestException {
    
    @scala.inline
    def apply(name: typings.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.InvalidRequestException): InvalidRequestException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidRequestException]
    }
    
    @scala.inline
    implicit class InvalidRequestExceptionMutableBuilder[Self <: InvalidRequestException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.InvalidRequestException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InvalidRequestExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var Message: js.UndefOr[String] = js.native
  }
  object InvalidRequestExceptionDetails {
    
    @scala.inline
    def apply(): InvalidRequestExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvalidRequestExceptionDetails]
    }
    
    @scala.inline
    implicit class InvalidRequestExceptionDetailsMutableBuilder[Self <: InvalidRequestExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    }
  }
}
