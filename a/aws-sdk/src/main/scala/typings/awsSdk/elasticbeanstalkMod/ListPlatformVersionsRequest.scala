package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPlatformVersionsRequest extends js.Object {
  /**
    * Criteria for restricting the resulting list of platform versions. The filter is interpreted as a logical conjunction (AND) of the separate PlatformFilter terms.
    */
  var Filters: js.UndefOr[PlatformFilters] = js.native
  /**
    * The maximum number of platform version values returned in one call.
    */
  var MaxRecords: js.UndefOr[PlatformMaxRecords] = js.native
  /**
    * For a paginated request. Specify a token from a previous response page to retrieve the next response page. All other parameter values must be identical to the ones specified in the initial request. If no NextToken is specified, the first page is retrieved.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object ListPlatformVersionsRequest {
  @scala.inline
  def apply(
    Filters: PlatformFilters = null,
    MaxRecords: js.UndefOr[PlatformMaxRecords] = js.undefined,
    NextToken: Token = null
  ): ListPlatformVersionsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPlatformVersionsRequest]
  }
}

