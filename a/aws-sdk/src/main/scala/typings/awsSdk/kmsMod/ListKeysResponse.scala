package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListKeysResponse extends js.Object {
  /**
    * A list of customer master keys (CMKs).
    */
  var Keys: js.UndefOr[KeyList] = js.native
  /**
    * When Truncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent request.
    */
  var NextMarker: js.UndefOr[MarkerType] = js.native
  /**
    * A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the NextMarker element in thisresponse to the Marker parameter in a subsequent request.
    */
  var Truncated: js.UndefOr[BooleanType] = js.native
}

object ListKeysResponse {
  @scala.inline
  def apply(
    Keys: KeyList = null,
    NextMarker: MarkerType = null,
    Truncated: js.UndefOr[BooleanType] = js.undefined
  ): ListKeysResponse = {
    val __obj = js.Dynamic.literal()
    if (Keys != null) __obj.updateDynamic("Keys")(Keys.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    if (!js.isUndefined(Truncated)) __obj.updateDynamic("Truncated")(Truncated.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListKeysResponse]
  }
}

