package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInterconnectRequest extends StObject {
  
  /**
    * The port bandwidth, in Gbps. The possible values are 1 and 10.
    */
  var bandwidth: Bandwidth
  
  /**
    * The name of the interconnect.
    */
  var interconnectName: InterconnectName
  
  /**
    * The ID of the LAG.
    */
  var lagId: js.UndefOr[LagId] = js.undefined
  
  /**
    * The location of the interconnect.
    */
  var location: LocationCode
  
  /**
    * The name of the service provider associated with the interconnect.
    */
  var providerName: js.UndefOr[ProviderName] = js.undefined
  
  /**
    * The tags to associate with the interconnect.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateInterconnectRequest {
  
  @scala.inline
  def apply(bandwidth: Bandwidth, interconnectName: InterconnectName, location: LocationCode): CreateInterconnectRequest = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], interconnectName = interconnectName.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInterconnectRequest]
  }
  
  @scala.inline
  implicit class CreateInterconnectRequestMutableBuilder[Self <: CreateInterconnectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandwidth(value: Bandwidth): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterconnectName(value: InterconnectName): Self = StObject.set(x, "interconnectName", value.asInstanceOf[js.Any])
    
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
