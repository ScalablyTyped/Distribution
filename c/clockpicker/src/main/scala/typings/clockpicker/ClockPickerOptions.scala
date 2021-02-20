package typings.clockpicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClockPickerOptions extends StObject {
  
  var default: js.UndefOr[String] = js.native
  
  var afterDone: js.UndefOr[js.Function0[Unit]] = js.native
  
  var afterHide: js.UndefOr[js.Function0[Unit]] = js.native
  
  var afterHourSelect: js.UndefOr[js.Function0[Unit]] = js.native
  
  var afterShow: js.UndefOr[js.Function0[Unit]] = js.native
  
  var align: js.UndefOr[String] = js.native
  
  var autoclose: js.UndefOr[Boolean] = js.native
  
  var beforeDone: js.UndefOr[js.Function0[Unit]] = js.native
  
  var beforeHide: js.UndefOr[js.Function0[Unit]] = js.native
  
  var beforeHourSelect: js.UndefOr[js.Function0[Unit]] = js.native
  
  var beforeShow: js.UndefOr[js.Function0[Unit]] = js.native
  
  var donetext: js.UndefOr[String] = js.native
  
  var fromnow: js.UndefOr[Double] = js.native
  
  var init: js.UndefOr[js.Function0[Unit]] = js.native
  
  var placement: js.UndefOr[String] = js.native
  
  var twelvehour: js.UndefOr[Boolean] = js.native
  
  var vibrate: js.UndefOr[Boolean] = js.native
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
