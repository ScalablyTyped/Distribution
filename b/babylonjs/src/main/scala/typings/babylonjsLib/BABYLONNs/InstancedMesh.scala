package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates an instance based on a source mesh.
  */
@JSGlobal("BABYLON.InstancedMesh")
@js.native
class InstancedMesh protected () extends AbstractMesh {
  def this(name: java.lang.String, source: Mesh) = this()
  var _currentLOD: js.Any = js.native
  var _sourceMesh: js.Any = js.native
  /**
    * The source mesh of the instance
    */
  val sourceMesh: Mesh = js.native
  /** @hidden */
  def _syncSubMeshes(): InstancedMesh = js.native
  /**
    * Sets a new updated BoundingInfo to the mesh.
    * @returns the mesh.
    */
  def refreshBoundingInfo(): InstancedMesh = js.native
  /**
    * Sets the mesh indices.
    * Expects an array populated with integers or a typed array (Int32Array, Uint32Array, Uint16Array).
    * If the mesh has no geometry, a new Geometry object is created and set to the mesh.
    * This method creates a new index buffer each call.
    * Returns the Mesh.
    */
  def setIndices(indices: IndicesArray): Mesh = js.native
}

