package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def attachToMesh(mesh: AbstractMesh): Unit = js.native
  def attachToMesh(mesh: AbstractMesh, meshSpaceDirection: Vector3): Unit = js.native
  def attachToMesh(mesh: AbstractMesh, meshSpaceDirection: Vector3, meshSpaceOrigin: Vector3): Unit = js.native
  def attachToMesh(mesh: AbstractMesh, meshSpaceDirection: Vector3, meshSpaceOrigin: Vector3, length: Double): Unit = js.native
  /**
    * Detach the ray helper from the mesh it has previously been attached to.
    */
  def detachFromMesh(): Unit = js.native
  /**
    * Dispose the helper and release its associated resources.
    */
  def dispose(): Unit = js.native
  /**
    * Hides the ray we are debugging.
    */
  def hide(): Unit = js.native
  /**
    * Shows the ray we are willing to debug.
    * @param scene Defines the scene the ray needs to be rendered in
    * @param color Defines the color the ray needs to be rendered in
    */
  def show(scene: Scene): Unit = js.native
  def show(scene: Scene, color: Color3): Unit = js.native
}

/* static members */
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
  def CreateAndShow(ray: Ray, scene: Scene, color: Color3): RayHelper = js.native
}

