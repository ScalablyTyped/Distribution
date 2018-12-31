package typings
package chromeDashAppsLib.chromeNs.alarmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlarmCreateInfo extends js.Object {
  /** Length of time in minutes after which the onAlarm event should fire.  */
  var delayInMinutes: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** If set, the onAlarm event should fire every periodInMinutes minutes after the initial event specified by when or delayInMinutes. If not set, the alarm will only fire once.  */
  var periodInMinutes: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** Time at which the alarm should fire, in milliseconds past the epoch (e.g. Date.now() + n).  */
  var when: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
}

