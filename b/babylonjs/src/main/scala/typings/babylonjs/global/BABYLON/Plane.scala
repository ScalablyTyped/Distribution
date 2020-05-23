package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.DeepImmutable
import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.Plane")
@js.native
class Plane protected ()
  extends typings.babylonjs.BABYLON.Plane {
  /**
    * Creates a Plane object according to the given floats a, b, c, d and the plane equation : ax + by + cz + d = 0
    * @param a a component of the plane
    * @param b b component of the plane
    * @param c c component of the plane
    * @param d d component of the plane
    */
  def this(a: Double, b: Double, c: Double, d: Double) = this()
  /**
    * d component of the plane
    */
  /* CompleteClass */
  override var d: Double = js.native
  /**
    * Normal of the plane (a,b,c)
    */
  /* CompleteClass */
  override var normal: typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * @returns the plane coordinates as a new array of 4 elements [a, b, c, d].
    */
  /* CompleteClass */
  override def asArray(): js.Array[Double] = js.native
  /**
    * Updates the current Plane from the plane defined by the three given points.
    * @param point1 one of the points used to contruct the plane
    * @param point2 one of the points used to contruct the plane
    * @param point3 one of the points used to contruct the plane
    * @returns the updated Plane.
    */
  /* CompleteClass */
  override def copyFromPoints(
    point1: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    point2: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    point3: DeepImmutable[typings.babylonjs.BABYLON.Vector3]
  ): typings.babylonjs.BABYLON.Plane = js.native
  /**
    * Calcualtte the dot product between the point and the plane normal
    * @param point point to calculate the dot product with
    * @returns the dot product (float) of the point coordinates and the plane normal.
    */
  /* CompleteClass */
  override def dotCoordinate(point: DeepImmutable[typings.babylonjs.BABYLON.Vector3]): Double = js.native
  /**
    * @returns the string "Plane".
    */
  /* CompleteClass */
  override def getClassName(): String = js.native
  /**
    * @returns the Plane hash code.
    */
  /* CompleteClass */
  override def getHashCode(): Double = js.native
  /**
    * Checks if the plane is facing a given direction
    * @param direction the direction to check if the plane is facing
    * @param epsilon value the dot product is compared against (returns true if dot <= epsilon)
    * @returns True is the vector "direction"  is the same side than the plane normal.
    */
  /* CompleteClass */
  override def isFrontFacingTo(direction: DeepImmutable[typings.babylonjs.BABYLON.Vector3], epsilon: Double): Boolean = js.native
  /**
    * Normalize the current Plane in place.
    * @returns the updated Plane.
    */
  /* CompleteClass */
  override def normalize(): typings.babylonjs.BABYLON.Plane = js.native
  /**
    * Calculates the distance to a point
    * @param point point to calculate distance to
    * @returns the signed distance (float) from the given point to the Plane.
    */
  /* CompleteClass */
  override def signedDistanceTo(point: DeepImmutable[typings.babylonjs.BABYLON.Vector3]): Double = js.native
  /**
    * Applies a transformation the plane and returns the result
    * @param transformation the transformation matrix to be applied to the plane
    * @returns a new Plane as the result of the transformation of the current Plane by the given matrix.
    */
  /* CompleteClass */
  override def transform(transformation: DeepImmutable[typings.babylonjs.BABYLON.Matrix]): typings.babylonjs.BABYLON.Plane = js.native
}

/* static members */
@JSGlobal("BABYLON.Plane")
@js.native
object Plane extends js.Object {
  var _TmpMatrix: js.Any = js.native
  /**
    * Creates a plane from an  array
    * @param array the array to create a plane from
    * @returns a new Plane from the given array.
    */
  def FromArray(array: DeepImmutable[ArrayLike[Double]]): typings.babylonjs.BABYLON.Plane = js.native
  /**
    * Creates a plane from three points
    * @param point1 point used to create the plane
    * @param point2 point used to create the plane
    * @param point3 point used to create the plane
    * @returns a new Plane defined by the three given points.
    */
  def FromPoints(
    point1: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    point2: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    point3: DeepImmutable[typings.babylonjs.BABYLON.Vector3]
  ): typings.babylonjs.BABYLON.Plane = js.native
  /**
    * Creates a plane from an origin point and a normal
    * @param origin origin of the plane to be constructed
    * @param normal normal of the plane to be constructed
    * @returns a new Plane the normal vector to this plane at the given origin point.
    * Note : the vector "normal" is updated because normalized.
    */
  def FromPositionAndNormal(
    origin: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    normal: DeepImmutable[typings.babylonjs.BABYLON.Vector3]
  ): typings.babylonjs.BABYLON.Plane = js.native
  /**
    * Calculates the distance from a plane and a point
    * @param origin origin of the plane to be constructed
    * @param normal normal of the plane to be constructed
    * @param point point to calculate distance to
    * @returns the signed distance between the plane defined by the normal vector at the "origin"" point and the given other point.
    */
  def SignedDistanceToPlaneFromPositionAndNormal(
    origin: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    normal: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    point: DeepImmutable[typings.babylonjs.BABYLON.Vector3]
  ): Double = js.native
}

