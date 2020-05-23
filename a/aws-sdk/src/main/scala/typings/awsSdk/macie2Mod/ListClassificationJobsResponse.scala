package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListClassificationJobsResponse extends js.Object {
  /**
    * An array of objects, one for each job that meets the filter criteria specified in the request.
    */
  var items: js.UndefOr[listOfJobSummary] = js.native
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var nextToken: js.UndefOr[string] = js.native
}

object ListClassificationJobsResponse {
  @scala.inline
  def apply(items: listOfJobSummary = null, nextToken: string = null): ListClassificationJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListClassificationJobsResponse]
  }
}

