package typings.chromeDashApps.chrome.alarms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.alarms.create")
@js.native
object create extends js.Object {
  /**
    * Creates an alarm. Near the time(s) specified by alarmInfo, the onAlarm event is fired. If there is another alarm with the same name (or no name if none is specified), it will be cancelled and replaced by this alarm.
    * In order to reduce the load on the user's machine, Chrome limits alarms to at most once every 1 minute but may delay them an arbitrary amount more.
    * That is, setting delayInMinutes or periodInMinutes to less than 1 will not be honored and will cause a warning.
    * `when` can be set to less than 1 minute after 'now' without warning but won't actually cause the alarm to fire for at least 1 minute.
    * To help you debug your app, when you've loaded it unpacked, there's no limit to how often the alarm can fire.
    * @param alarmInfo Describes when the alarm should fire. The initial time must be specified by either when or delayInMinutes (but not both). If periodInMinutes is set, the alarm will repeat every periodInMinutes minutes after the initial event. If neither when or delayInMinutes is set for a repeating alarm, periodInMinutes is used as the default for delayInMinutes.
    */
  def apply(alarmInfo: AlarmCreateInfo): Unit = js.native
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
  def apply(name: String, alarmInfo: AlarmCreateInfo): Unit = js.native
}

