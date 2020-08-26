package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePatchGroupsRequest extends js.Object {
  /**
    * One or more filters. Use a filter to return a more specific list of results. For DescribePatchGroups,valid filter keys include the following:    NAME_PREFIX: The name of the patch group. Wildcards (*) are accepted.    OPERATING_SYSTEM: The supported operating system type to return results for. For valid operating system values, see GetDefaultPatchBaselineRequest$OperatingSystem in CreatePatchBaseline. Examples:    --filters Key=NAME_PREFIX,Values=MyPatchGroup*     --filters Key=OPERATING_SYSTEM,Values=AMAZON_LINUX_2     
    */
  var Filters: js.UndefOr[PatchOrchestratorFilterList] = js.native
  /**
    * The maximum number of patch groups to return (per page).
    */
  var MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}

object DescribePatchGroupsRequest {
  @scala.inline
  def apply(): DescribePatchGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePatchGroupsRequest]
  }
  @scala.inline
  implicit class DescribePatchGroupsRequestOps[Self <: DescribePatchGroupsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFiltersVarargs(value: PatchOrchestratorFilter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: PatchOrchestratorFilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setMaxResults(value: PatchBaselineMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

