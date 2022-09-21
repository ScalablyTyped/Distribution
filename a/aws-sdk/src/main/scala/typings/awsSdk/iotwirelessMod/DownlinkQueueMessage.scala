package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownlinkQueueMessage extends StObject {
  
  var LoRaWAN: js.UndefOr[LoRaWANSendDataToDevice] = js.undefined
  
  /**
    *  The message ID assigned by IoT Wireless to each downlink message, which helps identify the message.
    */
  var MessageId: js.UndefOr[typings.awsSdk.iotwirelessMod.MessageId] = js.undefined
  
  /**
    * The time at which Iot Wireless received the downlink message.
    */
  var ReceivedAt: js.UndefOr[ISODateTimeString] = js.undefined
  
  /**
    * The transmit mode to use for sending data to the wireless device. This can be 0 for UM (unacknowledge mode) or 1 for AM (acknowledge mode).
    */
  var TransmitMode: js.UndefOr[typings.awsSdk.iotwirelessMod.TransmitMode] = js.undefined
}
object DownlinkQueueMessage {
  
  inline def apply(): DownlinkQueueMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownlinkQueueMessage]
  }
  
  extension [Self <: DownlinkQueueMessage](x: Self) {
    
    inline def setLoRaWAN(value: LoRaWANSendDataToDevice): Self = StObject.set(x, "LoRaWAN", value.asInstanceOf[js.Any])
    
    inline def setLoRaWANUndefined: Self = StObject.set(x, "LoRaWAN", js.undefined)
    
    inline def setMessageId(value: MessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
    
    inline def setReceivedAt(value: ISODateTimeString): Self = StObject.set(x, "ReceivedAt", value.asInstanceOf[js.Any])
    
    inline def setReceivedAtUndefined: Self = StObject.set(x, "ReceivedAt", js.undefined)
    
    inline def setTransmitMode(value: TransmitMode): Self = StObject.set(x, "TransmitMode", value.asInstanceOf[js.Any])
    
    inline def setTransmitModeUndefined: Self = StObject.set(x, "TransmitMode", js.undefined)
  }
}
