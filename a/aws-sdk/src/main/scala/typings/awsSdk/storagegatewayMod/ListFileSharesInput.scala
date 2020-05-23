package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFileSharesInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the gateway whose file shares you want to list. If this field is not present, all file shares under your account are listed.
    */
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
  /**
    * The maximum number of file shares to return in the response. The value must be an integer with a value greater than zero. Optional.
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.native
  /**
    * Opaque pagination token returned from a previous ListFileShares operation. If present, Marker specifies where to continue the list from after a previous call to ListFileShares. Optional.
    */
  var Marker: js.UndefOr[typings.awsSdk.storagegatewayMod.Marker] = js.native
}

object ListFileSharesInput {
  @scala.inline
  def apply(
    GatewayARN: GatewayARN = null,
    Limit: js.UndefOr[PositiveIntObject] = js.undefined,
    Marker: Marker = null
  ): ListFileSharesInput = {
    val __obj = js.Dynamic.literal()
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFileSharesInput]
  }
}

