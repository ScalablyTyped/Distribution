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
  def apply(isReady: () => scala.Boolean, shouldDiscardImage: stdLib.HTMLImageElement => scala.Boolean): DiscardMissingTileImagePolicy = {
    val __obj = js.Dynamic.literal(isReady = js.Any.fromFunction0(isReady), shouldDiscardImage = js.Any.fromFunction1(shouldDiscardImage))
  
    __obj.asInstanceOf[DiscardMissingTileImagePolicy]
  }
}

