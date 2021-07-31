package typings.baseui.datepickerMod

import typings.react.mod.Component
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/datepicker", "TimezonePicker")
@js.native
class TimezonePicker protected ()
  extends Component[TimezonePickerProps, TimezonePickerState, js.Any] {
  def this(props: TimezonePickerProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: TimezonePickerProps, context: js.Any) = this()
  
  def buildTimezones(compareDate: Date): js.Array[String] = js.native
}
