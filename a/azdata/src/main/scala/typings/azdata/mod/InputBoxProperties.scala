package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputBoxProperties
  extends StObject
     with ComponentProperties {
  
  var ariaLive: js.UndefOr[String] = js.undefined
  
  var columns: js.UndefOr[Double] = js.undefined
  
  var inputType: js.UndefOr[InputBoxInputType] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var multiline: js.UndefOr[Boolean] = js.undefined
  
  var placeHolder: js.UndefOr[String] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var rows: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether to stop key event propagation when enter is pressed in the input box. Leaving this as false
    * means the event will propagate up to any parents that have handlers (such as validate on Dialogs)
    */
  var stopEnterPropagation: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object InputBoxProperties {
  
  inline def apply(): InputBoxProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputBoxProperties]
  }
  
  extension [Self <: InputBoxProperties](x: Self) {
    
    inline def setAriaLive(value: String): Self = StObject.set(x, "ariaLive", value.asInstanceOf[js.Any])
    
    inline def setAriaLiveUndefined: Self = StObject.set(x, "ariaLive", js.undefined)
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setInputType(value: InputBoxInputType): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
    
    inline def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
    
    inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
    
    inline def setPlaceHolder(value: String): Self = StObject.set(x, "placeHolder", value.asInstanceOf[js.Any])
    
    inline def setPlaceHolderUndefined: Self = StObject.set(x, "placeHolder", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setStopEnterPropagation(value: Boolean): Self = StObject.set(x, "stopEnterPropagation", value.asInstanceOf[js.Any])
    
    inline def setStopEnterPropagationUndefined: Self = StObject.set(x, "stopEnterPropagation", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
