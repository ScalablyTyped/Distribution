package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ProjectionPickerViewModel")
@js.native
class ProjectionPickerViewModel protected () extends js.Object {
  def this(scene: Scene) = this()
  var dropDownVisible: scala.Boolean = js.native
  var isOrthographicProjection: Command = js.native
  var scene: Scene = js.native
  var sceneMode: SceneMode = js.native
  var selectedTooltip: java.lang.String = js.native
  var switchToOrthographic: Command = js.native
  var switchToPerspective: Command = js.native
  var toggleDropdown: Command = js.native
  var tooltipOrthographic: java.lang.String = js.native
  var tooltipPerspective: java.lang.String = js.native
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
}

