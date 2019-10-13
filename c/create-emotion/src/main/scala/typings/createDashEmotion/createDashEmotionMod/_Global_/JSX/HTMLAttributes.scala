package typings.createDashEmotion.createDashEmotionMod._Global_.JSX

import typings.createDashEmotion.createDashEmotionMod.Interpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLAttributes extends js.Object {
  var css: js.UndefOr[Interpolation] = js.undefined
}

object HTMLAttributes {
  @scala.inline
  def apply(css: Interpolation = null): HTMLAttributes = {
    val __obj = js.Dynamic.literal()
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributes]
  }
}

