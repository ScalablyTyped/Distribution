package typings.awsSdk.iotsecuretunnelingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tunnel extends StObject {
  
  /**
    * The time when the tunnel was created.
    */
  var createdAt: js.UndefOr[DateType] = js.native
  
  /**
    * A description of the tunnel.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * The destination configuration that specifies the thing name of the destination device and a service name that the local proxy uses to connect to the destination application.
    */
  var destinationConfig: js.UndefOr[DestinationConfig] = js.native
  
  /**
    * The connection state of the destination application.
    */
  var destinationConnectionState: js.UndefOr[ConnectionState] = js.native
  
  /**
    * The last time the tunnel was updated.
    */
  var lastUpdatedAt: js.UndefOr[DateType] = js.native
  
  /**
    * The connection state of the source application.
    */
  var sourceConnectionState: js.UndefOr[ConnectionState] = js.native
  
  /**
    * The status of a tunnel. Valid values are: Open and Closed.
    */
  var status: js.UndefOr[TunnelStatus] = js.native
  
  /**
    * A list of tag metadata associated with the secure tunnel.
    */
  var tags: js.UndefOr[TagList] = js.native
  
  /**
    * Timeout configuration for the tunnel.
    */
  var timeoutConfig: js.UndefOr[TimeoutConfig] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of a tunnel. The tunnel ARN format is arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt; 
    */
  var tunnelArn: js.UndefOr[TunnelArn] = js.native
  
  /**
    * A unique alpha-numeric ID that identifies a tunnel.
    */
  var tunnelId: js.UndefOr[TunnelId] = js.native
}
object Tunnel {
  
  @scala.inline
  def apply(): Tunnel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tunnel]
  }
  
  @scala.inline
  implicit class TunnelMutableBuilder[Self <: Tunnel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: DateType): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDestinationConfig(value: DestinationConfig): Self = StObject.set(x, "destinationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationConfigUndefined: Self = StObject.set(x, "destinationConfig", js.undefined)
    
    @scala.inline
    def setDestinationConnectionState(value: ConnectionState): Self = StObject.set(x, "destinationConnectionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationConnectionStateUndefined: Self = StObject.set(x, "destinationConnectionState", js.undefined)
    
    @scala.inline
    def setLastUpdatedAt(value: DateType): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    @scala.inline
    def setSourceConnectionState(value: ConnectionState): Self = StObject.set(x, "sourceConnectionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceConnectionStateUndefined: Self = StObject.set(x, "sourceConnectionState", js.undefined)
    
    @scala.inline
    def setStatus(value: TunnelStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTimeoutConfig(value: TimeoutConfig): Self = StObject.set(x, "timeoutConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutConfigUndefined: Self = StObject.set(x, "timeoutConfig", js.undefined)
    
    @scala.inline
    def setTunnelArn(value: TunnelArn): Self = StObject.set(x, "tunnelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTunnelArnUndefined: Self = StObject.set(x, "tunnelArn", js.undefined)
    
    @scala.inline
    def setTunnelId(value: TunnelId): Self = StObject.set(x, "tunnelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTunnelIdUndefined: Self = StObject.set(x, "tunnelId", js.undefined)
  }
}
