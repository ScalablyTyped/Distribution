package typings.createDashEmotion.createDashEmotionMod.reactMod

import typings.createDashEmotion.createDashEmotionMod.Interpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLAttributes[T] extends js.Object {
  var css: js.UndefOr[Interpolation] = js.undefined
}

object HTMLAttributes {
  @scala.inline
  def apply[T](css: Interpolation = null): HTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributes[T]]
  }
}

