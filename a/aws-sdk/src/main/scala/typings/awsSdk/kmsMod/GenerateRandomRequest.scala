package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateRandomRequest extends js.Object {
  /**
    * Generates the random byte string in the AWS CloudHSM cluster that is associated with the specified custom key store. To find the ID of a custom key store, use the DescribeCustomKeyStores operation.
    */
  var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.native
  /**
    * The length of the byte string.
    */
  var NumberOfBytes: js.UndefOr[NumberOfBytesType] = js.native
}

object GenerateRandomRequest {
  @scala.inline
  def apply(
    CustomKeyStoreId: CustomKeyStoreIdType = null,
    NumberOfBytes: js.UndefOr[NumberOfBytesType] = js.undefined
  ): GenerateRandomRequest = {
    val __obj = js.Dynamic.literal()
    if (CustomKeyStoreId != null) __obj.updateDynamic("CustomKeyStoreId")(CustomKeyStoreId.asInstanceOf[js.Any])
    if (!js.isUndefined(NumberOfBytes)) __obj.updateDynamic("NumberOfBytes")(NumberOfBytes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateRandomRequest]
  }
}

