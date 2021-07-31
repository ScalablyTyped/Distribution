package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableColumn extends StObject {
  
  var cssClass: js.UndefOr[String] = js.undefined
  
  var headerCssClass: js.UndefOr[String] = js.undefined
  
  var options: js.UndefOr[CheckboxColumnOption | TextColumnOption] = js.undefined
  
  var toolTip: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[ColumnType] = js.undefined
  
  var value: String
  
  var width: js.UndefOr[Double] = js.undefined
}
object TableColumn {
  
  @scala.inline
  def apply(value: String): TableColumn = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableColumn]
  }
  
  @scala.inline
  implicit class TableColumnMutableBuilder[Self <: TableColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    @scala.inline
    def setHeaderCssClass(value: String): Self = StObject.set(x, "headerCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderCssClassUndefined: Self = StObject.set(x, "headerCssClass", js.undefined)
    
    @scala.inline
    def setOptions(value: CheckboxColumnOption | TextColumnOption): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setToolTip(value: String): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolTipUndefined: Self = StObject.set(x, "toolTip", js.undefined)
    
    @scala.inline
    def setType(value: ColumnType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
