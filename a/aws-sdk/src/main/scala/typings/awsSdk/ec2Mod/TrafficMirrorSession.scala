package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficMirrorSession extends js.Object {
  /**
    * The description of the Traffic Mirror session.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The ID of the Traffic Mirror session's network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
  /**
    * The ID of the account that owns the Traffic Mirror session.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * The number of bytes in each packet to mirror. These are the bytes after the VXLAN header. To mirror a subset, set this to the length (in bytes) to mirror. For example, if you set this value to 100, then the first 100 bytes that meet the filter criteria are copied to the target. Do not specify this parameter when you want to mirror the entire packet
    */
  var PacketLength: js.UndefOr[Integer] = js.native
  /**
    * The session number determines the order in which sessions are evaluated when an interface is used by multiple sessions. The first session with a matching filter is the one that mirrors the packets. Valid values are 1-32766.
    */
  var SessionNumber: js.UndefOr[Integer] = js.native
  /**
    * The tags assigned to the Traffic Mirror session.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the Traffic Mirror filter.
    */
  var TrafficMirrorFilterId: js.UndefOr[String] = js.native
  /**
    * The ID for the Traffic Mirror session.
    */
  var TrafficMirrorSessionId: js.UndefOr[String] = js.native
  /**
    * The ID of the Traffic Mirror target.
    */
  var TrafficMirrorTargetId: js.UndefOr[String] = js.native
  /**
    * The virtual network ID associated with the Traffic Mirror session.
    */
  var VirtualNetworkId: js.UndefOr[Integer] = js.native
}

object TrafficMirrorSession {
  @scala.inline
  def apply(): TrafficMirrorSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficMirrorSession]
  }
  @scala.inline
  implicit class TrafficMirrorSessionOps[Self <: TrafficMirrorSession] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = this.set("NetworkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("NetworkInterfaceId", js.undefined)
    @scala.inline
    def setOwnerId(value: String): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    @scala.inline
    def setPacketLength(value: Integer): Self = this.set("PacketLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePacketLength: Self = this.set("PacketLength", js.undefined)
    @scala.inline
    def setSessionNumber(value: Integer): Self = this.set("SessionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionNumber: Self = this.set("SessionNumber", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setTrafficMirrorFilterId(value: String): Self = this.set("TrafficMirrorFilterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrafficMirrorFilterId: Self = this.set("TrafficMirrorFilterId", js.undefined)
    @scala.inline
    def setTrafficMirrorSessionId(value: String): Self = this.set("TrafficMirrorSessionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrafficMirrorSessionId: Self = this.set("TrafficMirrorSessionId", js.undefined)
    @scala.inline
    def setTrafficMirrorTargetId(value: String): Self = this.set("TrafficMirrorTargetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrafficMirrorTargetId: Self = this.set("TrafficMirrorTargetId", js.undefined)
    @scala.inline
    def setVirtualNetworkId(value: Integer): Self = this.set("VirtualNetworkId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualNetworkId: Self = this.set("VirtualNetworkId", js.undefined)
  }
  
}

