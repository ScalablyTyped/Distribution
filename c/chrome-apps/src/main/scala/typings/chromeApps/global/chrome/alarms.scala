package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.alarms.Alarm
import typings.chromeApps.chrome.alarms.AlarmCreateInfo
import typings.chromeApps.chrome.alarms.AlarmEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.alarms
////////////
// Alarms //
////////////
/**
  * @requires Permissions: 'alarms'
  * @since Chrome 22.
  * @description
  * Use the chrome.alarms API to schedule code to run
  * periodically or at a specified time in the future.
  */
object alarms {
  
  @JSGlobal("chrome.alarms")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Clears the alarm with the given name.
    * @param name The name of the alarm to clear. Defaults to the empty string.
    * @param [callback] If you specify the callback parameter, it should be a function that looks like this:
    * @example function(boolean wasCleared) {...};
    */
  @scala.inline
  def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  /**
    * Clears the alarm without a name.
    * @param [callback] If you specify the callback parameter, it should be a function that looks like this:
    * @example function(boolean wasCleared) {...};
    */
  @scala.inline
  def clear(callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def clear(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def clear(name: String, callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clear")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def clear(name: Unit, callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clear")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Clears all alarms.
    * @param [callback] If you specify the callback parameter, it should be a function that looks like this:
    * @example function(boolean wasCleared) {...};
    */
  @scala.inline
  def clearAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAll")().asInstanceOf[Unit]
  @scala.inline
  def clearAll(callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAll")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Creates an alarm. Near the time(s) specified by alarmInfo, the onAlarm event is fired. If there is another alarm with the same name (or no name if none is specified), it will be cancelled and replaced by this alarm.
    * In order to reduce the load on the user's machine, Chrome limits alarms to at most once every 1 minute but may delay them an arbitrary amount more.
    * That is, setting delayInMinutes or periodInMinutes to less than 1 will not be honored and will cause a warning.
    * `when` can be set to less than 1 minute after 'now' without warning but won't actually cause the alarm to fire for at least 1 minute.
    * To help you debug your app, when you've loaded it unpacked, there's no limit to how often the alarm can fire.
    * @param alarmInfo Describes when the alarm should fire. The initial time must be specified by either when or delayInMinutes (but not both). If periodInMinutes is set, the alarm will repeat every periodInMinutes minutes after the initial event. If neither when or delayInMinutes is set for a repeating alarm, periodInMinutes is used as the default for delayInMinutes.
    */
  @scala.inline
  def create(alarmInfo: AlarmCreateInfo): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(alarmInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
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
  @scala.inline
  def create(name: String, alarmInfo: AlarmCreateInfo): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], alarmInfo.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Retrieves details about the specified alarm.
    * @param callback The callback parameter should be a function that looks like this:
    * @example function( Alarm alarm) {...};
    */
  @scala.inline
  def get(callback: js.Function1[/* alarm */ Alarm, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  /**
    * Retrieves details about the specified alarm.
    * @param name The name of the alarm to get. Defaults to the empty string.
    * @param callback The callback parameter should be a function that looks like this:
    * @example function( Alarm alarm) {...};
    */
  @scala.inline
  def get(name: String, callback: js.Function1[/* alarm */ Alarm, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Gets an array of all the alarms.
    * @param callback The callback parameter should be a function that looks like this:
    * @example function(array of Alarm alarms) {...};
    */
  @scala.inline
  def getAll(callback: js.Function1[/* alarms */ js.Array[Alarm], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Fired when an alarm has elapsed. Useful for event pages. */
  @JSGlobal("chrome.alarms.onAlarm")
  @js.native
  val onAlarm: AlarmEvent = js.native
}
