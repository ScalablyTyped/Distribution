package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTrafficMirrorSessionRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  
  /**
    * The description of the Traffic Mirror session.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the source network interface.
    */
  var NetworkInterfaceId: typings.awsSdk.ec2Mod.NetworkInterfaceId = js.native
  
  /**
    * The number of bytes in each packet to mirror. These are bytes after the VXLAN header. Do not specify this parameter when you want to mirror the entire packet. To mirror a subset of the packet, set this to the length (in bytes) that you want to mirror. For example, if you set this value to 100, then the first 100 bytes that meet the filter criteria are copied to the target. If you do not want to mirror the entire packet, use the PacketLength parameter to specify the number of bytes in each packet to mirror.
    */
  var PacketLength: js.UndefOr[Integer] = js.native
  
  /**
    * The session number determines the order in which sessions are evaluated when an interface is used by multiple sessions. The first session with a matching filter is the one that mirrors the packets. Valid values are 1-32766.
    */
  var SessionNumber: Integer = js.native
  
  /**
    * The tags to assign to a Traffic Mirror session.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  
  /**
    * The ID of the Traffic Mirror filter.
    */
  var TrafficMirrorFilterId: typings.awsSdk.ec2Mod.TrafficMirrorFilterId = js.native
  
  /**
    * The ID of the Traffic Mirror target.
    */
  var TrafficMirrorTargetId: typings.awsSdk.ec2Mod.TrafficMirrorTargetId = js.native
  
  /**
    * The VXLAN ID for the Traffic Mirror session. For more information about the VXLAN protocol, see RFC 7348. If you do not specify a VirtualNetworkId, an account-wide unique id is chosen at random.
    */
  var VirtualNetworkId: js.UndefOr[Integer] = js.native
}
object CreateTrafficMirrorSessionRequest {
  
  @scala.inline
  def apply(
    NetworkInterfaceId: NetworkInterfaceId,
    SessionNumber: Integer,
    TrafficMirrorFilterId: TrafficMirrorFilterId,
    TrafficMirrorTargetId: TrafficMirrorTargetId
  ): CreateTrafficMirrorSessionRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any], SessionNumber = SessionNumber.asInstanceOf[js.Any], TrafficMirrorFilterId = TrafficMirrorFilterId.asInstanceOf[js.Any], TrafficMirrorTargetId = TrafficMirrorTargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrafficMirrorSessionRequest]
  }
  
  @scala.inline
  implicit class CreateTrafficMirrorSessionRequestMutableBuilder[Self <: CreateTrafficMirrorSessionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketLength(value: Integer): Self = StObject.set(x, "PacketLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketLengthUndefined: Self = StObject.set(x, "PacketLength", js.undefined)
    
    @scala.inline
    def setSessionNumber(value: Integer): Self = StObject.set(x, "SessionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setTrafficMirrorFilterId(value: TrafficMirrorFilterId): Self = StObject.set(x, "TrafficMirrorFilterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficMirrorTargetId(value: TrafficMirrorTargetId): Self = StObject.set(x, "TrafficMirrorTargetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualNetworkId(value: Integer): Self = StObject.set(x, "VirtualNetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualNetworkIdUndefined: Self = StObject.set(x, "VirtualNetworkId", js.undefined)
  }
}
