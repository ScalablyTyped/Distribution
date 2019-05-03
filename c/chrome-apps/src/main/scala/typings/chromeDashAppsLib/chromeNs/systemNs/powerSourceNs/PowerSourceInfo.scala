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
  var `type`: java.lang.String | PowerSourceType
}

object PowerSourceInfo {
  @scala.inline
  def apply(
    active: scala.Boolean,
    `type`: java.lang.String | PowerSourceType,
    maxPower: js.UndefOr[chromeDashAppsLib.chromeNs.double] = js.undefined
  ): PowerSourceInfo = {
    val __obj = js.Dynamic.literal(active = active)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPower)) __obj.updateDynamic("maxPower")(maxPower)
    __obj.asInstanceOf[PowerSourceInfo]
  }
}

