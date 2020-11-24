package typings.babylonjs.rayMod

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.boundingBoxMod.BoundingBox
import typings.babylonjs.boundingSphereMod.BoundingSphere
import typings.babylonjs.intersectionInfoMod.IntersectionInfo
import typings.babylonjs.mathPlaneMod.Plane
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.pickingInfoMod.PickingInfo
import typings.babylonjs.typesMod.DeepImmutable
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.typesMod.float
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Culling/ray", "Ray")
@js.native
class Ray protected () extends js.Object {
  /**
    * Creates a new ray
    * @param origin origin point
    * @param direction direction
    * @param length length of the ray
    */
  def this(/** origin point */
  origin: Vector3, /** direction */
  direction: Vector3) = this()
  def this(
    /** origin point */
  origin: Vector3,
    /** direction */
  direction: Vector3,
    /** length of the ray */
  length: Double
  ) = this()
  
  var _comparePickingInfo: js.Any = js.native
  
  var _tmpRay: js.Any = js.native
  
  /** direction */
  var direction: Vector3 = js.native
  
  /**
    * Intersection test between the ray and a given segment whithin a given tolerance (threshold)
    * @param sega the first point of the segment to test the intersection against
    * @param segb the second point of the segment to test the intersection against
    * @param threshold the tolerance margin, if the ray doesn't intersect the segment but is close to the given threshold, the intersection is successful
    * @return the distance from the ray origin to the intersection point if there's intersection, or -1 if there's no intersection
    */
  def intersectionSegment(sega: DeepImmutable[Vector3], segb: DeepImmutable[Vector3], threshold: Double): Double = js.native
  
  /**
    * Calculate the intercept of a ray on a given axis
    * @param axis to check 'x' | 'y' | 'z'
    * @param offset from axis interception (i.e. an offset of 1y is intercepted above ground)
    * @returns a vector containing the coordinates where 'axis' is equal to zero (else offset), or null if there is no intercept.
    */
  def intersectsAxis(axis: String): Nullable[Vector3] = js.native
  def intersectsAxis(axis: String, offset: Double): Nullable[Vector3] = js.native
  
  /**
    * Checks if the ray intersects a box
    * This does not account for the ray lenght by design to improve perfs.
    * @param box the bounding box to check
    * @param intersectionTreshold extra extend to be added to the BoundingBox in all direction
    * @returns if the box was hit
    */
  def intersectsBox(box: DeepImmutable[BoundingBox]): Boolean = js.native
  def intersectsBox(box: DeepImmutable[BoundingBox], intersectionTreshold: Double): Boolean = js.native
  
  /**
    * Checks if the ray intersects a box
    * This does not account for the ray lenght by design to improve perfs.
    * @param minimum bound of the box
    * @param maximum bound of the box
    * @param intersectionTreshold extra extend to be added to the box in all direction
    * @returns if the box was hit
    */
  def intersectsBoxMinMax(minimum: DeepImmutable[Vector3], maximum: DeepImmutable[Vector3]): Boolean = js.native
  def intersectsBoxMinMax(minimum: DeepImmutable[Vector3], maximum: DeepImmutable[Vector3], intersectionTreshold: Double): Boolean = js.native
  
  /**
    * Checks if ray intersects a mesh
    * @param mesh the mesh to check
    * @param fastCheck defines if the first intersection will be used (and not the closest)
    * @returns picking info of the intersecton
    */
  def intersectsMesh(mesh: DeepImmutable[AbstractMesh]): PickingInfo = js.native
  def intersectsMesh(mesh: DeepImmutable[AbstractMesh], fastCheck: Boolean): PickingInfo = js.native
  
  /**
    * Checks if ray intersects a mesh
    * @param meshes the meshes to check
    * @param fastCheck defines if the first intersection will be used (and not the closest)
    * @param results array to store result in
    * @returns Array of picking infos
    */
  def intersectsMeshes(meshes: js.Array[DeepImmutable[AbstractMesh]]): js.Array[PickingInfo] = js.native
  def intersectsMeshes(
    meshes: js.Array[DeepImmutable[AbstractMesh]],
    fastCheck: js.UndefOr[scala.Nothing],
    results: js.Array[PickingInfo]
  ): js.Array[PickingInfo] = js.native
  def intersectsMeshes(meshes: js.Array[DeepImmutable[AbstractMesh]], fastCheck: Boolean): js.Array[PickingInfo] = js.native
  def intersectsMeshes(meshes: js.Array[DeepImmutable[AbstractMesh]], fastCheck: Boolean, results: js.Array[PickingInfo]): js.Array[PickingInfo] = js.native
  
