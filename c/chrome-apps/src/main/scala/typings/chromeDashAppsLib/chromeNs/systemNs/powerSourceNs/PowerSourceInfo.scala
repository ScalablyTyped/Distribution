package typings
package chromeDashAppsLib.chromeNs.systemNs.powerSourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PowerSourceInfo extends js.Object {
  /** Whether this power source is connected to the device. */
  var active: scala.Boolean
  /**
    * Maximum power this source is capable of delivering if known.
    * Reported in watts, rounded to two significant digits.
    */
  var maxPower: js.UndefOr[chromeDashAppsLib.chromeNs.double] = js.undefined
  /**
    * Type of power source
    * @see PowerSourceType
    */
  var `type`: java.lang.String
}

