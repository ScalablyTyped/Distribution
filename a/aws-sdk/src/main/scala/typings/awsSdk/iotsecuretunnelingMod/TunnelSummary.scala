package typings.awsSdk.iotsecuretunnelingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TunnelSummary extends StObject {
  
  /**
    * The time the tunnel was created.
    */
  var createdAt: js.UndefOr[DateType] = js.undefined
  
  /**
    * A description of the tunnel.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The time the tunnel was last updated.
    */
  var lastUpdatedAt: js.UndefOr[DateType] = js.undefined
  
  /**
    * The status of a tunnel. Valid values are: Open and Closed.
    */
  var status: js.UndefOr[TunnelStatus] = js.undefined
  
  /**
    * The Amazon Resource Name of the tunnel. The tunnel ARN format is arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt; 
    */
  var tunnelArn: js.UndefOr[TunnelArn] = js.undefined
  
  /**
    * The unique alpha-numeric identifier for the tunnel.
    */
  var tunnelId: js.UndefOr[TunnelId] = js.undefined
}
object TunnelSummary {
  
  @scala.inline
  def apply(): TunnelSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TunnelSummary]
  }
  
  @scala.inline
  implicit class TunnelSummaryMutableBuilder[Self <: TunnelSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: DateType): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLastUpdatedAt(value: DateType): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    @scala.inline
    def setStatus(value: TunnelStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
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
