package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "TileDiscardPolicy")
@js.native
class TileDiscardPolicy () extends js.Object {
  def isReady(): scala.Boolean = js.native
  def shouldDiscardImage(image: js.Promise[stdLib.HTMLImageElement]): js.Promise[scala.Boolean] = js.native
  def shouldDiscardImage(image: stdLib.HTMLImageElement): js.Promise[scala.Boolean] = js.native
}

