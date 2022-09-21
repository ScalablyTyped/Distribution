package typings.baseui

import typings.baseui.timepickerTimepickerMod.default
import typings.baseui.timepickerTypesMod.TimePickerDefaultProps
import typings.baseui.timepickerTypesMod.TimePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timepickerMod {
  
  @JSImport("baseui/timepicker", "TimePicker")
  @js.native
  open class TimePicker[T] protected () extends default[T] {
    def this(props: TimePickerProps[T]) = this()
  }
  object TimePicker {
    
    @JSImport("baseui/timepicker", "TimePicker")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("baseui/timepicker", "TimePicker.defaultProps")
    @js.native
    def defaultProps: TimePickerDefaultProps = js.native
    inline def defaultProps_=(x: TimePickerDefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
