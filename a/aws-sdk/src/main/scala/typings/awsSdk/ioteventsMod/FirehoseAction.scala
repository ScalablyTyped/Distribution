package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseAction extends StObject {
  
  /**
    * The name of the Kinesis Data Firehose delivery stream where the data is written.
    */
  var deliveryStreamName: DeliveryStreamName
  
  /**
    * You can configure the action payload when you send a message to an Amazon Kinesis Data Firehose delivery stream.
    */
  var payload: js.UndefOr[Payload] = js.undefined
  
  /**
    * A character separator that is used to separate records written to the Kinesis Data Firehose delivery stream. Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
    */
  var separator: js.UndefOr[FirehoseSeparator] = js.undefined
}
object FirehoseAction {
  
  @scala.inline
  def apply(deliveryStreamName: DeliveryStreamName): FirehoseAction = {
    val __obj = js.Dynamic.literal(deliveryStreamName = deliveryStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseAction]
  }
  
  @scala.inline
  implicit class FirehoseActionMutableBuilder[Self <: FirehoseAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryStreamName(value: DeliveryStreamName): Self = StObject.set(x, "deliveryStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setSeparator(value: FirehoseSeparator): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
  }
}
