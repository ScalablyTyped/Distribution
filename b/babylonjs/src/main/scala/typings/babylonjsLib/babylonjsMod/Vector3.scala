package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Classed used to store (x,y,z) vector representation
  * A Vector3 is the main object used in 3D geometry
  * It can represent etiher the coordinates of a point the space, either a direction
  * Reminder: Babylon.js uses a left handed forward facing system
  */
@JSImport("babylonjs", "Vector3")
@js.native
/**
  * Creates a new Vector3 object from the given x, y, z (floats) coordinates.
  * @param x defines the first coordinates (on X axis)
  * @param y defines the second coordinates (on Y axis)
  * @param z defines the third coordinates (on Z axis)
  */
class Vector3 ()
  extends babylonjsLib.BABYLONNs.Vector3 {
  def this(/**
    * Defines the first coordinates (on X axis)
    */
  x: scala.Double) = this()
  def this(/**
    * Defines the first coordinates (on X axis)
    */
  x: scala.Double, /**
    * Defines the second coordinates (on Y axis)
    */
  y: scala.Double) = this()
  def this(/**
    * Defines the first coordinates (on X axis)
    */
  x: scala.Double, /**
    * Defines the second coordinates (on Y axis)
    */
  y: scala.Double, /**
    * Defines the third coordinates (on Z axis)
    */
  z: scala.Double) = this()
}

