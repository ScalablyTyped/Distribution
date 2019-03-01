package typings
package d3kitLib.d3kitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchOptions extends js.Object {
  var interval: js.UndefOr[scala.Double] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var target: js.UndefOr[
    stdLib.Element | (js.Tuple2[scala.Double, scala.Double]) | d3kitLib.Anon_Height | scala.Null
  ] = js.undefined
}

object WatchOptions {
  @scala.inline
  def apply(
    interval: scala.Int | scala.Double = null,
    mode: java.lang.String = null,
    target: stdLib.Element | (js.Tuple2[scala.Double, scala.Double]) | d3kitLib.Anon_Height = null
  ): WatchOptions = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchOptions]
  }
}

