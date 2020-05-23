package typings.clearbladejsServer.CbServer

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
    PAGENUM: js.UndefOr[Double] = js.undefined,
    PAGESIZE: js.UndefOr[Double] = js.undefined,
    SELECTCOLUMNS: js.Array[String] = null,
    SORT: QuerySortDirections = null
  ): Query = {
    val __obj = js.Dynamic.literal()
    if (FILTERS != null) __obj.updateDynamic("FILTERS")(FILTERS.asInstanceOf[js.Any])
    if (!js.isUndefined(PAGENUM)) __obj.updateDynamic("PAGENUM")(PAGENUM.get.asInstanceOf[js.Any])
    if (!js.isUndefined(PAGESIZE)) __obj.updateDynamic("PAGESIZE")(PAGESIZE.get.asInstanceOf[js.Any])
    if (SELECTCOLUMNS != null) __obj.updateDynamic("SELECTCOLUMNS")(SELECTCOLUMNS.asInstanceOf[js.Any])
    if (SORT != null) __obj.updateDynamic("SORT")(SORT.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
}

