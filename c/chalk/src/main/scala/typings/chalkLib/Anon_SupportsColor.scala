package typings
package chalkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SupportsColor extends js.Object {
  var supportsColor: chalkLib.chalkMod.ColorSupport
}

object Anon_SupportsColor {
  @scala.inline
  def apply(supportsColor: chalkLib.chalkMod.ColorSupport): Anon_SupportsColor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("supportsColor")(supportsColor)
    __obj.asInstanceOf[Anon_SupportsColor]
  }
}

