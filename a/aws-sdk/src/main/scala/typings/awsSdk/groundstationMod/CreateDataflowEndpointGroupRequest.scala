package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataflowEndpointGroupRequest extends StObject {
  
  /**
    * Endpoint details of each endpoint in the dataflow endpoint group.
    */
  var endpointDetails: EndpointDetailsList
  
  /**
    * Tags of a dataflow endpoint group.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object CreateDataflowEndpointGroupRequest {
  
  inline def apply(endpointDetails: EndpointDetailsList): CreateDataflowEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(endpointDetails = endpointDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataflowEndpointGroupRequest]
  }
  
  extension [Self <: CreateDataflowEndpointGroupRequest](x: Self) {
    
    inline def setEndpointDetails(value: EndpointDetailsList): Self = StObject.set(x, "endpointDetails", value.asInstanceOf[js.Any])
    
    inline def setEndpointDetailsVarargs(value: EndpointDetails*): Self = StObject.set(x, "endpointDetails", js.Array(value :_*))
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
