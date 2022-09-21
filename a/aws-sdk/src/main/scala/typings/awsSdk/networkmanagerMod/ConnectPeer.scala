package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectPeer extends StObject {
  
  /**
    * The configuration of the Connect peer.
    */
  var Configuration: js.UndefOr[ConnectPeerConfiguration] = js.undefined
  
  /**
    * The ID of the attachment to connect.
    */
  var ConnectAttachmentId: js.UndefOr[AttachmentId] = js.undefined
  
  /**
    * The ID of the Connect peer.
    */
  var ConnectPeerId: js.UndefOr[typings.awsSdk.networkmanagerMod.ConnectPeerId] = js.undefined
  
  /**
    * The ID of a core network.
    */
  var CoreNetworkId: js.UndefOr[typings.awsSdk.networkmanagerMod.CoreNetworkId] = js.undefined
  
  /**
    * The timestamp when the Connect peer was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Connect peer Regions where edges are located.
    */
  var EdgeLocation: js.UndefOr[ExternalRegionCode] = js.undefined
  
  /**
    * The state of the Connect peer.
    */
  var State: js.UndefOr[ConnectPeerState] = js.undefined
  
  /**
    * The list of key-value tags associated with the Connect peer.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ConnectPeer {
  
  inline def apply(): ConnectPeer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectPeer]
  }
  
  extension [Self <: ConnectPeer](x: Self) {
    
    inline def setConfiguration(value: ConnectPeerConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    inline def setConnectAttachmentId(value: AttachmentId): Self = StObject.set(x, "ConnectAttachmentId", value.asInstanceOf[js.Any])
    
    inline def setConnectAttachmentIdUndefined: Self = StObject.set(x, "ConnectAttachmentId", js.undefined)
    
    inline def setConnectPeerId(value: ConnectPeerId): Self = StObject.set(x, "ConnectPeerId", value.asInstanceOf[js.Any])
    
    inline def setConnectPeerIdUndefined: Self = StObject.set(x, "ConnectPeerId", js.undefined)
    
    inline def setCoreNetworkId(value: CoreNetworkId): Self = StObject.set(x, "CoreNetworkId", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkIdUndefined: Self = StObject.set(x, "CoreNetworkId", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setEdgeLocation(value: ExternalRegionCode): Self = StObject.set(x, "EdgeLocation", value.asInstanceOf[js.Any])
    
    inline def setEdgeLocationUndefined: Self = StObject.set(x, "EdgeLocation", js.undefined)
    
    inline def setState(value: ConnectPeerState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
