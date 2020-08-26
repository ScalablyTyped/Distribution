package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGatewaysOutput extends js.Object {
  /**
    * An array of GatewayInfo objects.
    */
  var Gateways: js.UndefOr[typings.awsSdk.storagegatewayMod.Gateways] = js.native
  /**
    * Use the marker in your next request to fetch the next set of gateways in the list. If there are no more gateways to list, this field does not appear in the response.
    */
  var Marker: js.UndefOr[typings.awsSdk.storagegatewayMod.Marker] = js.native
}

object ListGatewaysOutput {
  @scala.inline
  def apply(): ListGatewaysOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGatewaysOutput]
  }
  @scala.inline
  implicit class ListGatewaysOutputOps[Self <: ListGatewaysOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGatewaysVarargs(value: GatewayInfo*): Self = this.set("Gateways", js.Array(value :_*))
    @scala.inline
    def setGateways(value: Gateways): Self = this.set("Gateways", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGateways: Self = this.set("Gateways", js.undefined)
    @scala.inline
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
  
}

