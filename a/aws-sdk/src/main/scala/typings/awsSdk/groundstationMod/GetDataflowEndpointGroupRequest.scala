package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataflowEndpointGroupRequest extends js.Object {
  /**
    * UUID of a dataflow endpoint group.
    */
  var dataflowEndpointGroupId: String = js.native
}

object GetDataflowEndpointGroupRequest {
  @scala.inline
  def apply(dataflowEndpointGroupId: String): GetDataflowEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(dataflowEndpointGroupId = dataflowEndpointGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataflowEndpointGroupRequest]
  }
  @scala.inline
  implicit class GetDataflowEndpointGroupRequestOps[Self <: GetDataflowEndpointGroupRequest] (val x: Self) extends AnyVal {
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
    def setDataflowEndpointGroupId(value: String): Self = this.set("dataflowEndpointGroupId", value.asInstanceOf[js.Any])
  }
  
}

