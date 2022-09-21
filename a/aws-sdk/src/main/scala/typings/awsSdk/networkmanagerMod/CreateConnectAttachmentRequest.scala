package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectAttachmentRequest extends StObject {
  
  /**
    * The client token associated with the request.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.networkmanagerMod.ClientToken] = js.undefined
  
  /**
    * The ID of a core network where you want to create the attachment. 
    */
  var CoreNetworkId: typings.awsSdk.networkmanagerMod.CoreNetworkId
  
  /**
    * The Region where the edge is located.
    */
  var EdgeLocation: ExternalRegionCode
  
  /**
    * Options for creating an attachment.
    */
  var Options: ConnectAttachmentOptions
  
  /**
    * The list of key-value tags associated with the request.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the attachment between the two connections.
    */
  var TransportAttachmentId: AttachmentId
}
object CreateConnectAttachmentRequest {
  
  inline def apply(
    CoreNetworkId: CoreNetworkId,
    EdgeLocation: ExternalRegionCode,
    Options: ConnectAttachmentOptions,
    TransportAttachmentId: AttachmentId
  ): CreateConnectAttachmentRequest = {
    val __obj = js.Dynamic.literal(CoreNetworkId = CoreNetworkId.asInstanceOf[js.Any], EdgeLocation = EdgeLocation.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], TransportAttachmentId = TransportAttachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectAttachmentRequest]
  }
  
  extension [Self <: CreateConnectAttachmentRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setCoreNetworkId(value: CoreNetworkId): Self = StObject.set(x, "CoreNetworkId", value.asInstanceOf[js.Any])
    
    inline def setEdgeLocation(value: ExternalRegionCode): Self = StObject.set(x, "EdgeLocation", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ConnectAttachmentOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTransportAttachmentId(value: AttachmentId): Self = StObject.set(x, "TransportAttachmentId", value.asInstanceOf[js.Any])
  }
}
