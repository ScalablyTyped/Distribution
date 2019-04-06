package typings
package createDashEmotionLib.createDashEmotionMod.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLAttributes[T] extends js.Object {
  var css: js.UndefOr[createDashEmotionLib.createDashEmotionMod.Interpolation] = js.undefined
}

object HTMLAttributes {
  @scala.inline
  def apply[T](css: createDashEmotionLib.createDashEmotionMod.Interpolation = null): HTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributes[T]]
  }
}

