package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Bounding box gizmo
  */
@JSImport("babylonjs", "BoundingBoxGizmo")
@js.native
/**
  * Creates an BoundingBoxGizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  * @param color The color of the gizmo
  */
class BoundingBoxGizmo ()
  extends babylonjsLib.BABYLONNs.BoundingBoxGizmo {
  def this(color: babylonjsLib.BABYLONNs.Color3) = this()
  def this(color: babylonjsLib.BABYLONNs.Color3, gizmoLayer: babylonjsLib.BABYLONNs.UtilityLayerRenderer) = this()
}

/* static members */
@JSImport("babylonjs", "BoundingBoxGizmo")
@js.native
object BoundingBoxGizmo extends js.Object {
  var _OldPivotPoint: js.Any = js.native
  var _PivotCached: js.Any = js.native
  var _PivotTmpVector: js.Any = js.native
  var _PivotTranslation: js.Any = js.native
  /**
    * Makes a mesh not pickable and wraps the mesh inside of a bounding box mesh that is pickable. (This is useful to avoid picking within complex geometry)
    * @param mesh the mesh to wrap in the bounding box mesh and make not pickable
    * @returns the bounding box mesh with the passed in mesh as a child
    */
  def MakeNotPickableAndWrapInBoundingBox(mesh: babylonjsLib.BABYLONNs.Mesh): babylonjsLib.BABYLONNs.Mesh = js.native
  /** @hidden */
  def _RemoveAndStorePivotPoint(mesh: babylonjsLib.BABYLONNs.AbstractMesh): scala.Unit = js.native
  /** @hidden */
  def _RestorePivotPoint(mesh: babylonjsLib.BABYLONNs.AbstractMesh): scala.Unit = js.native
}

