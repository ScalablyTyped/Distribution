package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "FullscreenButton")
@js.native
class FullscreenButton protected ()
  extends cesiumLib.cesiumMod.CesiumNs.FullscreenButton {
  def this(container: java.lang.String) = this()
  def this(container: stdLib.Element) = this()
  def this(container: java.lang.String, fullscreenElement: java.lang.String) = this()
  def this(container: java.lang.String, fullscreenElement: stdLib.Element) = this()
  def this(container: stdLib.Element, fullscreenElement: java.lang.String) = this()
  def this(container: stdLib.Element, fullscreenElement: stdLib.Element) = this()
  /* CompleteClass */
  override var container: stdLib.Element = js.native
  /* CompleteClass */
  override var viewModel: cesiumLib.cesiumMod.CesiumNs.FullscreenButtonViewModel = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
}

