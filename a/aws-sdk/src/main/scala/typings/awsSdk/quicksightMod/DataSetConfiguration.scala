package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSetConfiguration extends StObject {
  
  /**
    * A structure containing the list of column group schemas.
    */
  var ColumnGroupSchemaList: js.UndefOr[typings.awsSdk.quicksightMod.ColumnGroupSchemaList] = js.native
  
  /**
    * Dataset schema.
    */
  var DataSetSchema: js.UndefOr[typings.awsSdk.quicksightMod.DataSetSchema] = js.native
  
  /**
    * Placeholder.
    */
  var Placeholder: js.UndefOr[String] = js.native
}
object DataSetConfiguration {
  
  @scala.inline
  def apply(): DataSetConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSetConfiguration]
  }
  
  @scala.inline
  implicit class DataSetConfigurationMutableBuilder[Self <: DataSetConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnGroupSchemaList(value: ColumnGroupSchemaList): Self = StObject.set(x, "ColumnGroupSchemaList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnGroupSchemaListUndefined: Self = StObject.set(x, "ColumnGroupSchemaList", js.undefined)
    
    @scala.inline
    def setColumnGroupSchemaListVarargs(value: ColumnGroupSchema*): Self = StObject.set(x, "ColumnGroupSchemaList", js.Array(value :_*))
    
    @scala.inline
    def setDataSetSchema(value: DataSetSchema): Self = StObject.set(x, "DataSetSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetSchemaUndefined: Self = StObject.set(x, "DataSetSchema", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "Placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "Placeholder", js.undefined)
  }
}
