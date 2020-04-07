package typings.babylonjs.babylonjsIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Meshes/index", "SubMesh")
@js.native
class SubMesh protected ()
  extends typings.babylonjs.subMeshMod.SubMesh {
  /**
    * Creates a new submesh
    * @param materialIndex defines the material index to use
    * @param verticesStart defines vertex index start
    * @param verticesCount defines vertices count
    * @param indexStart defines index start
    * @param indexCount defines indices count
    * @param mesh defines the parent mesh
    * @param renderingMesh defines an optional rendering mesh
    * @param createBoundingBox defines if bounding box should be created for this submesh
    */
  def this(
    /** the material index to use */
  materialIndex: Double,
    /** vertex index start */
  verticesStart: Double,
    /** vertices count */
  verticesCount: Double,
    /** index start */
  indexStart: Double,
    /** indices count */
  indexCount: Double,
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh
  ) = this()
  def this(
    /** the material index to use */
  materialIndex: Double,
    /** vertex index start */
  verticesStart: Double,
    /** vertices count */
  verticesCount: Double,
    /** index start */
  indexStart: Double,
    /** indices count */
  indexCount: Double,
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    renderingMesh: typings.babylonjs.meshMod.Mesh
  ) = this()
  def this(
    /** the material index to use */
  materialIndex: Double,
    /** vertex index start */
  verticesStart: Double,
    /** vertices count */
  verticesCount: Double,
    /** index start */
  indexStart: Double,
    /** indices count */
  indexCount: Double,
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    renderingMesh: typings.babylonjs.meshMod.Mesh,
    createBoundingBox: Boolean
  ) = this()
}

/* static members */
@JSImport("babylonjs/Meshes/index", "SubMesh")
@js.native
object SubMesh extends js.Object {
  /**
    * Add a new submesh to a mesh
    * @param materialIndex defines the material index to use
    * @param verticesStart defines vertex index start
    * @param verticesCount defines vertices count
    * @param indexStart defines index start
    * @param indexCount defines indices count
    * @param mesh defines the parent mesh
    * @param renderingMesh defines an optional rendering mesh
    * @param createBoundingBox defines if bounding box should be created for this submesh
    * @returns the new submesh
    */
  def AddToMesh(
    materialIndex: Double,
    verticesStart: Double,
    verticesCount: Double,
    indexStart: Double,
    indexCount: Double,
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh
  ): typings.babylonjs.subMeshMod.SubMesh = js.native
  def AddToMesh(
    materialIndex: Double,
    verticesStart: Double,
    verticesCount: Double,
    indexStart: Double,
    indexCount: Double,
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    renderingMesh: typings.babylonjs.meshMod.Mesh
  ): typings.babylonjs.subMeshMod.SubMesh = js.native
  def AddToMesh(
    materialIndex: Double,
    verticesStart: Double,
    verticesCount: Double,
    indexStart: Double,
    indexCount: Double,
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    renderingMesh: typings.babylonjs.meshMod.Mesh,
    createBoundingBox: Boolean
  ): typings.babylonjs.subMeshMod.SubMesh = js.native
  /**
    * Creates a new submesh from indices data
    * @param materialIndex the index of the main mesh material
    * @param startIndex the index where to start the copy in the mesh indices array
    * @param indexCount the number of indices to copy then from the startIndex
    * @param mesh the main mesh to create the submesh from
    * @param renderingMesh the optional rendering mesh
    * @returns a new submesh
    */
  def CreateFromIndices(
    materialIndex: Double,
    startIndex: Double,
    indexCount: Double,
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh
  ): typings.babylonjs.subMeshMod.SubMesh = js.native
  def CreateFromIndices(
    materialIndex: Double,
    startIndex: Double,
    indexCount: Double,
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    renderingMesh: typings.babylonjs.meshMod.Mesh
  ): typings.babylonjs.subMeshMod.SubMesh = js.native
}

