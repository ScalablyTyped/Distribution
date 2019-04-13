package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "SceneModePicker")
@js.native
class SceneModePicker protected () extends js.Object {
  def this(container: java.lang.String, scene: Scene) = this()
  def this(container: stdLib.Element, scene: Scene) = this()
  def this(container: java.lang.String, scene: Scene, duration: scala.Double) = this()
  def this(container: stdLib.Element, scene: Scene, duration: scala.Double) = this()
  var container: stdLib.Element = js.native
  var viewModel: SceneModePickerViewModel = js.native
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
}

