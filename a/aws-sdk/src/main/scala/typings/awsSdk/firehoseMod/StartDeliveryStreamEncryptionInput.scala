package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDeliveryStreamEncryptionInput extends StObject {
  
  /**
    * Used to specify the type and Amazon Resource Name (ARN) of the KMS key needed for Server-Side Encryption (SSE).
    */
  var DeliveryStreamEncryptionConfigurationInput: js.UndefOr[typings.awsSdk.firehoseMod.DeliveryStreamEncryptionConfigurationInput] = js.undefined
  
  /**
    * The name of the delivery stream for which you want to enable server-side encryption (SSE).
    */
  var DeliveryStreamName: typings.awsSdk.firehoseMod.DeliveryStreamName
}
object StartDeliveryStreamEncryptionInput {
  
  @scala.inline
  def apply(DeliveryStreamName: DeliveryStreamName): StartDeliveryStreamEncryptionInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDeliveryStreamEncryptionInput]
  }
  
  @scala.inline
  implicit class StartDeliveryStreamEncryptionInputMutableBuilder[Self <: StartDeliveryStreamEncryptionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryStreamEncryptionConfigurationInput(value: DeliveryStreamEncryptionConfigurationInput): Self = StObject.set(x, "DeliveryStreamEncryptionConfigurationInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryStreamEncryptionConfigurationInputUndefined: Self = StObject.set(x, "DeliveryStreamEncryptionConfigurationInput", js.undefined)
    
    @scala.inline
    def setDeliveryStreamName(value: DeliveryStreamName): Self = StObject.set(x, "DeliveryStreamName", value.asInstanceOf[js.Any])
  }
}
