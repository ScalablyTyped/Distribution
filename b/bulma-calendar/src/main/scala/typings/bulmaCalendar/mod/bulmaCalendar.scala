package typings.bulmaCalendar.mod

import typings.bulmaCalendar.anon.End
import typings.bulmaCalendar.anon.EndDate
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait bulmaCalendar extends js.Object {
  
  /**
    * Clear date selection (startDate and endDate are set to undefined)
    */
  def clear(): Unit = js.native
  
  /**
    * Get selected date
    */
  def date: End = js.native
  
  /**
    * Get date format pattern
    */
  def dateFormat: String = js.native
  /**
    * Set date format pattern
    */
  def dateFormat_=(dateFormat: String): Unit = js.native
  
  /**
    * Set date
    */
  def date_=(date: End): Unit = js.native
  
  def emit(name: EventType, data: bulmaCalendar): Unit = js.native
  def emit(name: EventType, data: bulmaCalendar, silent: Boolean): Unit = js.native
  
  /**
    * Get selected end date
    */
  def endDate: Date = js.native
  /**
    * Set end date
    */
  def endDate_=(endDate: Date): Unit = js.native
  
  /**
    * Get selected end time
    */
  def endTime: Date = js.native
  /**
    * Set end time
    */
  def endTime_=(endTime: Date): Unit = js.native
  
  /**
    * Close date picker (not available with "inline" display style)
    */
  def hide(): Unit = js.native
  
  // Getters
  /**
    * Get component instance ID
    */
  def id: js.Any = js.native
  
  /**
    * Check if date picker is open or not
    *
    * @returns True if date picker is open else False
    */
  def isOpen(): Boolean = js.native
  
  /**
    * Check if current instance is a range date picker
    *
    * @returns True if the instance is a range date picker
    */
  def isRange(): Boolean = js.native
  
  /**
    * Get active lang
    */
  def lang: String = js.native
  /**
    * Set component lang
    */
  def lang_=(lang: String): Unit = js.native
  
  // Custom EventEmitter implementation
  def listenerCount(eventName: EventType): Unit = js.native
  
  /**
    * Get max possible date
    */
  def maxDate: Date = js.native
  /**
    * Set max possible date
    */
  def maxDate_=(maxDate: Date): Unit = js.native
  
  def middleware[T /* <: EventType */](eventName: T, fn: js.Function1[/* event */ Event[T], Unit]): Unit = js.native
  
  /**
    * Get min possible date
    */
  def minDate: Date = js.native
  /**
    * Set min possible date
    */
  def minDate_=(minDate: Date): Unit = js.native
  
  def on[T /* <: EventType */](name: T, callback: js.Function1[/* event */ Event[T], Unit]): Unit = js.native
  def on[T /* <: EventType */](name: T, callback: js.Function1[/* event */ Event[T], Unit], once: Boolean): Unit = js.native
  
  def once[T /* <: EventType */](name: T, callback: js.Function1[/* event */ Event[T], Unit]): Unit = js.native
  
  /**
    * Force calendar refresh
    */
  def refresh(): Unit = js.native
  
  def removeListeners(eventName: EventType): Unit = js.native
  def removeListeners(eventName: EventType, middleware: Boolean): Unit = js.native
  
  def removeMiddleware(eventName: EventType): Unit = js.native
  
  /**
    * Force to set calendar data into UI inputs
    */
  def save(): Unit = js.native
  
  // Methods
  /**
    * Open date picker (not available with "inline" display style)
    */
  def show(): Unit = js.native
  
  /**
    * Get selected start date
    */
  def startDate: Date = js.native
  /**
    * Se start date
    */
  def startDate_=(startDate: Date): Unit = js.native
  
  /**
    * Get selected start time
    */
  def startTime: Date = js.native
  /**
    * Set start time
    */
  def startTime_=(startTime: Date): Unit = js.native
  
  /**
    * Get selected time
    */
  def time: Date = js.native
  
  /**
    * Get time format pattern
    */
  def timeFormat: String = js.native
  /**
    * Set time format pattern
    */
  def timeFormat_=(timeFormat: String): Unit = js.native
  
  /**
    * Set time
    */
  def time_=(time: Date): Unit = js.native
  
  /**
    * Get the date picker value as formatted string if no parameter else set the passed value
    *
    * @param value Formatted date value if no parameter passed else null
    *
    * @returns Date picker selected date (if not range calendar then endDate is undefined)
    */
  def value(): EndDate = js.native
  def value(value: String): EndDate = js.native
}
