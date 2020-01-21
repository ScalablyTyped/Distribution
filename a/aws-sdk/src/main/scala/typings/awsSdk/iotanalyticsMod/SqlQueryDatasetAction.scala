package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlQueryDatasetAction extends js.Object {
  /**
    * Pre-filters applied to message data.
    */
  var filters: js.UndefOr[QueryFilters] = js.native
  /**
    * A SQL query string.
    */
  var sqlQuery: SqlQuery = js.native
}

object SqlQueryDatasetAction {
  @scala.inline
  def apply(sqlQuery: SqlQuery, filters: QueryFilters = null): SqlQueryDatasetAction = {
    val __obj = js.Dynamic.literal(sqlQuery = sqlQuery.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlQueryDatasetAction]
  }
}

