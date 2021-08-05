package typings.baseui.datepickerMod

import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import typings.std.Date
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatepickerProps
  extends StObject
     with CalendarProps {
  
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  
  var `aria-label`: js.UndefOr[String] = js.undefined
  
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  
  var clearable: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var displayValueAtRangeIndex: js.UndefOr[Double] = js.undefined
  
  var error: js.UndefOr[Boolean] = js.undefined
  
  var formatDisplayValue: js.UndefOr[
    js.Function2[/* date */ Date | js.Array[Date], /* formatString */ String, String]
  ] = js.undefined
  
  var formatString: js.UndefOr[String] = js.undefined
  
  var mask: js.UndefOr[String | Null] = js.undefined
  
  var mountNode: js.UndefOr[HTMLElement] = js.undefined
  
  var onClose: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var positive: js.UndefOr[Boolean] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[mini | default_ | compact | large_] = js.undefined
}
object DatepickerProps {
  
  inline def apply(): DatepickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatepickerProps]
  }
  
  extension [Self <: DatepickerProps](x: Self) {
    
    inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    inline def setClearable(value: Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
    
    inline def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDisplayValueAtRangeIndex(value: Double): Self = StObject.set(x, "displayValueAtRangeIndex", value.asInstanceOf[js.Any])
    
    inline def setDisplayValueAtRangeIndexUndefined: Self = StObject.set(x, "displayValueAtRangeIndex", js.undefined)
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFormatDisplayValue(value: (/* date */ Date | js.Array[Date], /* formatString */ String) => String): Self = StObject.set(x, "formatDisplayValue", js.Any.fromFunction2(value))
    
    inline def setFormatDisplayValueUndefined: Self = StObject.set(x, "formatDisplayValue", js.undefined)
    
    inline def setFormatString(value: String): Self = StObject.set(x, "formatString", value.asInstanceOf[js.Any])
    
    inline def setFormatStringUndefined: Self = StObject.set(x, "formatString", js.undefined)
    
    inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskNull: Self = StObject.set(x, "mask", null)
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setMountNode(value: HTMLElement): Self = StObject.set(x, "mountNode", value.asInstanceOf[js.Any])
    
    inline def setMountNodeUndefined: Self = StObject.set(x, "mountNode", js.undefined)
    
    inline def setOnClose(value: () => js.Any): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
    
    inline def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setSize(value: mini | default_ | compact | large_): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
