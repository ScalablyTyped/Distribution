package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsSqsQueueDetails extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon SQS moves messages after the value of maxReceiveCount is exceeded. 
    */
  var DeadLetterTargetArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The length of time, in seconds, for which Amazon SQS can reuse a data key to encrypt or decrypt messages before calling AWS KMS again.
    */
  var KmsDataKeyReusePeriodSeconds: js.UndefOr[Integer] = js.native
  
  /**
    * The ID of an AWS managed customer master key (CMK) for Amazon SQS or a custom CMK.
    */
  var KmsMasterKeyId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the new queue.
    */
  var QueueName: js.UndefOr[NonEmptyString] = js.native
}
object AwsSqsQueueDetails {
  
  @scala.inline
  def apply(): AwsSqsQueueDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsSqsQueueDetails]
  }
  
  @scala.inline
  implicit class AwsSqsQueueDetailsOps[Self <: AwsSqsQueueDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeadLetterTargetArn(value: NonEmptyString): Self = this.set("DeadLetterTargetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeadLetterTargetArn: Self = this.set("DeadLetterTargetArn", js.undefined)
    
    @scala.inline
    def setKmsDataKeyReusePeriodSeconds(value: Integer): Self = this.set("KmsDataKeyReusePeriodSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsDataKeyReusePeriodSeconds: Self = this.set("KmsDataKeyReusePeriodSeconds", js.undefined)
    
    @scala.inline
    def setKmsMasterKeyId(value: NonEmptyString): Self = this.set("KmsMasterKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsMasterKeyId: Self = this.set("KmsMasterKeyId", js.undefined)
    
    @scala.inline
    def setQueueName(value: NonEmptyString): Self = this.set("QueueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueueName: Self = this.set("QueueName", js.undefined)
  }
}
