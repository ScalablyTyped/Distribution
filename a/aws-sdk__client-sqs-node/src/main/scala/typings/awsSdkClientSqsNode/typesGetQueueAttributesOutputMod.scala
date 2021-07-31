package typings.awsSdkClientSqsNode

import org.scalablytyped.runtime.TopLevel
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetQueueAttributesOutputMod {
  
  trait GetQueueAttributesOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>A map of attributes to their respective values.</p>
      */
    var Attributes: js.UndefOr[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in 'All' | 'Policy' | 'VisibilityTimeout' | 'MaximumMessageSize' | 'MessageRetentionPeriod' | 'ApproximateNumberOfMessages' | 'ApproximateNumberOfMessagesNotVisible' | 'CreatedTimestamp' | 'LastModifiedTimestamp' | 'QueueArn' | 'ApproximateNumberOfMessagesDelayed' | 'DelaySeconds' | 'ReceiveMessageWaitTimeSeconds' | 'RedrivePolicy' | 'FifoQueue' | 'ContentBasedDeduplication' | 'KmsMasterKeyId' | 'KmsDataKeyReusePeriodSeconds' | string ]: string}
      */ typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.GetQueueAttributesOutput & TopLevel[js.Any]
      ] = js.undefined
  }
  object GetQueueAttributesOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetQueueAttributesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetQueueAttributesOutput]
    }
    
    @scala.inline
    implicit class GetQueueAttributesOutputMutableBuilder[Self <: GetQueueAttributesOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributes(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ key in 'All' | 'Policy' | 'VisibilityTimeout' | 'MaximumMessageSize' | 'MessageRetentionPeriod' | 'ApproximateNumberOfMessages' | 'ApproximateNumberOfMessagesNotVisible' | 'CreatedTimestamp' | 'LastModifiedTimestamp' | 'QueueArn' | 'ApproximateNumberOfMessagesDelayed' | 'DelaySeconds' | 'ReceiveMessageWaitTimeSeconds' | 'RedrivePolicy' | 'FifoQueue' | 'ContentBasedDeduplication' | 'KmsMasterKeyId' | 'KmsDataKeyReusePeriodSeconds' | string ]: string}
        */ typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.GetQueueAttributesOutput & TopLevel[js.Any]
      ): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    }
  }
}
