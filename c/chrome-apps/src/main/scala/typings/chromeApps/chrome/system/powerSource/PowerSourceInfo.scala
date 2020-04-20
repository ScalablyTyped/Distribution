package typings.chromeApps.chrome.system.powerSource

import typings.chromeApps.chrome.double
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PowerSourceInfo extends js.Object {
  /** Whether this power source is connected to the device. */
  var active: Boolean
  /**
    * Maximum power this source is capable of delivering if known.
    * Reported in watts, rounded to two significant digits.
    */
  var maxPower: js.UndefOr[double] = js.undefined
  /**
    * Type of power source
    * @see PowerSourceType
    */
  var `type`: (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PowerSourceType * / any */ String) | PowerSourceType
}

object PowerSourceInfo {
  @scala.inline
  def apply(
    active: Boolean,
    `type`: (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PowerSourceType * / any */ String) | PowerSourceType,
    maxPower: Int | Double = null
  ): PowerSourceInfo = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (maxPower != null) __obj.updateDynamic("maxPower")(maxPower.asInstanceOf[js.Any])
    __obj.asInstanceOf[PowerSourceInfo]
  }
}

