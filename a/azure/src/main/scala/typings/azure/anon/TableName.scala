package typings.azure.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableName extends StObject {
  
  var TableName: String
}
object TableName {
  
  inline def apply(TableName: String): TableName = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableName]
  }
  
  extension [Self <: TableName](x: Self) {
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
