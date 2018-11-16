package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "SceneModePickerViewModel")
@js.native
class SceneModePickerViewModel protected ()
  extends cesiumLib.cesiumMod.CesiumNs.SceneModePickerViewModel {
  def this(scene: cesiumLib.cesiumMod.CesiumNs.Scene) = this()
  def this(scene: cesiumLib.cesiumMod.CesiumNs.Scene, duration: scala.Double) = this()
  /* CompleteClass */
  override var dropDownVisible: scala.Boolean = js.native
  /* CompleteClass */
  override var duration: scala.Double = js.native
  /* CompleteClass */
  override var morphTo2D: cesiumLib.cesiumMod.CesiumNs.Command = js.native
  /* CompleteClass */
  override var morphTo3D: cesiumLib.cesiumMod.CesiumNs.Command = js.native
  /* CompleteClass */
  override var morphToColumbusView: cesiumLib.cesiumMod.CesiumNs.Command = js.native
  /* CompleteClass */
  override var scene: cesiumLib.cesiumMod.CesiumNs.Scene = js.native
  /* CompleteClass */
  override var sceneMode: cesiumLib.cesiumMod.CesiumNs.SceneMode = js.native
  /* CompleteClass */
  override var selectedTooltip: java.lang.String = js.native
  /* CompleteClass */
  override var toggleDropDown: cesiumLib.cesiumMod.CesiumNs.Command = js.native
  /* CompleteClass */
  override var tooltip2D: java.lang.String = js.native
  /* CompleteClass */
  override var tooltip3D: java.lang.String = js.native
  /* CompleteClass */
  override var tooltipColumbusView: java.lang.String = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
}

