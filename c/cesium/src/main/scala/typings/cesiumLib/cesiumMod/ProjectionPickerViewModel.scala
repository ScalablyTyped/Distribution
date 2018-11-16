package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ProjectionPickerViewModel")
@js.native
class ProjectionPickerViewModel protected ()
  extends cesiumLib.cesiumMod.CesiumNs.ProjectionPickerViewModel {
  def this(scene: cesiumLib.cesiumMod.CesiumNs.Scene) = this()
  /* CompleteClass */
  override var dropDownVisible: scala.Boolean = js.native
  /* CompleteClass */
  override var isOrthographicProjection: cesiumLib.cesiumMod.CesiumNs.Command = js.native
  /* CompleteClass */
  override var scene: cesiumLib.cesiumMod.CesiumNs.Scene = js.native
  /* CompleteClass */
  override var sceneMode: cesiumLib.cesiumMod.CesiumNs.SceneMode = js.native
  /* CompleteClass */
  override var selectedTooltip: java.lang.String = js.native
  /* CompleteClass */
  override var switchToOrthographic: cesiumLib.cesiumMod.CesiumNs.Command = js.native
  /* CompleteClass */
  override var switchToPerspective: cesiumLib.cesiumMod.CesiumNs.Command = js.native
  /* CompleteClass */
  override var toggleDropdown: cesiumLib.cesiumMod.CesiumNs.Command = js.native
  /* CompleteClass */
  override var tooltipOrthographic: java.lang.String = js.native
  /* CompleteClass */
  override var tooltipPerspective: java.lang.String = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
}

