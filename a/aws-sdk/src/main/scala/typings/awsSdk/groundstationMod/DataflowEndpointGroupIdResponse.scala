package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataflowEndpointGroupIdResponse extends js.Object {
  /**
    * UUID of a dataflow endpoint group.
    */
  var dataflowEndpointGroupId: js.UndefOr[String] = js.native
}

object DataflowEndpointGroupIdResponse {
  @scala.inline
  def apply(): DataflowEndpointGroupIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataflowEndpointGroupIdResponse]
  }
  @scala.inline
  implicit class DataflowEndpointGroupIdResponseOps[Self <: DataflowEndpointGroupIdResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteDataflowEndpointGroupId: Self = this.set("dataflowEndpointGroupId", js.undefined)
  }
  
}

