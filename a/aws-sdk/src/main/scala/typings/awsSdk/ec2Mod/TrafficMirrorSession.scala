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
  def apply(
    Description: String = null,
    NetworkInterfaceId: String = null,
    OwnerId: String = null,
    PacketLength: Int | scala.Double = null,
    SessionNumber: Int | scala.Double = null,
    Tags: TagList = null,
    TrafficMirrorFilterId: String = null,
    TrafficMirrorSessionId: String = null,
    TrafficMirrorTargetId: String = null,
    VirtualNetworkId: Int | scala.Double = null
  ): TrafficMirrorSession = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (PacketLength != null) __obj.updateDynamic("PacketLength")(PacketLength.asInstanceOf[js.Any])
    if (SessionNumber != null) __obj.updateDynamic("SessionNumber")(SessionNumber.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TrafficMirrorFilterId != null) __obj.updateDynamic("TrafficMirrorFilterId")(TrafficMirrorFilterId.asInstanceOf[js.Any])
    if (TrafficMirrorSessionId != null) __obj.updateDynamic("TrafficMirrorSessionId")(TrafficMirrorSessionId.asInstanceOf[js.Any])
    if (TrafficMirrorTargetId != null) __obj.updateDynamic("TrafficMirrorTargetId")(TrafficMirrorTargetId.asInstanceOf[js.Any])
    if (VirtualNetworkId != null) __obj.updateDynamic("VirtualNetworkId")(VirtualNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficMirrorSession]
  }
}

