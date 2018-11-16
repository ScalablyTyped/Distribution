package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Animation")
@js.native
class Animation protected ()
  extends cesiumLib.cesiumMod.CesiumNs.Animation {
  def this(container: java.lang.String, viewModel: cesiumLib.cesiumMod.CesiumNs.AnimationViewModel) = this()
  def this(container: stdLib.Element, viewModel: cesiumLib.cesiumMod.CesiumNs.AnimationViewModel) = this()
  /* CompleteClass */
  override val container: stdLib.Element = js.native
  /* CompleteClass */
  override val viewModel: cesiumLib.cesiumMod.CesiumNs.AnimationViewModel = js.native
  /* CompleteClass */
  override def applyThemeChanges(): scala.Unit = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
  /* CompleteClass */
  override def resize(): scala.Unit = js.native
}

