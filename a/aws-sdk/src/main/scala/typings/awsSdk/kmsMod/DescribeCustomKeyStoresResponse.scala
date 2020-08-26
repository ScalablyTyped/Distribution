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
  def apply(): DescribeCustomKeyStoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCustomKeyStoresResponse]
  }
  @scala.inline
  implicit class DescribeCustomKeyStoresResponseOps[Self <: DescribeCustomKeyStoresResponse] (val x: Self) extends AnyVal {
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
    def setCustomKeyStoresVarargs(value: CustomKeyStoresListEntry*): Self = this.set("CustomKeyStores", js.Array(value :_*))
    @scala.inline
    def setCustomKeyStores(value: CustomKeyStoresList): Self = this.set("CustomKeyStores", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomKeyStores: Self = this.set("CustomKeyStores", js.undefined)
    @scala.inline
    def setNextMarker(value: MarkerType): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
    @scala.inline
    def setTruncated(value: BooleanType): Self = this.set("Truncated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTruncated: Self = this.set("Truncated", js.undefined)
  }
  
}

