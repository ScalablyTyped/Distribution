package typings.daterangepicker

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.daterangepicker.anon.DefaultOptions
import typings.daterangepicker.anon.RequiredLocale
import typings.daterangepicker.daterangepickerBooleans.`false`
import typings.daterangepicker.daterangepickerStrings.auto
import typings.daterangepicker.daterangepickerStrings.center
import typings.daterangepicker.daterangepickerStrings.down
import typings.daterangepicker.daterangepickerStrings.left
import typings.daterangepicker.daterangepickerStrings.right
import typings.daterangepicker.daterangepickerStrings.up
import typings.daterangepicker.mod.global.JQuery
import typings.jquery.JQueryEventObject
import typings.moment.mod.DurationInputArg1
import typings.moment.mod.Moment
import typings.std.Date
import typings.std.Element
import typings.std.Event
import typings.std.FlatArray
import typings.std.HTMLElement
import typings.std.IterableIterator
import typings.std.anon.CopyWithin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("daterangepicker", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends typings.daterangepicker.mod.daterangepicker {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: Options) = this()
    def this(element: HTMLElement, options: js.UndefOr[scala.Nothing], callback: DataRangePickerCallback) = this()
    def this(element: HTMLElement, options: Options, callback: DataRangePickerCallback) = this()
  }
  
  @js.native
  trait Calendar extends StObject {
    
    var calendar: Month = js.native
    
    var month: Moment = js.native
  }
  object Calendar {
    
    @scala.inline
    def apply(calendar: Month, month: Moment): Calendar = {
      val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any])
      __obj.asInstanceOf[Calendar]
    }
    
    @scala.inline
    implicit class CalendarMutableBuilder[Self <: Calendar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalendar(value: Month): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonth(value: Moment): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    }
  }
  
  type DataRangePickerCallback = js.Function3[/* start */ Moment, /* end */ Moment, /* label */ String | Null, Unit]
  
  type DateOrString = String | Moment | Date
  
  @js.native
  trait DateRangePicker_ extends StObject {
    
    var alwaysShowCalendars: Boolean = js.native
    
    var applyButtonClasses: String = js.native
    
    var autoApply: Boolean = js.native
    
    var autoUpdateInput: Boolean = js.native
    
    var buttonClasses: js.Array[String] = js.native
    
    var cancelButtonClasses: String = js.native
    
    var chosenLabel: js.UndefOr[String] = js.native
    
    var container: JQuery = js.native
    
    var drops: down | up = js.native
    
    var element: JQuery = js.native
    
    var endDate: Moment = js.native
    
    def isCustomDate(date: DateOrString): js.UndefOr[String | js.Array[String] | `false`] = js.native
    
    def isInvalidDate(startDate: DateOrString): Boolean = js.native
    def isInvalidDate(startDate: DateOrString, endDate: DateOrString): Boolean = js.native
    
    var isShowing: Boolean = js.native
    
    var leftCalendar: Calendar = js.native
    
    var linkedCalendars: Boolean = js.native
    
    var locale: RequiredLocale = js.native
    
    var maxDate: Moment = js.native
    
    var maxSpan: DurationInputArg1 | Boolean = js.native
    
    var maxYear: Double = js.native
    
    var minDate: Moment = js.native
    
    var minYear: Double = js.native
    
    var oldEndDate: Moment = js.native
    
    var oldStartDate: Moment = js.native
    
    var opens: left | right | center = js.native
    
    var parentEl: JQuery = js.native
    
    var previousRightTime: Moment = js.native
    
    var ranges: StringDictionary[js.Tuple2[DateOrString, DateOrString]] = js.native
    
    var rightCalendar: Calendar = js.native
    
    var showCustomRangeLabel: Boolean = js.native
    
    var showDropdowns: Boolean = js.native
    
    var showISOWeekNumbers: Boolean = js.native
    
    var showWeekNumbers: Boolean = js.native
    
    var singleDatePicker: Boolean = js.native
    
    var startDate: Moment = js.native
    
    var timePicker: Boolean = js.native
    
    var timePicker24Hour: Boolean = js.native
    
    var timePickerIncrement: Double = js.native
    
    var timePickerSeconds: Boolean = js.native
  }
  
  @js.native
  trait DatepickerEventObject extends JQueryEventObject {
    
    var date: Date = js.native
    
    def format(): String = js.native
    def format(format: String): String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.daterangepicker.daterangepickerStrings.showDotdaterangepicker
    - typings.daterangepicker.daterangepickerStrings.hideDotdaterangepicker
    - typings.daterangepicker.daterangepickerStrings.showCalendarDotdaterangepicker
    - typings.daterangepicker.daterangepickerStrings.hideCalendarDotdaterangepicker
    - typings.daterangepicker.daterangepickerStrings.applyDotdaterangepicker
    - typings.daterangepicker.daterangepickerStrings.cancelDotdaterangepicker
  */
  trait DatepickerEvents extends StObject
  object DatepickerEvents {
    
    @scala.inline
    def applyDotdaterangepicker: typings.daterangepicker.daterangepickerStrings.applyDotdaterangepicker = "apply.daterangepicker".asInstanceOf[typings.daterangepicker.daterangepickerStrings.applyDotdaterangepicker]
    
    @scala.inline
    def cancelDotdaterangepicker: typings.daterangepicker.daterangepickerStrings.cancelDotdaterangepicker = "cancel.daterangepicker".asInstanceOf[typings.daterangepicker.daterangepickerStrings.cancelDotdaterangepicker]
    
    @scala.inline
    def hideCalendarDotdaterangepicker: typings.daterangepicker.daterangepickerStrings.hideCalendarDotdaterangepicker = "hideCalendar.daterangepicker".asInstanceOf[typings.daterangepicker.daterangepickerStrings.hideCalendarDotdaterangepicker]
    
    @scala.inline
    def hideDotdaterangepicker: typings.daterangepicker.daterangepickerStrings.hideDotdaterangepicker = "hide.daterangepicker".asInstanceOf[typings.daterangepicker.daterangepickerStrings.hideDotdaterangepicker]
    
    @scala.inline
    def showCalendarDotdaterangepicker: typings.daterangepicker.daterangepickerStrings.showCalendarDotdaterangepicker = "showCalendar.daterangepicker".asInstanceOf[typings.daterangepicker.daterangepickerStrings.showCalendarDotdaterangepicker]
    
    @scala.inline
    def showDotdaterangepicker: typings.daterangepicker.daterangepickerStrings.showDotdaterangepicker = "show.daterangepicker".asInstanceOf[typings.daterangepicker.daterangepickerStrings.showDotdaterangepicker]
  }
  
  @js.native
  trait Locale extends StObject {
    
    /**
      * Text for apply label.
      */
    var applyLabel: js.UndefOr[String] = js.native
    
    /**
      * Text for cancel label.
      */
    var cancelLabel: js.UndefOr[String] = js.native
    
    /**
      * Text for the custom range label.
      */
    var customRangeLabel: js.UndefOr[String] = js.native
    
    /**
      * Weekday names displayed in the header of calendar.
      */
    var daysOfWeek: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The first day of the week (0-6, Sunday to Saturday).
      */
    var firstDay: js.UndefOr[Double] = js.native
    
    /**
      * Format of the date string. example: 'YYYY-MM-DD'
      */
    var format: js.UndefOr[String] = js.native
    
    /**
      * Text for fromLabel label.
      */
    var fromLabel: js.UndefOr[String] = js.native
    
    /**
      * Month names used in the month select boxes.
      */
    var monthNames: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Separator between the startDate and endDate in the attached input element. Example: ' - '
      */
    var separator: js.UndefOr[String] = js.native
    
    /**
      * Text for toLabel label.
      */
    var toLabel: js.UndefOr[String] = js.native
    
    /**
      * Text for the week label.
      */
    var weekLabel: js.UndefOr[String] = js.native
  }
  object Locale {
    
    @scala.inline
    def apply(): Locale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit class LocaleMutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyLabel(value: String): Self = StObject.set(x, "applyLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyLabelUndefined: Self = StObject.set(x, "applyLabel", js.undefined)
      
      @scala.inline
      def setCancelLabel(value: String): Self = StObject.set(x, "cancelLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelLabelUndefined: Self = StObject.set(x, "cancelLabel", js.undefined)
      
      @scala.inline
      def setCustomRangeLabel(value: String): Self = StObject.set(x, "customRangeLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomRangeLabelUndefined: Self = StObject.set(x, "customRangeLabel", js.undefined)
      
      @scala.inline
      def setDaysOfWeek(value: js.Array[String]): Self = StObject.set(x, "daysOfWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysOfWeekUndefined: Self = StObject.set(x, "daysOfWeek", js.undefined)
      
      @scala.inline
      def setDaysOfWeekVarargs(value: String*): Self = StObject.set(x, "daysOfWeek", js.Array(value :_*))
      
      @scala.inline
      def setFirstDay(value: Double): Self = StObject.set(x, "firstDay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstDayUndefined: Self = StObject.set(x, "firstDay", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setFromLabel(value: String): Self = StObject.set(x, "fromLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromLabelUndefined: Self = StObject.set(x, "fromLabel", js.undefined)
      
      @scala.inline
      def setMonthNames(value: js.Array[String]): Self = StObject.set(x, "monthNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthNamesUndefined: Self = StObject.set(x, "monthNames", js.undefined)
      
      @scala.inline
      def setMonthNamesVarargs(value: String*): Self = StObject.set(x, "monthNames", js.Array(value :_*))
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setToLabel(value: String): Self = StObject.set(x, "toLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToLabelUndefined: Self = StObject.set(x, "toLabel", js.undefined)
      
      @scala.inline
      def setWeekLabel(value: String): Self = StObject.set(x, "weekLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekLabelUndefined: Self = StObject.set(x, "weekLabel", js.undefined)
    }
  }
  
  /* Inlined std.Array<std.Array<moment.moment.Moment>> & {  firstDay :moment.moment.Moment,   lastDay :moment.moment.Moment} */
  @js.native
  trait Month
    extends /* n */ NumberDictionary[js.Array[Moment]] {
    
    /**
      * Combines two or more arrays.
      * @param items Additional items to add to the end of array1.
      */
    def concat(items: (js.Array[js.Array[Moment] | Moment])*): js.Array[js.Array[Moment]] = js.native
    
    /**
      * Returns the this object after copying a section of the array identified by start and end
      * to the same array starting at position target
      * @param target If target is negative, it is treated as length+target where length is the
      * length of the array.
      * @param start If start is negative, it is treated as length+start. If end is negative, it
      * is treated as length+end.
      * @param end If not specified, length of the this object is used as its default value.
      */
    def copyWithin(target: Double, start: Double): this.type = js.native
    def copyWithin(target: Double, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    def entries(): IterableIterator[js.Tuple2[Double, js.Array[Moment]]] = js.native
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    def every(
      predicate: js.Function3[
          /* value */ js.Array[Moment], 
          /* index */ Double, 
          /* array */ js.Array[js.Array[Moment]], 
          _
        ]
    ): Boolean = js.native
    def every(
      predicate: js.Function3[
          /* value */ js.Array[Moment], 
          /* index */ Double, 
          /* array */ js.Array[js.Array[Moment]], 
          _
        ],
      thisArg: js.Any
    ): Boolean = js.native
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSName("every")
    def every_S_ArrayMoment[S /* <: js.Array[Moment] */](
      predicate: js.Function3[
          /* value */ js.Array[Moment], 
          /* index */ Double, 
          /* array */ js.Array[js.Array[Moment]], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = js.native
    @JSName("every")
    def every_S_ArrayMoment[S /* <: js.Array[Moment] */](
      predicate: js.Function3[
          /* value */ js.Array[Moment], 
          /* index */ Double, 
          /* array */ js.Array[js.Array[Moment]], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): /* is std.Array<S> */ Boolean = js.native
    
    /**
      * Returns the this object after filling the section identified by start and end with value
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    def fill(value: js.Array[Moment]): this.type = js.native
    def fill(value: js.Array[Moment], start: js.UndefOr[scala.Nothing], end: Double): this.type = js.native
    def fill(value: js.Array[Moment], start: Double): this.type = js.native
    def fill(value: js.Array[Moment], start: Double, end: Double): this.type = js.native
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    def filter(
      predicate: js.Function3[
          /* value */ js.Array[Moment], 
          /* index */ Double, 
          /* array */ js.Array[js.Array[Moment]], 
          _
        ]
    ): js.Array[js.Array[Moment]] = js.native
    def filter(
      predicate: js.Function3[
          /* value */ js.Array[Moment], 
          /* index */ Double, 
          /* array */ js.Array[js.Array[Moment]], 
          _
        ],
      thisArg: js.Any
    ): js.Array[js.Array[Moment]] = js.native
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSName("filter")
    def filter_S_ArrayMoment[S /* <: js.Array[Moment] */](
      predicate: js.Function3[
          /* value */ js.Array[Moment], 
          /* index */ Double, 
          /* array */ js.Array[js.Array[Moment]], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = js.native
    @JSName("filter")
    def filter_S_ArrayMoment[S /* <: js.Array[Moment] */](
      predicate: js.Function3[
          /* value */ js.Array[Moment], 
          /* index */ Double, 
          /* array */ js.Array[js.Array[Moment]], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.Array[S] = js.native
    
    def find(
      predicate: js.Function3[
          /* value */ js.Array[Moment], 
          /* index */ Double, 
          /* obj */ js.Array[js.Array[Moment]], 
          _
        ]
    ): js.UndefOr[js.Array[Moment]] = js.native
    def find(
      predicate: js.Function3[
          /* value */ js.Array[Moment], 
          /* index */ Double, 
          /* obj */ js.Array[js.Array[Moment]], 
          _
        ],
      thisArg: js.Any
    ): js.UndefOr[js.Array[Moment]] = js.native
    /**
      * Returns the value of the first element in the array where predicate is true, and undefined
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found, find
      * immediately returns that element value. Otherwise, find returns undefined.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    def find[S /* <: js.Array[Moment] */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ js.Array[Moment], 
          /* index */ Double, 
          /* obj */ js.Array[js.Array[Moment]], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    def find[S /* <: js.Array[Moment] */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ js.Array[Moment], 
          /* index */ Double, 
          /* obj */ js.Array[js.Array[Moment]], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.UndefOr[S] = js.native
    
    /**
      * Returns the index of the first element in the array where predicate is true, and -1
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found,
      * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    def findIndex(
      predicate: js.Function3[
          /* value */ js.Array[Moment], 
          /* index */ Double, 
          /* obj */ js.Array[js.Array[Moment]], 
          _
        ]
    ): Double = js.native
    def findIndex(
      predicate: js.Function3[
          /* value */ js.Array[Moment], 
          /* index */ Double, 
          /* obj */ js.Array[js.Array[Moment]], 
          _
        ],
      thisArg: js.Any
    ): Double = js.native
    
    var firstDay: Moment = js.native
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = js.native
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = js.native
    
    /**
      * Calls a defined callback function on each element of an array. Then, flattens the result into
      * a new array.
      * This is identical to a map followed by flat with depth 1.
      *
      * @param callback A function that accepts up to three arguments. The flatMap method calls the
      * callback function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callback function. If
      * thisArg is omitted, undefined is used as the this value.
      */
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ js.Array[Moment], 
          /* index */ Double, 
          /* array */ js.Array[js.Array[Moment]], 
          U | js.Array[U]
        ]
    ): js.Array[U] = js.native
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ js.Array[Moment], 
          /* index */ Double, 
          /* array */ js.Array[js.Array[Moment]], 
          U | js.Array[U]
        ],
      thisArg: This
    ): js.Array[U] = js.native
    
    /**
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    def forEach(
      callbackfn: js.Function3[
          /* value */ js.Array[Moment], 
          /* index */ Double, 
          /* array */ js.Array[js.Array[Moment]], 
          Unit
        ]
    ): Unit = js.native
    def forEach(
      callbackfn: js.Function3[
          /* value */ js.Array[Moment], 
          /* index */ Double, 
          /* array */ js.Array[js.Array[Moment]], 
          Unit
        ],
      thisArg: js.Any
    ): Unit = js.native
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    def includes(searchElement: js.Array[Moment]): Boolean = js.native
    def includes(searchElement: js.Array[Moment], fromIndex: Double): Boolean = js.native
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    def indexOf(searchElement: js.Array[Moment]): Double = js.native
    def indexOf(searchElement: js.Array[Moment], fromIndex: Double): Double = js.native
    
    /** Iterator */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[js.Array[Moment]]] = js.native
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
      */
    def join(): String = js.native
    def join(separator: String): String = js.native
    
    /**
      * Returns an iterable of keys in the array
      */
    def keys(): IterableIterator[Double] = js.native
    
    var lastDay: Moment = js.native
    
    /**
      * Returns the index of the last occurrence of a specified value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
      */
    def lastIndexOf(searchElement: js.Array[Moment]): Double = js.native
    def lastIndexOf(searchElement: js.Array[Moment], fromIndex: Double): Double = js.native
    
    /**
      * Gets or sets the length of the array. This is a number one higher than the highest element defined in an array.
      */
    var length: Double = js.native
    
    /**
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    def map[U](
      callbackfn: js.Function3[
          /* value */ js.Array[Moment], 
          /* index */ Double, 
          /* array */ js.Array[js.Array[Moment]], 
          U
        ]
    ): js.Array[U] = js.native
    def map[U](
      callbackfn: js.Function3[
          /* value */ js.Array[Moment], 
          /* index */ Double, 
          /* array */ js.Array[js.Array[Moment]], 
          U
        ],
      thisArg: js.Any
    ): js.Array[U] = js.native
    
    /**
      * Removes the last element from an array and returns it.
      */
    def pop(): js.UndefOr[js.Array[Moment]] = js.native
    
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param items New elements of the Array.
      */
    def push(items: js.Array[Moment]*): Double = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ js.Array[Moment], 
          /* currentValue */ js.Array[Moment], 
          /* currentIndex */ Double, 
          /* array */ js.Array[js.Array[Moment]], 
          js.Array[Moment]
        ]
    ): js.Array[Moment] = js.native
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ js.Array[Moment], 
          /* currentValue */ js.Array[Moment], 
          /* currentIndex */ Double, 
          /* array */ js.Array[js.Array[Moment]], 
          js.Array[Moment]
        ],
      initialValue: js.Array[Moment]
    ): js.Array[Moment] = js.native
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    def reduce[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ js.Array[Moment], 
          /* currentIndex */ Double, 
          /* array */ js.Array[js.Array[Moment]], 
          U
        ],
      initialValue: U
    ): U = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ js.Array[Moment], 
          /* currentValue */ js.Array[Moment], 
          /* currentIndex */ Double, 
          /* array */ js.Array[js.Array[Moment]], 
          js.Array[Moment]
        ]
    ): js.Array[Moment] = js.native
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ js.Array[Moment], 
          /* currentValue */ js.Array[Moment], 
          /* currentIndex */ Double, 
          /* array */ js.Array[js.Array[Moment]], 
          js.Array[Moment]
        ],
      initialValue: js.Array[Moment]
    ): js.Array[Moment] = js.native
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    def reduceRight[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ js.Array[Moment], 
          /* currentIndex */ Double, 
          /* array */ js.Array[js.Array[Moment]], 
          U
        ],
      initialValue: U
    ): U = js.native
    
    /**
      * Reverses the elements in an Array.
      */
    def reverse(): js.Array[js.Array[Moment]] = js.native
    
    /**
      * Removes the first element from an array and returns it.
      */
    def shift(): js.UndefOr[js.Array[Moment]] = js.native
    
    /**
      * Returns a section of an array.
      * @param start The beginning of the specified portion of the array.
      * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
      */
    def slice(): js.Array[js.Array[Moment]] = js.native
    def slice(start: js.UndefOr[scala.Nothing], end: Double): js.Array[js.Array[Moment]] = js.native
    def slice(start: Double): js.Array[js.Array[Moment]] = js.native
    def slice(start: Double, end: Double): js.Array[js.Array[Moment]] = js.native
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    def some(
      predicate: js.Function3[
          /* value */ js.Array[Moment], 
          /* index */ Double, 
          /* array */ js.Array[js.Array[Moment]], 
          _
        ]
    ): Boolean = js.native
    def some(
      predicate: js.Function3[
          /* value */ js.Array[Moment], 
          /* index */ Double, 
          /* array */ js.Array[js.Array[Moment]], 
          _
        ],
      thisArg: js.Any
    ): Boolean = js.native
    
    /**
      * Sorts an array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    def sort(): this.type = js.native
    def sort(compareFn: js.Function2[/* a */ js.Array[Moment], /* b */ js.Array[Moment], Double]): this.type = js.native
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      */
    def splice(start: Double): js.Array[js.Array[Moment]] = js.native
    def splice(start: Double, deleteCount: Double): js.Array[js.Array[Moment]] = js.native
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      */
    def splice(start: Double, deleteCount: Double, items: js.Array[Moment]*): js.Array[js.Array[Moment]] = js.native
    
    /**
      * Returns an object whose properties have the value 'true'
      * when they will be absent when used in a 'with' statement.
      */
    @JSName(js.Symbol.unscopables)
    var unscopables: js.Function0[CopyWithin] = js.native
    
    /**
      * Inserts new elements at the start of an array.
      * @param items  Elements to insert at the start of the Array.
      */
    def unshift(items: js.Array[Moment]*): Double = js.native
    
    /**
      * Returns an iterable of values in the array
      */
    def values(): IterableIterator[js.Array[Moment]] = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Normally, if you use the `ranges` option to specify pre-defined date ranges, calendars
      * for choosing a custom date range are not shown until the user clicks "Custom Range".
      * When this option is set to true, the calendars for choosing a custom date range are always shown instead.
      */
    var alwaysShowCalendars: js.UndefOr[Boolean] = js.native
    
    /**
      * CSS class string that will be added to the apply button
      */
    var applyButtonClasses: js.UndefOr[String] = js.native
    
    /**
      * Hide the apply and cancel buttons, and automatically apply a new date range as soon as two dates or a predefined range is selected.
      */
    var autoApply: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates whether the date range picker should automatically update the value of an < input > element it's attached to at initialization and when the selected dates change.
      */
    var autoUpdateInput: js.UndefOr[Boolean] = js.native
    
    /**
      * CSS class names that will be added to all buttons in the picker
      */
    var buttonClasses: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * CSS class string that will be added to the cancel button
      */
    var cancelButtonClasses: js.UndefOr[String] = js.native
    
    /**
      * Whether the picker appears below (default) or above the HTML element it's attached to
      */
    var drops: js.UndefOr[down | up | auto] = js.native
    
    /**
      * The end of the initially selected date range
      */
    var endDate: js.UndefOr[DateOrString] = js.native
    
    /**
      * A function that is passed each date in the two calendars before they are displayed, and may return a string or array of CSS class names to apply to that date's calendar cell.
      */
    var isCustomDate: js.UndefOr[
        js.Function1[/* date */ DateOrString, js.UndefOr[String | js.Array[String] | `false`]]
      ] = js.native
    
    /**
      * A function that is passed each date in the two calendars before they are displayed, and may return true or false to indicate whether that date should be available for selection or not.
      */
    var isInvalidDate: js.UndefOr[
        js.Function2[/* startDate */ DateOrString, /* endDate */ js.UndefOr[DateOrString], Boolean]
      ] = js.native
    
    /**
      * When enabled, the two calendars displayed will always be for two sequential months (i.e.
      * January and February), and both will be advanced when clicking the left or right arrows
      * above the calendars.When disabled, the two calendars can be individually advanced and
      * display any month/ year.
      */
    var linkedCalendars: js.UndefOr[Boolean] = js.native
    
    /**
      * Allows you to provide localized strings for buttons and labels, customize the date display format, and change the first day of week for the calendars.
      */
    var locale: js.UndefOr[Locale] = js.native
    
    /**
      * The latest date a user may select
      */
    var maxDate: js.UndefOr[DateOrString] = js.native
    
    /**
      * The maximum span between the selected start and end dates. Can have any property you can add to a moment object (i.e. days, months)
      */
    var maxSpan: js.UndefOr[DurationInputArg1] = js.native
    
    /**
      * The maximum year shown in the dropdowns when `showDropdowns` is set to true.
      */
    var maxYear: js.UndefOr[Double] = js.native
    
    /**
      * The earliest date a user may select
      */
    var minDate: js.UndefOr[DateOrString] = js.native
    
    /**
      * The minimum year shown in the dropdowns when `showDropdowns` is set to true.
      */
    var minYear: js.UndefOr[Double] = js.native
    
    /**
      * Whether the picker appears aligned to the left, to the right, or centered under the HTML element it's attached to
      */
    var opens: js.UndefOr[left | right | center] = js.native
    
    /**
      * jQuery selector of the parent element that the date range picker will be added to, if not provided this will be 'body'
      */
    var parentEl: js.UndefOr[Element | String] = js.native
    
    /**
      * Set predefined date ranges the user can select from.Each key is the label for the range, and its value an array with two dates representing the bounds of the range.
      */
    var ranges: js.UndefOr[StringDictionary[js.Tuple2[DateOrString, DateOrString]]] = js.native
    
    /**
      * Whether to show the 'Custom Range' label or just pre-defined ranges
      */
    var showCustomRangeLabel: js.UndefOr[Boolean] = js.native
    
    /**
      * Show year and month select boxes above calendars to jump to a specific month and year
      */
    var showDropdowns: js.UndefOr[Boolean] = js.native
    
    /**
      * Show ISO week numbers at the start of each week on the calendars
      */
    var showISOWeekNumbers: js.UndefOr[Boolean] = js.native
    
    /**
      * Show localized week numbers at the start of each week on the calendars
      */
    var showWeekNumbers: js.UndefOr[Boolean] = js.native
    
    /**
      * Show only a single calendar to choose one date, instead of a range picker with two calendars; the start and end dates provided to your callback will be the same single date chosen.
      */
    var singleDatePicker: js.UndefOr[Boolean] = js.native
    
    /**
      * The start of the initially selected date range
      */
    var startDate: js.UndefOr[DateOrString] = js.native
    
    /**
      * Allow selection of dates with times, not just dates
      */
    var timePicker: js.UndefOr[Boolean] = js.native
    
    /**
      * Use 24- hour instead of 12- hour times, removing the AM/ PM selection.
      */
    var timePicker24Hour: js.UndefOr[Boolean] = js.native
    
    /**
      * Increment of the minutes selection list for times (i.e. 30 to allow only selection of times ending in 0 or 30)
      */
    var timePickerIncrement: js.UndefOr[Double] = js.native
    
    /**
      * Show seconds in the timePicker.
      */
    var timePickerSeconds: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysShowCalendars(value: Boolean): Self = StObject.set(x, "alwaysShowCalendars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysShowCalendarsUndefined: Self = StObject.set(x, "alwaysShowCalendars", js.undefined)
      
      @scala.inline
      def setApplyButtonClasses(value: String): Self = StObject.set(x, "applyButtonClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyButtonClassesUndefined: Self = StObject.set(x, "applyButtonClasses", js.undefined)
      
      @scala.inline
      def setAutoApply(value: Boolean): Self = StObject.set(x, "autoApply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoApplyUndefined: Self = StObject.set(x, "autoApply", js.undefined)
      
      @scala.inline
      def setAutoUpdateInput(value: Boolean): Self = StObject.set(x, "autoUpdateInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoUpdateInputUndefined: Self = StObject.set(x, "autoUpdateInput", js.undefined)
      
      @scala.inline
      def setButtonClasses(value: js.Array[String]): Self = StObject.set(x, "buttonClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonClassesUndefined: Self = StObject.set(x, "buttonClasses", js.undefined)
      
      @scala.inline
      def setButtonClassesVarargs(value: String*): Self = StObject.set(x, "buttonClasses", js.Array(value :_*))
      
      @scala.inline
      def setCancelButtonClasses(value: String): Self = StObject.set(x, "cancelButtonClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelButtonClassesUndefined: Self = StObject.set(x, "cancelButtonClasses", js.undefined)
      
      @scala.inline
      def setDrops(value: down | up | auto): Self = StObject.set(x, "drops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropsUndefined: Self = StObject.set(x, "drops", js.undefined)
      
      @scala.inline
      def setEndDate(value: DateOrString): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      @scala.inline
      def setIsCustomDate(value: /* date */ DateOrString => js.UndefOr[String | js.Array[String] | `false`]): Self = StObject.set(x, "isCustomDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsCustomDateUndefined: Self = StObject.set(x, "isCustomDate", js.undefined)
      
      @scala.inline
      def setIsInvalidDate(value: (/* startDate */ DateOrString, /* endDate */ js.UndefOr[DateOrString]) => Boolean): Self = StObject.set(x, "isInvalidDate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsInvalidDateUndefined: Self = StObject.set(x, "isInvalidDate", js.undefined)
      
      @scala.inline
      def setLinkedCalendars(value: Boolean): Self = StObject.set(x, "linkedCalendars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkedCalendarsUndefined: Self = StObject.set(x, "linkedCalendars", js.undefined)
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMaxDate(value: DateOrString): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMaxSpan(value: DurationInputArg1): Self = StObject.set(x, "maxSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSpanUndefined: Self = StObject.set(x, "maxSpan", js.undefined)
      
      @scala.inline
      def setMaxYear(value: Double): Self = StObject.set(x, "maxYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxYearUndefined: Self = StObject.set(x, "maxYear", js.undefined)
      
      @scala.inline
      def setMinDate(value: DateOrString): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setMinYear(value: Double): Self = StObject.set(x, "minYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinYearUndefined: Self = StObject.set(x, "minYear", js.undefined)
      
      @scala.inline
      def setOpens(value: left | right | center): Self = StObject.set(x, "opens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpensUndefined: Self = StObject.set(x, "opens", js.undefined)
      
      @scala.inline
      def setParentEl(value: Element | String): Self = StObject.set(x, "parentEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentElUndefined: Self = StObject.set(x, "parentEl", js.undefined)
      
      @scala.inline
      def setRanges(value: StringDictionary[js.Tuple2[DateOrString, DateOrString]]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      @scala.inline
      def setShowCustomRangeLabel(value: Boolean): Self = StObject.set(x, "showCustomRangeLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCustomRangeLabelUndefined: Self = StObject.set(x, "showCustomRangeLabel", js.undefined)
      
      @scala.inline
      def setShowDropdowns(value: Boolean): Self = StObject.set(x, "showDropdowns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDropdownsUndefined: Self = StObject.set(x, "showDropdowns", js.undefined)
      
      @scala.inline
      def setShowISOWeekNumbers(value: Boolean): Self = StObject.set(x, "showISOWeekNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowISOWeekNumbersUndefined: Self = StObject.set(x, "showISOWeekNumbers", js.undefined)
      
      @scala.inline
      def setShowWeekNumbers(value: Boolean): Self = StObject.set(x, "showWeekNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowWeekNumbersUndefined: Self = StObject.set(x, "showWeekNumbers", js.undefined)
      
      @scala.inline
      def setSingleDatePicker(value: Boolean): Self = StObject.set(x, "singleDatePicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleDatePickerUndefined: Self = StObject.set(x, "singleDatePicker", js.undefined)
      
      @scala.inline
      def setStartDate(value: DateOrString): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      @scala.inline
      def setTimePicker(value: Boolean): Self = StObject.set(x, "timePicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePicker24Hour(value: Boolean): Self = StObject.set(x, "timePicker24Hour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePicker24HourUndefined: Self = StObject.set(x, "timePicker24Hour", js.undefined)
      
      @scala.inline
      def setTimePickerIncrement(value: Double): Self = StObject.set(x, "timePickerIncrement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePickerIncrementUndefined: Self = StObject.set(x, "timePickerIncrement", js.undefined)
      
      @scala.inline
      def setTimePickerSeconds(value: Boolean): Self = StObject.set(x, "timePickerSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePickerSecondsUndefined: Self = StObject.set(x, "timePickerSeconds", js.undefined)
      
      @scala.inline
      def setTimePickerUndefined: Self = StObject.set(x, "timePicker", js.undefined)
    }
  }
  
  @js.native
  trait daterangepicker extends StObject {
    
    var container: JQuery = js.native
    
    var endDate: Moment = js.native
    
    def remove(): Unit = js.native
    
    def setEndDate(date: DateOrString): Unit = js.native
    
    def setStartDate(date: DateOrString): Unit = js.native
    
    var startDate: Moment = js.native
  }
  object daterangepicker {
    
    @scala.inline
    def apply(
      container: JQuery,
      endDate: Moment,
      remove: () => Unit,
      setEndDate: DateOrString => Unit,
      setStartDate: DateOrString => Unit,
      startDate: Moment
    ): typings.daterangepicker.mod.daterangepicker = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), setEndDate = js.Any.fromFunction1(setEndDate), setStartDate = js.Any.fromFunction1(setStartDate), startDate = startDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.daterangepicker.mod.daterangepicker]
    }
    
    @scala.inline
    implicit class daterangepickerMutableBuilder[Self <: typings.daterangepicker.mod.daterangepicker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: JQuery): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndDate(value: Moment): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetEndDate(value: DateOrString => Unit): Self = StObject.set(x, "setEndDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetStartDate(value: DateOrString => Unit): Self = StObject.set(x, "setStartDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartDate(value: Moment): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      @JSName("data")
      def data_daterangepicker(key: typings.daterangepicker.daterangepickerStrings.daterangepicker): js.UndefOr[typings.daterangepicker.mod.daterangepicker] = js.native
      
      def daterangepicker(): this.type = js.native
      def daterangepicker(options: js.UndefOr[scala.Nothing], callback: DataRangePickerCallback): this.type = js.native
      def daterangepicker(options: Options): this.type = js.native
      def daterangepicker(options: Options, callback: DataRangePickerCallback): this.type = js.native
      @JSName("daterangepicker")
      var daterangepicker_Original: (js.Function2[
            /* options */ js.UndefOr[Options], 
            /* callback */ js.UndefOr[DataRangePickerCallback], 
            this.type
          ]) with DefaultOptions = js.native
      
      def on(
        events: DatepickerEvents,
        handler: js.Function2[/* event */ Event, /* picker */ DateRangePicker_, Unit]
      ): JQuery = js.native
    }
  }
}
