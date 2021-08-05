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
  
  inline def apply(value: String): TableColumn = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableColumn]
  }
  
  extension [Self <: TableColumn](x: Self) {
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setHeaderCssClass(value: String): Self = StObject.set(x, "headerCssClass", value.asInstanceOf[js.Any])
    
    inline def setHeaderCssClassUndefined: Self = StObject.set(x, "headerCssClass", js.undefined)
    
    inline def setOptions(value: CheckboxColumnOption | TextColumnOption): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setToolTip(value: String): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
    
    inline def setToolTipUndefined: Self = StObject.set(x, "toolTip", js.undefined)
    
    inline def setType(value: ColumnType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
