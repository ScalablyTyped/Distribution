package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectColumnData extends js.Object {
  @JSName("_")
  var _underscore: String | Double | FunctionColumnData = js.native
  var display: js.UndefOr[String | Double | FunctionColumnData] = js.native
  var filter: js.UndefOr[String | Double | FunctionColumnData] = js.native
  var sort: js.UndefOr[String | Double | FunctionColumnData] = js.native
  var `type`: js.UndefOr[String | Double | FunctionColumnData] = js.native
}

object ObjectColumnData {
  @scala.inline
  def apply(_underscore: String | Double | FunctionColumnData): ObjectColumnData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectColumnData]
  }
  @scala.inline
  implicit class ObjectColumnDataOps[Self <: ObjectColumnData] (val x: Self) extends AnyVal {
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
    def set_underscore(value: String | Double | FunctionColumnData): Self = this.set("_", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplay(value: String | Double | FunctionColumnData): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setFilter(value: String | Double | FunctionColumnData): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setSort(value: String | Double | FunctionColumnData): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setType(value: String | Double | FunctionColumnData): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

