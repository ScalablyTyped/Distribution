package typings.clearbladejsDashClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  var FILTERS: js.UndefOr[js.Array[QueryFilter]] = js.undefined
  var PAGENUM: js.UndefOr[Double] = js.undefined
  var PAGESIZE: js.UndefOr[Double] = js.undefined
  var SELECTCOLUMNS: js.UndefOr[js.Array[String]] = js.undefined
  var SORT: js.UndefOr[QuerySortDirections] = js.undefined
}

object Query {
  @scala.inline
  def apply(
    FILTERS: js.Array[QueryFilter] = null,
    PAGENUM: Int | Double = null,
    PAGESIZE: Int | Double = null,
    SELECTCOLUMNS: js.Array[String] = null,
    SORT: QuerySortDirections = null
  ): Query = {
    val __obj = js.Dynamic.literal()
    if (FILTERS != null) __obj.updateDynamic("FILTERS")(FILTERS.asInstanceOf[js.Any])
    if (PAGENUM != null) __obj.updateDynamic("PAGENUM")(PAGENUM.asInstanceOf[js.Any])
    if (PAGESIZE != null) __obj.updateDynamic("PAGESIZE")(PAGESIZE.asInstanceOf[js.Any])
    if (SELECTCOLUMNS != null) __obj.updateDynamic("SELECTCOLUMNS")(SELECTCOLUMNS.asInstanceOf[js.Any])
    if (SORT != null) __obj.updateDynamic("SORT")(SORT.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
}

