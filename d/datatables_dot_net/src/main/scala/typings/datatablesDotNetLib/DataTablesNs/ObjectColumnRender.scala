package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectColumnRender extends js.Object {
  var `_`: js.UndefOr[java.lang.String | scala.Double | FunctionColumnRender] = js.undefined
  var display: js.UndefOr[java.lang.String | scala.Double | FunctionColumnRender] = js.undefined
  var filter: js.UndefOr[java.lang.String | scala.Double | FunctionColumnRender] = js.undefined
  var sort: js.UndefOr[java.lang.String | scala.Double | FunctionColumnRender] = js.undefined
  var `type`: js.UndefOr[java.lang.String | scala.Double | FunctionColumnRender] = js.undefined
}

object ObjectColumnRender {
  @scala.inline
  def apply(
    `_`: java.lang.String | scala.Double | FunctionColumnRender = null,
    display: java.lang.String | scala.Double | FunctionColumnRender = null,
    filter: java.lang.String | scala.Double | FunctionColumnRender = null,
    sort: java.lang.String | scala.Double | FunctionColumnRender = null,
    `type`: java.lang.String | scala.Double | FunctionColumnRender = null
  ): ObjectColumnRender = {
    val __obj = js.Dynamic.literal()
    if (`_` != null) __obj.updateDynamic("_")(`_`.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectColumnRender]
  }
}

