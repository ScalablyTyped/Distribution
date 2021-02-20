package typings.baseui.datepickerMod

import typings.baseui.anon.Id
import typings.baseui.anon.Select
import typings.baseui.selectMod.Option
import typings.react.mod.ReactNode
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimezonePickerProps extends StObject {
  
  var date: js.UndefOr[Date] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var error: js.UndefOr[Boolean] = js.native
  
  var mapLabels: js.UndefOr[js.Function1[/* args */ Option, ReactNode]] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* value */ Id, _]] = js.native
  
  var overrides: js.UndefOr[Select] = js.native
  
  var positive: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object TimezonePickerProps {
  
  @scala.inline
  def apply(): TimezonePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimezonePickerProps]
  }
  
  @scala.inline
  implicit class TimezonePickerPropsMutableBuilder[Self <: TimezonePickerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setMapLabels(value: /* args */ Option => ReactNode): Self = StObject.set(x, "mapLabels", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMapLabelsUndefined: Self = StObject.set(x, "mapLabels", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ Id => _): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOverrides(value: Select): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
