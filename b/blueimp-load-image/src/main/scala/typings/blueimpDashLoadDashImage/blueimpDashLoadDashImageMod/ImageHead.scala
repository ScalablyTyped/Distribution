package typings.blueimpDashLoadDashImage.blueimpDashLoadDashImageMod

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageHead extends js.Object {
  var imageHead: js.UndefOr[ArrayBuffer | Uint8Array] = js.undefined
}

object ImageHead {
  @scala.inline
  def apply(imageHead: ArrayBuffer | Uint8Array = null): ImageHead = {
    val __obj = js.Dynamic.literal()
    if (imageHead != null) __obj.updateDynamic("imageHead")(imageHead.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageHead]
  }
}

