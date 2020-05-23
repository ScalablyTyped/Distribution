package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCustomKeyStoresResponse extends js.Object {
  /**
    * Contains metadata about each custom key store.
    */
  var CustomKeyStores: js.UndefOr[CustomKeyStoresList] = js.native
  /**
    * When Truncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent request.
    */
  var NextMarker: js.UndefOr[MarkerType] = js.native
  /**
    * A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the NextMarker element in thisresponse to the Marker parameter in a subsequent request.
    */
  var Truncated: js.UndefOr[BooleanType] = js.native
}

object DescribeCustomKeyStoresResponse {
  @scala.inline
  def apply(
    CustomKeyStores: CustomKeyStoresList = null,
    NextMarker: MarkerType = null,
    Truncated: js.UndefOr[BooleanType] = js.undefined
  ): DescribeCustomKeyStoresResponse = {
    val __obj = js.Dynamic.literal()
    if (CustomKeyStores != null) __obj.updateDynamic("CustomKeyStores")(CustomKeyStores.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    if (!js.isUndefined(Truncated)) __obj.updateDynamic("Truncated")(Truncated.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCustomKeyStoresResponse]
  }
}

