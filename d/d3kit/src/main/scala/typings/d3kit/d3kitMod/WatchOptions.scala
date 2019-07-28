package typings.d3kit.d3kitMod

import typings.d3kit.Anon_Height
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchOptions extends js.Object {
  var interval: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[Element | (js.Tuple2[Double, Double]) | Anon_Height | Null] = js.undefined
}

object WatchOptions {
  @scala.inline
  def apply(
    interval: Int | Double = null,
    mode: String = null,
    target: Element | (js.Tuple2[Double, Double]) | Anon_Height = null
  ): WatchOptions = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchOptions]
  }
}

