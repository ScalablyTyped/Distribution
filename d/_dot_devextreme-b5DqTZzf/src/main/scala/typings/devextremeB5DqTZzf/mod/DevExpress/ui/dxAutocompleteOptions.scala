package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxPopup.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxAutocompleteOptions
  extends StObject
     with dxDropDownListOptions[dxAutocomplete] {
  
  /**
    * Configures the drop-down field which holds the content.
    */
  @JSName("dropDownOptions")
  var dropDownOptions_dxAutocompleteOptions: js.UndefOr[Properties] = js.undefined
  
  /**
    * Specifies the maximum count of items displayed by the UI component.
    */
  var maxItemCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the current value displayed by the UI component.
    */
  @JSName("value")
  var value_dxAutocompleteOptions: js.UndefOr[String] = js.undefined
}
object dxAutocompleteOptions {
  
  inline def apply(): dxAutocompleteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxAutocompleteOptions]
  }
  
  extension [Self <: dxAutocompleteOptions](x: Self) {
    
    inline def setDropDownOptions(value: Properties): Self = StObject.set(x, "dropDownOptions", value.asInstanceOf[js.Any])
    
    inline def setDropDownOptionsUndefined: Self = StObject.set(x, "dropDownOptions", js.undefined)
    
    inline def setMaxItemCount(value: Double): Self = StObject.set(x, "maxItemCount", value.asInstanceOf[js.Any])
    
    inline def setMaxItemCountUndefined: Self = StObject.set(x, "maxItemCount", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
