package typings
package d3pieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Back extends js.Object {
  var effect: js.UndefOr[
    d3pieLib.d3pieLibStrings.none | d3pieLib.d3pieLibStrings.linear | d3pieLib.d3pieLibStrings.bounce | d3pieLib.d3pieLibStrings.elastic | d3pieLib.d3pieLibStrings.back
  ] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var speed: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Back {
  @scala.inline
  def apply(
    effect: d3pieLib.d3pieLibStrings.none | d3pieLib.d3pieLibStrings.linear | d3pieLib.d3pieLibStrings.bounce | d3pieLib.d3pieLibStrings.elastic | d3pieLib.d3pieLibStrings.back = null,
    size: scala.Int | scala.Double = null,
    speed: scala.Int | scala.Double = null
  ): Anon_Back = {
    val __obj = js.Dynamic.literal()
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Back]
  }
}

