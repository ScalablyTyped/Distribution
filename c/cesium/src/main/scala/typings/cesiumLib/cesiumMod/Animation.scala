package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Animation")
@js.native
class Animation protected () extends js.Object {
  def this(container: java.lang.String, viewModel: AnimationViewModel) = this()
  def this(container: stdLib.Element, viewModel: AnimationViewModel) = this()
  val container: stdLib.Element = js.native
  val viewModel: AnimationViewModel = js.native
  def applyThemeChanges(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
  def resize(): scala.Unit = js.native
}

