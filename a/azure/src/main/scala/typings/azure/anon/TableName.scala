package typings.azure.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableName extends StObject {
  
  var TableName: String = js.native
}
object TableName {
  
  @scala.inline
  def apply(TableName: String): TableName = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableName]
  }
  
  @scala.inline
  implicit class TableNameMutableBuilder[Self <: TableName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
