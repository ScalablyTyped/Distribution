package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFindingStatisticsResponse extends js.Object {
  /**
    * An array of objects, one for each group of findings that meet the filter criteria specified in the request.
    */
  var countsByGroup: js.UndefOr[listOfGroupCount] = js.native
}

object GetFindingStatisticsResponse {
  @scala.inline
  def apply(): GetFindingStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFindingStatisticsResponse]
  }
  @scala.inline
  implicit class GetFindingStatisticsResponseOps[Self <: GetFindingStatisticsResponse] (val x: Self) extends AnyVal {
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
    def setCountsByGroupVarargs(value: GroupCount*): Self = this.set("countsByGroup", js.Array(value :_*))
    @scala.inline
    def setCountsByGroup(value: listOfGroupCount): Self = this.set("countsByGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountsByGroup: Self = this.set("countsByGroup", js.undefined)
  }
  
}

