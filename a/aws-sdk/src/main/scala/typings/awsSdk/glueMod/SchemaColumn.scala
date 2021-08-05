package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaColumn extends StObject {
  
  /**
    * The type of data in the column.
    */
  var DataType: js.UndefOr[ColumnTypeString] = js.undefined
  
  /**
    * The name of the column.
    */
  var Name: js.UndefOr[ColumnNameString] = js.undefined
}
object SchemaColumn {
  
  inline def apply(): SchemaColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColumn]
  }
  
  extension [Self <: SchemaColumn](x: Self) {
    
    inline def setDataType(value: ColumnTypeString): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "DataType", js.undefined)
    
    inline def setName(value: ColumnNameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
