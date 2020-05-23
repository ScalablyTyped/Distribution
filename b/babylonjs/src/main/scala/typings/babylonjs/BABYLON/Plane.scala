package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plane extends js.Object {
  /**
    * d component of the plane
    */
  var d: Double
  /**
    * Normal of the plane (a,b,c)
    */
  var normal: Vector3
  /**
    * @returns the plane coordinates as a new array of 4 elements [a, b, c, d].
    */
  def asArray(): js.Array[Double]
  /**
    * Updates the current Plane from the plane defined by the three given points.
    * @param point1 one of the points used to contruct the plane
    * @param point2 one of the points used to contruct the plane
    * @param point3 one of the points used to contruct the plane
    * @returns the updated Plane.
    */
  def copyFromPoints(point1: DeepImmutable[Vector3], point2: DeepImmutable[Vector3], point3: DeepImmutable[Vector3]): Plane
  /**
    * Calcualtte the dot product between the point and the plane normal
    * @param point point to calculate the dot product with
    * @returns the dot product (float) of the point coordinates and the plane normal.
    */
  def dotCoordinate(point: DeepImmutable[Vector3]): Double
  /**
    * @returns the string "Plane".
    */
  def getClassName(): String
  /**
    * @returns the Plane hash code.
    */
  def getHashCode(): Double
  /**
    * Checks if the plane is facing a given direction
    * @param direction the direction to check if the plane is facing
    * @param epsilon value the dot product is compared against (returns true if dot <= epsilon)
    * @returns True is the vector "direction"  is the same side than the plane normal.
    */
  def isFrontFacingTo(direction: DeepImmutable[Vector3], epsilon: Double): Boolean
  /**
    * Normalize the current Plane in place.
    * @returns the updated Plane.
    */
  def normalize(): Plane
  /**
    * Calculates the distance to a point
    * @param point point to calculate distance to
    * @returns the signed distance (float) from the given point to the Plane.
    */
  def signedDistanceTo(point: DeepImmutable[Vector3]): Double
  /**
    * Applies a transformation the plane and returns the result
    * @param transformation the transformation matrix to be applied to the plane
    * @returns a new Plane as the result of the transformation of the current Plane by the given matrix.
    */
  def transform(transformation: DeepImmutable[Matrix]): Plane
}

object Plane {
  @scala.inline
  def apply(
    asArray: () => js.Array[Double],
    copyFromPoints: (DeepImmutable[Vector3], DeepImmutable[Vector3], DeepImmutable[Vector3]) => Plane,
    d: Double,
    dotCoordinate: DeepImmutable[Vector3] => Double,
    getClassName: () => String,
    getHashCode: () => Double,
    isFrontFacingTo: (DeepImmutable[Vector3], Double) => Boolean,
    normal: Vector3,
    normalize: () => Plane,
    signedDistanceTo: DeepImmutable[Vector3] => Double,
    transform: DeepImmutable[Matrix] => Plane
  ): Plane = {
    val __obj = js.Dynamic.literal(asArray = js.Any.fromFunction0(asArray), copyFromPoints = js.Any.fromFunction3(copyFromPoints), d = d.asInstanceOf[js.Any], dotCoordinate = js.Any.fromFunction1(dotCoordinate), getClassName = js.Any.fromFunction0(getClassName), getHashCode = js.Any.fromFunction0(getHashCode), isFrontFacingTo = js.Any.fromFunction2(isFrontFacingTo), normal = normal.asInstanceOf[js.Any], normalize = js.Any.fromFunction0(normalize), signedDistanceTo = js.Any.fromFunction1(signedDistanceTo), transform = js.Any.fromFunction1(transform))
    __obj.asInstanceOf[Plane]
  }
}

