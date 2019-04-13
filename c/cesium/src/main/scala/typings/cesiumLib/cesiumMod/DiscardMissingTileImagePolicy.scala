package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "DiscardMissingTileImagePolicy")
@js.native
class DiscardMissingTileImagePolicy protected () extends js.Object {
  def this(options: cesiumLib.Anon_DisableCheckIfAllPixelsAreTransparent) = this()
  def isReady(): scala.Boolean = js.native
  def shouldDiscardImage(image: stdLib.HTMLImageElement): scala.Boolean = js.native
}

