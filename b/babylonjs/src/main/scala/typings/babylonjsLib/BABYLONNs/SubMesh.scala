package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a subdivision inside a mesh
  */
@JSGlobal("BABYLON.SubMesh")
@js.native
class SubMesh protected ()
  extends BaseSubMesh
     with ICullable {
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
  def this(/** the material index to use */
  materialIndex: scala.Double, /** vertex index start */
  verticesStart: scala.Double, /** vertices count */
  verticesCount: scala.Double, /** index start */
  indexStart: scala.Double, /** indices count */
  indexCount: scala.Double, mesh: AbstractMesh) = this()
  def this(/** the material index to use */
  materialIndex: scala.Double, /** vertex index start */
  verticesStart: scala.Double, /** vertices count */
  verticesCount: scala.Double, /** index start */
  indexStart: scala.Double, /** indices count */
  indexCount: scala.Double, mesh: AbstractMesh, renderingMesh: Mesh) = this()
  def this(/** the material index to use */
  materialIndex: scala.Double, /** vertex index start */
  verticesStart: scala.Double, /** vertices count */
  verticesCount: scala.Double, /** index start */
  indexStart: scala.Double, /** indices count */
  indexCount: scala.Double, mesh: AbstractMesh, renderingMesh: Mesh, createBoundingBox: scala.Boolean) = this()
  /**
    * Returns true if this submesh covers the entire parent mesh
    * @ignorenaming
    */
  val IsGlobal: scala.Boolean = js.native
  /** @hidden */
  var _alphaIndex: scala.Double = js.native
  var _boundingInfo: js.Any = js.native
  var _currentMaterial: js.Any = js.native
  /** @hidden */
  var _distanceToCamera: scala.Double = js.native
  /** @hidden */
  var _id: scala.Double = js.native
  /** @hidden */
  var _intersectLines: js.Any = js.native
  /** @hidden */
  var _intersectTriangles: js.Any = js.native
  /** @hidden */
  var _lastColliderTransformMatrix: Matrix = js.native
  /** @hidden */
  var _lastColliderWorldVertices: Nullable[js.Array[Vector3]] = js.native
  var _linesIndexBuffer: js.Any = js.native
  /** @hidden */
  var _linesIndexCount: scala.Double = js.native
  var _mesh: js.Any = js.native
  /** @hidden */
  var _renderId: scala.Double = js.native
  var _renderingMesh: js.Any = js.native
  /** @hidden */
  var _trianglePlanes: js.Array[Plane] = js.native
  /** indices count */
  var indexCount: scala.Double = js.native
  /** index start */
  var indexStart: scala.Double = js.native
  /** the material index to use */
  var materialIndex: scala.Double = js.native
  /** vertices count */
  var verticesCount: scala.Double = js.native
  /** vertex index start */
  var verticesStart: scala.Double = js.native
  /** @hidden */
  def _checkCollision(collider: Collider): scala.Boolean = js.native
  /**
    * @hidden
    */
  def _getLinesIndexBuffer(indices: IndicesArray, engine: Engine): babylonjsLib.WebGLBuffer = js.native
  /** @hidden */
  def _rebuild(): scala.Unit = js.native
  /**
    * Checks if the submesh intersects with a ray
    * @param ray defines the ray to test
    * @returns true is the passed ray intersects the submesh bounding box
    */
  def canIntersects(ray: Ray): scala.Boolean = js.native
  /**
    * Creates a new submesh from the passed mesh
    * @param newMesh defines the new hosting mesh
    * @param newRenderingMesh defines an optional rendering mesh
    * @returns the new submesh
    */
  def clone(newMesh: AbstractMesh): SubMesh = js.native
  def clone(newMesh: AbstractMesh, newRenderingMesh: Mesh): SubMesh = js.native
  /**
    * Release associated resources
    */
  def dispose(): scala.Unit = js.native
  /**
    * Returns the submesh BoudingInfo object
    * @returns current bounding info (or mesh's one if the submesh is global)
    */
  def getBoundingInfo(): BoundingInfo = js.native
  /**
    * Returns the submesh material
    * @returns null or the current material
    */
  def getMaterial(): Nullable[Material] = js.native
  /**
    * Returns the mesh of the current submesh
    * @return the parent mesh
    */
  def getMesh(): AbstractMesh = js.native
  /**
    * Returns the rendering mesh of the submesh
    * @returns the rendering mesh (could be different from parent mesh)
    */
  def getRenderingMesh(): Mesh = js.native
  /**
    * Intersects current submesh with a ray
    * @param ray defines the ray to test
    * @param positions defines mesh's positions array
    * @param indices defines mesh's indices array
    * @param fastCheck defines if only bounding info should be used
    * @returns intersection info or null if no intersection
    */
  def intersects(ray: Ray, positions: js.Array[Vector3], indices: IndicesArray): Nullable[IntersectionInfo] = js.native
  def intersects(ray: Ray, positions: js.Array[Vector3], indices: IndicesArray, fastCheck: scala.Boolean): Nullable[IntersectionInfo] = js.native
  /**
    * Checks if a cullable object (mesh...) is in the camera frustum
    * Unlike isInFrustum this cheks the full bounding box
    * @param frustumPlanes Camera near/planes
    * @returns true if the object is in frustum otherwise false
    */
  /* CompleteClass */
  override def isCompletelyInFrustum(frustumPlanes: js.Array[Plane]): scala.Boolean = js.native
  /**
    * Checks if the object or part of the object is in the frustum
    * @param frustumPlanes Camera near/planes
    * @returns true if the object is in frustum otherwise false
    */
  /* CompleteClass */
  override def isInFrustum(frustumPlanes: js.Array[Plane]): scala.Boolean = js.native
  /**
    * Sets a new updated BoundingInfo object to the submesh
    * @returns the SubMesh
    */
  def refreshBoundingInfo(): SubMesh = js.native
  /**
    * Renders the submesh
    * @param enableAlphaMode defines if alpha needs to be used
    * @returns the submesh
    */
  def render(enableAlphaMode: scala.Boolean): SubMesh = js.native
  /**
    * Sets the submesh BoundingInfo
    * @param boundingInfo defines the new bounding info to use
    * @returns the SubMesh
    */
  def setBoundingInfo(boundingInfo: BoundingInfo): SubMesh = js.native
  /**
    * Updates the submesh BoundingInfo
    * @param world defines the world matrix to use to update the bounding info
    * @returns the submesh
    */
  def updateBoundingInfo(world: Matrix): SubMesh = js.native
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
    materialIndex: scala.Double,
    verticesStart: scala.Double,
    verticesCount: scala.Double,
    indexStart: scala.Double,
    indexCount: scala.Double,
    mesh: babylonjsLib.BABYLONNs.AbstractMesh
  ): babylonjsLib.BABYLONNs.SubMesh = js.native
  def AddToMesh(
    materialIndex: scala.Double,
    verticesStart: scala.Double,
    verticesCount: scala.Double,
    indexStart: scala.Double,
    indexCount: scala.Double,
    mesh: babylonjsLib.BABYLONNs.AbstractMesh,
    renderingMesh: babylonjsLib.BABYLONNs.Mesh
  ): babylonjsLib.BABYLONNs.SubMesh = js.native
  def AddToMesh(
    materialIndex: scala.Double,
    verticesStart: scala.Double,
    verticesCount: scala.Double,
    indexStart: scala.Double,
    indexCount: scala.Double,
    mesh: babylonjsLib.BABYLONNs.AbstractMesh,
    renderingMesh: babylonjsLib.BABYLONNs.Mesh,
    createBoundingBox: scala.Boolean
  ): babylonjsLib.BABYLONNs.SubMesh = js.native
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
    materialIndex: scala.Double,
    startIndex: scala.Double,
    indexCount: scala.Double,
    mesh: babylonjsLib.BABYLONNs.AbstractMesh
  ): babylonjsLib.BABYLONNs.SubMesh = js.native
  def CreateFromIndices(
    materialIndex: scala.Double,
    startIndex: scala.Double,
    indexCount: scala.Double,
    mesh: babylonjsLib.BABYLONNs.AbstractMesh,
    renderingMesh: babylonjsLib.BABYLONNs.Mesh
  ): babylonjsLib.BABYLONNs.SubMesh = js.native
}

