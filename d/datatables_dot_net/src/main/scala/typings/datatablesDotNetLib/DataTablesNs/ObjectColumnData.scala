package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectColumnData extends js.Object {
  var `_`: java.lang.String | scala.Double | FunctionColumnData
  var display: js.UndefOr[java.lang.String | scala.Double | FunctionColumnData] = js.undefined
  var filter: js.UndefOr[java.lang.String | scala.Double | FunctionColumnData] = js.undefined
  var sort: js.UndefOr[java.lang.String | scala.Double | FunctionColumnData] = js.undefined
  var `type`: js.UndefOr[java.lang.String | scala.Double | FunctionColumnData] = js.undefined
}

object ObjectColumnData {
  @scala.inline
  def apply(
    `_`: java.lang.String | scala.Double | FunctionColumnData,
    display: java.lang.String | scala.Double | FunctionColumnData = null,
    filter: java.lang.String | scala.Double | FunctionColumnData = null,
    sort: java.lang.String | scala.Double | FunctionColumnData = null,
    `type`: java.lang.String | scala.Double | FunctionColumnData = null
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

