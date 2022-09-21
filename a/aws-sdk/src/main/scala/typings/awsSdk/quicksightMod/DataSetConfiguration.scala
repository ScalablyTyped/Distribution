package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSetConfiguration extends StObject {
  
  /**
    * A structure containing the list of column group schemas.
    */
  var ColumnGroupSchemaList: js.UndefOr[typings.awsSdk.quicksightMod.ColumnGroupSchemaList] = js.undefined
  
  /**
    * Dataset schema.
    */
  var DataSetSchema: js.UndefOr[typings.awsSdk.quicksightMod.DataSetSchema] = js.undefined
  
  /**
    * Placeholder.
    */
  var Placeholder: js.UndefOr[String] = js.undefined
}
object DataSetConfiguration {
  
  inline def apply(): DataSetConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSetConfiguration]
  }
  
  extension [Self <: DataSetConfiguration](x: Self) {
    
    inline def setColumnGroupSchemaList(value: ColumnGroupSchemaList): Self = StObject.set(x, "ColumnGroupSchemaList", value.asInstanceOf[js.Any])
    
    inline def setColumnGroupSchemaListUndefined: Self = StObject.set(x, "ColumnGroupSchemaList", js.undefined)
    
    inline def setColumnGroupSchemaListVarargs(value: ColumnGroupSchema*): Self = StObject.set(x, "ColumnGroupSchemaList", js.Array(value*))
    
    inline def setDataSetSchema(value: DataSetSchema): Self = StObject.set(x, "DataSetSchema", value.asInstanceOf[js.Any])
    
    inline def setDataSetSchemaUndefined: Self = StObject.set(x, "DataSetSchema", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "Placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "Placeholder", js.undefined)
  }
}
