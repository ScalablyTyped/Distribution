package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubMesh extends ICullable {
  
  /**
    * Returns true if this submesh covers the entire parent mesh
    * @ignorenaming
    */
  def IsGlobal: Boolean = js.native
  
  var _IsMultiMaterial: js.Any = js.native
  
  /** @hidden */
  var _alphaIndex: Double = js.native
  
  var _boundingInfo: js.Any = js.native
  
  /** @hidden */
  def _checkCollision(collider: Collider): Boolean = js.native
  
  var _currentMaterial: js.Any = js.native
  
  /** @hidden */
  var _distanceToCamera: Double = js.native
  
  /** @hidden */
  var _effectOverride: Nullable[Effect] = js.native
  
  /**
    * @hidden
    */
  def _getLinesIndexBuffer(indices: IndicesArray, engine: Engine): DataBuffer = js.native
  
  /** @hidden */
  var _id: Double = js.native
  
  /** @hidden */
  var _intersectLines: js.Any = js.native
  
  /** @hidden */
  var _intersectTriangles: js.Any = js.native
  
  /** @hidden */
  var _intersectUnIndexedLines: js.Any = js.native
  
  /** @hidden */
  var _intersectUnIndexedTriangles: js.Any = js.native
  
  /** @hidden */
  var _lastColliderTransformMatrix: Nullable[Matrix] = js.native
  
  /** @hidden */
  var _lastColliderWorldVertices: Nullable[js.Array[Vector3]] = js.native
  
  var _linesIndexBuffer: js.Any = js.native
  
  /** @hidden */
  var _linesIndexCount: Double = js.native
  
  /** @hidden */
  var _materialDefines: Nullable[MaterialDefines] = js.native
  
  /** @hidden */
  var _materialEffect: Nullable[Effect] = js.native
  
  var _mesh: js.Any = js.native
  
  /** @hidden */
  def _rebuild(): Unit = js.native
  
  /** @hidden */
  var _renderId: Double = js.native
  
  var _renderingMesh: js.Any = js.native
  
  /** @hidden */
  var _trianglePlanes: js.Array[Plane] = js.native
  
  /**
    * Checks if the submesh intersects with a ray
    * @param ray defines the ray to test
    * @returns true is the passed ray intersects the submesh bounding box
    */
  def canIntersects(ray: Ray): Boolean = js.native
  
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
  def dispose(): Unit = js.native
  
  /**
    * Gets associated effect
    */
  def effect: Nullable[Effect] = js.native
  
  /**
    * Returns the submesh BoudingInfo object
    * @returns current bounding info (or mesh's one if the submesh is global)
    */
  def getBoundingInfo(): BoundingInfo = js.native
  
  /**
    * Gets the class name
    * @returns the string "SubMesh".
    */
  def getClassName(): String = js.native
  
  /**
    * Returns the effective mesh of the submesh
    * @returns the effective mesh (could be different from parent mesh)
    */
  def getEffectiveMesh(): AbstractMesh = js.native
  
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
    * Returns the replacement mesh of the submesh
    * @returns the replacement mesh (could be different from parent mesh)
    */
  def getReplacementMesh(): Nullable[AbstractMesh] = js.native
  
  /** indices count */
  var indexCount: Double = js.native
  
  /** index start */
  var indexStart: Double = js.native
  
  /**
    * Intersects current submesh with a ray
    * @param ray defines the ray to test
    * @param positions defines mesh's positions array
    * @param indices defines mesh's indices array
    * @param fastCheck defines if the first intersection will be used (and not the closest)
    * @param trianglePredicate defines an optional predicate used to select faces when a mesh intersection is detected
    * @returns intersection info or null if no intersection
    */
  def intersects(ray: Ray, positions: js.Array[Vector3], indices: IndicesArray): Nullable[IntersectionInfo] = js.native
  def intersects(
    ray: Ray,
    positions: js.Array[Vector3],
    indices: IndicesArray,
    fastCheck: js.UndefOr[scala.Nothing],
    trianglePredicate: TrianglePickingPredicate
  ): Nullable[IntersectionInfo] = js.native
  def intersects(ray: Ray, positions: js.Array[Vector3], indices: IndicesArray, fastCheck: Boolean): Nullable[IntersectionInfo] = js.native
  def intersects(
    ray: Ray,
    positions: js.Array[Vector3],
    indices: IndicesArray,
    fastCheck: Boolean,
    trianglePredicate: TrianglePickingPredicate
  ): Nullable[IntersectionInfo] = js.native
  
  /**
    * Gets material defines used by the effect associated to the sub mesh
    */
  def materialDefines: Nullable[MaterialDefines] = js.native
  /**
    * Sets material defines used by the effect associated to the sub mesh
    */
  def materialDefines_=(defines: Nullable[MaterialDefines]): Unit = js.native
  
  /** the material index to use */
  var materialIndex: Double = js.native
  
  /**
    * Sets a new updated BoundingInfo object to the submesh
    * @param data defines an optional position array to use to determine the bounding info
    * @returns the SubMesh
    */
  def refreshBoundingInfo(): SubMesh = js.native
  def refreshBoundingInfo(data: Nullable[FloatArray]): SubMesh = js.native
  
  /**
    * Renders the submesh
    * @param enableAlphaMode defines if alpha needs to be used
    * @returns the submesh
    */
  def render(enableAlphaMode: Boolean): SubMesh = js.native
  
  /**
    * Sets the submesh BoundingInfo
    * @param boundingInfo defines the new bounding info to use
    * @returns the SubMesh
    */
  def setBoundingInfo(boundingInfo: BoundingInfo): SubMesh = js.native
  
  /**
    * Sets associated effect (effect used to render this submesh)
    * @param effect defines the effect to associate with
    * @param defines defines the set of defines used to compile this effect
    */
  def setEffect(effect: Nullable[Effect]): Unit = js.native
  def setEffect(effect: Nullable[Effect], defines: Nullable[MaterialDefines]): Unit = js.native
  
  /**
    * Updates the submesh BoundingInfo
    * @param world defines the world matrix to use to update the bounding info
    * @returns the submesh
    */
  def updateBoundingInfo(world: DeepImmutable[Matrix]): SubMesh = js.native
  
  /** vertices count */
  var verticesCount: Double = js.native
  
  /** vertex index start */
  var verticesStart: Double = js.native
}
