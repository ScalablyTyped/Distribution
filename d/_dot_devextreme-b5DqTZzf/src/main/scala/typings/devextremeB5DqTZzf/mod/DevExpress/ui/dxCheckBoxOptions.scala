package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxCheckBoxOptions
  extends StObject
     with EditorOptions[dxCheckBox] {
  
  /**
    * Specifies the check box icon&apos;s width and height.
    */
  var iconSize: js.UndefOr[Double | String] = js.undefined
  
  /**
    * The value to be assigned to the `name` attribute of the underlying HTML element.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the text displayed by the check box.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the UI component state.
    */
  @JSName("value")
  var value_dxCheckBoxOptions: js.UndefOr[Boolean | Null] = js.undefined
}
object dxCheckBoxOptions {
  
  inline def apply(): dxCheckBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxCheckBoxOptions]
  }
  
  extension [Self <: dxCheckBoxOptions](x: Self) {
    
    inline def setIconSize(value: Double | String): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
    
    inline def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
