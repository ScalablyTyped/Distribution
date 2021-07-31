package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSetSchema extends StObject {
  
  /**
    * A structure containing the list of column schemas.
    */
  var ColumnSchemaList: js.UndefOr[typings.awsSdk.quicksightMod.ColumnSchemaList] = js.undefined
}
object DataSetSchema {
  
  @scala.inline
  def apply(): DataSetSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSetSchema]
  }
  
  @scala.inline
  implicit class DataSetSchemaMutableBuilder[Self <: DataSetSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnSchemaList(value: ColumnSchemaList): Self = StObject.set(x, "ColumnSchemaList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnSchemaListUndefined: Self = StObject.set(x, "ColumnSchemaList", js.undefined)
    
    @scala.inline
    def setColumnSchemaListVarargs(value: ColumnSchema*): Self = StObject.set(x, "ColumnSchemaList", js.Array(value :_*))
  }
}
