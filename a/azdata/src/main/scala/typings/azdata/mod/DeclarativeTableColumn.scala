package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclarativeTableColumn extends StObject {
  
  var categoryValues: js.UndefOr[js.Array[CategoryValue]] = js.undefined
  
  var displayName: String
  
  var isReadOnly: Boolean
  
  var valueType: DeclarativeDataType
  
  var width: Double | String
}
object DeclarativeTableColumn {
  
  @scala.inline
  def apply(displayName: String, isReadOnly: Boolean, valueType: DeclarativeDataType, width: Double | String): DeclarativeTableColumn = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarativeTableColumn]
  }
  
  @scala.inline
  implicit class DeclarativeTableColumnMutableBuilder[Self <: DeclarativeTableColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoryValues(value: js.Array[CategoryValue]): Self = StObject.set(x, "categoryValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryValuesUndefined: Self = StObject.set(x, "categoryValues", js.undefined)
    
    @scala.inline
    def setCategoryValuesVarargs(value: CategoryValue*): Self = StObject.set(x, "categoryValues", js.Array(value :_*))
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueType(value: DeclarativeDataType): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
