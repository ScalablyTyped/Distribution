package typings
package clearbladejsDashServerLib.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  var FILTERS: js.UndefOr[js.Array[QueryFilter]] = js.undefined
  var PAGENUM: js.UndefOr[scala.Double] = js.undefined
  var PAGESIZE: js.UndefOr[scala.Double] = js.undefined
  var SELECTCOLUMNS: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var SORT: js.UndefOr[QuerySortDirections] = js.undefined
}

object Query {
  @scala.inline
  def apply(
    FILTERS: js.Array[QueryFilter] = null,
    PAGENUM: scala.Int | scala.Double = null,
    PAGESIZE: scala.Int | scala.Double = null,
    SELECTCOLUMNS: js.Array[java.lang.String] = null,
    SORT: QuerySortDirections = null
  ): Query = {
    val __obj = js.Dynamic.literal()
    if (FILTERS != null) __obj.updateDynamic("FILTERS")(FILTERS)
    if (PAGENUM != null) __obj.updateDynamic("PAGENUM")(PAGENUM.asInstanceOf[js.Any])
    if (PAGESIZE != null) __obj.updateDynamic("PAGESIZE")(PAGESIZE.asInstanceOf[js.Any])
    if (SELECTCOLUMNS != null) __obj.updateDynamic("SELECTCOLUMNS")(SELECTCOLUMNS)
    if (SORT != null) __obj.updateDynamic("SORT")(SORT)
    __obj.asInstanceOf[Query]
  }
}

