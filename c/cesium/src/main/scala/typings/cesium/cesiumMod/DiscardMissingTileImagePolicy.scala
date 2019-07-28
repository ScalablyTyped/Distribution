package typings.cesium.cesiumMod

import typings.cesium.Anon_DisableCheckIfAllPixelsAreTransparent
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "DiscardMissingTileImagePolicy")
@js.native
class DiscardMissingTileImagePolicy protected () extends js.Object {
  def this(options: Anon_DisableCheckIfAllPixelsAreTransparent) = this()
  def isReady(): Boolean = js.native
  def shouldDiscardImage(image: HTMLImageElement): Boolean = js.native
}

