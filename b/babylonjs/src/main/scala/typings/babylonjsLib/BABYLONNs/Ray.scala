package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class representing a ray with position and direction
  */
@JSGlobal("BABYLON.Ray")
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
  def this(/** origin point */
  origin: Vector3, /** direction */
  direction: Vector3, /** length of the ray */
  length: scala.Double) = this()
  var _comparePickingInfo: js.Any = js.native
  var _edge1: js.Any = js.native
  var _edge2: js.Any = js.native
  var _pvec: js.Any = js.native
  var _qvec: js.Any = js.native
  var _tmpRay: js.Any = js.native
  var _tvec: js.Any = js.native
  /** direction */
  var direction: Vector3 = js.native
  /** length of the ray */
  var length: scala.Double = js.native
  /** origin point */
  var origin: Vector3 = js.native
  /**
    * Intersection test between the ray and a given segment whithin a given tolerance (threshold)
    * @param sega the first point of the segment to test the intersection against
    * @param segb the second point of the segment to test the intersection against
    * @param threshold the tolerance margin, if the ray doesn't intersect the segment but is close to the given threshold, the intersection is successful
    * @return the distance from the ray origin to the intersection point if there's intersection, or -1 if there's no intersection
    */
  def intersectionSegment(sega: Vector3, segb: Vector3, threshold: scala.Double): scala.Double = js.native
  /**
    * Checks if the ray intersects a box
    * @param box the bounding box to check
    * @returns if the box was hit
    */
  def intersectsBox(box: BoundingBox): scala.Boolean = js.native
  /**
    * Checks if the ray intersects a box
    * @param minimum bound of the box
    * @param maximum bound of the box
    * @returns if the box was hit
    */
  def intersectsBoxMinMax(minimum: Vector3, maximum: Vector3): scala.Boolean = js.native
  /**
    * Checks if ray intersects a mesh
    * @param mesh the mesh to check
    * @param fastCheck if only the bounding box should checked
    * @returns picking info of the intersecton
    */
  def intersectsMesh(mesh: AbstractMesh): PickingInfo = js.native
  def intersectsMesh(mesh: AbstractMesh, fastCheck: scala.Boolean): PickingInfo = js.native
  /**
    * Checks if ray intersects a mesh
    * @param meshes the meshes to check
    * @param fastCheck if only the bounding box should checked
    * @param results array to store result in
    * @returns Array of picking infos
    */
  def intersectsMeshes(meshes: js.Array[AbstractMesh]): js.Array[PickingInfo] = js.native
  def intersectsMeshes(meshes: js.Array[AbstractMesh], fastCheck: scala.Boolean): js.Array[PickingInfo] = js.native
  def intersectsMeshes(meshes: js.Array[AbstractMesh], fastCheck: scala.Boolean, results: js.Array[PickingInfo]): js.Array[PickingInfo] = js.native
  /**
    * Checks if ray intersects a plane
    * @param plane the plane to check
    * @returns the distance away it was hit
    */
  def intersectsPlane(plane: Plane): Nullable[scala.Double] = js.native
  /**
    * If the ray hits a sphere
    * @param sphere the bounding sphere to check
    * @returns true if it hits the sphere
    */
  def intersectsSphere(sphere: BoundingSphere): scala.Boolean = js.native
  /**
    * If the ray hits a triange
    * @param vertex0 triangle vertex
    * @param vertex1 triangle vertex
    * @param vertex2 triangle vertex
    * @returns intersection information if hit
    */
  def intersectsTriangle(vertex0: Vector3, vertex1: Vector3, vertex2: Vector3): Nullable[IntersectionInfo] = js.native
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
    x: scala.Double,
    y: scala.Double,
    viewportWidth: scala.Double,
    viewportHeight: scala.Double,
    world: Matrix,
    view: Matrix,
    projection: Matrix
  ): Ray = js.native
}

/* static members */
@JSGlobal("BABYLON.Ray")
@js.native
object Ray extends js.Object {
  var rayl: js.Any = js.native
  var smallnum: js.Any = js.native
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
    x: scala.Double,
    y: scala.Double,
    viewportWidth: scala.Double,
    viewportHeight: scala.Double,
    world: babylonjsLib.BABYLONNs.Matrix,
    view: babylonjsLib.BABYLONNs.Matrix,
    projection: babylonjsLib.BABYLONNs.Matrix
  ): babylonjsLib.BABYLONNs.Ray = js.native
  /**
    * Function will create a new transformed ray starting from origin and ending at the end point. Ray's length will be set, and ray will be
    * transformed to the given world matrix.
    * @param origin The origin point
    * @param end The end point
    * @param world a matrix to transform the ray to. Default is the identity matrix.
    * @returns the new ray
    */
  def CreateNewFromTo(origin: babylonjsLib.BABYLONNs.Vector3, end: babylonjsLib.BABYLONNs.Vector3): babylonjsLib.BABYLONNs.Ray = js.native
  def CreateNewFromTo(
    origin: babylonjsLib.BABYLONNs.Vector3,
    end: babylonjsLib.BABYLONNs.Vector3,
    world: babylonjsLib.BABYLONNs.Matrix
  ): babylonjsLib.BABYLONNs.Ray = js.native
  /**
    * Transforms a ray by a matrix
    * @param ray ray to transform
    * @param matrix matrix to apply
    * @returns the resulting new ray
    */
  def Transform(ray: babylonjsLib.BABYLONNs.Ray, matrix: babylonjsLib.BABYLONNs.Matrix): babylonjsLib.BABYLONNs.Ray = js.native
  /**
    * Transforms a ray by a matrix
    * @param ray ray to transform
    * @param matrix matrix to apply
    * @param result ray to store result in
    */
  def TransformToRef(
    ray: babylonjsLib.BABYLONNs.Ray,
    matrix: babylonjsLib.BABYLONNs.Matrix,
    result: babylonjsLib.BABYLONNs.Ray
  ): scala.Unit = js.native
  /**
    * Creates a ray with origin and direction of 0,0,0
    * @returns the new ray
    */
  def Zero(): babylonjsLib.BABYLONNs.Ray = js.native
}

