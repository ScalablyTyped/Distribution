package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "PositionGizmo")
@js.native
/**
  * Creates a PositionGizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  @param thickness display gizmo axis thickness
  */
class PositionGizmo ()
  extends typings.babylonjs.legacyMod.PositionGizmo {
  def this(gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer) = this()
  def this(gizmoLayer: js.UndefOr[scala.Nothing], thickness: Double) = this()
  def this(gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer, thickness: Double) = this()
  def this(
    gizmoLayer: js.UndefOr[scala.Nothing],
    thickness: js.UndefOr[scala.Nothing],
    gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
  ) = this()
  def this(
    gizmoLayer: js.UndefOr[scala.Nothing],
    thickness: Double,
    gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
  ) = this()
  def this(
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    thickness: js.UndefOr[scala.Nothing],
    gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
  ) = this()
  def this(
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    thickness: Double,
    gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
  ) = this()
}
