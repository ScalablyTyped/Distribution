package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NeverTileDiscardPolicy extends js.Object {
  def isReady(): scala.Boolean = js.native
  def shouldDiscardImage(image: js.Promise[stdLib.HTMLImageElement]): js.Promise[scala.Boolean] = js.native
  def shouldDiscardImage(image: stdLib.HTMLImageElement): js.Promise[scala.Boolean] = js.native
}

