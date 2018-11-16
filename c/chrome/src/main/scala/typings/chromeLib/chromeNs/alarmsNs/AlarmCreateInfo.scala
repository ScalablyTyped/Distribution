package typings
package chromeLib.chromeNs.alarmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AlarmCreateInfo extends js.Object {
  /** Optional. Length of time in minutes after which the onAlarm event should fire.  */
  var delayInMinutes: js.UndefOr[scala.Double] = js.undefined
  /** Optional. If set, the onAlarm event should fire every periodInMinutes minutes after the initial event specified by when or delayInMinutes. If not set, the alarm will only fire once.  */
  var periodInMinutes: js.UndefOr[scala.Double] = js.undefined
  /** Optional. Time at which the alarm should fire, in milliseconds past the epoch (e.g. Date.now() + n).  */
  var when: js.UndefOr[scala.Double] = js.undefined
}

