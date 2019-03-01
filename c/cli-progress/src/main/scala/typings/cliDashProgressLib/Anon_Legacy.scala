package typings
package cliDashProgressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Legacy extends js.Object {
  /** Styles as of cli-progress v1.3.0 */
  var legacy: cliDashProgressLib.cliDashProgressMod.Preset
  /** Unicode Rectangles */
  var rect: cliDashProgressLib.cliDashProgressMod.Preset
  /** Unicode background shades are used for the bar */
  var shades_classic: cliDashProgressLib.cliDashProgressMod.Preset
  /** Unicode background shades with grey bar */
  var shades_grey: cliDashProgressLib.cliDashProgressMod.Preset
}

object Anon_Legacy {
  @scala.inline
  def apply(
    legacy: cliDashProgressLib.cliDashProgressMod.Preset,
    rect: cliDashProgressLib.cliDashProgressMod.Preset,
    shades_classic: cliDashProgressLib.cliDashProgressMod.Preset,
    shades_grey: cliDashProgressLib.cliDashProgressMod.Preset
  ): Anon_Legacy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("legacy")(legacy)
    __obj.updateDynamic("rect")(rect)
    __obj.updateDynamic("shades_classic")(shades_classic)
    __obj.updateDynamic("shades_grey")(shades_grey)
    __obj.asInstanceOf[Anon_Legacy]
  }
}

