package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlQueryDatasetAction extends StObject {
  
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
  implicit class SqlQueryDatasetActionMutableBuilder[Self <: SqlQueryDatasetAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: QueryFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: QueryFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setSqlQuery(value: SqlQuery): Self = StObject.set(x, "sqlQuery", value.asInstanceOf[js.Any])
  }
}
