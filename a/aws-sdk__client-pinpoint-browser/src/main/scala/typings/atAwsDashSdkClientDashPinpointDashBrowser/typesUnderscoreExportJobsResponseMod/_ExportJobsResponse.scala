package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreExportJobsResponseMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreExportJobResponseMod._ExportJobResponse
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ExportJobsResponse extends js.Object {
  /**
    * A list of export jobs for the application.
    */
  var Item: js.UndefOr[js.Array[_ExportJobResponse] | Iterable[_ExportJobResponse]] = js.undefined
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object _ExportJobsResponse {
  @scala.inline
  def apply(Item: js.Array[_ExportJobResponse] | Iterable[_ExportJobResponse] = null, NextToken: String = null): _ExportJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[_ExportJobsResponse]
  }
}

