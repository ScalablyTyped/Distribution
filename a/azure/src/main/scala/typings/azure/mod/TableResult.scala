package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableResult extends StObject {
  
  var TableName: String
}
object TableResult {
  
  @scala.inline
  def apply(TableName: String): TableResult = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableResult]
  }
  
  @scala.inline
  implicit class TableResultMutableBuilder[Self <: TableResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
