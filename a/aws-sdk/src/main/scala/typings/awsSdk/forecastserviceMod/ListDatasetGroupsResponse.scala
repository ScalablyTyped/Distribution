package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDatasetGroupsResponse extends js.Object {
  /**
    * An array of objects that summarize each dataset group's properties.
    */
  var DatasetGroups: js.UndefOr[typings.awsSdk.forecastserviceMod.DatasetGroups] = js.native
  /**
    * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.forecastserviceMod.NextToken] = js.native
}

object ListDatasetGroupsResponse {
  @scala.inline
  def apply(): ListDatasetGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetGroupsResponse]
  }
  @scala.inline
  implicit class ListDatasetGroupsResponseOps[Self <: ListDatasetGroupsResponse] (val x: Self) extends AnyVal {
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
    def setDatasetGroupsVarargs(value: DatasetGroupSummary*): Self = this.set("DatasetGroups", js.Array(value :_*))
    @scala.inline
    def setDatasetGroups(value: DatasetGroups): Self = this.set("DatasetGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetGroups: Self = this.set("DatasetGroups", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

