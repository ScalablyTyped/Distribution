package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectionRequest extends StObject {
  
  /**
    * The ID of the second device in the connection.
    */
  var ConnectedDeviceId: DeviceId
  
  /**
    * The ID of the link for the second device.
    */
  var ConnectedLinkId: js.UndefOr[LinkId] = js.undefined
  
  /**
    * A description of the connection. Length Constraints: Maximum length of 256 characters.
    */
  var Description: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The ID of the first device in the connection.
    */
  var DeviceId: typings.awsSdk.networkmanagerMod.DeviceId
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: typings.awsSdk.networkmanagerMod.GlobalNetworkId
  
  /**
    * The ID of the link for the first device.
    */
  var LinkId: js.UndefOr[typings.awsSdk.networkmanagerMod.LinkId] = js.undefined
  
  /**
    * The tags to apply to the resource during creation.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateConnectionRequest {
  
  inline def apply(ConnectedDeviceId: DeviceId, DeviceId: DeviceId, GlobalNetworkId: GlobalNetworkId): CreateConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectedDeviceId = ConnectedDeviceId.asInstanceOf[js.Any], DeviceId = DeviceId.asInstanceOf[js.Any], GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectionRequest]
  }
  
  extension [Self <: CreateConnectionRequest](x: Self) {
    
    inline def setConnectedDeviceId(value: DeviceId): Self = StObject.set(x, "ConnectedDeviceId", value.asInstanceOf[js.Any])
    
    inline def setConnectedLinkId(value: LinkId): Self = StObject.set(x, "ConnectedLinkId", value.asInstanceOf[js.Any])
    
    inline def setConnectedLinkIdUndefined: Self = StObject.set(x, "ConnectedLinkId", js.undefined)
    
    inline def setDescription(value: ConstrainedString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setLinkId(value: LinkId): Self = StObject.set(x, "LinkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "LinkId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
