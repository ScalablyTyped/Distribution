package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreenSpaceEventHandler extends js.Object {
  def destroy(): scala.Unit = js.native
  def getInputAction(`type`: scala.Double): js.Function0[scala.Unit] = js.native
  def getInputAction(`type`: scala.Double, modifier: scala.Double): js.Function0[scala.Unit] = js.native
  def isDestroyed(): scala.Boolean = js.native
  def removeInputAction(`type`: scala.Double): scala.Unit = js.native
  def removeInputAction(`type`: scala.Double, modifier: scala.Double): scala.Unit = js.native
  def setInputAction(action: js.Function0[scala.Unit], `type`: scala.Double): scala.Unit = js.native
  def setInputAction(action: js.Function0[scala.Unit], `type`: scala.Double, modifier: scala.Double): scala.Unit = js.native
}

