package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ScreenSpaceEventHandler")
@js.native
class ScreenSpaceEventHandler () extends js.Object {
  def this(element: stdLib.HTMLCanvasElement) = this()
  def destroy(): scala.Unit = js.native
  def getInputAction(`type`: scala.Double): js.Function0[scala.Unit] = js.native
  def getInputAction(`type`: scala.Double, modifier: scala.Double): js.Function0[scala.Unit] = js.native
  def isDestroyed(): scala.Boolean = js.native
  def removeInputAction(`type`: scala.Double): scala.Unit = js.native
  def removeInputAction(`type`: scala.Double, modifier: scala.Double): scala.Unit = js.native
  def setInputAction(action: js.Function1[/* click */ cesiumLib.Anon_Position, scala.Unit], `type`: scala.Double): scala.Unit = js.native
  def setInputAction(
    action: js.Function1[/* click */ cesiumLib.Anon_Position, scala.Unit],
    `type`: scala.Double,
    modifier: scala.Double
  ): scala.Unit = js.native
}

