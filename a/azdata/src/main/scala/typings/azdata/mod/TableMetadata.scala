package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableMetadata extends StObject {
  
  var columns: ColumnMetadata = js.native
}
object TableMetadata {
  
  @scala.inline
  def apply(columns: ColumnMetadata): TableMetadata = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableMetadata]
  }
  
  @scala.inline
  implicit class TableMetadataMutableBuilder[Self <: TableMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: ColumnMetadata): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
  }
}
