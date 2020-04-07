package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.OctreeSceneComponent")
@js.native
class OctreeSceneComponent protected () extends js.Object {
  /**
    * Creates a new instance of the component for the given scene
    * @param scene Defines the scene to register the component in
    */
  def this(scene: Scene) = this()
  var _tempRay: js.Any = js.native
  /**
    * Indicates if the meshes have been checked to make sure they are isEnabled()
    */
  val checksIsEnabled: Boolean = js.native
  /**
    * The component name help to identify the component in the list of scene components.
    */
  val name: String = js.native
  /**
    * The scene the component belongs to.
    */
  var scene: Scene = js.native
  /**
    * Disposes the component and the associated ressources.
    */
  def dispose(): Unit = js.native
  /**
    * Return the list of active meshes
    * @returns the list of active meshes
    */
  def getActiveMeshCandidates(): ISmartArrayLike[AbstractMesh] = js.native
  /**
    * Return the list of active sub meshes
    * @param mesh The mesh to get the candidates sub meshes from
    * @returns the list of active sub meshes
    */
  def getActiveSubMeshCandidates(mesh: AbstractMesh): ISmartArrayLike[SubMesh] = js.native
  /**
    * Return the list of sub meshes colliding with a collider
    * @param mesh defines the mesh to find the submesh for
    * @param collider defines the collider to evaluate the collision against
    * @returns the list of colliding sub meshes
    */
  def getCollidingSubMeshCandidates(mesh: AbstractMesh, collider: Collider): ISmartArrayLike[SubMesh] = js.native
  /**
    * Return the list of sub meshes intersecting with a given local ray
    * @param mesh defines the mesh to find the submesh for
    * @param localRay defines the ray in local space
    * @returns the list of intersecting sub meshes
    */
  def getIntersectingSubMeshCandidates(mesh: AbstractMesh, localRay: Ray): ISmartArrayLike[SubMesh] = js.native
  /**
    * Rebuilds the elements related to this component in case of
    * context lost for instance.
    */
  def rebuild(): Unit = js.native
  /**
    * Registers the component in a given scene
    */
  def register(): Unit = js.native
}

