package typings.cesium.cesiumMod

import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "NeverTileDiscardPolicy")
@js.native
class NeverTileDiscardPolicy () extends js.Object {
  def isReady(): Boolean = js.native
  def shouldDiscardImage(image: js.Promise[HTMLImageElement]): js.Promise[Boolean] = js.native
  def shouldDiscardImage(image: HTMLImageElement): js.Promise[Boolean] = js.native
}

