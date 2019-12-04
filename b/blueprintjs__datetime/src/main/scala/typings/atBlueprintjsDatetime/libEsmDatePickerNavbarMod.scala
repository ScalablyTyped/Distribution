package typings.atBlueprintjsDatetime

import typings.atBlueprintjsDatetime.libEsmDatePickerNavbarMod.IDatePickerNavbarProps
import typings.react.reactMod.Component
import typings.reactDashDayDashPicker.typesPropsMod.NavbarElementProps
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/datetime/lib/esm/datePickerNavbar", JSImport.Namespace)
@js.native
object libEsmDatePickerNavbarMod extends js.Object {
  @js.native
  class DatePickerNavbar ()
    extends Component[IDatePickerNavbarProps, js.Object, js.Any] {
    var handleNextClick: js.Any = js.native
    var handlePreviousClick: js.Any = js.native
  }
  
  @js.native
  trait IDatePickerNavbarProps extends NavbarElementProps {
    var hideLeftNavButton: js.UndefOr[Boolean] = js.native
    var hideRightNavButton: js.UndefOr[Boolean] = js.native
    var maxDate: Date = js.native
    var minDate: Date = js.native
  }
  
}

