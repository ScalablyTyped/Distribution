package typings.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEventTypesRequest extends js.Object {
  /**
    * The filters to use to return information by service or resource type.
    */
  var Filters: js.UndefOr[ListEventTypesFilters] = js.native
  /**
    * A non-negative integer used to limit the number of returned results. The default number is 50. The maximum number of results that can be returned is 100.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.codestarnotificationsMod.MaxResults] = js.native
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.codestarnotificationsMod.NextToken] = js.native
}

object ListEventTypesRequest {
  @scala.inline
  def apply(
    Filters: ListEventTypesFilters = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): ListEventTypesRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEventTypesRequest]
  }
}

