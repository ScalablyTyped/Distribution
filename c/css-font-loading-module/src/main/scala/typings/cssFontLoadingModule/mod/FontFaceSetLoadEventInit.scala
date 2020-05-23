package typings.cssFontLoadingModule.mod

import typings.cssFontLoadingModule.mod.global.FontFace
import typings.std.EventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontFaceSetLoadEventInit extends EventInit {
  var fontfaces: js.UndefOr[js.Array[FontFace]] = js.undefined
}

object FontFaceSetLoadEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[Boolean] = js.undefined,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    composed: js.UndefOr[Boolean] = js.undefined,
    fontfaces: js.Array[FontFace] = null
  ): FontFaceSetLoadEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.get.asInstanceOf[js.Any])
    if (fontfaces != null) __obj.updateDynamic("fontfaces")(fontfaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFaceSetLoadEventInit]
  }
}

