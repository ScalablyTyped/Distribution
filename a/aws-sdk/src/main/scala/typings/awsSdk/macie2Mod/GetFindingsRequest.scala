package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFindingsRequest extends js.Object {
  /**
    * An array of strings that lists the unique identifiers for the findings to retrieve information about.
    */
  var findingIds: listOfString = js.native
  /**
    * The criteria for sorting the results of the request.
    */
  var sortCriteria: js.UndefOr[SortCriteria] = js.native
}

object GetFindingsRequest {
  @scala.inline
  def apply(findingIds: listOfString): GetFindingsRequest = {
    val __obj = js.Dynamic.literal(findingIds = findingIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsRequest]
  }
  @scala.inline
  implicit class GetFindingsRequestOps[Self <: GetFindingsRequest] (val x: Self) extends AnyVal {
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
    def setFindingIdsVarargs(value: string*): Self = this.set("findingIds", js.Array(value :_*))
    @scala.inline
    def setFindingIds(value: listOfString): Self = this.set("findingIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortCriteria(value: SortCriteria): Self = this.set("sortCriteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortCriteria: Self = this.set("sortCriteria", js.undefined)
  }
  
}

