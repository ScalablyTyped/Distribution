package typings.awsSdk.finspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnDefinition extends StObject {
  
  /**
    * Description for a column.
    */
  var columnDescription: js.UndefOr[ColumnDescription] = js.undefined
  
  /**
    * The name of a column.
    */
  var columnName: js.UndefOr[ColumnName] = js.undefined
  
  /**
    * Data type of a column.    STRING – A String data type.  CHAR – A char data type.  INTEGER – An integer data type.  TINYINT – A tinyint data type.  SMALLINT – A smallint data type.  BIGINT – A bigint data type.  FLOAT – A float data type.  DOUBLE – A double data type.  DATE – A date data type.  DATETIME – A datetime data type.  BOOLEAN – A boolean data type.  BINARY – A binary data type.  
    */
  var dataType: js.UndefOr[ColumnDataType] = js.undefined
}
object ColumnDefinition {
  
  inline def apply(): ColumnDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnDefinition]
  }
  
  extension [Self <: ColumnDefinition](x: Self) {
    
    inline def setColumnDescription(value: ColumnDescription): Self = StObject.set(x, "columnDescription", value.asInstanceOf[js.Any])
    
    inline def setColumnDescriptionUndefined: Self = StObject.set(x, "columnDescription", js.undefined)
    
    inline def setColumnName(value: ColumnName): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
    
    inline def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
    
    inline def setDataType(value: ColumnDataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
  }
}