/* static members */
@JSImport("babylonjs", "Vector3")
@js.native
object Vector3 extends js.Object {
  var _viewportMatrixCache: js.Any = js.native
  /**
    * Returns a new Vector3 set to (0.0, 0.0, -1.0)
    * @returns a new forward Vector3
    */
  def Backward(): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
    * Returns a new Vector3 located for "amount" on the CatmullRom interpolation spline defined by the vectors "value1", "value2", "value3", "value4"
    * @param value1 defines the first control point
    * @param value2 defines the second control point
    * @param value3 defines the third control point
    * @param value4 defines the fourth control point
    * @param amount defines the amount on the spline to use
    * @returns the new Vector3
    */
  def CatmullRom(
    value1: babylonjsLib.BABYLONNs.Vector3,
    value2: babylonjsLib.BABYLONNs.Vector3,
    value3: babylonjsLib.BABYLONNs.Vector3,
    value4: babylonjsLib.BABYLONNs.Vector3,
    amount: scala.Double
  ): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
    * Returns a new Vector3 located at the center between "value1" and "value2"
    * @param value1 defines the first operand
    * @param value2 defines the second operand
    * @returns the new Vector3
    */
  def Center(value1: babylonjsLib.BABYLONNs.Vector3, value2: babylonjsLib.BABYLONNs.Vector3): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
    * Returns a new Vector3 set with the coordinates of "value", if the vector "value" is in the cube defined by the vectors "min" and "max"
    * If a coordinate value of "value" is lower than one of the "min" coordinate, then this "value" coordinate is set with the "min" one
    * If a coordinate value of "value" is greater than one of the "max" coordinate, then this "value" coordinate is set with the "max" one
    * @param value defines the current value
    * @param min defines the lower range value
    * @param max defines the upper range value
    * @returns the new Vector3
    */
  def Clamp(
    value: babylonjsLib.BABYLONNs.Vector3,
    min: babylonjsLib.BABYLONNs.Vector3,
    max: babylonjsLib.BABYLONNs.Vector3
  ): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
    * Returns a new Vector3 as the cross product of the vectors "left" and "right"
    * The cross product is then orthogonal to both "left" and "right"
    * @param left defines the left operand
    * @param right defines the right operand
    * @returns the cross product
    */
  def Cross(left: babylonjsLib.BABYLONNs.Vector3, right: babylonjsLib.BABYLONNs.Vector3): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
    * Sets the given vector "result" with the cross product of "left" and "right"
    * The cross product is then orthogonal to both "left" and "right"
    * @param left defines the left operand
    * @param right defines the right operand
    * @param result defines the Vector3 where to store the result
    */
  def CrossToRef(
    left: babylonjsLib.BABYLONNs.Vector3,
    right: babylonjsLib.BABYLONNs.Vector3,
    result: babylonjsLib.BABYLONNs.Vector3
  ): scala.Unit = js.native
  /**
    * Returns the distance between the vectors "value1" and "value2"
    * @param value1 defines the first operand
    * @param value2 defines the second operand
    * @returns the distance
    */
  def Distance(value1: babylonjsLib.BABYLONNs.Vector3, value2: babylonjsLib.BABYLONNs.Vector3): scala.Double = js.native
  /**
    * Returns the squared distance between the vectors "value1" and "value2"
    * @param value1 defines the first operand
    * @param value2 defines the second operand
    * @returns the squared distance
    */
  def DistanceSquared(value1: babylonjsLib.BABYLONNs.Vector3, value2: babylonjsLib.BABYLONNs.Vector3): scala.Double = js.native
  /**
    * Returns the dot product (float) between the vectors "left" and "right"
    * @param left defines the left operand
    * @param right defines the right operand
    * @returns the dot product
    */
  def Dot(left: babylonjsLib.BABYLONNs.Vector3, right: babylonjsLib.BABYLONNs.Vector3): scala.Double = js.native
  /**
    * Returns a new Vector3 set to (0.0, -1.0, 0.0)
    * @returns a new down Vector3
    */
  def Down(): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
    * Returns a new Vector3 set to (0.0, 0.0, 1.0)
    * @returns a new forward Vector3
    */
  def Forward(): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
    * Returns a new Vector3 set from the index "offset" of the given array
    * @param array defines the source array
    * @param offset defines the offset in the source array
    * @returns the new Vector3
    */
  def FromArray(array: stdLib.ArrayLike[scala.Double]): babylonjsLib.BABYLONNs.Vector3 = js.native
  def FromArray(array: stdLib.ArrayLike[scala.Double], offset: scala.Double): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
    * Sets the given vector "result" with the element values from the index "offset" of the given array
    * @param array defines the source array
    * @param offset defines the offset in the source array
    * @param result defines the Vector3 where to store the result
    */
  def FromArrayToRef(
    array: stdLib.ArrayLike[scala.Double],
    offset: scala.Double,
    result: babylonjsLib.BABYLONNs.Vector3
  ): scala.Unit = js.native
  /**
    * Returns a new Vector3 set from the index "offset" of the given Float32Array
    * This function is deprecated.  Use FromArray instead
    * @param array defines the source array
    * @param offset defines the offset in the source array
    * @returns the new Vector3
    */
  def FromFloatArray(array: stdLib.Float32Array): babylonjsLib.BABYLONNs.Vector3 = js.native
  def FromFloatArray(array: stdLib.Float32Array, offset: scala.Double): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
    * Sets the given vector "result" with the element values from the index "offset" of the given Float32Array
    * This function is deprecated.  Use FromArrayToRef instead.
    * @param array defines the source array
    * @param offset defines the offset in the source array
    * @param result defines the Vector3 where to store the result
    */
  def FromFloatArrayToRef(array: stdLib.Float32Array, offset: scala.Double, result: babylonjsLib.BABYLONNs.Vector3): scala.Unit = js.native
  /**
    * Sets the given vector "result" with the given floats.
    * @param x defines the x coordinate of the source
    * @param y defines the y coordinate of the source
    * @param z defines the z coordinate of the source
    * @param result defines the Vector3 where to store the result
    */
  def FromFloatsToRef(x: scala.Double, y: scala.Double, z: scala.Double, result: babylonjsLib.BABYLONNs.Vector3): scala.Unit = js.native
  /**
    * Get angle between two vectors
    * @param vector0 angle between vector0 and vector1
    * @param vector1 angle between vector0 and vector1
    * @param normal direction of the normal
    * @return the angle between vector0 and vector1
    */
  def GetAngleBetweenVectors(
    vector0: babylonjsLib.BABYLONNs.Vector3,
    vector1: babylonjsLib.BABYLONNs.Vector3,
    normal: babylonjsLib.BABYLONNs.Vector3
  ): scala.Double = js.native
  /**
    * Get the clip factor between two vectors
    * @param vector0 defines the first operand
    * @param vector1 defines the second operand
    * @param axis defines the axis to use
    * @param size defines the size along the axis
    * @returns the clip factor
    */
  def GetClipFactor(
    vector0: babylonjsLib.BABYLONNs.Vector3,
    vector1: babylonjsLib.BABYLONNs.Vector3,
    axis: babylonjsLib.BABYLONNs.Vector3,
    size: scala.Double
  ): scala.Double = js.native
  /**
    * Returns a new Vector3 located for "amount" (float) on the Hermite interpolation spline defined by the vectors "value1", "tangent1", "value2", "tangent2"
    * @param value1 defines the first control point
    * @param tangent1 defines the first tangent vector
    * @param value2 defines the second control point
    * @param tangent2 defines the second tangent vector
    * @param amount defines the amount on the interpolation spline (between 0 and 1)
    * @returns the new Vector3
    */
  def Hermite(
    value1: babylonjsLib.BABYLONNs.Vector3,
    tangent1: babylonjsLib.BABYLONNs.Vector3,
    value2: babylonjsLib.BABYLONNs.Vector3,
    tangent2: babylonjsLib.BABYLONNs.Vector3,
    amount: scala.Double
  ): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
    * Returns a new Vector3 set to (-1.0, 0.0, 0.0)
    * @returns a new left Vector3
    */
  def Left(): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
    * Returns a new Vector3 located for "amount" (float) on the linear interpolation between the vectors "start" and "end"
    * @param start defines the start value
    * @param end defines the end value
    * @param amount max defines amount between both (between 0 and 1)
    * @returns the new Vector3
    */
  def Lerp(start: babylonjsLib.BABYLONNs.Vector3, end: babylonjsLib.BABYLONNs.Vector3, amount: scala.Double): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
    * Sets the given vector "result" with the result of the linear interpolation from the vector "start" for "amount" to the vector "end"
    * @param start defines the start value
    * @param end defines the end value
    * @param amount max defines amount between both (between 0 and 1)
    * @param result defines the Vector3 where to store the result
    */
  def LerpToRef(
    start: babylonjsLib.BABYLONNs.Vector3,
    end: babylonjsLib.BABYLONNs.Vector3,
    amount: scala.Double,
    result: babylonjsLib.BABYLONNs.Vector3
  ): scala.Unit = js.native
  /**
    * Gets the maximal coordinate values between two Vector3
    * @param left defines the first operand
    * @param right defines the second operand
    * @returns the new Vector3
    */
  def Maximize(left: babylonjsLib.BABYLONNs.Vector3, right: babylonjsLib.BABYLONNs.Vector3): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
    * Gets the minimal coordinate values between two Vector3
    * @param left defines the first operand
    * @param right defines the second operand
    * @returns the new Vector3
    */
  def Minimize(left: babylonjsLib.BABYLONNs.Vector3, right: babylonjsLib.BABYLONNs.Vector3): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
    * Returns a new Vector3 as the normalization of the given vector
    * @param vector defines the Vector3 to normalize
    * @returns the new Vector3
    */
  def Normalize(vector: babylonjsLib.BABYLONNs.Vector3): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
    * Sets the given vector "result" with the normalization of the given first vector
    * @param vector defines the Vector3 to normalize
    * @param result defines the Vector3 where to store the result
    */
  def NormalizeToRef(vector: babylonjsLib.BABYLONNs.Vector3, result: babylonjsLib.BABYLONNs.Vector3): scala.Unit = js.native
  /**
    * Returns a new Vector3 set to (1.0, 1.0, 1.0)
    * @returns a new unit Vector3
    */
  def One(): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
    * Project a Vector3 onto screen space
    * @param vector defines the Vector3 to project
    * @param world defines the world matrix to use
    * @param transform defines the transform (view x projection) matrix to use
    * @param viewport defines the screen viewport to use
    * @returns the new Vector3
    */
  def Project(
    vector: babylonjsLib.BABYLONNs.Vector3,
    world: babylonjsLib.BABYLONNs.Matrix,
    transform: babylonjsLib.BABYLONNs.Matrix,
    viewport: babylonjsLib.BABYLONNs.Viewport
  ): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
    * Returns a new Vector3 set to (1.0, 0.0, 0.0)
    * @returns a new right Vector3
    */
  def Right(): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
    * Given three orthogonal normalized left-handed oriented Vector3 axis in space (target system),
    * RotationFromAxis() returns the rotation Euler angles (ex : rotation.x, rotation.y, rotation.z) to apply
    * to something in order to rotate it from its local system to the given target system
    * Note: axis1, axis2 and axis3 are normalized during this operation
    * @param axis1 defines the first axis
    * @param axis2 defines the second axis
    * @param axis3 defines the third axis
    * @returns a new Vector3
    */
  def RotationFromAxis(
    axis1: babylonjsLib.BABYLONNs.Vector3,
    axis2: babylonjsLib.BABYLONNs.Vector3,
    axis3: babylonjsLib.BABYLONNs.Vector3
  ): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
    * The same than RotationFromAxis but updates the given ref Vector3 parameter instead of returning a new Vector3
    * @param axis1 defines the first axis
    * @param axis2 defines the second axis
    * @param axis3 defines the third axis
    * @param ref defines the Vector3 where to store the result
    */
  def RotationFromAxisToRef(
    axis1: babylonjsLib.BABYLONNs.Vector3,
    axis2: babylonjsLib.BABYLONNs.Vector3,
    axis3: babylonjsLib.BABYLONNs.Vector3,
    ref: babylonjsLib.BABYLONNs.Vector3
  ): scala.Unit = js.native
  /**
    * Returns a new Vector3 set with the result of the transformation by the given matrix of the given vector.
    * This method computes tranformed coordinates only, not transformed direction vectors (ie. it takes translation in account)
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @returns the transformed Vector3
    */
  def TransformCoordinates(vector: babylonjsLib.BABYLONNs.Vector3, transformation: babylonjsLib.BABYLONNs.Matrix): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
    * Sets the given vector "result" coordinates with the result of the transformation by the given matrix of the given floats (x, y, z)
    * This method computes tranformed coordinates only, not transformed direction vectors
    * @param x define the x coordinate of the source vector
    * @param y define the y coordinate of the source vector
    * @param z define the z coordinate of the source vector
    * @param transformation defines the transformation matrix
    * @param result defines the Vector3 where to store the result
    */
  def TransformCoordinatesFromFloatsToRef(
    x: scala.Double,
    y: scala.Double,
    z: scala.Double,
    transformation: babylonjsLib.BABYLONNs.Matrix,
    result: babylonjsLib.BABYLONNs.Vector3
  ): scala.Unit = js.native
  /**
    * Sets the given vector "result" coordinates with the result of the transformation by the given matrix of the given vector
    * This method computes tranformed coordinates only, not transformed direction vectors (ie. it takes translation in account)
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @param result defines the Vector3 where to store the result
    */
  def TransformCoordinatesToRef(
    vector: babylonjsLib.BABYLONNs.Vector3,
    transformation: babylonjsLib.BABYLONNs.Matrix,
    result: babylonjsLib.BABYLONNs.Vector3
  ): scala.Unit = js.native
  /**
    * Returns a new Vector3 set with the result of the normal transformation by the given matrix of the given vector
    * This methods computes transformed normalized direction vectors only (ie. it does not apply translation)
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @returns the new Vector3
    */
  def TransformNormal(vector: babylonjsLib.BABYLONNs.Vector3, transformation: babylonjsLib.BABYLONNs.Matrix): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
    * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given floats (x, y, z)
    * This methods computes transformed normalized direction vectors only (ie. it does not apply translation)
    * @param x define the x coordinate of the source vector
    * @param y define the y coordinate of the source vector
    * @param z define the z coordinate of the source vector
    * @param transformation defines the transformation matrix
    * @param result defines the Vector3 where to store the result
    */
  def TransformNormalFromFloatsToRef(
    x: scala.Double,
    y: scala.Double,
    z: scala.Double,
    transformation: babylonjsLib.BABYLONNs.Matrix,
    result: babylonjsLib.BABYLONNs.Vector3
  ): scala.Unit = js.native
  /**
    * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given vector
    * This methods computes transformed normalized direction vectors only (ie. it does not apply translation)
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @param result defines the Vector3 where to store the result
    */
  def TransformNormalToRef(
    vector: babylonjsLib.BABYLONNs.Vector3,
    transformation: babylonjsLib.BABYLONNs.Matrix,
    result: babylonjsLib.BABYLONNs.Vector3
  ): scala.Unit = js.native
  /**
    * Unproject from screen space to object space
    * @param source defines the screen space Vector3 to use
    * @param viewportWidth defines the current width of the viewport
    * @param viewportHeight defines the current height of the viewport
    * @param world defines the world matrix to use (can be set to Identity to go to world space)
    * @param view defines the view matrix to use
    * @param projection defines the projection matrix to use
    * @returns the new Vector3
    */
  def Unproject(
    source: babylonjsLib.BABYLONNs.Vector3,
    viewportWidth: scala.Double,
    viewportHeight: scala.Double,
    world: babylonjsLib.BABYLONNs.Matrix,
    view: babylonjsLib.BABYLONNs.Matrix,
    projection: babylonjsLib.BABYLONNs.Matrix
  ): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
    * Unproject from screen space to object space
    * @param sourceX defines the screen space x coordinate to use
    * @param sourceY defines the screen space y coordinate to use
    * @param sourceZ defines the screen space z coordinate to use
    * @param viewportWidth defines the current width of the viewport
    * @param viewportHeight defines the current height of the viewport
    * @param world defines the world matrix to use (can be set to Identity to go to world space)
    * @param view defines the view matrix to use
    * @param projection defines the projection matrix to use
    * @param result defines the Vector3 where to store the result
    */
  def UnprojectFloatsToRef(
    sourceX: babylonjsLib.BABYLONNs.float,
    sourceY: babylonjsLib.BABYLONNs.float,
    sourceZ: babylonjsLib.BABYLONNs.float,
    viewportWidth: scala.Double,
    viewportHeight: scala.Double,
    world: babylonjsLib.BABYLONNs.Matrix,
    view: babylonjsLib.BABYLONNs.Matrix,
    projection: babylonjsLib.BABYLONNs.Matrix,
    result: babylonjsLib.BABYLONNs.Vector3
  ): scala.Unit = js.native
  /**
    * Unproject from screen space to object space
    * @param source defines the screen space Vector3 to use
    * @param viewportWidth defines the current width of the viewport
    * @param viewportHeight defines the current height of the viewport
    * @param world defines the world matrix to use (can be set to Identity to go to world space)
    * @param transform defines the transform (view x projection) matrix to use
    * @returns the new Vector3
    */
  def UnprojectFromTransform(
    source: babylonjsLib.BABYLONNs.Vector3,
    viewportWidth: scala.Double,
    viewportHeight: scala.Double,
    world: babylonjsLib.BABYLONNs.Matrix,
    transform: babylonjsLib.BABYLONNs.Matrix
  ): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
    * Unproject from screen space to object space
    * @param source defines the screen space Vector3 to use
    * @param viewportWidth defines the current width of the viewport
    * @param viewportHeight defines the current height of the viewport
    * @param world defines the world matrix to use (can be set to Identity to go to world space)
    * @param view defines the view matrix to use
    * @param projection defines the projection matrix to use
    * @param result defines the Vector3 where to store the result
    */
  def UnprojectToRef(
    source: babylonjsLib.BABYLONNs.Vector3,
    viewportWidth: scala.Double,
    viewportHeight: scala.Double,
    world: babylonjsLib.BABYLONNs.Matrix,
    view: babylonjsLib.BABYLONNs.Matrix,
    projection: babylonjsLib.BABYLONNs.Matrix,
    result: babylonjsLib.BABYLONNs.Vector3
  ): scala.Unit = js.native
  /**
    * Returns a new Vector3 set to (0.0, 1.0, 0.0)
    * @returns a new up Vector3
    */
  def Up(): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
    * Returns a new Vector3 set to (0.0, 0.0, 0.0)
    * @returns a new empty Vector3
    */
  def Zero(): babylonjsLib.BABYLONNs.Vector3 = js.native
}

