package typings
package cluiLib.cluiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineBufferOptions extends js.Object {
  var height: js.UndefOr[scala.Double | cluiLib.cluiLibStrings.console] = js.undefined
  var scroll: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double | cluiLib.cluiLibStrings.console] = js.undefined
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

object LineBufferOptions {
  @scala.inline
  def apply(
    height: scala.Double | cluiLib.cluiLibStrings.console = null,
    scroll: scala.Int | scala.Double = null,
    width: scala.Double | cluiLib.cluiLibStrings.console = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): LineBufferOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineBufferOptions]
  }
}

