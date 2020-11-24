package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancedMesh extends AbstractMesh {
  
  var _currentLOD: js.Any = js.native
  
  /** @hidden */
  var _indexInSourceMeshInstanceArray: Double = js.native
  
  var _sourceMesh: js.Any = js.native
  
  /** @hidden */
  def _syncSubMeshes(): InstancedMesh = js.native
  
  /**
    * Creates a new InstancedMesh from the current mesh.
    * - name (string) : the cloned mesh name
    * - newParent (optional Node) : the optional Node to parent the clone to.
    * - doNotCloneChildren (optional boolean, default `false`) : if `true` the model children aren't cloned.
    *
    * Returns the clone.
    */
  def clone(name: String): InstancedMesh = js.native
  
  /**
    * Creates a new InstancedMesh object from the mesh model.
    * @see https://doc.babylonjs.com/how_to/how_to_use_instances
    * @param name defines the name of the new instance
    * @returns a new InstancedMesh
    */
  def createInstance(name: String): InstancedMesh = js.native
  
  /**
    * Sets the mesh indices.
    * Expects an array populated with integers or a typed array (Int32Array, Uint32Array, Uint16Array).
    * If the mesh has no geometry, a new Geometry object is created and set to the mesh.
    * This method creates a new index buffer each call.
    * Returns the Mesh.
    */
  def setIndices(indices: IndicesArray): Mesh = js.native
  
  /**
    * The source mesh of the instance
    */
  def sourceMesh: Mesh = js.native
}
