package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryRetrievalJobDescription extends js.Object {
  /**
    * The end of the date range in UTC for vault inventory retrieval that includes archives created before this date. This value should be a string in the ISO 8601 date format, for example 2013-03-20T17:03:43Z.
    */
  var EndDate: js.UndefOr[DateTime] = js.native
  /**
    * The output format for the vault inventory list, which is set by the InitiateJob request when initiating a job to retrieve a vault inventory. Valid values are CSV and JSON.
    */
  var Format: js.UndefOr[String] = js.native
  /**
    * The maximum number of inventory items returned per vault inventory retrieval request. This limit is set when initiating the job with the a InitiateJob request. 
    */
  var Limit: js.UndefOr[String] = js.native
  /**
    * An opaque string that represents where to continue pagination of the vault inventory retrieval results. You use the marker in a new InitiateJob request to obtain additional inventory items. If there are no more inventory items, this value is null. For more information, see  Range Inventory Retrieval.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The start of the date range in Universal Coordinated Time (UTC) for vault inventory retrieval that includes archives created on or after this date. This value should be a string in the ISO 8601 date format, for example 2013-03-20T17:03:43Z.
    */
  var StartDate: js.UndefOr[DateTime] = js.native
}

object InventoryRetrievalJobDescription {
  @scala.inline
  def apply(): InventoryRetrievalJobDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryRetrievalJobDescription]
  }
  @scala.inline
  implicit class InventoryRetrievalJobDescriptionOps[Self <: InventoryRetrievalJobDescription] (val x: Self) extends AnyVal {
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
    def setEndDate(value: DateTime): Self = this.set("EndDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("EndDate", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("Format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("Format", js.undefined)
    @scala.inline
    def setLimit(value: String): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setStartDate(value: DateTime): Self = this.set("StartDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("StartDate", js.undefined)
  }
  
}

