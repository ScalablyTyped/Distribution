package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorsGutter extends js.Object {
  var colors: js.UndefOr[js.Object] = js.undefined
  var gutter: js.UndefOr[Double] = js.undefined
}

object AnonColorsGutter {
  @scala.inline
  def apply(colors: js.Object = null, gutter: Int | Double = null): AnonColorsGutter = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorsGutter]
  }
}

