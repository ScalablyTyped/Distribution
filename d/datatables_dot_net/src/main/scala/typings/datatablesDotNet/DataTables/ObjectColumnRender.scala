package typings.datatablesDotNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectColumnRender extends js.Object {
  @JSName("_")
  var _underscore: js.UndefOr[String | Double | FunctionColumnRender] = js.undefined
  var display: js.UndefOr[String | Double | FunctionColumnRender] = js.undefined
  var filter: js.UndefOr[String | Double | FunctionColumnRender] = js.undefined
  var sort: js.UndefOr[String | Double | FunctionColumnRender] = js.undefined
  var `type`: js.UndefOr[String | Double | FunctionColumnRender] = js.undefined
}

object ObjectColumnRender {
  @scala.inline
  def apply(
    _underscore: String | Double | FunctionColumnRender = null,
    display: String | Double | FunctionColumnRender = null,
    filter: String | Double | FunctionColumnRender = null,
    sort: String | Double | FunctionColumnRender = null,
    `type`: String | Double | FunctionColumnRender = null
  ): ObjectColumnRender = {
    val __obj = js.Dynamic.literal()
    if (_underscore != null) __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectColumnRender]
  }
}

