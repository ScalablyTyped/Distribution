package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionIdList extends js.Object {
  /**
    * A flag that indicates whether more distribution IDs remain to be listed. If your results were truncated, you can make a subsequent request using the Marker request field to retrieve more distribution IDs in the list.
    */
  var IsTruncated: Boolean = js.native
  /**
    * Contains the distribution IDs in the list.
    */
  var Items: js.UndefOr[DistributionIdListSummary] = js.native
  /**
    * The value provided in the Marker request field.
    */
  var Marker: String = js.native
  /**
    * The maximum number of distribution IDs requested.
    */
  var MaxItems: integer = js.native
  /**
    * Contains the value that you should use in the Marker field of a subsequent request to continue listing distribution IDs where you left off.
    */
  var NextMarker: js.UndefOr[String] = js.native
  /**
    * The total number of distribution IDs returned in the response.
    */
  var Quantity: integer = js.native
}

object DistributionIdList {
  @scala.inline
  def apply(IsTruncated: Boolean, Marker: String, MaxItems: integer, Quantity: integer): DistributionIdList = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated.asInstanceOf[js.Any], Marker = Marker.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionIdList]
  }
  @scala.inline
  implicit class DistributionIdListOps[Self <: DistributionIdList] (val x: Self) extends AnyVal {
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
    def setIsTruncated(value: Boolean): Self = this.set("IsTruncated", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxItems(value: integer): Self = this.set("MaxItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuantity(value: integer): Self = this.set("Quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: String*): Self = this.set("Items", js.Array(value :_*))
    @scala.inline
    def setItems(value: DistributionIdListSummary): Self = this.set("Items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("Items", js.undefined)
    @scala.inline
    def setNextMarker(value: String): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
  }
  
}

