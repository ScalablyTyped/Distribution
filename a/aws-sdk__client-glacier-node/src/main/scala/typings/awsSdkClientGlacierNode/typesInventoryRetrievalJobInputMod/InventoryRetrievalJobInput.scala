package typings.awsSdkClientGlacierNode.typesInventoryRetrievalJobInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryRetrievalJobInput extends js.Object {
  /**
    * <p>The end of the date range in UTC for vault inventory retrieval that includes archives created before this date. This value should be a string in the ISO 8601 date format, for example <code>2013-03-20T17:03:43Z</code>.</p>
    */
  var EndDate: js.UndefOr[String] = js.native
  /**
    * <p>Specifies the maximum number of inventory items returned per vault inventory retrieval request. Valid values are greater than or equal to 1.</p>
    */
  var Limit: js.UndefOr[String] = js.native
  /**
    * <p>An opaque string that represents where to continue pagination of the vault inventory retrieval results. You use the marker in a new <b>InitiateJob</b> request to obtain additional inventory items. If there are no more inventory items, this value is <code>null</code>.</p>
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * <p>The start of the date range in UTC for vault inventory retrieval that includes archives created on or after this date. This value should be a string in the ISO 8601 date format, for example <code>2013-03-20T17:03:43Z</code>.</p>
    */
  var StartDate: js.UndefOr[String] = js.native
}

object InventoryRetrievalJobInput {
  @scala.inline
  def apply(): InventoryRetrievalJobInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryRetrievalJobInput]
  }
  @scala.inline
  implicit class InventoryRetrievalJobInputOps[Self <: InventoryRetrievalJobInput] (val x: Self) extends AnyVal {
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
    def setEndDate(value: String): Self = this.set("EndDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("EndDate", js.undefined)
    @scala.inline
    def setLimit(value: String): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setStartDate(value: String): Self = this.set("StartDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("StartDate", js.undefined)
  }
  
}

