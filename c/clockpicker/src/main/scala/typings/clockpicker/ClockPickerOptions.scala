package typings.clockpicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClockPickerOptions extends StObject {
  
  var default: js.UndefOr[String] = js.undefined
  
  var afterDone: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var afterHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var afterHourSelect: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var afterShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var align: js.UndefOr[String] = js.undefined
  
  var autoclose: js.UndefOr[Boolean] = js.undefined
  
  var beforeDone: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var beforeHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var beforeHourSelect: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var beforeShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var donetext: js.UndefOr[String] = js.undefined
  
  var fromnow: js.UndefOr[Double] = js.undefined
  
  var init: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var placement: js.UndefOr[String] = js.undefined
  
  var twelvehour: js.UndefOr[Boolean] = js.undefined
  
  var vibrate: js.UndefOr[Boolean] = js.undefined
}
object ClockPickerOptions {
  
  @scala.inline
  def apply(): ClockPickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClockPickerOptions]
  }
  
  @scala.inline
  implicit class ClockPickerOptionsMutableBuilder[Self <: ClockPickerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterDone(value: () => Unit): Self = StObject.set(x, "afterDone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAfterDoneUndefined: Self = StObject.set(x, "afterDone", js.undefined)
    
    @scala.inline
    def setAfterHide(value: () => Unit): Self = StObject.set(x, "afterHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAfterHideUndefined: Self = StObject.set(x, "afterHide", js.undefined)
    
    @scala.inline
    def setAfterHourSelect(value: () => Unit): Self = StObject.set(x, "afterHourSelect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAfterHourSelectUndefined: Self = StObject.set(x, "afterHourSelect", js.undefined)
    
    @scala.inline
    def setAfterShow(value: () => Unit): Self = StObject.set(x, "afterShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAfterShowUndefined: Self = StObject.set(x, "afterShow", js.undefined)
    
    @scala.inline
    def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setAutoclose(value: Boolean): Self = StObject.set(x, "autoclose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutocloseUndefined: Self = StObject.set(x, "autoclose", js.undefined)
    
    @scala.inline
    def setBeforeDone(value: () => Unit): Self = StObject.set(x, "beforeDone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeforeDoneUndefined: Self = StObject.set(x, "beforeDone", js.undefined)
    
    @scala.inline
    def setBeforeHide(value: () => Unit): Self = StObject.set(x, "beforeHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeforeHideUndefined: Self = StObject.set(x, "beforeHide", js.undefined)
    
    @scala.inline
    def setBeforeHourSelect(value: () => Unit): Self = StObject.set(x, "beforeHourSelect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeforeHourSelectUndefined: Self = StObject.set(x, "beforeHourSelect", js.undefined)
    
    @scala.inline
    def setBeforeShow(value: () => Unit): Self = StObject.set(x, "beforeShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeforeShowUndefined: Self = StObject.set(x, "beforeShow", js.undefined)
    
    @scala.inline
    def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setDonetext(value: String): Self = StObject.set(x, "donetext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDonetextUndefined: Self = StObject.set(x, "donetext", js.undefined)
    
    @scala.inline
    def setFromnow(value: Double): Self = StObject.set(x, "fromnow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromnowUndefined: Self = StObject.set(x, "fromnow", js.undefined)
    
    @scala.inline
    def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setTwelvehour(value: Boolean): Self = StObject.set(x, "twelvehour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwelvehourUndefined: Self = StObject.set(x, "twelvehour", js.undefined)
    
    @scala.inline
    def setVibrate(value: Boolean): Self = StObject.set(x, "vibrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVibrateUndefined: Self = StObject.set(x, "vibrate", js.undefined)
  }
}
