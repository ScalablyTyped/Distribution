package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.BoundingBoxGizmo")
@js.native
/**
  * Creates an BoundingBoxGizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  * @param color The color of the gizmo
  */
class BoundingBoxGizmo ()
  extends typings.babylonjs.BABYLON.BoundingBoxGizmo {
  def this(color: typings.babylonjs.BABYLON.Color3) = this()
  def this(color: js.UndefOr[scala.Nothing], gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer) = this()
  def this(
    color: typings.babylonjs.BABYLON.Color3,
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer
  ) = this()
}
/* static members */
@JSGlobal("BABYLON.BoundingBoxGizmo")
@js.native
object BoundingBoxGizmo extends js.Object {
  
  /**
    * Makes a mesh not pickable and wraps the mesh inside of a bounding box mesh that is pickable. (This is useful to avoid picking within complex geometry)
    * @param mesh the mesh to wrap in the bounding box mesh and make not pickable
    * @returns the bounding box mesh with the passed in mesh as a child
    */
  def MakeNotPickableAndWrapInBoundingBox(mesh: typings.babylonjs.BABYLON.Mesh): typings.babylonjs.BABYLON.Mesh = js.native
}
