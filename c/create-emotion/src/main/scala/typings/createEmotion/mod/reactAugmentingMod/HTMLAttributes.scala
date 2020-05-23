package typings.createEmotion.mod.reactAugmentingMod

import typings.createEmotion.mod.Interpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLAttributes[T] extends js.Object {
  var css: js.UndefOr[Interpolation] = js.undefined
}

object HTMLAttributes {
  @scala.inline
  def apply[T](css: js.UndefOr[Null | Interpolation] = js.undefined): HTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(css)) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributes[T]]
  }
}

