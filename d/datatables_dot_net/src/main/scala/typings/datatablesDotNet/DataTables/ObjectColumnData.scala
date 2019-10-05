package typings.datatablesDotNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectColumnData extends js.Object {
  var `_`: String | Double | FunctionColumnData
  var display: js.UndefOr[String | Double | FunctionColumnData] = js.undefined
  var filter: js.UndefOr[String | Double | FunctionColumnData] = js.undefined
  var sort: js.UndefOr[String | Double | FunctionColumnData] = js.undefined
  var `type`: js.UndefOr[String | Double | FunctionColumnData] = js.undefined
}

object ObjectColumnData {
  @scala.inline
  def apply(
    `_`: String | Double | FunctionColumnData,
    display: String | Double | FunctionColumnData = null,
    filter: String | Double | FunctionColumnData = null,
    sort: String | Double | FunctionColumnData = null,
    `type`: String | Double | FunctionColumnData = null
  ): ObjectColumnData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(`_`.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectColumnData]
  }
}

