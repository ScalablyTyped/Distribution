package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataflowEndpoint extends js.Object {
  /**
    * Socket address of a dataflow endpoint.
    */
  var address: js.UndefOr[SocketAddress] = js.native
  /**
    * Maximum transmission unit (MTU) size in bytes of a dataflow endpoint.
    */
  var mtu: js.UndefOr[DataflowEndpointmtuInteger] = js.native
  /**
    * Name of a dataflow endpoint.
    */
  var name: js.UndefOr[SafeName] = js.native
  /**
    * Status of a dataflow endpoint.
    */
  var status: js.UndefOr[EndpointStatus] = js.native
}

object DataflowEndpoint {
  @scala.inline
  def apply(): DataflowEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataflowEndpoint]
  }
  @scala.inline
  implicit class DataflowEndpointOps[Self <: DataflowEndpoint] (val x: Self) extends AnyVal {
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
    def setAddress(value: SocketAddress): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setMtu(value: DataflowEndpointmtuInteger): Self = this.set("mtu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMtu: Self = this.set("mtu", js.undefined)
    @scala.inline
    def setName(value: SafeName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStatus(value: EndpointStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

