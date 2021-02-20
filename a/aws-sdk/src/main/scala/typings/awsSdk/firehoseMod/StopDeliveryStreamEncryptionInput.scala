package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopDeliveryStreamEncryptionInput extends StObject {
  
  /**
    * The name of the delivery stream for which you want to disable server-side encryption (SSE).
    */
  var DeliveryStreamName: typings.awsSdk.firehoseMod.DeliveryStreamName = js.native
}
object StopDeliveryStreamEncryptionInput {
  
  @scala.inline
  def apply(DeliveryStreamName: DeliveryStreamName): StopDeliveryStreamEncryptionInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDeliveryStreamEncryptionInput]
  }
  
  @scala.inline
  implicit class StopDeliveryStreamEncryptionInputMutableBuilder[Self <: StopDeliveryStreamEncryptionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryStreamName(value: DeliveryStreamName): Self = StObject.set(x, "DeliveryStreamName", value.asInstanceOf[js.Any])
  }
}
