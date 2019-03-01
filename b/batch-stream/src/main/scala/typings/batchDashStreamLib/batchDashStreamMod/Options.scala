package typings
package batchDashStreamLib.batchDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var highWaterMark: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(highWaterMark: scala.Int | scala.Double = null, size: scala.Int | scala.Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

