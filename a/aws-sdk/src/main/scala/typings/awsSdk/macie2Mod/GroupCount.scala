package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupCount extends js.Object {
  /**
    * The total number of findings in the group of query results.
    */
  var count: js.UndefOr[long] = js.native
  /**
    * The name of the property that defines the group in the query results, as specified by the groupBy property in the query request.
    */
  var groupKey: js.UndefOr[string] = js.native
}

object GroupCount {
  @scala.inline
  def apply(): GroupCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupCount]
  }
  @scala.inline
  implicit class GroupCountOps[Self <: GroupCount] (val x: Self) extends AnyVal {
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
    def setCount(value: long): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setGroupKey(value: string): Self = this.set("groupKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupKey: Self = this.set("groupKey", js.undefined)
  }
  
}

