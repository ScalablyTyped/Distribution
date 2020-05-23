package typings.createEmotion.mod.global.JSX

import typings.createEmotion.mod.Interpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLAttributes extends js.Object {
  var css: js.UndefOr[Interpolation] = js.undefined
}

object HTMLAttributes {
  @scala.inline
  def apply(css: js.UndefOr[Null | Interpolation] = js.undefined): HTMLAttributes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(css)) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributes]
  }
}

