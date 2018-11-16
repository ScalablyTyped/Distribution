package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Single axis scale gizmo
     */
@JSGlobal("BABYLON.AxisScaleGizmo")
@js.native
class AxisScaleGizmo protected () extends Gizmo {
  /**
           * Creates an AxisScaleGizmo
           * @param gizmoLayer The utility layer the gizmo will be added to
           * @param dragAxis The axis which the gizmo will be able to scale on
           * @param color The color of the gizmo
           */
  def this(dragAxis: Vector3) = this()
  /**
           * Creates an AxisScaleGizmo
           * @param gizmoLayer The utility layer the gizmo will be added to
           * @param dragAxis The axis which the gizmo will be able to scale on
           * @param color The color of the gizmo
           */
  def this(dragAxis: Vector3, color: Color3) = this()
  /**
           * Creates an AxisScaleGizmo
           * @param gizmoLayer The utility layer the gizmo will be added to
           * @param dragAxis The axis which the gizmo will be able to scale on
           * @param color The color of the gizmo
           */
  def this(dragAxis: Vector3, color: Color3, gizmoLayer: UtilityLayerRenderer) = this()
  var _coloredMaterial: js.Any = js.native
  var _pointerObserver: js.Any = js.native
  /**
           * Drag behavior responsible for the gizmos dragging interactions
           */
  var dragBehavior: PointerDragBehavior = js.native
  /**
           * Event that fires each time the gizmo snaps to a new location.
           * * snapDistance is the the change in distance
           */
  var onSnapObservable: Observable[babylonjsLib.Anon_SnapDistance] = js.native
  /**
           * Scale distance in babylon units that the gizmo will snap to when dragged (Default: 0)
           */
  var snapDistance: scala.Double = js.native
  /**
           * If the scaling operation should be done on all axis (default: false)
           */
  var uniformScaling: scala.Boolean = js.native
  /**
           * Disposes and replaces the current meshes in the gizmo with the specified mesh
           * @param mesh The mesh to replace the default mesh of the gizmo
           * @param useGizmoMaterial If the gizmo's default material should be used (default: false)
           */
  def setCustomMesh(mesh: Mesh, useGizmoMaterial: scala.Boolean): scala.Unit = js.native
}

