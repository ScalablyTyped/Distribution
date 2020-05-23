package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.SubMesh")
@js.native
class SubMesh protected ()
  extends typings.babylonjs.BABYLON.SubMesh {
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
    mesh: typings.babylonjs.BABYLON.AbstractMesh
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
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
    renderingMesh: typings.babylonjs.BABYLON.Mesh
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
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
    renderingMesh: typings.babylonjs.BABYLON.Mesh,
    createBoundingBox: Boolean
  ) = this()
  /**
    * Checks if a cullable object (mesh...) is in the camera frustum
    * Unlike isInFrustum this cheks the full bounding box
    * @param frustumPlanes Camera near/planes
    * @returns true if the object is in frustum otherwise false
    */
  /* CompleteClass */
  override def isCompletelyInFrustum(frustumPlanes: js.Array[typings.babylonjs.BABYLON.Plane]): Boolean = js.native
  /**
    * Checks if the object or part of the object is in the frustum
    * @param frustumPlanes Camera near/planes
    * @returns true if the object is in frustum otherwise false
    */
  /* CompleteClass */
  override def isInFrustum(frustumPlanes: js.Array[typings.babylonjs.BABYLON.Plane]): Boolean = js.native
}

/* static members */
@JSGlobal("BABYLON.SubMesh")
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
    mesh: typings.babylonjs.BABYLON.AbstractMesh
  ): typings.babylonjs.BABYLON.SubMesh = js.native
  def AddToMesh(
    materialIndex: Double,
    verticesStart: Double,
    verticesCount: Double,
    indexStart: Double,
    indexCount: Double,
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
    renderingMesh: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.SubMesh = js.native
  def AddToMesh(
    materialIndex: Double,
    verticesStart: Double,
    verticesCount: Double,
    indexStart: Double,
    indexCount: Double,
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
    renderingMesh: typings.babylonjs.BABYLON.Mesh,
    createBoundingBox: Boolean
  ): typings.babylonjs.BABYLON.SubMesh = js.native
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
    mesh: typings.babylonjs.BABYLON.AbstractMesh
  ): typings.babylonjs.BABYLON.SubMesh = js.native
  def CreateFromIndices(
    materialIndex: Double,
    startIndex: Double,
    indexCount: Double,
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
    renderingMesh: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.SubMesh = js.native
}

