package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectColumnData extends js.Object {
  var `_`: java.lang.String
  var display: js.UndefOr[java.lang.String] = js.undefined
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var sort: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ObjectColumnData {
  @scala.inline
  def apply(
    `_`: java.lang.String,
    display: java.lang.String = null,
    filter: java.lang.String = null,
    sort: java.lang.String = null,
    `type`: java.lang.String = null
  ): ObjectColumnData = {
    val __obj = js.Dynamic.literal(`_` = `_`)
    if (display != null) __obj.updateDynamic("display")(display)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ObjectColumnData]
  }
}

