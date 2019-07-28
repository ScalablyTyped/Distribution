package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ProjectionPickerViewModel")
@js.native
class ProjectionPickerViewModel protected () extends js.Object {
  def this(scene: Scene) = this()
  var dropDownVisible: Boolean = js.native
  var isOrthographicProjection: Command = js.native
  var scene: Scene = js.native
  var sceneMode: SceneMode = js.native
  var selectedTooltip: String = js.native
  var switchToOrthographic: Command = js.native
  var switchToPerspective: Command = js.native
  var toggleDropdown: Command = js.native
  var tooltipOrthographic: String = js.native
  var tooltipPerspective: String = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
}

