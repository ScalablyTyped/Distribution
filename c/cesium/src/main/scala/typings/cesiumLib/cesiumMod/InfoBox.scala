package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "InfoBox")
@js.native
class InfoBox protected ()
  extends cesiumLib.cesiumMod.CesiumNs.InfoBox {
  def this(container: java.lang.String) = this()
  def this(container: stdLib.Element) = this()
  /* CompleteClass */
  override var container: stdLib.Element = js.native
  /* CompleteClass */
  override var frame: stdLib.HTMLIFrameElement = js.native
  /* CompleteClass */
  override var viewModel: cesiumLib.cesiumMod.CesiumNs.InfoBoxViewModel = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
}

