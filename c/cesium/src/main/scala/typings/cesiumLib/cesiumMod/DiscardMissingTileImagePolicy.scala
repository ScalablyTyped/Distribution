package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "DiscardMissingTileImagePolicy")
@js.native
class DiscardMissingTileImagePolicy protected ()
  extends cesiumLib.cesiumMod.CesiumNs.DiscardMissingTileImagePolicy {
  def this(options: cesiumLib.Anon_PixelsToCheck) = this()
  /* CompleteClass */
  override def isReady(): scala.Boolean = js.native
  /* CompleteClass */
  override def shouldDiscardImage(image: stdLib.HTMLImageElement): scala.Boolean = js.native
}

