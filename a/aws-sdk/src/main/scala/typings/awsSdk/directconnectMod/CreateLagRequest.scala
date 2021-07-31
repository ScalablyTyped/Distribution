package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLagRequest extends StObject {
  
  /**
    * The tags to associate with the automtically created LAGs.
    */
  var childConnectionTags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of an existing dedicated connection to migrate to the LAG.
    */
  var connectionId: js.UndefOr[ConnectionId] = js.undefined
  
  /**
    * The bandwidth of the individual physical dedicated connections bundled by the LAG. The possible values are 1Gbps and 10Gbps. 
    */
  var connectionsBandwidth: Bandwidth
  
  /**
    * The name of the LAG.
    */
  var lagName: LagName
  
  /**
    * The location for the LAG.
    */
  var location: LocationCode
  
  /**
    * The number of physical dedicated connections initially provisioned and bundled by the LAG.
    */
  var numberOfConnections: Count
  
  /**
    * The name of the service provider associated with the LAG.
    */
  var providerName: js.UndefOr[ProviderName] = js.undefined
  
  /**
    * The tags to associate with the LAG.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateLagRequest {
  
  @scala.inline
  def apply(
    connectionsBandwidth: Bandwidth,
    lagName: LagName,
    location: LocationCode,
    numberOfConnections: Count
  ): CreateLagRequest = {
    val __obj = js.Dynamic.literal(connectionsBandwidth = connectionsBandwidth.asInstanceOf[js.Any], lagName = lagName.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], numberOfConnections = numberOfConnections.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLagRequest]
  }
  
  @scala.inline
  implicit class CreateLagRequestMutableBuilder[Self <: CreateLagRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildConnectionTags(value: TagList): Self = StObject.set(x, "childConnectionTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildConnectionTagsUndefined: Self = StObject.set(x, "childConnectionTags", js.undefined)
    
    @scala.inline
    def setChildConnectionTagsVarargs(value: Tag*): Self = StObject.set(x, "childConnectionTags", js.Array(value :_*))
    
    @scala.inline
    def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
    
    @scala.inline
    def setConnectionsBandwidth(value: Bandwidth): Self = StObject.set(x, "connectionsBandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLagName(value: LagName): Self = StObject.set(x, "lagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: LocationCode): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfConnections(value: Count): Self = StObject.set(x, "numberOfConnections", value.asInstanceOf[js.Any])
    
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
