package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "GizmoManager")
@js.native
open class GizmoManager protected ()
  extends typings.babylonjs.legacyLegacyMod.GizmoManager {
  /**
    * Instantiates a gizmo manager
    * @param _scene the scene to overlay the gizmos on top of
    * @param thickness display gizmo axis thickness
    * @param utilityLayer the layer where gizmos are rendered
    * @param keepDepthUtilityLayer the layer where occluded gizmos are rendered
    */
  def this(_scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(_scene: typings.babylonjs.sceneMod.Scene, thickness: Double) = this()
  def this(
    _scene: typings.babylonjs.sceneMod.Scene,
    thickness: Double,
    utilityLayer: typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    _scene: typings.babylonjs.sceneMod.Scene,
    thickness: Unit,
    utilityLayer: typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    _scene: typings.babylonjs.sceneMod.Scene,
    thickness: Double,
    utilityLayer: Unit,
    keepDepthUtilityLayer: typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    _scene: typings.babylonjs.sceneMod.Scene,
    thickness: Double,
    utilityLayer: typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer,
    keepDepthUtilityLayer: typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    _scene: typings.babylonjs.sceneMod.Scene,
    thickness: Unit,
    utilityLayer: Unit,
    keepDepthUtilityLayer: typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    _scene: typings.babylonjs.sceneMod.Scene,
    thickness: Unit,
    utilityLayer: typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer,
    keepDepthUtilityLayer: typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
}
