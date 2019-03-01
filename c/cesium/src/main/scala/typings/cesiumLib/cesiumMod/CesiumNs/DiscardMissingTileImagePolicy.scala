package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscardMissingTileImagePolicy extends js.Object {
  def isReady(): scala.Boolean
  def shouldDiscardImage(image: stdLib.HTMLImageElement): scala.Boolean
}

object DiscardMissingTileImagePolicy {
  @scala.inline
  def apply(
    isReady: js.Function0[scala.Boolean],
    shouldDiscardImage: js.Function1[stdLib.HTMLImageElement, scala.Boolean]
  ): DiscardMissingTileImagePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isReady")(isReady)
    __obj.updateDynamic("shouldDiscardImage")(shouldDiscardImage)
    __obj.asInstanceOf[DiscardMissingTileImagePolicy]
  }
}

