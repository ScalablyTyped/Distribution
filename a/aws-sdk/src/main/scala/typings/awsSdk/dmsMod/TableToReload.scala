package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableToReload extends StObject {
  
  /**
    * The schema name of the table to be reloaded.
    */
  var SchemaName: String = js.native
  
  /**
    * The table name of the table to be reloaded.
    */
  var TableName: String = js.native
}
object TableToReload {
  
  @scala.inline
  def apply(SchemaName: String, TableName: String): TableToReload = {
    val __obj = js.Dynamic.literal(SchemaName = SchemaName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableToReload]
  }
  
  @scala.inline
  implicit class TableToReloadMutableBuilder[Self <: TableToReload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSchemaName(value: String): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
