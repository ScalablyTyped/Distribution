package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeliveryStreamEncryptionConfiguration extends js.Object {
  
  /**
    * Provides details in case one of the following operations fails due to an error related to KMS: CreateDeliveryStream, DeleteDeliveryStream, StartDeliveryStreamEncryption, StopDeliveryStreamEncryption.
    */
  var FailureDescription: js.UndefOr[typings.awsSdk.firehoseMod.FailureDescription] = js.native
  
  /**
    * If KeyType is CUSTOMER_MANAGED_CMK, this field contains the ARN of the customer managed CMK. If KeyType is AWS_OWNED_CMK, DeliveryStreamEncryptionConfiguration doesn't contain a value for KeyARN.
    */
  var KeyARN: js.UndefOr[AWSKMSKeyARN] = js.native
  
  /**
    * Indicates the type of customer master key (CMK) that is used for encryption. The default setting is AWS_OWNED_CMK. For more information about CMKs, see Customer Master Keys (CMKs).
    */
  var KeyType: js.UndefOr[typings.awsSdk.firehoseMod.KeyType] = js.native
  
  /**
    * This is the server-side encryption (SSE) status for the delivery stream. For a full description of the different values of this status, see StartDeliveryStreamEncryption and StopDeliveryStreamEncryption. If this status is ENABLING_FAILED or DISABLING_FAILED, it is the status of the most recent attempt to enable or disable SSE, respectively.
    */
  var Status: js.UndefOr[DeliveryStreamEncryptionStatus] = js.native
}
object DeliveryStreamEncryptionConfiguration {
  
  @scala.inline
  def apply(): DeliveryStreamEncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryStreamEncryptionConfiguration]
  }
  
  @scala.inline
  implicit class DeliveryStreamEncryptionConfigurationOps[Self <: DeliveryStreamEncryptionConfiguration] (val x: Self) extends AnyVal {
    
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
    def setFailureDescription(value: FailureDescription): Self = this.set("FailureDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureDescription: Self = this.set("FailureDescription", js.undefined)
    
    @scala.inline
    def setKeyARN(value: AWSKMSKeyARN): Self = this.set("KeyARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyARN: Self = this.set("KeyARN", js.undefined)
    
    @scala.inline
    def setKeyType(value: KeyType): Self = this.set("KeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyType: Self = this.set("KeyType", js.undefined)
    
    @scala.inline
    def setStatus(value: DeliveryStreamEncryptionStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
