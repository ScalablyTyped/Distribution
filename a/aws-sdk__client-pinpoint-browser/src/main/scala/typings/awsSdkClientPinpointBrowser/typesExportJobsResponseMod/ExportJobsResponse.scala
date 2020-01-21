package typings.awsSdkClientPinpointBrowser.typesExportJobsResponseMod

import typings.awsSdkClientPinpointBrowser.typesExportJobResponseMod.ExportJobResponse
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportJobsResponse extends js.Object {
  /**
    * A list of export jobs for the application.
    */
  var Item: js.UndefOr[js.Array[ExportJobResponse] | Iterable[ExportJobResponse]] = js.undefined
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ExportJobsResponse {
  @scala.inline
  def apply(Item: js.Array[ExportJobResponse] | Iterable[ExportJobResponse] = null, NextToken: String = null): ExportJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportJobsResponse]
  }
}

