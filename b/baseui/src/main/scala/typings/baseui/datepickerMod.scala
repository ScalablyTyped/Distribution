package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.anon.Ariadescribedby
import typings.baseui.anon.CalendarPropsunknownadapt
import typings.baseui.anon.Orientation
import typings.baseui.anon.`1`
import typings.baseui.anon.`3`
import typings.baseui.anon.separateRangeInputsboolea
import typings.baseui.baseuiStrings.button
import typings.baseui.baseuiStrings.change_
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.span
import typings.baseui.datepickerCalendarMod.default
import typings.baseui.datepickerStatefulContainerMod.InputProps
import typings.baseui.datepickerStatefulContainerMod.Props
import typings.baseui.datepickerTypesMod.CalendarProps
import typings.baseui.datepickerTypesMod.ContainerState
import typings.baseui.datepickerTypesMod.DatepickerProps
import typings.baseui.datepickerTypesMod.SharedStyleProps
import typings.baseui.datepickerTypesMod.StateReducer
import typings.baseui.datepickerUtilsTypesMod.DateIOAdapter
import typings.baseui.timepickerTypesMod.TimePickerDefaultProps
import typings.baseui.timepickerTypesMod.TimePickerProps
import typings.react.mod.ReactNode
import typings.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datepickerMod {
  
  @JSImport("baseui/datepicker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baseui/datepicker", "Calendar")
  @js.native
  open class Calendar[T] protected () extends default[T] {
    def this(props: CalendarProps[T]) = this()
  }
  /* static members */
  object Calendar {
    
    @JSImport("baseui/datepicker", "Calendar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/datepicker", "Calendar.defaultProps")
    @js.native
    def defaultProps: CalendarPropsunknownadapt = js.native
    inline def defaultProps_=(x: CalendarPropsunknownadapt): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  object DENSITY extends Shortcut {
    
    @JSImport("baseui/datepicker", "DENSITY.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/datepicker", "DENSITY.high")
    @js.native
    val high: typings.baseui.baseuiStrings.high = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `DENSITY.foo` */
    override def _to: default_ = default
  }
  
  @JSImport("baseui/datepicker", "DatePicker")
  @js.native
  open class DatePicker_[T] protected ()
    extends typings.baseui.datepickerDatepickerMod.default[T] {
    def this(props: DatepickerProps[T]) = this()
  }
  /* static members */
  object DatePicker_ {
    
    @JSImport("baseui/datepicker", "DatePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/datepicker", "DatePicker.defaultProps")
    @js.native
    def defaultProps: Ariadescribedby = js.native
    inline def defaultProps_=(x: Ariadescribedby): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baseui/datepicker", "Datepicker")
  @js.native
  open class Datepicker[T] protected ()
    extends typings.baseui.datepickerDatepickerMod.default[T] {
    def this(props: DatepickerProps[T]) = this()
  }
  /* static members */
  object Datepicker {
    
    @JSImport("baseui/datepicker", "Datepicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/datepicker", "Datepicker.defaultProps")
    @js.native
    def defaultProps: Ariadescribedby = js.native
    inline def defaultProps_=(x: Ariadescribedby): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined std.Readonly<{ readonly horizontal :'horizontal',  readonly vertical :'vertical'}> */
  object ORIENTATION {
    
    @JSImport("baseui/datepicker", "ORIENTATION.horizontal")
    @js.native
    val horizontal: typings.baseui.baseuiStrings.horizontal = js.native
    
    @JSImport("baseui/datepicker", "ORIENTATION.vertical")
    @js.native
    val vertical: typings.baseui.baseuiStrings.vertical = js.native
  }
  
  /* Inlined std.Readonly<{ readonly change :'change',  readonly moveUp :'moveUp',  readonly moveDown :'moveDown',  readonly moveLeft :'moveLeft',  readonly moveRight :'moveRight',  readonly mouseOver :'mouseOver',  readonly mouseLeave :'mouseLeave'}> */
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/datepicker", "STATE_CHANGE_TYPE.change")
    @js.native
    val change: change_ = js.native
    
    @JSImport("baseui/datepicker", "STATE_CHANGE_TYPE.mouseLeave")
    @js.native
    val mouseLeave: typings.baseui.baseuiStrings.mouseLeave = js.native
    
    @JSImport("baseui/datepicker", "STATE_CHANGE_TYPE.mouseOver")
    @js.native
    val mouseOver: typings.baseui.baseuiStrings.mouseOver = js.native
    
    @JSImport("baseui/datepicker", "STATE_CHANGE_TYPE.moveDown")
    @js.native
    val moveDown: typings.baseui.baseuiStrings.moveDown = js.native
    
    @JSImport("baseui/datepicker", "STATE_CHANGE_TYPE.moveLeft")
    @js.native
    val moveLeft: typings.baseui.baseuiStrings.moveLeft = js.native
    
    @JSImport("baseui/datepicker", "STATE_CHANGE_TYPE.moveRight")
    @js.native
    val moveRight: typings.baseui.baseuiStrings.moveRight = js.native
    
    @JSImport("baseui/datepicker", "STATE_CHANGE_TYPE.moveUp")
    @js.native
    val moveUp: typings.baseui.baseuiStrings.moveUp = js.native
  }
  
  @JSImport("baseui/datepicker", "StatefulCalendar")
  @js.native
  open class StatefulCalendar[T] ()
    extends typings.baseui.datepickerStatefulCalendarMod.default[T]
  object StatefulCalendar {
    
    @JSImport("baseui/datepicker", "StatefulCalendar")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("baseui/datepicker", "StatefulCalendar.defaultProps")
    @js.native
    def defaultProps: typings.baseui.datepickerStatefulCalendarMod.DatepickerProps[Any] = js.native
    inline def defaultProps_=(x: typings.baseui.datepickerStatefulCalendarMod.DatepickerProps[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baseui/datepicker", "StatefulContainer")
  @js.native
  open class StatefulContainer[T] protected ()
    extends typings.baseui.datepickerStatefulContainerMod.default[T] {
    def this(props: Props[T]) = this()
  }
  object StatefulContainer {
    
    /* static member */
    /* Inlined {  stateReducer :baseui.baseui/datepicker/types.StateReducer<unknown>} & std.Partial<baseui.baseui/datepicker/stateful-container.Props<unknown>> */
    object defaultProps {
      
      @JSImport("baseui/datepicker", "StatefulContainer.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/datepicker", "StatefulContainer.defaultProps.adapter")
      @js.native
      def adapter: js.UndefOr[DateIOAdapter[Any]] = js.native
      inline def adapter_=(x: js.UndefOr[DateIOAdapter[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("adapter")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/datepicker", "StatefulContainer.defaultProps.children")
      @js.native
      def children: js.UndefOr[js.Function1[/* a */ InputProps[Any], ReactNode]] = js.native
      inline def children_=(x: js.UndefOr[js.Function1[/* a */ InputProps[Any], ReactNode]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/datepicker", "StatefulContainer.defaultProps.initialState")
      @js.native
      def initialState: js.UndefOr[ContainerState[Any]] = js.native
      inline def initialState_=(x: js.UndefOr[ContainerState[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialState")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/datepicker", "StatefulContainer.defaultProps.onChange")
      @js.native
      def onChange: js.UndefOr[js.Function1[/* a */ `3`, Any]] = js.native
      inline def onChange_=(x: js.UndefOr[js.Function1[/* a */ `3`, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/datepicker", "StatefulContainer.defaultProps.onRangeChange")
      @js.native
      def onRangeChange: js.UndefOr[js.Function1[/* a */ `1`, Any]] = js.native
      inline def onRangeChange_=(x: js.UndefOr[js.Function1[/* a */ `1`, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRangeChange")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/datepicker", "StatefulContainer.defaultProps.range")
      @js.native
      def range: js.UndefOr[Boolean] = js.native
      inline def range_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("range")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/datepicker", "StatefulContainer.defaultProps.stateReducer")
      @js.native
      def stateReducer: js.UndefOr[StateReducer[Any]] = js.native
      inline def stateReducer_=(x: js.UndefOr[StateReducer[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/datepicker", "StatefulDatePicker")
  @js.native
  open class StatefulDatePicker_[T] ()
    extends typings.baseui.datepickerStatefulDatepickerMod.default[T]
  object StatefulDatePicker_ {
    
    @JSImport("baseui/datepicker", "StatefulDatePicker")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("baseui/datepicker", "StatefulDatePicker.defaultProps")
    @js.native
    def defaultProps: typings.baseui.datepickerStatefulDatepickerMod.Props[Any] = js.native
    inline def defaultProps_=(x: typings.baseui.datepickerStatefulDatepickerMod.Props[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baseui/datepicker", "StatefulDatepicker")
  @js.native
  open class StatefulDatepicker[T] ()
    extends typings.baseui.datepickerStatefulDatepickerMod.default[T]
  object StatefulDatepicker {
    
    @JSImport("baseui/datepicker", "StatefulDatepicker")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("baseui/datepicker", "StatefulDatepicker.defaultProps")
    @js.native
    def defaultProps: typings.baseui.datepickerStatefulDatepickerMod.Props[Any] = js.native
    inline def defaultProps_=(x: typings.baseui.datepickerStatefulDatepickerMod.Props[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baseui/datepicker", "StyledCalendarContainer")
  @js.native
  val StyledCalendarContainer: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/datepicker", "StyledCalendarHeader")
  @js.native
  val StyledCalendarHeader: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/datepicker", "StyledDay")
  @js.native
  val StyledDay: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/datepicker", "StyledDayLabel")
  @js.native
  val StyledDayLabel: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/datepicker", "StyledEndDate")
  @js.native
  val StyledEndDate: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/datepicker", "StyledInputLabel")
  @js.native
  val StyledInputLabel: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/datepicker", "StyledInputWrapper")
  @js.native
  val StyledInputWrapper: StyletronComponent[div, separateRangeInputsboolea] = js.native
  
  @JSImport("baseui/datepicker", "StyledMonth")
  @js.native
  val StyledMonth: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/datepicker", "StyledMonthContainer")
  @js.native
  val StyledMonthContainer: StyletronComponent[div, Orientation] = js.native
  
  @JSImport("baseui/datepicker", "StyledMonthHeader")
  @js.native
  val StyledMonthHeader: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/datepicker", "StyledMonthYearSelectButton")
  @js.native
  val StyledMonthYearSelectButton: StyletronComponent[button, SharedStyleProps] = js.native
  
  @JSImport("baseui/datepicker", "StyledMonthYearSelectIconContainer")
  @js.native
  val StyledMonthYearSelectIconContainer: StyletronComponent[span, js.Object] = js.native
  
  @JSImport("baseui/datepicker", "StyledNextButton")
  @js.native
  val StyledNextButton: StyletronComponent[button, SharedStyleProps] = js.native
  
  @JSImport("baseui/datepicker", "StyledPrevButton")
  @js.native
  val StyledPrevButton: StyletronComponent[button, SharedStyleProps] = js.native
  
  @JSImport("baseui/datepicker", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/datepicker", "StyledSelectorContainer")
  @js.native
  val StyledSelectorContainer: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/datepicker", "StyledStartDate")
  @js.native
  val StyledStartDate: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/datepicker", "StyledWeek")
  @js.native
  val StyledWeek: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/datepicker", "StyledWeekdayHeader")
  @js.native
  val StyledWeekdayHeader: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/datepicker", "TimePicker")
  @js.native
  open class TimePicker[T] protected ()
    extends typings.baseui.timepickerMod.TimePicker[T] {
    def this(props: TimePickerProps[T]) = this()
  }
  object TimePicker {
    
    @JSImport("baseui/datepicker", "TimePicker")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("baseui/datepicker", "TimePicker.defaultProps")
    @js.native
    def defaultProps: TimePickerDefaultProps = js.native
    inline def defaultProps_=(x: TimePickerDefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baseui/datepicker", "TimezonePicker")
  @js.native
  open class TimezonePicker ()
    extends typings.baseui.timezonepickerMod.TimezonePicker
  
  inline def formatDate(c: js.Date, b: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(c.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatDate(c: js.Date, b: String, a: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(c.asInstanceOf[js.Any], b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type SharedStylePropsT = SharedStyleProps
}
