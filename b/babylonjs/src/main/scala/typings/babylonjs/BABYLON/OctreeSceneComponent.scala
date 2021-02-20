package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OctreeSceneComponent extends StObject {
  
  var _tempRay: js.Any = js.native
  
  /**
    * Indicates if the meshes have been checked to make sure they are isEnabled()
    */
  val checksIsEnabled: Boolean = js.native
  
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
    * The component name help to identify the component in the list of scene components.
    */
  val name: String = js.native
  
  /**
    * Rebuilds the elements related to this component in case of
    * context lost for instance.
    */
  def rebuild(): Unit = js.native
  
  /**
    * Registers the component in a given scene
    */
  def register(): Unit = js.native
  
  /**
    * The scene the component belongs to.
    */
  var scene: Scene = js.native
}
object OctreeSceneComponent {
  
  @scala.inline
  def apply(
    _tempRay: js.Any,
    checksIsEnabled: Boolean,
    dispose: () => Unit,
    getActiveMeshCandidates: () => ISmartArrayLike[AbstractMesh],
    getActiveSubMeshCandidates: AbstractMesh => ISmartArrayLike[SubMesh],
    getCollidingSubMeshCandidates: (AbstractMesh, Collider) => ISmartArrayLike[SubMesh],
    getIntersectingSubMeshCandidates: (AbstractMesh, Ray) => ISmartArrayLike[SubMesh],
    name: String,
    rebuild: () => Unit,
    register: () => Unit,
    scene: Scene
  ): OctreeSceneComponent = {
    val __obj = js.Dynamic.literal(_tempRay = _tempRay.asInstanceOf[js.Any], checksIsEnabled = checksIsEnabled.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), getActiveMeshCandidates = js.Any.fromFunction0(getActiveMeshCandidates), getActiveSubMeshCandidates = js.Any.fromFunction1(getActiveSubMeshCandidates), getCollidingSubMeshCandidates = js.Any.fromFunction2(getCollidingSubMeshCandidates), getIntersectingSubMeshCandidates = js.Any.fromFunction2(getIntersectingSubMeshCandidates), name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[OctreeSceneComponent]
  }
  
  @scala.inline
  implicit class OctreeSceneComponentMutableBuilder[Self <: OctreeSceneComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecksIsEnabled(value: Boolean): Self = StObject.set(x, "checksIsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetActiveMeshCandidates(value: () => ISmartArrayLike[AbstractMesh]): Self = StObject.set(x, "getActiveMeshCandidates", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetActiveSubMeshCandidates(value: AbstractMesh => ISmartArrayLike[SubMesh]): Self = StObject.set(x, "getActiveSubMeshCandidates", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCollidingSubMeshCandidates(value: (AbstractMesh, Collider) => ISmartArrayLike[SubMesh]): Self = StObject.set(x, "getCollidingSubMeshCandidates", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetIntersectingSubMeshCandidates(value: (AbstractMesh, Ray) => ISmartArrayLike[SubMesh]): Self = StObject.set(x, "getIntersectingSubMeshCandidates", js.Any.fromFunction2(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRebuild(value: () => Unit): Self = StObject.set(x, "rebuild", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegister(value: () => Unit): Self = StObject.set(x, "register", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScene(value: Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_tempRay(value: js.Any): Self = StObject.set(x, "_tempRay", value.asInstanceOf[js.Any])
  }
}
