package typings.awsSdkClientPinpointBrowser.typesImportJobsResponseMod

import typings.awsSdkClientPinpointBrowser.typesImportJobResponseMod.ImportJobResponse
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportJobsResponse extends js.Object {
  /**
    * A list of import jobs for the application.
    */
  var Item: js.UndefOr[js.Array[ImportJobResponse] | Iterable[ImportJobResponse]] = js.undefined
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ImportJobsResponse {
  @scala.inline
  def apply(Item: js.Array[ImportJobResponse] | Iterable[ImportJobResponse] = null, NextToken: String = null): ImportJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportJobsResponse]
  }
}

