package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDatastoresResponse extends js.Object {
  /**
    * A list of "DatastoreSummary" objects.
    */
  var datastoreSummaries: js.UndefOr[DatastoreSummaries] = js.native
  /**
    * The token to retrieve the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDatastoresResponse {
  @scala.inline
  def apply(datastoreSummaries: DatastoreSummaries = null, nextToken: NextToken = null): ListDatastoresResponse = {
    val __obj = js.Dynamic.literal()
    if (datastoreSummaries != null) __obj.updateDynamic("datastoreSummaries")(datastoreSummaries.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDatastoresResponse]
  }
}

