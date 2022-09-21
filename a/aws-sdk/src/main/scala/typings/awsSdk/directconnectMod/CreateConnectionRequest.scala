package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectionRequest extends StObject {
  
  /**
    * The bandwidth of the connection.
    */
  var bandwidth: Bandwidth
  
  /**
    * The name of the connection.
    */
  var connectionName: ConnectionName
  
  /**
    * The ID of the LAG.
    */
  var lagId: js.UndefOr[LagId] = js.undefined
  
  /**
    * The location of the connection.
    */
  var location: LocationCode
  
  /**
    * The name of the service provider associated with the requested connection.
    */
  var providerName: js.UndefOr[ProviderName] = js.undefined
  
  /**
    * Indicates whether you want the connection to support MAC Security (MACsec). MAC Security (MACsec) is only available on dedicated connections. For information about MAC Security (MACsec) prerequisties, see MACsec prerequisties in the Direct Connect User Guide.
    */
  var requestMACSec: js.UndefOr[RequestMACSec] = js.undefined
  
  /**
    * The tags to associate with the lag.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateConnectionRequest {
  
  inline def apply(bandwidth: Bandwidth, connectionName: ConnectionName, location: LocationCode): CreateConnectionRequest = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], connectionName = connectionName.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectionRequest]
  }
  
  extension [Self <: CreateConnectionRequest](x: Self) {
    
    inline def setBandwidth(value: Bandwidth): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    inline def setConnectionName(value: ConnectionName): Self = StObject.set(x, "connectionName", value.asInstanceOf[js.Any])
    
    inline def setLagId(value: LagId): Self = StObject.set(x, "lagId", value.asInstanceOf[js.Any])
    
    inline def setLagIdUndefined: Self = StObject.set(x, "lagId", js.undefined)
    
    inline def setLocation(value: LocationCode): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setProviderName(value: ProviderName): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
    
    inline def setProviderNameUndefined: Self = StObject.set(x, "providerName", js.undefined)
    
    inline def setRequestMACSec(value: RequestMACSec): Self = StObject.set(x, "requestMACSec", value.asInstanceOf[js.Any])
    
    inline def setRequestMACSecUndefined: Self = StObject.set(x, "requestMACSec", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
