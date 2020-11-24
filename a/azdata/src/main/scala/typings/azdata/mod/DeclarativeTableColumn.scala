package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclarativeTableColumn extends js.Object {
  
  var categoryValues: js.UndefOr[js.Array[CategoryValue]] = js.native
  
  var displayName: String = js.native
  
  var isReadOnly: Boolean = js.native
  
  var valueType: DeclarativeDataType = js.native
  
  var width: Double | String = js.native
}
object DeclarativeTableColumn {
  
  @scala.inline
  def apply(displayName: String, isReadOnly: Boolean, valueType: DeclarativeDataType, width: Double | String): DeclarativeTableColumn = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarativeTableColumn]
  }
  
  @scala.inline
  implicit class DeclarativeTableColumnOps[Self <: DeclarativeTableColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = this.set("isReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueType(value: DeclarativeDataType): Self = this.set("valueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryValuesVarargs(value: CategoryValue*): Self = this.set("categoryValues", js.Array(value :_*))
    
    @scala.inline
    def setCategoryValues(value: js.Array[CategoryValue]): Self = this.set("categoryValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoryValues: Self = this.set("categoryValues", js.undefined)
  }
}
