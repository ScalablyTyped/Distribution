package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * As raycast might be hard to debug, the RayHelper can help rendering the different rays
     * in order to better appreciate the issue one might have.
     * @see http://doc.babylonjs.com/babylon101/raycasts#debugging
     */
@JSGlobal("BABYLON.RayHelper")
@js.native
class RayHelper protected () extends js.Object {
  /**
           * Instantiate a new ray helper.
           * As raycast might be hard to debug, the RayHelper can help rendering the different rays
           * in order to better appreciate the issue one might have.
           * @see http://doc.babylonjs.com/babylon101/raycasts#debugging
           * @param ray Defines the ray we are currently tryin to visualize
           */
  def this(ray: Ray) = this()
  var _attachedToMesh: js.Any = js.native
  var _meshSpaceDirection: js.Any = js.native
  var _meshSpaceOrigin: js.Any = js.native
  var _render: js.Any = js.native
  var _renderFunction: js.Any = js.native
  var _renderLine: js.Any = js.native
  var _renderPoints: js.Any = js.native
  var _scene: js.Any = js.native
  var _updateToMesh: js.Any = js.native
  var _updateToMeshFunction: js.Any = js.native
  /**
           * Defines the ray we are currently tryin to visualize.
           */
  var ray: Nullable[Ray] = js.native
  /**
           * Attach a ray helper to a mesh so that we can easily see its orientation for instance or information like its normals.
           * @param mesh Defines the mesh we want the helper attached to
           * @param meshSpaceDirection Defines the direction of the Ray in mesh space (local space of the mesh node)
           * @param meshSpaceOrigin Defines the origin of the Ray in mesh space (local space of the mesh node)
           * @param length Defines the length of the ray
           */
  def attachToMesh(mesh: AbstractMesh): scala.Unit = js.native
  /**
           * Attach a ray helper to a mesh so that we can easily see its orientation for instance or information like its normals.
           * @param mesh Defines the mesh we want the helper attached to
           * @param meshSpaceDirection Defines the direction of the Ray in mesh space (local space of the mesh node)
           * @param meshSpaceOrigin Defines the origin of the Ray in mesh space (local space of the mesh node)
           * @param length Defines the length of the ray
           */
  def attachToMesh(mesh: AbstractMesh, meshSpaceDirection: Vector3): scala.Unit = js.native
  /**
           * Attach a ray helper to a mesh so that we can easily see its orientation for instance or information like its normals.
           * @param mesh Defines the mesh we want the helper attached to
           * @param meshSpaceDirection Defines the direction of the Ray in mesh space (local space of the mesh node)
           * @param meshSpaceOrigin Defines the origin of the Ray in mesh space (local space of the mesh node)
           * @param length Defines the length of the ray
           */
  def attachToMesh(mesh: AbstractMesh, meshSpaceDirection: Vector3, meshSpaceOrigin: Vector3): scala.Unit = js.native
  /**
           * Attach a ray helper to a mesh so that we can easily see its orientation for instance or information like its normals.
           * @param mesh Defines the mesh we want the helper attached to
           * @param meshSpaceDirection Defines the direction of the Ray in mesh space (local space of the mesh node)
           * @param meshSpaceOrigin Defines the origin of the Ray in mesh space (local space of the mesh node)
           * @param length Defines the length of the ray
           */
  def attachToMesh(mesh: AbstractMesh, meshSpaceDirection: Vector3, meshSpaceOrigin: Vector3, length: scala.Double): scala.Unit = js.native
  /**
           * Detach the ray helper from the mesh it has previously been attached to.
           */
  def detachFromMesh(): scala.Unit = js.native
  /**
           * Dispose the helper and release its associated resources.
           */
  def dispose(): scala.Unit = js.native
  /**
           * Hides the ray we are debugging.
           */
  def hide(): scala.Unit = js.native
  /**
           * Shows the ray we are willing to debug.
           * @param scene Defines the scene the ray needs to be rendered in
           * @param color Defines the color the ray needs to be rendered in
           */
  def show(scene: Scene): scala.Unit = js.native
  /**
           * Shows the ray we are willing to debug.
           * @param scene Defines the scene the ray needs to be rendered in
           * @param color Defines the color the ray needs to be rendered in
           */
  def show(scene: Scene, color: Color3): scala.Unit = js.native
}

/**
     * As raycast might be hard to debug, the RayHelper can help rendering the different rays
     * in order to better appreciate the issue one might have.
     * @see http://doc.babylonjs.com/babylon101/raycasts#debugging
     */
@JSGlobal("BABYLON.RayHelper")
@js.native
object RayHelper extends js.Object {
  /**
           * Helper function to create a colored helper in a scene in one line.
           * @param ray Defines the ray we are currently tryin to visualize
           * @param scene Defines the scene the ray is used in
           * @param color Defines the color we want to see the ray in
           * @returns The newly created ray helper.
           */
  def CreateAndShow(
    ray: babylonjsLib.BABYLONNs.Ray,
    scene: babylonjsLib.BABYLONNs.Scene,
    color: babylonjsLib.BABYLONNs.Color3
  ): babylonjsLib.BABYLONNs.RayHelper = js.native
}

