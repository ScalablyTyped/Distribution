package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsSqsQueueDetails extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon SQS moves messages after the value of maxReceiveCount is exceeded. 
    */
  var DeadLetterTargetArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The length of time, in seconds, for which Amazon SQS can reuse a data key to encrypt or decrypt messages before calling AWS KMS again.
    */
  var KmsDataKeyReusePeriodSeconds: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of an AWS managed customer master key (CMK) for Amazon SQS or a custom CMK.
    */
  var KmsMasterKeyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the new queue.
    */
  var QueueName: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsSqsQueueDetails {
  
  inline def apply(): AwsSqsQueueDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsSqsQueueDetails]
  }
  
  extension [Self <: AwsSqsQueueDetails](x: Self) {
    
    inline def setDeadLetterTargetArn(value: NonEmptyString): Self = StObject.set(x, "DeadLetterTargetArn", value.asInstanceOf[js.Any])
    
    inline def setDeadLetterTargetArnUndefined: Self = StObject.set(x, "DeadLetterTargetArn", js.undefined)
    
    inline def setKmsDataKeyReusePeriodSeconds(value: Integer): Self = StObject.set(x, "KmsDataKeyReusePeriodSeconds", value.asInstanceOf[js.Any])
    
    inline def setKmsDataKeyReusePeriodSecondsUndefined: Self = StObject.set(x, "KmsDataKeyReusePeriodSeconds", js.undefined)
    
    inline def setKmsMasterKeyId(value: NonEmptyString): Self = StObject.set(x, "KmsMasterKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsMasterKeyIdUndefined: Self = StObject.set(x, "KmsMasterKeyId", js.undefined)
    
    inline def setQueueName(value: NonEmptyString): Self = StObject.set(x, "QueueName", value.asInstanceOf[js.Any])
    
    inline def setQueueNameUndefined: Self = StObject.set(x, "QueueName", js.undefined)
  }
}
