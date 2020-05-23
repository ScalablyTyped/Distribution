package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UdpOutputSettings extends js.Object {
  /**
    * UDP output buffering in milliseconds. Larger values increase latency through the transcoder but simultaneously assist the transcoder in maintaining a constant, low-jitter UDP/RTP output while accommodating clock recovery, input switching, input disruptions, picture reordering, etc.
    */
  var BufferMsec: js.UndefOr[integerMin0Max10000] = js.native
  var ContainerSettings: UdpContainerSettings = js.native
  /**
    * Destination address and port number for RTP or UDP packets. Can be unicast or multicast RTP or UDP (eg. rtp://239.10.10.10:5001 or udp://10.100.100.100:5002).
    */
  var Destination: OutputLocationRef = js.native
  /**
    * Settings for enabling and adjusting Forward Error Correction on UDP outputs.
    */
  var FecOutputSettings: js.UndefOr[typings.awsSdk.medialiveMod.FecOutputSettings] = js.native
}

object UdpOutputSettings {
  @scala.inline
  def apply(
    ContainerSettings: UdpContainerSettings,
    Destination: OutputLocationRef,
    BufferMsec: js.UndefOr[integerMin0Max10000] = js.undefined,
    FecOutputSettings: FecOutputSettings = null
  ): UdpOutputSettings = {
    val __obj = js.Dynamic.literal(ContainerSettings = ContainerSettings.asInstanceOf[js.Any], Destination = Destination.asInstanceOf[js.Any])
    if (!js.isUndefined(BufferMsec)) __obj.updateDynamic("BufferMsec")(BufferMsec.get.asInstanceOf[js.Any])
    if (FecOutputSettings != null) __obj.updateDynamic("FecOutputSettings")(FecOutputSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UdpOutputSettings]
  }
}

