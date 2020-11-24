package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.GizmoManager")
@js.native
class GizmoManager protected ()
  extends typings.babylonjs.BABYLON.GizmoManager {
  /**
    * Instatiates a gizmo manager
    * @param scene the scene to overlay the gizmos on top of
    * @param thickness display gizmo axis thickness
    * @param utilityLayer the layer where gizmos are rendered
    * @param keepDepthUtilityLayer the layer where occluded gizmos are rendered
    */
  def this(scene: typings.babylonjs.BABYLON.Scene) = this()
  def this(scene: typings.babylonjs.BABYLON.Scene, thickness: Double) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    thickness: js.UndefOr[scala.Nothing],
    utilityLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer
  ) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    thickness: Double,
    utilityLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer
  ) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    thickness: js.UndefOr[scala.Nothing],
    utilityLayer: js.UndefOr[scala.Nothing],
    keepDepthUtilityLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer
  ) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    thickness: js.UndefOr[scala.Nothing],
    utilityLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer,
    keepDepthUtilityLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer
  ) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    thickness: Double,
    utilityLayer: js.UndefOr[scala.Nothing],
    keepDepthUtilityLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer
  ) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    thickness: Double,
    utilityLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer,
    keepDepthUtilityLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer
  ) = this()
}
