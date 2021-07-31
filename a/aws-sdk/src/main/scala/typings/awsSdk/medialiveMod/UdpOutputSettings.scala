package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UdpOutputSettings extends StObject {
  
  /**
    * UDP output buffering in milliseconds. Larger values increase latency through the transcoder but simultaneously assist the transcoder in maintaining a constant, low-jitter UDP/RTP output while accommodating clock recovery, input switching, input disruptions, picture reordering, etc.
    */
  var BufferMsec: js.UndefOr[integerMin0Max10000] = js.undefined
  
  var ContainerSettings: UdpContainerSettings
  
  /**
    * Destination address and port number for RTP or UDP packets. Can be unicast or multicast RTP or UDP (eg. rtp://239.10.10.10:5001 or udp://10.100.100.100:5002).
    */
  var Destination: OutputLocationRef
  
  /**
    * Settings for enabling and adjusting Forward Error Correction on UDP outputs.
    */
  var FecOutputSettings: js.UndefOr[typings.awsSdk.medialiveMod.FecOutputSettings] = js.undefined
}
object UdpOutputSettings {
  
  @scala.inline
  def apply(ContainerSettings: UdpContainerSettings, Destination: OutputLocationRef): UdpOutputSettings = {
    val __obj = js.Dynamic.literal(ContainerSettings = ContainerSettings.asInstanceOf[js.Any], Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[UdpOutputSettings]
  }
  
  @scala.inline
  implicit class UdpOutputSettingsMutableBuilder[Self <: UdpOutputSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBufferMsec(value: integerMin0Max10000): Self = StObject.set(x, "BufferMsec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferMsecUndefined: Self = StObject.set(x, "BufferMsec", js.undefined)
    
    @scala.inline
    def setContainerSettings(value: UdpContainerSettings): Self = StObject.set(x, "ContainerSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination(value: OutputLocationRef): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFecOutputSettings(value: FecOutputSettings): Self = StObject.set(x, "FecOutputSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFecOutputSettingsUndefined: Self = StObject.set(x, "FecOutputSettings", js.undefined)
  }
}
