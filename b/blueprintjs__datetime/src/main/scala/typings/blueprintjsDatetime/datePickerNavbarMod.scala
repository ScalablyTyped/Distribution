package typings.blueprintjsDatetime

import typings.react.mod.PureComponent
import typings.reactDayPicker.propsMod.NavbarElementProps
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerNavbarMod {
  
  @JSImport("@blueprintjs/datetime/lib/esm/datePickerNavbar", "DatePickerNavbar")
  @js.native
  class DatePickerNavbar protected ()
    extends PureComponent[IDatePickerNavbarProps, js.Object, js.Any] {
    def this(props: IDatePickerNavbarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IDatePickerNavbarProps, context: js.Any) = this()
    
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
