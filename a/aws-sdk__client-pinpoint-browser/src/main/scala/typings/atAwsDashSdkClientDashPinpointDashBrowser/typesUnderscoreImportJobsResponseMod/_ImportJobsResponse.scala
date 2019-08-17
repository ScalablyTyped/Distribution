package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreImportJobsResponseMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreImportJobResponseMod._ImportJobResponse
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ImportJobsResponse extends js.Object {
  /**
    * A list of import jobs for the application.
    */
  var Item: js.UndefOr[js.Array[_ImportJobResponse] | Iterable[_ImportJobResponse]] = js.undefined
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object _ImportJobsResponse {
  @scala.inline
  def apply(Item: js.Array[_ImportJobResponse] | Iterable[_ImportJobResponse] = null, NextToken: String = null): _ImportJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[_ImportJobsResponse]
  }
}

