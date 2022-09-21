package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticipatingGateways extends StObject {
  
  /**
    * Indicates whether to send the downlink message in sequential mode or concurrent mode, or to use only the chosen gateways from the previous uplink message transmission.
    */
  var DownlinkMode: typings.awsSdk.iotwirelessMod.DownlinkMode
  
  /**
    * The list of gateways that you want to use for sending the downlink data traffic.
    */
  var GatewayList: typings.awsSdk.iotwirelessMod.GatewayList
  
  /**
    * The duration of time for which AWS IoT Core for LoRaWAN will wait before transmitting the payload to the next gateway.
    */
  var TransmissionInterval: typings.awsSdk.iotwirelessMod.TransmissionInterval
}
object ParticipatingGateways {
  
  inline def apply(DownlinkMode: DownlinkMode, GatewayList: GatewayList, TransmissionInterval: TransmissionInterval): ParticipatingGateways = {
    val __obj = js.Dynamic.literal(DownlinkMode = DownlinkMode.asInstanceOf[js.Any], GatewayList = GatewayList.asInstanceOf[js.Any], TransmissionInterval = TransmissionInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipatingGateways]
  }
  
  extension [Self <: ParticipatingGateways](x: Self) {
    
    inline def setDownlinkMode(value: DownlinkMode): Self = StObject.set(x, "DownlinkMode", value.asInstanceOf[js.Any])
    
    inline def setGatewayList(value: GatewayList): Self = StObject.set(x, "GatewayList", value.asInstanceOf[js.Any])
    
    inline def setGatewayListVarargs(value: GatewayListItem*): Self = StObject.set(x, "GatewayList", js.Array(value*))
    
    inline def setTransmissionInterval(value: TransmissionInterval): Self = StObject.set(x, "TransmissionInterval", value.asInstanceOf[js.Any])
  }
}
