package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCostAndUsageWithResourcesResponse extends js.Object {
  /**
    * The groups that are specified by the Filter or GroupBy parameters in the request.
    */
  var GroupDefinitions: js.UndefOr[typings.awsSdk.costexplorerMod.GroupDefinitions] = js.native
  /**
    * The token for the next set of retrievable results. AWS provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.native
  /**
    * The time period that is covered by the results in the response.
    */
  var ResultsByTime: js.UndefOr[typings.awsSdk.costexplorerMod.ResultsByTime] = js.native
}

object GetCostAndUsageWithResourcesResponse {
  @scala.inline
  def apply(): GetCostAndUsageWithResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCostAndUsageWithResourcesResponse]
  }
  @scala.inline
  implicit class GetCostAndUsageWithResourcesResponseOps[Self <: GetCostAndUsageWithResourcesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGroupDefinitionsVarargs(value: GroupDefinition*): Self = this.set("GroupDefinitions", js.Array(value :_*))
    @scala.inline
    def setGroupDefinitions(value: GroupDefinitions): Self = this.set("GroupDefinitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupDefinitions: Self = this.set("GroupDefinitions", js.undefined)
    @scala.inline
    def setNextPageToken(value: NextPageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
    @scala.inline
    def setResultsByTimeVarargs(value: ResultByTime*): Self = this.set("ResultsByTime", js.Array(value :_*))
    @scala.inline
    def setResultsByTime(value: ResultsByTime): Self = this.set("ResultsByTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultsByTime: Self = this.set("ResultsByTime", js.undefined)
  }
  
}

