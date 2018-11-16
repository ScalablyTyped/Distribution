package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
@JSGlobal("BABYLON.Collider")
@js.native
class Collider () extends js.Object {
  var _basePoint: js.Any = js.native
  /** @hidden */
  var _basePointWorld: Vector3 = js.native
  var _baseToVertex: js.Any = js.native
  var _collisionMask: js.Any = js.native
  var _collisionPoint: js.Any = js.native
  var _destinationPoint: js.Any = js.native
  var _displacementVector: js.Any = js.native
  var _edge: js.Any = js.native
  var _epsilon: js.Any = js.native
  /** @hidden */
  var _initialPosition: Vector3 = js.native
  /** @hidden */
  var _initialVelocity: Vector3 = js.native
  var _nearestDistance: js.Any = js.native
  var _normalizedVelocity: js.Any = js.native
  var _planeIntersectionPoint: js.Any = js.native
  /** @hidden */
  var _radius: Vector3 = js.native
  /** @hidden */
  var _retry: scala.Double = js.native
  var _slidePlaneNormal: js.Any = js.native
  var _tempVector: js.Any = js.native
  var _tempVector2: js.Any = js.native
  var _tempVector3: js.Any = js.native
  var _tempVector4: js.Any = js.native
  var _velocity: js.Any = js.native
  var _velocityWorld: js.Any = js.native
  /** @hidden */
  var _velocityWorldLength: scala.Double = js.native
  /**
           * Define last collided mesh
           */
  var collidedMesh: Nullable[AbstractMesh] = js.native
  /** Define if a collision was found */
  var collisionFound: scala.Boolean = js.native
  var collisionMask: scala.Double = js.native
  /**
           * Define last intersection point in local space
           */
  var intersectionPoint: Vector3 = js.native
  /**
           * Gets the plane normal used to compute the sliding response (in local space)
           */
  val slidePlaneNormal: Vector3 = js.native
  /** @hidden */
  def _canDoCollision(sphereCenter: Vector3, sphereRadius: scala.Double, vecMin: Vector3, vecMax: Vector3): scala.Boolean = js.native
  /** @hidden */
  def _checkPointInTriangle(point: Vector3, pa: Vector3, pb: Vector3, pc: Vector3, n: Vector3): scala.Boolean = js.native
  /** @hidden */
  def _collide(
    trianglePlaneArray: js.Array[Plane],
    pts: js.Array[Vector3],
    indices: IndicesArray,
    indexStart: scala.Double,
    indexEnd: scala.Double,
    decal: scala.Double,
    hasMaterial: scala.Boolean
  ): scala.Unit = js.native
  /** @hidden */
  def _getResponse(pos: Vector3, vel: Vector3): scala.Unit = js.native
  /** @hidden */
  def _initialize(source: Vector3, dir: Vector3, e: scala.Double): scala.Unit = js.native
  /** @hidden */
  def _testTriangle(
    faceIndex: scala.Double,
    trianglePlaneArray: js.Array[Plane],
    p1: Vector3,
    p2: Vector3,
    p3: Vector3,
    hasMaterial: scala.Boolean
  ): scala.Unit = js.native
}

