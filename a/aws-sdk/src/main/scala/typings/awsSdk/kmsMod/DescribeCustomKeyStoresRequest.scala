package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCustomKeyStoresRequest extends js.Object {
  /**
    * Gets only information about the specified custom key store. Enter the key store ID. By default, this operation gets information about all custom key stores in the account and region. To limit the output to a particular custom key store, you can use either the CustomKeyStoreId or CustomKeyStoreName parameter, but not both.
    */
  var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.native
  /**
    * Gets only information about the specified custom key store. Enter the friendly name of the custom key store. By default, this operation gets information about all custom key stores in the account and region. To limit the output to a particular custom key store, you can use either the CustomKeyStoreId or CustomKeyStoreName parameter, but not both.
    */
  var CustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType] = js.native
  /**
    * Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS does not return more than the specified number of items, but it might return fewer.
    */
  var Limit: js.UndefOr[LimitType] = js.native
  /**
    * Use this parameter in a subsequent request after you receive a response with truncated results. Set it to the value of NextMarker from the truncated response you just received.
    */
  var Marker: js.UndefOr[MarkerType] = js.native
}

object DescribeCustomKeyStoresRequest {
  @scala.inline
  def apply(
    CustomKeyStoreId: CustomKeyStoreIdType = null,
    CustomKeyStoreName: CustomKeyStoreNameType = null,
    Limit: Int | Double = null,
    Marker: MarkerType = null
  ): DescribeCustomKeyStoresRequest = {
    val __obj = js.Dynamic.literal()
    if (CustomKeyStoreId != null) __obj.updateDynamic("CustomKeyStoreId")(CustomKeyStoreId.asInstanceOf[js.Any])
    if (CustomKeyStoreName != null) __obj.updateDynamic("CustomKeyStoreName")(CustomKeyStoreName.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCustomKeyStoresRequest]
  }
}

