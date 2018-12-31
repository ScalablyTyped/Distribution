package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Single plane rotation gizmo
  */
@JSImport("babylonjs", "PlaneRotationGizmo")
@js.native
class PlaneRotationGizmo protected ()
  extends babylonjsLib.BABYLONNs.PlaneRotationGizmo {
  /**
    * Creates a PlaneRotationGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param planeNormal The normal of the plane which the gizmo will be able to rotate on
    * @param color The color of the gizmo
    * @param tessellation Amount of tessellation to be used when creating rotation circles
    */
  def this(planeNormal: babylonjsLib.BABYLONNs.Vector3) = this()
  def this(planeNormal: babylonjsLib.BABYLONNs.Vector3, color: babylonjsLib.BABYLONNs.Color3) = this()
  def this(planeNormal: babylonjsLib.BABYLONNs.Vector3, color: babylonjsLib.BABYLONNs.Color3, gizmoLayer: babylonjsLib.BABYLONNs.UtilityLayerRenderer) = this()
  def this(planeNormal: babylonjsLib.BABYLONNs.Vector3, color: babylonjsLib.BABYLONNs.Color3, gizmoLayer: babylonjsLib.BABYLONNs.UtilityLayerRenderer, tessellation: scala.Double) = this()
}

