package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDataflowEndpointGroupRequest extends StObject {
  
  /**
    * Endpoint details of each endpoint in the dataflow endpoint group.
    */
  var endpointDetails: EndpointDetailsList = js.native
  
  /**
    * Tags of a dataflow endpoint group.
    */
  var tags: js.UndefOr[TagsMap] = js.native
}
object CreateDataflowEndpointGroupRequest {
  
  @scala.inline
  def apply(endpointDetails: EndpointDetailsList): CreateDataflowEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(endpointDetails = endpointDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataflowEndpointGroupRequest]
  }
  
  @scala.inline
  implicit class CreateDataflowEndpointGroupRequestMutableBuilder[Self <: CreateDataflowEndpointGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointDetails(value: EndpointDetailsList): Self = StObject.set(x, "endpointDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointDetailsVarargs(value: EndpointDetails*): Self = StObject.set(x, "endpointDetails", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
