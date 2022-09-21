package typings.baseui

import typings.baseui.anon.AriaRoleDescCalMonth
import typings.baseui.anon.CalendarPropsunknownadapt
import typings.baseui.anon.DateEvent
import typings.baseui.anon.DateT
import typings.baseui.anon.`5`
import typings.baseui.datepickerTypesMod.CalendarInternalState
import typings.baseui.datepickerTypesMod.CalendarProps
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarMod {
  
  @JSImport("baseui/datepicker/calendar", JSImport.Default)
  @js.native
  open class default[T] protected () extends Calendar[T] {
    def this(props: CalendarProps[T]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("baseui/datepicker/calendar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/datepicker/calendar", "default.defaultProps")
    @js.native
    def defaultProps: CalendarPropsunknownadapt = js.native
    inline def defaultProps_=(x: CalendarPropsunknownadapt): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Calendar[T] extends Component[CalendarProps[T], CalendarInternalState[T], Any] {
    
    def blurCalendar(): Unit = js.native
    
    var calendar: HTMLElement = js.native
    
    def changeMonth(a: DateT[T]): Any = js.native
    
    def changeYear(a: DateT[T]): Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MCalendar(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MCalendar(prevProps: CalendarProps[T]): Unit = js.native
    
    var dateHelpers: typings.baseui.dateHelpersMod.default[T] = js.native
    
    def focusCalendar(): Unit = js.native
    
    def getDateInView(): T = js.native
    
    def getSingleDate(): js.UndefOr[T | Null] = js.native
    def getSingleDate(value: T): js.UndefOr[T | Null] = js.native
    def getSingleDate(value: js.Array[js.UndefOr[T | Null]]): js.UndefOr[T | Null] = js.native
    
    def handleArrowKey(key: String): Unit = js.native
    
    /** Responsible for merging time values into date values. Note: the 'Day' component
      * determines how the days themselves change when a new day is selected. */
    def handleDateChange(a: `5`[T]): Unit = js.native
    
    def handleMonthChange(a: T): Unit = js.native
    
    def handleTabbing(event: KeyboardEvent): Unit = js.native
    
    def handleTimeChange(time: T, index: Double): Unit = js.native
    
    def handleYearChange(a: T): Unit = js.native
    
    def isInView(date: T): Boolean = js.native
    
    def onDayFocus(a: DateEvent[T]): Any = js.native
    
    def onDayMouseLeave(a: DateEvent[T]): Any = js.native
    
    def onDayMouseOver(a: DateEvent[T]): Any = js.native
    
    def onKeyDown(event: KeyboardEvent): Unit = js.native
    
    def renderCalendarHeader(b: T, a: Double): ReactNode = js.native
    
    def renderMonths(translations: AriaRoleDescCalMonth): Element = js.native
    
    def renderQuickSelect(): Element = js.native
    
    def renderTimeSelect(c: T, b: js.Function, a: String): ReactNode = js.native
    def renderTimeSelect(c: Null, b: js.Function, a: String): ReactNode = js.native
    def renderTimeSelect(c: Unit, b: js.Function, a: String): ReactNode = js.native
    
    def setHighlightedDate(date: T): Unit = js.native
  }
}
