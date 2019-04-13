package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "SceneModePickerViewModel")
@js.native
class SceneModePickerViewModel protected () extends js.Object {
  def this(scene: Scene) = this()
  def this(scene: Scene, duration: scala.Double) = this()
  var dropDownVisible: scala.Boolean = js.native
  var duration: scala.Double = js.native
  var morphTo2D: Command = js.native
  var morphTo3D: Command = js.native
  var morphToColumbusView: Command = js.native
  var scene: Scene = js.native
  var sceneMode: SceneMode = js.native
  var selectedTooltip: java.lang.String = js.native
  var toggleDropDown: Command = js.native
  var tooltip2D: java.lang.String = js.native
  var tooltip3D: java.lang.String = js.native
  var tooltipColumbusView: java.lang.String = js.native
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
}

