package typings.baseui.datepickerMod

import typings.baseui.anon.Id
import typings.baseui.anon.Select
import typings.baseui.selectMod.Option
import typings.react.mod.ReactNode
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimezonePickerProps extends StObject {
  
  var date: js.UndefOr[Date] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var error: js.UndefOr[Boolean] = js.undefined
  
  var mapLabels: js.UndefOr[js.Function1[/* args */ Option, ReactNode]] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* value */ Id, js.Any]] = js.undefined
  
  var overrides: js.UndefOr[Select] = js.undefined
  
  var positive: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object TimezonePickerProps {
  
  inline def apply(): TimezonePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimezonePickerProps]
  }
  
  extension [Self <: TimezonePickerProps](x: Self) {
    
    inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setMapLabels(value: /* args */ Option => ReactNode): Self = StObject.set(x, "mapLabels", js.Any.fromFunction1(value))
    
    inline def setMapLabelsUndefined: Self = StObject.set(x, "mapLabels", js.undefined)
    
    inline def setOnChange(value: /* value */ Id => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOverrides(value: Select): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
    
    inline def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
