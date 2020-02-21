package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFindingsRequest extends js.Object {
  /**
    * The finding attributes used to define a condition to filter the returned findings.
    */
  var Filters: js.UndefOr[AwsSecurityFindingFilters] = js.native
  /**
    * The maximum number of findings to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.securityhubMod.MaxResults] = js.native
  /**
    * The token that is required for pagination. On your first call to the GetFindings operation, set the value of this parameter to NULL. For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value returned from the previous response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.native
  /**
    * The finding attributes used to sort the list of returned findings.
    */
  var SortCriteria: js.UndefOr[typings.awsSdk.securityhubMod.SortCriteria] = js.native
}

object GetFindingsRequest {
  @scala.inline
  def apply(
    Filters: AwsSecurityFindingFilters = null,
    MaxResults: Int | scala.Double = null,
    NextToken: NextToken = null,
    SortCriteria: SortCriteria = null
  ): GetFindingsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SortCriteria != null) __obj.updateDynamic("SortCriteria")(SortCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsRequest]
  }
}

