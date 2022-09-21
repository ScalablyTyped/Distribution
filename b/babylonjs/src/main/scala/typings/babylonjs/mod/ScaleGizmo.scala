package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "ScaleGizmo")
@js.native
/**
  * Creates a ScaleGizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  * @param thickness display gizmo axis thickness
  * @param gizmoManager
  */
open class ScaleGizmo ()
  extends typings.babylonjs.legacyMod.ScaleGizmo {
  def this(gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer) = this()
  def this(gizmoLayer: Unit, thickness: Double) = this()
  def this(gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer, thickness: Double) = this()
  def this(gizmoLayer: Unit, thickness: Double, gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager) = this()
  def this(gizmoLayer: Unit, thickness: Unit, gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager) = this()
  def this(
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    thickness: Double,
    gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
  ) = this()
  def this(
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    thickness: Unit,
    gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
  ) = this()
}
