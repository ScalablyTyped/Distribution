package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTapesInput extends js.Object {
  /**
    * An optional number limit for the tapes in the list returned by this call.
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.native
  /**
    * A string that indicates the position at which to begin the returned list of tapes.
    */
  var Marker: js.UndefOr[typings.awsSdk.storagegatewayMod.Marker] = js.native
  var TapeARNs: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeARNs] = js.native
}

object ListTapesInput {
  @scala.inline
  def apply(
    Limit: js.UndefOr[PositiveIntObject] = js.undefined,
    Marker: Marker = null,
    TapeARNs: TapeARNs = null
  ): ListTapesInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (TapeARNs != null) __obj.updateDynamic("TapeARNs")(TapeARNs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTapesInput]
  }
}

