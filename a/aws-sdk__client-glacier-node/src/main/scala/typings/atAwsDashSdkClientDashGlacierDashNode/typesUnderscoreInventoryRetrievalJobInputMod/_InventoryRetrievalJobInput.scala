package typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreInventoryRetrievalJobInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InventoryRetrievalJobInput extends js.Object {
  /**
    * <p>The end of the date range in UTC for vault inventory retrieval that includes archives created before this date. This value should be a string in the ISO 8601 date format, for example <code>2013-03-20T17:03:43Z</code>.</p>
    */
  var EndDate: js.UndefOr[String] = js.undefined
  /**
    * <p>Specifies the maximum number of inventory items returned per vault inventory retrieval request. Valid values are greater than or equal to 1.</p>
    */
  var Limit: js.UndefOr[String] = js.undefined
  /**
    * <p>An opaque string that represents where to continue pagination of the vault inventory retrieval results. You use the marker in a new <b>InitiateJob</b> request to obtain additional inventory items. If there are no more inventory items, this value is <code>null</code>.</p>
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * <p>The start of the date range in UTC for vault inventory retrieval that includes archives created on or after this date. This value should be a string in the ISO 8601 date format, for example <code>2013-03-20T17:03:43Z</code>.</p>
    */
  var StartDate: js.UndefOr[String] = js.undefined
}

object _InventoryRetrievalJobInput {
  @scala.inline
  def apply(EndDate: String = null, Limit: String = null, Marker: String = null, StartDate: String = null): _InventoryRetrievalJobInput = {
    val __obj = js.Dynamic.literal()
    if (EndDate != null) __obj.updateDynamic("EndDate")(EndDate.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (StartDate != null) __obj.updateDynamic("StartDate")(StartDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[_InventoryRetrievalJobInput]
  }
}

