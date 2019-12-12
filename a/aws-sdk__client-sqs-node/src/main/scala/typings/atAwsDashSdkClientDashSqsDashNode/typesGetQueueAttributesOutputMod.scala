package typings.atAwsDashSdkClientDashSqsDashNode

import typings.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/types/GetQueueAttributesOutput", JSImport.Namespace)
@js.native
object typesGetQueueAttributesOutputMod extends js.Object {
  @js.native
  trait GetQueueAttributesOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>A map of attributes to their respective values.</p>
      */
    var Attributes: js.UndefOr[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in 'All' | 'Policy' | 'VisibilityTimeout' | 'MaximumMessageSize' | 'MessageRetentionPeriod' | 'ApproximateNumberOfMessages' | 'ApproximateNumberOfMessagesNotVisible' | 'CreatedTimestamp' | 'LastModifiedTimestamp' | 'QueueArn' | 'ApproximateNumberOfMessagesDelayed' | 'DelaySeconds' | 'ReceiveMessageWaitTimeSeconds' | 'RedrivePolicy' | 'FifoQueue' | 'ContentBasedDeduplication' | 'KmsMasterKeyId' | 'KmsDataKeyReusePeriodSeconds' | string ]: string}
      */ typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.GetQueueAttributesOutput with js.Any
      ] = js.native
  }
  
}

