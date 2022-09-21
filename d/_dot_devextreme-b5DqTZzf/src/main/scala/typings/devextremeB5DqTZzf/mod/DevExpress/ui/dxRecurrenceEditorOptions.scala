package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxRecurrenceEditorOptions
  extends StObject
     with EditorOptions[dxRecurrenceEditor] {
  
  /**
    * Specifies the UI component&apos;s value.
    */
  @JSName("value")
  var value_dxRecurrenceEditorOptions: js.UndefOr[String] = js.undefined
}
object dxRecurrenceEditorOptions {
  
  inline def apply(): dxRecurrenceEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxRecurrenceEditorOptions]
  }
  
  extension [Self <: dxRecurrenceEditorOptions](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
