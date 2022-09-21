package typings.baseui

import typings.baseui.anon.Adapter
import typings.baseui.anon.Id
import typings.baseui.anon.IsMonthDropdownOpen
import typings.baseui.anon.Locale
import typings.baseui.baseuiStrings.next
import typings.baseui.baseuiStrings.previous
import typings.baseui.datepickerTypesMod.HeaderProps
import typings.react.mod.Component
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarHeaderMod {
  
  @JSImport("baseui/datepicker/calendar-header", JSImport.Default)
  @js.native
  open class default[T] protected () extends CalendarHeader[T] {
    def this(props: HeaderProps[T]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("baseui/datepicker/calendar-header", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/datepicker/calendar-header", "default.defaultProps")
    @js.native
    def defaultProps: Adapter = js.native
    inline def defaultProps_=(x: Adapter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CalendarHeader[T] extends Component[HeaderProps[T], IsMonthDropdownOpen, Any] {
    
    def canArrowsOpenDropdown(event: KeyboardEvent): Boolean = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MCalendarHeader(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MCalendarHeader(prevProps: HeaderProps[T]): Unit = js.native
    
    var dateHelpers: typings.baseui.dateHelpersMod.default[T] = js.native
    
    def decreaseMonth(): Unit = js.native
    
    def getDateProp(): T = js.native
    
    def getMonthItems(): Unit = js.native
    
    def getYearItems(): Unit = js.native
    
    def handleBlur(event: SyntheticEvent[Element, Event]): Unit = js.native
    
    def handleFocus(event: SyntheticEvent[Element, Event]): Unit = js.native
    
    def increaseMonth(): Unit = js.native
    
    def isHiddenPaginationButton(direction: next | previous): Boolean = js.native
    
    def isMultiMonthHorizontal(): Boolean = js.native
    
    var monthItems: js.Array[Id] = js.native
    
    def renderMonthYearDropdown(): typings.react.mod.global.JSX.Element = js.native
    
    def renderNextMonthButton(hasLocaleTheme: Locale): typings.react.mod.global.JSX.Element = js.native
    
    def renderPreviousMonthButton(hasLocaleTheme: Locale): typings.react.mod.global.JSX.Element = js.native
    
    var yearItems: js.Array[Id] = js.native
  }
}
