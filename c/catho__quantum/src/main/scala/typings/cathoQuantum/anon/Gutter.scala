package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gutter extends js.Object {
  var colors: js.UndefOr[js.Object] = js.undefined
  var gutter: js.UndefOr[Double] = js.undefined
}

object Gutter {
  @scala.inline
  def apply(colors: js.Object = null, gutter: js.UndefOr[Double] = js.undefined): Gutter = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(gutter)) __obj.updateDynamic("gutter")(gutter.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gutter]
  }
}

