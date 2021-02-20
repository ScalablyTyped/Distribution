package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyTrafficMirrorSessionRequest extends StObject {
  
  /**
    * The description to assign to the Traffic Mirror session.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of bytes in each packet to mirror. These are bytes after the VXLAN header. To mirror a subset, set this to the length (in bytes) to mirror. For example, if you set this value to 100, then the first 100 bytes that meet the filter criteria are copied to the target. Do not specify this parameter when you want to mirror the entire packet.
    */
  var PacketLength: js.UndefOr[Integer] = js.native
  
  /**
    * The properties that you want to remove from the Traffic Mirror session. When you remove a property from a Traffic Mirror session, the property is set to the default.
    */
  var RemoveFields: js.UndefOr[TrafficMirrorSessionFieldList] = js.native
  
  /**
    * The session number determines the order in which sessions are evaluated when an interface is used by multiple sessions. The first session with a matching filter is the one that mirrors the packets. Valid values are 1-32766.
    */
  var SessionNumber: js.UndefOr[Integer] = js.native
  
  /**
    * The ID of the Traffic Mirror filter.
    */
  var TrafficMirrorFilterId: js.UndefOr[typings.awsSdk.ec2Mod.TrafficMirrorFilterId] = js.native
  
  /**
    * The ID of the Traffic Mirror session.
    */
  var TrafficMirrorSessionId: typings.awsSdk.ec2Mod.TrafficMirrorSessionId = js.native
  
  /**
    * The Traffic Mirror target. The target must be in the same VPC as the source, or have a VPC peering connection with the source.
    */
  var TrafficMirrorTargetId: js.UndefOr[typings.awsSdk.ec2Mod.TrafficMirrorTargetId] = js.native
  
  /**
    * The virtual network ID of the Traffic Mirror session.
    */
  var VirtualNetworkId: js.UndefOr[Integer] = js.native
}
object ModifyTrafficMirrorSessionRequest {
  
  @scala.inline
  def apply(TrafficMirrorSessionId: TrafficMirrorSessionId): ModifyTrafficMirrorSessionRequest = {
    val __obj = js.Dynamic.literal(TrafficMirrorSessionId = TrafficMirrorSessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyTrafficMirrorSessionRequest]
  }
  
  @scala.inline
  implicit class ModifyTrafficMirrorSessionRequestMutableBuilder[Self <: ModifyTrafficMirrorSessionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setPacketLength(value: Integer): Self = StObject.set(x, "PacketLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketLengthUndefined: Self = StObject.set(x, "PacketLength", js.undefined)
    
    @scala.inline
    def setRemoveFields(value: TrafficMirrorSessionFieldList): Self = StObject.set(x, "RemoveFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveFieldsUndefined: Self = StObject.set(x, "RemoveFields", js.undefined)
    
    @scala.inline
    def setRemoveFieldsVarargs(value: TrafficMirrorSessionField*): Self = StObject.set(x, "RemoveFields", js.Array(value :_*))
    
    @scala.inline
    def setSessionNumber(value: Integer): Self = StObject.set(x, "SessionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionNumberUndefined: Self = StObject.set(x, "SessionNumber", js.undefined)
    
    @scala.inline
    def setTrafficMirrorFilterId(value: TrafficMirrorFilterId): Self = StObject.set(x, "TrafficMirrorFilterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficMirrorFilterIdUndefined: Self = StObject.set(x, "TrafficMirrorFilterId", js.undefined)
    
    @scala.inline
    def setTrafficMirrorSessionId(value: TrafficMirrorSessionId): Self = StObject.set(x, "TrafficMirrorSessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficMirrorTargetId(value: TrafficMirrorTargetId): Self = StObject.set(x, "TrafficMirrorTargetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficMirrorTargetIdUndefined: Self = StObject.set(x, "TrafficMirrorTargetId", js.undefined)
    
    @scala.inline
    def setVirtualNetworkId(value: Integer): Self = StObject.set(x, "VirtualNetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualNetworkIdUndefined: Self = StObject.set(x, "VirtualNetworkId", js.undefined)
  }
}
