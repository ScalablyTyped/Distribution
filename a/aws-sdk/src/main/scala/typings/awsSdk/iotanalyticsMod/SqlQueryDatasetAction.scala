package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlQueryDatasetAction extends js.Object {
  
  /**
    * Prefilters applied to message data.
    */
  var filters: js.UndefOr[QueryFilters] = js.native
  
  /**
    * A SQL query string.
    */
  var sqlQuery: SqlQuery = js.native
}
object SqlQueryDatasetAction {
  
  @scala.inline
  def apply(sqlQuery: SqlQuery): SqlQueryDatasetAction = {
    val __obj = js.Dynamic.literal(sqlQuery = sqlQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlQueryDatasetAction]
  }
  
  @scala.inline
  implicit class SqlQueryDatasetActionOps[Self <: SqlQueryDatasetAction] (val x: Self) extends AnyVal {
    
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
    def setSqlQuery(value: SqlQuery): Self = this.set("sqlQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: QueryFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: QueryFilters): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
}
