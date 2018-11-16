package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProjectionPickerViewModel extends js.Object {
  var dropDownVisible: scala.Boolean
  var isOrthographicProjection: Command
  var scene: Scene
  var sceneMode: SceneMode
  var selectedTooltip: java.lang.String
  var switchToOrthographic: Command
  var switchToPerspective: Command
  var toggleDropdown: Command
  var tooltipOrthographic: java.lang.String
  var tooltipPerspective: java.lang.String
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
}

