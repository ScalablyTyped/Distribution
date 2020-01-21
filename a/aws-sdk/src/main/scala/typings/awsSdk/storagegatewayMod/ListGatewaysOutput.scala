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
  def apply(Gateways: Gateways = null, Marker: Marker = null): ListGatewaysOutput = {
    val __obj = js.Dynamic.literal()
    if (Gateways != null) __obj.updateDynamic("Gateways")(Gateways.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGatewaysOutput]
  }
}