  /**
    * Checks if ray intersects a plane
    * @param plane the plane to check
    * @returns the distance away it was hit
    */
  def intersectsPlane(plane: DeepImmutable[Plane]): Nullable[Double] = js.native
  
  /**
    * If the ray hits a sphere
    * @param sphere the bounding sphere to check
    * @param intersectionTreshold extra extend to be added to the BoundingSphere in all direction
    * @returns true if it hits the sphere
    */
  def intersectsSphere(sphere: DeepImmutable[BoundingSphere]): Boolean = js.native
  def intersectsSphere(sphere: DeepImmutable[BoundingSphere], intersectionTreshold: Double): Boolean = js.native
  
  /**
    * If the ray hits a triange
    * @param vertex0 triangle vertex
    * @param vertex1 triangle vertex
    * @param vertex2 triangle vertex
    * @returns intersection information if hit
    */
  def intersectsTriangle(vertex0: DeepImmutable[Vector3], vertex1: DeepImmutable[Vector3], vertex2: DeepImmutable[Vector3]): Nullable[IntersectionInfo] = js.native
  
  /** length of the ray */
  var length: Double = js.native
  
  /** origin point */
  var origin: Vector3 = js.native
  
  /**
    * Unproject a ray from screen space to object space
    * @param sourceX defines the screen space x coordinate to use
    * @param sourceY defines the screen space y coordinate to use
    * @param viewportWidth defines the current width of the viewport
    * @param viewportHeight defines the current height of the viewport
    * @param world defines the world matrix to use (can be set to Identity to go to world space)
    * @param view defines the view matrix to use
    * @param projection defines the projection matrix to use
    */
  def unprojectRayToRef(
    sourceX: float,
    sourceY: float,
    viewportWidth: Double,
    viewportHeight: Double,
    world: DeepImmutable[Matrix],
    view: DeepImmutable[Matrix],
    projection: DeepImmutable[Matrix]
  ): Unit = js.native
  
  /**
    * Update the ray from viewport position
    * @param x position
    * @param y y position
    * @param viewportWidth viewport width
    * @param viewportHeight viewport height
    * @param world world matrix
    * @param view view matrix
    * @param projection projection matrix
    * @returns this ray updated
    */
  def update(
    x: Double,
    y: Double,
    viewportWidth: Double,
    viewportHeight: Double,
    world: DeepImmutable[Matrix],
    view: DeepImmutable[Matrix],
    projection: DeepImmutable[Matrix]
  ): Ray = js.native
}
/* static members */
@JSImport("babylonjs/Culling/ray", "Ray")
@js.native
object Ray extends js.Object {
  
  /**
    * Creates a new ray from screen space and viewport
    * @param x position
    * @param y y position
    * @param viewportWidth viewport width
    * @param viewportHeight viewport height
    * @param world world matrix
    * @param view view matrix
    * @param projection projection matrix
    * @returns new ray
    */
  def CreateNew(
    x: Double,
    y: Double,
    viewportWidth: Double,
    viewportHeight: Double,
    world: DeepImmutable[Matrix],
    view: DeepImmutable[Matrix],
    projection: DeepImmutable[Matrix]
  ): Ray = js.native
  
  /**
    * Function will create a new transformed ray starting from origin and ending at the end point. Ray's length will be set, and ray will be
    * transformed to the given world matrix.
    * @param origin The origin point
    * @param end The end point
    * @param world a matrix to transform the ray to. Default is the identity matrix.
    * @returns the new ray
    */
  def CreateNewFromTo(origin: Vector3, end: Vector3): Ray = js.native
  def CreateNewFromTo(origin: Vector3, end: Vector3, world: DeepImmutable[Matrix]): Ray = js.native
  
  /**
    * Transforms a ray by a matrix
    * @param ray ray to transform
    * @param matrix matrix to apply
    * @returns the resulting new ray
    */
  def Transform(ray: DeepImmutable[Ray], matrix: DeepImmutable[Matrix]): Ray = js.native
  
  /**
    * Transforms a ray by a matrix
    * @param ray ray to transform
    * @param matrix matrix to apply
    * @param result ray to store result in
    */
  def TransformToRef(ray: DeepImmutable[Ray], matrix: DeepImmutable[Matrix], result: Ray): Unit = js.native
  
  /**
    * Creates a ray with origin and direction of 0,0,0
    * @returns the new ray
    */
  def Zero(): Ray = js.native
  
  val _TmpVector3: js.Any = js.native
  
  var rayl: js.Any = js.native
  
  var smallnum: js.Any = js.native
}
