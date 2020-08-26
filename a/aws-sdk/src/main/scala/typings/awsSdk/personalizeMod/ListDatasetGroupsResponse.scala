package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDatasetGroupsResponse extends js.Object {
  /**
    * The list of your dataset groups.
    */
  var datasetGroups: js.UndefOr[DatasetGroups] = js.native
  /**
    * A token for getting the next set of dataset groups (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDatasetGroupsVarargs(value: DatasetGroupSummary*): Self = this.set("datasetGroups", js.Array(value :_*))
    @scala.inline
    def setDatasetGroups(value: DatasetGroups): Self = this.set("datasetGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetGroups: Self = this.set("datasetGroups", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

