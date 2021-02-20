package typings.cordovaPluginWebsql

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlResultSet extends StObject {
  
  var insertId: Double = js.native
  
  var rows: SqlResultSetRowList = js.native
  
  var rowsAffected: Double = js.native
}
object SqlResultSet {
  
  @scala.inline
  def apply(insertId: Double, rows: SqlResultSetRowList, rowsAffected: Double): SqlResultSet = {
    val __obj = js.Dynamic.literal(insertId = insertId.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], rowsAffected = rowsAffected.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlResultSet]
  }
  
  @scala.inline
  implicit class SqlResultSetMutableBuilder[Self <: SqlResultSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsertId(value: Double): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: SqlResultSetRowList): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsAffected(value: Double): Self = StObject.set(x, "rowsAffected", value.asInstanceOf[js.Any])
  }
}
