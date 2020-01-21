package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(endpointDetails: EndpointDetailsList, tags: TagsMap = null): CreateDataflowEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(endpointDetails = endpointDetails.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataflowEndpointGroupRequest]
  }
}

