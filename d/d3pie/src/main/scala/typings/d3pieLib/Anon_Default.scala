package typings
package d3pieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default extends js.Object {
  var effect: js.UndefOr[d3pieLib.d3pieLibStrings.none | d3pieLib.d3pieLibStrings.default] = js.undefined
  var speed: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Default {
  @scala.inline
  def apply(
    effect: d3pieLib.d3pieLibStrings.none | d3pieLib.d3pieLibStrings.default = null,
    speed: scala.Int | scala.Double = null
  ): Anon_Default = {
    val __obj = js.Dynamic.literal()
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Default]
  }
}

