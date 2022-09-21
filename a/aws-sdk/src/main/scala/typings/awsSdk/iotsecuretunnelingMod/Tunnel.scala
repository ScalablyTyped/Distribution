package typings.awsSdk.iotsecuretunnelingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tunnel extends StObject {
  
  /**
    * The time when the tunnel was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A description of the tunnel.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The destination configuration that specifies the thing name of the destination device and a service name that the local proxy uses to connect to the destination application.
    */
  var destinationConfig: js.UndefOr[DestinationConfig] = js.undefined
  
  /**
    * The connection state of the destination application.
    */
  var destinationConnectionState: js.UndefOr[ConnectionState] = js.undefined
  
  /**
    * The last time the tunnel was updated.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The connection state of the source application.
    */
  var sourceConnectionState: js.UndefOr[ConnectionState] = js.undefined
  
  /**
    * The status of a tunnel. Valid values are: Open and Closed.
    */
  var status: js.UndefOr[TunnelStatus] = js.undefined
  
  /**
    * A list of tag metadata associated with the secure tunnel.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * Timeout configuration for the tunnel.
    */
  var timeoutConfig: js.UndefOr[TimeoutConfig] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a tunnel.
    */
  var tunnelArn: js.UndefOr[TunnelArn] = js.undefined
  
  /**
    * A unique alpha-numeric ID that identifies a tunnel.
    */
  var tunnelId: js.UndefOr[TunnelId] = js.undefined
}
object Tunnel {
  
  inline def apply(): Tunnel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tunnel]
  }
  
  extension [Self <: Tunnel](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDestinationConfig(value: DestinationConfig): Self = StObject.set(x, "destinationConfig", value.asInstanceOf[js.Any])
    
    inline def setDestinationConfigUndefined: Self = StObject.set(x, "destinationConfig", js.undefined)
    
    inline def setDestinationConnectionState(value: ConnectionState): Self = StObject.set(x, "destinationConnectionState", value.asInstanceOf[js.Any])
    
    inline def setDestinationConnectionStateUndefined: Self = StObject.set(x, "destinationConnectionState", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setSourceConnectionState(value: ConnectionState): Self = StObject.set(x, "sourceConnectionState", value.asInstanceOf[js.Any])
    
    inline def setSourceConnectionStateUndefined: Self = StObject.set(x, "sourceConnectionState", js.undefined)
    
    inline def setStatus(value: TunnelStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTimeoutConfig(value: TimeoutConfig): Self = StObject.set(x, "timeoutConfig", value.asInstanceOf[js.Any])
    
    inline def setTimeoutConfigUndefined: Self = StObject.set(x, "timeoutConfig", js.undefined)
    
    inline def setTunnelArn(value: TunnelArn): Self = StObject.set(x, "tunnelArn", value.asInstanceOf[js.Any])
    
    inline def setTunnelArnUndefined: Self = StObject.set(x, "tunnelArn", js.undefined)
    
    inline def setTunnelId(value: TunnelId): Self = StObject.set(x, "tunnelId", value.asInstanceOf[js.Any])
    
    inline def setTunnelIdUndefined: Self = StObject.set(x, "tunnelId", js.undefined)
  }
}
