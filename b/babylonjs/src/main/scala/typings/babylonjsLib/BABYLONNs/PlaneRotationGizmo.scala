package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Single plane rotation gizmo
     */
@JSGlobal("BABYLON.PlaneRotationGizmo")
@js.native
class PlaneRotationGizmo protected () extends Gizmo {
  /**
           * Creates a PlaneRotationGizmo
           * @param gizmoLayer The utility layer the gizmo will be added to
           * @param planeNormal The normal of the plane which the gizmo will be able to rotate on
           * @param color The color of the gizmo
           * @param tessellation Amount of tessellation to be used when creating rotation circles
           */
  def this(planeNormal: Vector3) = this()
  /**
           * Creates a PlaneRotationGizmo
           * @param gizmoLayer The utility layer the gizmo will be added to
           * @param planeNormal The normal of the plane which the gizmo will be able to rotate on
           * @param color The color of the gizmo
           * @param tessellation Amount of tessellation to be used when creating rotation circles
           */
  def this(planeNormal: Vector3, color: Color3) = this()
  /**
           * Creates a PlaneRotationGizmo
           * @param gizmoLayer The utility layer the gizmo will be added to
           * @param planeNormal The normal of the plane which the gizmo will be able to rotate on
           * @param color The color of the gizmo
           * @param tessellation Amount of tessellation to be used when creating rotation circles
           */
  def this(planeNormal: Vector3, color: Color3, gizmoLayer: UtilityLayerRenderer) = this()
  /**
           * Creates a PlaneRotationGizmo
           * @param gizmoLayer The utility layer the gizmo will be added to
           * @param planeNormal The normal of the plane which the gizmo will be able to rotate on
           * @param color The color of the gizmo
           * @param tessellation Amount of tessellation to be used when creating rotation circles
           */
  def this(planeNormal: Vector3, color: Color3, gizmoLayer: UtilityLayerRenderer, tessellation: scala.Double) = this()
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
           * Rotation distance in radians that the gizmo will snap to (Default: 0)
           */
  var snapDistance: scala.Double = js.native
}

