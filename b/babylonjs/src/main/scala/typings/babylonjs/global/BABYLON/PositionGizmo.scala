package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PositionGizmo")
@js.native
/**
  * Creates a PositionGizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  @param thickness display gizmo axis thickness
  */
class PositionGizmo ()
  extends StObject
     with typings.babylonjs.BABYLON.PositionGizmo {
  def this(gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer) = this()
  def this(gizmoLayer: Unit, thickness: Double) = this()
  def this(gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer, thickness: Double) = this()
  def this(gizmoLayer: Unit, thickness: Double, gizmoManager: typings.babylonjs.BABYLON.GizmoManager) = this()
  def this(gizmoLayer: Unit, thickness: Unit, gizmoManager: typings.babylonjs.BABYLON.GizmoManager) = this()
  def this(
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer,
    thickness: Double,
    gizmoManager: typings.babylonjs.BABYLON.GizmoManager
  ) = this()
  def this(
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer,
    thickness: Unit,
    gizmoManager: typings.babylonjs.BABYLON.GizmoManager
  ) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
