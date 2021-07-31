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
    * The tags to associate with the lag.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateConnectionRequest {
  
  @scala.inline
  def apply(bandwidth: Bandwidth, connectionName: ConnectionName, location: LocationCode): CreateConnectionRequest = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], connectionName = connectionName.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectionRequest]
  }
  
  @scala.inline
  implicit class CreateConnectionRequestMutableBuilder[Self <: CreateConnectionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandwidth(value: Bandwidth): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionName(value: ConnectionName): Self = StObject.set(x, "connectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLagId(value: LagId): Self = StObject.set(x, "lagId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLagIdUndefined: Self = StObject.set(x, "lagId", js.undefined)
    
    @scala.inline
    def setLocation(value: LocationCode): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderName(value: ProviderName): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderNameUndefined: Self = StObject.set(x, "providerName", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
