package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclarativeTableCellValue extends StObject {
  
  /**
    * The aria-label of the cell
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the cell is enabled. Default value is true.
    * Only used when the valueType is boolean
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The CSS style of the cell
    */
  var style: js.UndefOr[CssStyles] = js.undefined
  
  /**
    * The cell value
    */
  var value: String | Double | Boolean | Component | DeclarativeTableMenuCellValue
}
object DeclarativeTableCellValue {
  
  inline def apply(value: String | Double | Boolean | Component | DeclarativeTableMenuCellValue): DeclarativeTableCellValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarativeTableCellValue]
  }
  
  extension [Self <: DeclarativeTableCellValue](x: Self) {
    
    inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setStyle(value: CssStyles): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setValue(value: String | Double | Boolean | Component | DeclarativeTableMenuCellValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
