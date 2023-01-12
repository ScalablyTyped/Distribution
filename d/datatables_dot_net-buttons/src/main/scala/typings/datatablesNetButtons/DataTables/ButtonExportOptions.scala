package typings.datatablesNetButtons.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonExportOptions extends StObject {
  
  var columns: js.UndefOr[ButtonSelectorTypes | js.Array[ButtonSelectorTypes]] = js.undefined
}
object ButtonExportOptions {
  
  inline def apply(): ButtonExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonExportOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonExportOptions] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: ButtonSelectorTypes | js.Array[ButtonSelectorTypes]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: ButtonSelectorTypes*): Self = StObject.set(x, "columns", js.Array(value*))
  }
}
