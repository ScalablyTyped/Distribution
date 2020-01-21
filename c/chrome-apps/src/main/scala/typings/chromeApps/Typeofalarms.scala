package typings.chromeApps

import typings.chromeApps.chrome.alarms.Alarm
import typings.chromeApps.chrome.alarms.AlarmCreateInfo
import typings.chromeApps.chrome.alarms.AlarmEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofalarms extends js.Object {
  /** Fired when an alarm has elapsed. Useful for event pages. */
  val onAlarm: AlarmEvent = js.native
  /**
    * Clears the alarm with the given name.
    * @param name The name of the alarm to clear. Defaults to the empty string.
    * @param [callback] If you specify the callback parameter, it should be a function that looks like this:
    * @example function(boolean wasCleared) {...};
    */
  def clear(): Unit = js.native
  /**
    * Clears the alarm without a name.
    * @param [callback] If you specify the callback parameter, it should be a function that looks like this:
    * @example function(boolean wasCleared) {...};
    */
  def clear(callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
  def clear(name: String): Unit = js.native
  def clear(name: String, callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
  /**
    * Clears all alarms.
    * @param [callback] If you specify the callback parameter, it should be a function that looks like this:
    * @example function(boolean wasCleared) {...};
    */
  def clearAll(): Unit = js.native
  def clearAll(callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
  /**
    * Creates an alarm. Near the time(s) specified by alarmInfo, the onAlarm event is fired. If there is another alarm with the same name (or no name if none is specified), it will be cancelled and replaced by this alarm.
    * In order to reduce the load on the user's machine, Chrome limits alarms to at most once every 1 minute but may delay them an arbitrary amount more.
    * That is, setting delayInMinutes or periodInMinutes to less than 1 will not be honored and will cause a warning.
    * `when` can be set to less than 1 minute after 'now' without warning but won't actually cause the alarm to fire for at least 1 minute.
    * To help you debug your app, when you've loaded it unpacked, there's no limit to how often the alarm can fire.
    * @param alarmInfo Describes when the alarm should fire. The initial time must be specified by either when or delayInMinutes (but not both). If periodInMinutes is set, the alarm will repeat every periodInMinutes minutes after the initial event. If neither when or delayInMinutes is set for a repeating alarm, periodInMinutes is used as the default for delayInMinutes.
    */
  def create(alarmInfo: AlarmCreateInfo): Unit = js.native
  /**
    * Creates an alarm. Near the time(s) specified by alarmInfo, the onAlarm event is fired.
    * If there is another alarm with the same name (or no name if none is specified), it will be cancelled and replaced by this alarm.
    * In order to reduce the load on the user's machine, Chrome limits alarms to at most once every 1 minute but may delay them an arbitrary amount more.
    * That is, setting delayInMinutes or periodInMinutes to less than 1 will not be honored and will cause a warning.
    * `when` can be set to less than 1 minute after 'now' without warning but won't actually cause the alarm to fire for at least 1 minute.
    * To help you debug your app, when you've loaded it unpacked, there's no limit to how often the alarm can fire.
    * @param name Optional name to identify this alarm. Defaults to the empty string.
    * @param alarmInfo Describes when the alarm should fire. The initial time must be specified by either when or delayInMinutes (but not both). If periodInMinutes is set, the alarm will repeat every periodInMinutes minutes after the initial event. If neither when or delayInMinutes is set for a repeating alarm, periodInMinutes is used as the default for delayInMinutes.
    */
  def create(name: String, alarmInfo: AlarmCreateInfo): Unit = js.native
  /**
    * Retrieves details about the specified alarm.
    * @param callback The callback parameter should be a function that looks like this:
    * @example function( Alarm alarm) {...};
    */
  def get(callback: js.Function1[/* alarm */ Alarm, Unit]): Unit = js.native
  /**
    * Retrieves details about the specified alarm.
    * @param name The name of the alarm to get. Defaults to the empty string.
    * @param callback The callback parameter should be a function that looks like this:
    * @example function( Alarm alarm) {...};
    */
  def get(name: String, callback: js.Function1[/* alarm */ Alarm, Unit]): Unit = js.native
  /**
    * Gets an array of all the alarms.
    * @param callback The callback parameter should be a function that looks like this:
    * @example function(array of Alarm alarms) {...};
    */
  def getAll(callback: js.Function1[/* alarms */ js.Array[Alarm], Unit]): Unit = js.native
}

