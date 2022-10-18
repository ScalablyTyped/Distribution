package typings.baseui

import typings.baseui.anon.Ariadescribedby
import typings.baseui.anon.`2`
import typings.baseui.datepickerTypesMod.DatepickerProps
import typings.baseui.datepickerTypesMod.InputRole
import typings.baseui.localeTypesMod.Locale
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datepickerDatepickerMod {
  
  @JSImport("baseui/datepicker/datepicker", JSImport.Default)
  @js.native
  open class default[T] protected () extends Datepicker[T] {
    def this(props: DatepickerProps[T]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("baseui/datepicker/datepicker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/datepicker/datepicker", "default.defaultProps")
    @js.native
    def defaultProps: Ariadescribedby = js.native
    inline def defaultProps_=(x: Ariadescribedby): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baseui/datepicker/datepicker", "DEFAULT_DATE_FORMAT")
  @js.native
  val DEFAULT_DATE_FORMAT: /* "yyyy/MM/dd" */ String = js.native
  
  @js.native
  trait Datepicker[T] extends Component[DatepickerProps[T], DatepickerState, Any] {
    
    var calendar: js.UndefOr[HTMLElement | Null] = js.native
    
    def close(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDatepicker(prevProps: DatepickerProps[T]): Unit = js.native
    
    var dateHelpers: typings.baseui.datepickerUtilsDateHelpersMod.default[T] = js.native
    
    def focusCalendar(): Unit = js.native
    
    def formatDate(date: T, formatString: String): String = js.native
    def formatDate(date: js.Array[js.UndefOr[T | Null]], formatString: String): String = js.native
    def formatDate(date: Null, formatString: String): String = js.native
    def formatDate(date: Unit, formatString: String): String = js.native
    
    def formatDisplayValue(): String = js.native
    def formatDisplayValue(a: T): String = js.native
    def formatDisplayValue(a: js.Array[js.UndefOr[T | Null]]): String = js.native
    
    def getMask(): String = js.native
    
    def getNullDatePlaceholder(formatString: String): String = js.native
    
    def handleChange(): Unit = js.native
    def handleChange(a: T): Unit = js.native
    def handleChange(a: js.Array[js.UndefOr[T | Null]]): Unit = js.native
    
    def handleEsc(): Unit = js.native
    
    def handleInputBlur(): Unit = js.native
    
    def handleInputChange(event: ChangeEvent[HTMLInputElement]): Unit = js.native
    def handleInputChange(event: ChangeEvent[HTMLInputElement], inputRole: InputRole): Unit = js.native
    
    def handleKeyDown(event: KeyboardEvent): Unit = js.native
    
    def hasLockedBehavior(): Boolean = js.native
    
    def normalizeDashes(inputValue: String): String = js.native
    
    def onCalendarSelect(a: `2`[T]): Unit = js.native
    
    def open(): Unit = js.native
    def open(inputRole: InputRole): Unit = js.native
    
    def renderInputComponent(locale: Locale): Element = js.native
    def renderInputComponent(locale: Locale, inputRole: InputRole): Element = js.native
  }
  
  trait DatepickerState extends StObject {
    
    var calendarFocused: Boolean
    
    var inputValue: js.UndefOr[String] = js.undefined
    
    var isOpen: Boolean
    
    var isPseudoFocused: Boolean
    
    var lastActiveElm: js.UndefOr[HTMLElement | Null] = js.undefined
    
    var selectedInput: js.UndefOr[InputRole | Null] = js.undefined
  }
  object DatepickerState {
    
    inline def apply(calendarFocused: Boolean, isOpen: Boolean, isPseudoFocused: Boolean): DatepickerState = {
      val __obj = js.Dynamic.literal(calendarFocused = calendarFocused.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], isPseudoFocused = isPseudoFocused.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatepickerState]
    }
    
    extension [Self <: DatepickerState](x: Self) {
      
      inline def setCalendarFocused(value: Boolean): Self = StObject.set(x, "calendarFocused", value.asInstanceOf[js.Any])
      
      inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      inline def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsPseudoFocused(value: Boolean): Self = StObject.set(x, "isPseudoFocused", value.asInstanceOf[js.Any])
      
      inline def setLastActiveElm(value: HTMLElement): Self = StObject.set(x, "lastActiveElm", value.asInstanceOf[js.Any])
      
      inline def setLastActiveElmNull: Self = StObject.set(x, "lastActiveElm", null)
      
      inline def setLastActiveElmUndefined: Self = StObject.set(x, "lastActiveElm", js.undefined)
      
      inline def setSelectedInput(value: InputRole): Self = StObject.set(x, "selectedInput", value.asInstanceOf[js.Any])
      
      inline def setSelectedInputNull: Self = StObject.set(x, "selectedInput", null)
      
      inline def setSelectedInputUndefined: Self = StObject.set(x, "selectedInput", js.undefined)
    }
  }
}
