package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.AxisScaleGizmo")
@js.native
class AxisScaleGizmo protected ()
  extends StObject
     with typings.babylonjs.BABYLON.AxisScaleGizmo {
  /**
    * Creates an AxisScaleGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param dragAxis The axis which the gizmo will be able to scale on
    * @param color The color of the gizmo
    * @param thickness display gizmo axis thickness
    */
  def this(dragAxis: typings.babylonjs.BABYLON.Vector3) = this()
  def this(dragAxis: typings.babylonjs.BABYLON.Vector3, color: typings.babylonjs.BABYLON.Color3) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: Unit,
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: typings.babylonjs.BABYLON.Color3,
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: Unit,
    gizmoLayer: Unit,
    parent: Nullable[typings.babylonjs.BABYLON.ScaleGizmo]
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: Unit,
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.BABYLON.ScaleGizmo]
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: typings.babylonjs.BABYLON.Color3,
    gizmoLayer: Unit,
    parent: Nullable[typings.babylonjs.BABYLON.ScaleGizmo]
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: typings.babylonjs.BABYLON.Color3,
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.BABYLON.ScaleGizmo]
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: Unit,
    gizmoLayer: Unit,
    parent: Unit,
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: Unit,
    gizmoLayer: Unit,
    parent: Nullable[typings.babylonjs.BABYLON.ScaleGizmo],
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: Unit,
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer,
    parent: Unit,
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: Unit,
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.BABYLON.ScaleGizmo],
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: typings.babylonjs.BABYLON.Color3,
    gizmoLayer: Unit,
    parent: Unit,
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: typings.babylonjs.BABYLON.Color3,
    gizmoLayer: Unit,
    parent: Nullable[typings.babylonjs.BABYLON.ScaleGizmo],
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: typings.babylonjs.BABYLON.Color3,
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer,
    parent: Unit,
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: typings.babylonjs.BABYLON.Color3,
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.BABYLON.ScaleGizmo],
    thickness: Double
  ) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
