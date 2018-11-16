package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "FullscreenButtonViewModel")
@js.native
class FullscreenButtonViewModel ()
  extends cesiumLib.cesiumMod.CesiumNs.FullscreenButtonViewModel {
  def this(fullscreenElement: java.lang.String) = this()
  def this(fullscreenElement: stdLib.Element) = this()
  /* CompleteClass */
  override var command: cesiumLib.cesiumMod.CesiumNs.Command = js.native
  /* CompleteClass */
  override var fullscreenElement: stdLib.Element = js.native
  /* CompleteClass */
  override var isFullscreen: scala.Boolean = js.native
  /* CompleteClass */
  override var isFullscreenEnabled: scala.Boolean = js.native
  /* CompleteClass */
  override var tooltip: java.lang.String = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
}

