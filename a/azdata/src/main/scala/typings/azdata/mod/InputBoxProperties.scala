package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputBoxProperties extends ComponentProperties {
  
  var ariaLive: js.UndefOr[String] = js.native
  
  var columns: js.UndefOr[Double] = js.native
  
  var inputType: js.UndefOr[InputBoxInputType] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var multiline: js.UndefOr[Boolean] = js.native
  
  var placeHolder: js.UndefOr[String] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var rows: js.UndefOr[Double] = js.native
  
  /**
    * Whether to stop key event propagation when enter is pressed in the input box. Leaving this as false
    * means the event will propagate up to any parents that have handlers (such as validate on Dialogs)
    */
  var stopEnterPropagation: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object InputBoxProperties {
  
  @scala.inline
  def apply(): InputBoxProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputBoxProperties]
  }
  
  @scala.inline
  implicit class InputBoxPropertiesMutableBuilder[Self <: InputBoxProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAriaLive(value: String): Self = StObject.set(x, "ariaLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaLiveUndefined: Self = StObject.set(x, "ariaLive", js.undefined)
    
    @scala.inline
    def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setInputType(value: InputBoxInputType): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
    
    @scala.inline
    def setPlaceHolder(value: String): Self = StObject.set(x, "placeHolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceHolderUndefined: Self = StObject.set(x, "placeHolder", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setStopEnterPropagation(value: Boolean): Self = StObject.set(x, "stopEnterPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopEnterPropagationUndefined: Self = StObject.set(x, "stopEnterPropagation", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
