package typings.babylonjs.BABYLON

import typings.babylonjs.anon.DoNotInstantiateNewSourcedMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancedMesh
  extends StObject
     with AbstractMesh {
  
  /* private */ var _billboardWorldMatrix: Any = js.native
  
  /* private */ var _currentLOD: Any = js.native
  
  /** @hidden */
  var _distanceToCamera: Double = js.native
  
  /** @hidden */
  var _indexInSourceMeshInstanceArray: Double = js.native
  
  /** @hidden */
  var _previousWorldMatrix: Nullable[Matrix] = js.native
  
  def _removeLightSource(): Unit = js.native
  
  def _resyncLightSource(): Unit = js.native
  
  /* private */ var _sourceMesh: Any = js.native
  
  /** @hidden */
  def _syncSubMeshes(): InstancedMesh = js.native
  
  /**
    * Creates a new InstancedMesh from the current mesh.
    *
    * Returns the clone.
    * @param name the cloned mesh name
    * @param newParent the optional Node to parent the clone to.
    * @param doNotCloneChildren if `true` the model children aren't cloned.
    * @param newSourceMesh if set this mesh will be used as the source mesh instead of ths instance's one
    * @returns the clone
    */
  def clone(name: String): InstancedMesh = js.native
  def clone(name: String, newParent: Unit, doNotCloneChildren: Boolean): InstancedMesh = js.native
  def clone(name: String, newParent: Unit, doNotCloneChildren: Boolean, newSourceMesh: Mesh): InstancedMesh = js.native
  def clone(name: String, newParent: Unit, doNotCloneChildren: Unit, newSourceMesh: Mesh): InstancedMesh = js.native
  def clone(name: String, newParent: Nullable[Node], doNotCloneChildren: Boolean, newSourceMesh: Mesh): InstancedMesh = js.native
  def clone(name: String, newParent: Nullable[Node], doNotCloneChildren: Unit, newSourceMesh: Mesh): InstancedMesh = js.native
  
  /**
    * Creates a new InstancedMesh object from the mesh model.
    * @see https://doc.babylonjs.com/how_to/how_to_use_instances
    * @param name defines the name of the new instance
    * @returns a new InstancedMesh
    */
  def createInstance(name: String): InstancedMesh = js.native
  
  /**
    * Releases all held resources
    */
  /* InferMemberOverrides */
  override def dispose(): Unit = js.native
  
  def instantiateHierarchy(newParent: Unit, options: DoNotInstantiateNewSourcedMesh): Nullable[TransformNode] = js.native
  def instantiateHierarchy(
    newParent: Unit,
    options: DoNotInstantiateNewSourcedMesh,
    onNewNodeCreated: js.Function2[/* source */ TransformNode, /* clone */ TransformNode, Unit]
  ): Nullable[TransformNode] = js.native
  def instantiateHierarchy(newParent: Nullable[TransformNode], options: DoNotInstantiateNewSourcedMesh): Nullable[TransformNode] = js.native
  def instantiateHierarchy(
    newParent: Nullable[TransformNode],
    options: DoNotInstantiateNewSourcedMesh,
    onNewNodeCreated: js.Function2[/* source */ TransformNode, /* clone */ TransformNode, Unit]
  ): Nullable[TransformNode] = js.native
  
  /**
    * Sets the mesh indices.
    * Expects an array populated with integers or a typed array (Int32Array, Uint32Array, Uint16Array).
    * If the mesh has no geometry, a new Geometry object is created and set to the mesh.
    * This method creates a new index buffer each call.
    * Returns the Mesh.
    * @param indices
    * @param totalVertices
    */
  def setIndices(indices: IndicesArray): Mesh = js.native
  
  /**
    * The source mesh of the instance
    */
  def sourceMesh: Mesh = js.native
}
