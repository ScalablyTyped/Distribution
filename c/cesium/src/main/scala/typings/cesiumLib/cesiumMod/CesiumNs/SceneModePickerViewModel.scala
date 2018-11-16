package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SceneModePickerViewModel extends js.Object {
  var dropDownVisible: scala.Boolean
  var duration: scala.Double
  var morphTo2D: Command
  var morphTo3D: Command
  var morphToColumbusView: Command
  var scene: Scene
  var sceneMode: SceneMode
  var selectedTooltip: java.lang.String
  var toggleDropDown: Command
  var tooltip2D: java.lang.String
  var tooltip3D: java.lang.String
  var tooltipColumbusView: java.lang.String
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
}

