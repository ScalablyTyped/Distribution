package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDataflowEndpointGroupRequest extends js.Object {
  
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
  implicit class CreateDataflowEndpointGroupRequestOps[Self <: CreateDataflowEndpointGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndpointDetailsVarargs(value: EndpointDetails*): Self = this.set("endpointDetails", js.Array(value :_*))
    
    @scala.inline
    def setEndpointDetails(value: EndpointDetailsList): Self = this.set("endpointDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagsMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
