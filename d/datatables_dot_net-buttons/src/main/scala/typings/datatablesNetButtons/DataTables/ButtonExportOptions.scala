package typings.datatablesNetButtons.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonExportOptions extends StObject {
  
  var columns: js.UndefOr[ButtonSelectorTypes | js.Array[ButtonSelectorTypes]] = js.undefined
}
object ButtonExportOptions {
  
  @scala.inline
  def apply(): ButtonExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonExportOptions]
  }
  
  @scala.inline
  implicit class ButtonExportOptionsMutableBuilder[Self <: ButtonExportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: ButtonSelectorTypes | js.Array[ButtonSelectorTypes]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: ButtonSelectorTypes*): Self = StObject.set(x, "columns", js.Array(value :_*))
  }
}
