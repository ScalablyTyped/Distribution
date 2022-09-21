package typings.awsSdk.honeycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableColumn extends StObject {
  
  /**
    *  The column level format that is applied in the table. An empty value in this field means that the column format is the default value 'AUTO'. 
    */
  var format: js.UndefOr[Format] = js.undefined
  
  /**
    * The id of the column in the table.
    */
  var tableColumnId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The name of the column in the table.
    */
  var tableColumnName: js.UndefOr[TableColumnName] = js.undefined
}
object TableColumn {
  
  inline def apply(): TableColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableColumn]
  }
  
  extension [Self <: TableColumn](x: Self) {
    
    inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setTableColumnId(value: ResourceId): Self = StObject.set(x, "tableColumnId", value.asInstanceOf[js.Any])
    
    inline def setTableColumnIdUndefined: Self = StObject.set(x, "tableColumnId", js.undefined)
    
    inline def setTableColumnName(value: TableColumnName): Self = StObject.set(x, "tableColumnName", value.asInstanceOf[js.Any])
    
    inline def setTableColumnNameUndefined: Self = StObject.set(x, "tableColumnName", js.undefined)
  }
}
