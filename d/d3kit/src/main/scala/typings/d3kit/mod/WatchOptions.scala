package typings.d3kit.mod

import typings.d3kit.anon.Height
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchOptions extends js.Object {
  var interval: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[Element | (js.Tuple2[Double, Double]) | Height | Null] = js.undefined
}

object WatchOptions {
  @scala.inline
  def apply(
    interval: js.UndefOr[Double] = js.undefined,
    mode: String = null,
    target: js.UndefOr[Null | Element | (js.Tuple2[Double, Double]) | Height] = js.undefined
  ): WatchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(target)) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchOptions]
  }
}

