package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileDiscardPolicy extends js.Object {
  def isReady(): scala.Boolean = js.native
  def shouldDiscardImage(image: stdLib.HTMLImageElement): stdLib.Promise[scala.Boolean] = js.native
  def shouldDiscardImage(image: stdLib.Promise[stdLib.HTMLImageElement]): stdLib.Promise[scala.Boolean] = js.native
}

