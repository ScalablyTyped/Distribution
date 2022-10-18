package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vector2 extends StObject {
  
  /**
    * Add another vector with the current one
    * Example Playground https://playground.babylonjs.com/#QYBWV4#11
    * @param otherVector defines the other vector
    * @returns a new Vector2 set with the addition of the current Vector2 and the given one coordinates
    */
  def add(otherVector: DeepImmutable[Vector2]): Vector2 = js.native
  
  /**
    * Set the Vector2 coordinates by adding the given Vector2 coordinates
    * Example Playground https://playground.babylonjs.com/#QYBWV4#13
    * @param otherVector defines the other vector
    * @returns the current updated Vector2
    */
  def addInPlace(otherVector: DeepImmutable[Vector2]): Vector2 = js.native
  
  /**
    * Sets the "result" coordinates with the addition of the current Vector2 and the given one coordinates
    * Example Playground https://playground.babylonjs.com/#QYBWV4#12
    * @param otherVector defines the other vector
    * @param result defines the target vector
    * @returns the unmodified current Vector2
    */
  def addToRef(otherVector: DeepImmutable[Vector2], result: Vector2): Vector2 = js.native
  
  /**
    * Gets a new Vector2 by adding the current Vector2 coordinates to the given Vector3 x, y coordinates
    * Example Playground https://playground.babylonjs.com/#QYBWV4#14
    * @param otherVector defines the other vector
    * @returns a new Vector2
    */
  def addVector3(otherVector: Vector3): Vector2 = js.native
  
  /**
    * Copy the current vector to an array
    * Example Playground https://playground.babylonjs.com/#QYBWV4#40
    * @returns a new array with 2 elements: the Vector2 coordinates.
    */
  def asArray(): js.Array[Double] = js.native
  
  /**
    * Sets the Vector2 coordinates with the given Vector2 coordinates
    * Example Playground https://playground.babylonjs.com/#QYBWV4#24
    * @param source defines the source Vector2
    * @returns the current updated Vector2
    */
  def copyFrom(source: DeepImmutable[Vector2]): Vector2 = js.native
  
  /**
    * Sets the Vector2 coordinates with the given floats
    * Example Playground https://playground.babylonjs.com/#QYBWV4#25
    * @param x defines the first coordinate
    * @param y defines the second coordinate
    * @returns the current updated Vector2
    */
  def copyFromFloats(x: Double, y: Double): Vector2 = js.native
  
  /**
    * Returns a new Vector2 set with the Vector2 coordinates divided by the given one coordinates
    * Example Playground https://playground.babylonjs.com/#QYBWV4#27
    * @param otherVector defines the other vector
    * @returns a new Vector2
    */
  def divide(otherVector: Vector2): Vector2 = js.native
  
  /**
    * Divides the current Vector2 coordinates by the given ones
    * Example Playground https://playground.babylonjs.com/#QYBWV4#28
    * @param otherVector defines the other vector
    * @returns the current updated Vector2
    */
  def divideInPlace(otherVector: DeepImmutable[Vector2]): Vector2 = js.native
  
  /**
    * Sets the "result" coordinates with the Vector2 divided by the given one coordinates
    * Example Playground https://playground.babylonjs.com/#QYBWV4#30
    * @param otherVector defines the other vector
    * @param result defines the target vector
    * @returns the unmodified current Vector2
    */
  def divideToRef(otherVector: DeepImmutable[Vector2], result: Vector2): Vector2 = js.native
  
  /**
    * Gets a boolean if two vectors are equals
    * Example Playground https://playground.babylonjs.com/#QYBWV4#31
    * @param otherVector defines the other vector
    * @returns true if the given vector coordinates strictly equal the current Vector2 ones
    */
  def equals(otherVector: DeepImmutable[Vector2]): Boolean = js.native
  
  /**
    * Gets a boolean if two vectors are equals (using an epsilon value)
    * Example Playground https://playground.babylonjs.com/#QYBWV4#32
    * @param otherVector defines the other vector
    * @param epsilon defines the minimal distance to consider equality
    * @returns true if the given vector coordinates are close to the current ones by a distance of epsilon.
    */
  def equalsWithEpsilon(otherVector: DeepImmutable[Vector2]): Boolean = js.native
  def equalsWithEpsilon(otherVector: DeepImmutable[Vector2], epsilon: Double): Boolean = js.native
  
  /**
    * Gets a new Vector2 from current Vector2 floored values
    * Example Playground https://playground.babylonjs.com/#QYBWV4#35
    * eg (1.2, 2.31) returns (1, 2)
    * @returns a new Vector2
    */
  def floor(): Vector2 = js.native
  
  /**
    * Gets a new Vector2 from current Vector2 fractional values
    * Example Playground https://playground.babylonjs.com/#QYBWV4#34
    * eg (1.2, 2.31) returns (0.2, 0.31)
    * @returns a new Vector2
    */
  def fract(): Vector2 = js.native
  
  /**
    * Update the current vector from an array
    * Example Playground https://playground.babylonjs.com/#QYBWV4#39
    * @param array defines the destination array
    * @param index defines the offset in the destination array
    * @returns the current Vector3
    */
  def fromArray(array: FloatArray): Vector2 = js.native
  def fromArray(array: FloatArray, index: Double): Vector2 = js.native
  
  /**
    * Gets class name
    * @returns the string "Vector2"
    */
  def getClassName(): String = js.native
  
  /**
    * Gets current vector hash code
    * @returns the Vector2 hash code as a number
    */
  def getHashCode(): Double = js.native
  
  /**
    * Gets the length of the vector
    * @returns the vector length (float)
    */
  def length(): Double = js.native
  
  /**
    * Gets the vector squared length
    * @returns the vector squared length (float)
    */
  def lengthSquared(): Double = js.native
  
  /**
    * Returns a new Vector2 set with the multiplication of the current Vector2 and the given one coordinates
    * Example Playground https://playground.babylonjs.com/#QYBWV4#42
    * @param otherVector defines the other vector
    * @returns a new Vector2
    */
  def multiply(otherVector: DeepImmutable[Vector2]): Vector2 = js.native
  
  /**
    * Gets a new Vector2 set with the Vector2 coordinates multiplied by the given floats
    * Example Playground https://playground.babylonjs.com/#QYBWV4#89
    * @param x defines the first coordinate
    * @param y defines the second coordinate
    * @returns a new Vector2
    */
  def multiplyByFloats(x: Double, y: Double): Vector2 = js.native
  
  /**
    * Multiplies in place the current Vector2 coordinates by the given ones
    * Example Playground https://playground.babylonjs.com/#QYBWV4#43
    * @param otherVector defines the other vector
    * @returns the current updated Vector2
    */
  def multiplyInPlace(otherVector: DeepImmutable[Vector2]): Vector2 = js.native
  
  /**
    * Sets "result" coordinates with the multiplication of the current Vector2 and the given one coordinates
    * Example Playground https://playground.babylonjs.com/#QYBWV4#44
    * @param otherVector defines the other vector
    * @param result defines the target vector
    * @returns the unmodified current Vector2
    */
  def multiplyToRef(otherVector: DeepImmutable[Vector2], result: Vector2): Vector2 = js.native
  
  /**
    * Gets a new Vector2 with current Vector2 negated coordinates
    * Example Playground https://playground.babylonjs.com/#QYBWV4#22
    * @returns a new Vector2
    */
  def negate(): Vector2 = js.native
  
  /**
    * Negate this vector in place
    * Example Playground https://playground.babylonjs.com/#QYBWV4#23
    * @returns this
    */
  def negateInPlace(): Vector2 = js.native
  
  /**
    * Negate the current Vector2 and stores the result in the given vector "result" coordinates
    * Example Playground https://playground.babylonjs.com/#QYBWV4#41
    * @param result defines the Vector3 object where to store the result
    * @returns the result
    */
  def negateToRef(result: Vector2): Vector2 = js.native
  
  /**
    * Normalize the vector
    * Example Playground https://playground.babylonjs.com/#QYBWV4#48
    * @returns the current updated Vector2
    */
  def normalize(): Vector2 = js.native
  
  /**
    * Rotate the current vector into a given result vector
    * Example Playground https://playground.babylonjs.com/#QYBWV4#49
    * @param angle defines the rotation angle
    * @param result defines the result vector where to store the rotated vector
    * @returns the current vector
    */
  def rotateToRef(angle: Double, result: Vector2): this.type = js.native
  
  /**
    * Returns a new Vector2 scaled by "scale" from the current Vector2
    * Example Playground https://playground.babylonjs.com/#QYBWV4#52
    * @param scale defines the scaling factor
    * @returns a new Vector2
    */
  def scale(scale: Double): Vector2 = js.native
  
  /**
    * Scale the current Vector2 values by a factor and add the result to a given Vector2
    * Example Playground https://playground.babylonjs.com/#QYBWV4#58
    * @param scale defines the scale factor
    * @param result defines the Vector2 object where to store the result
    * @returns the unmodified current Vector2
    */
  def scaleAndAddToRef(scale: Double, result: Vector2): Vector2 = js.native
  
  /**
    * Multiply the Vector2 coordinates by
    * Example Playground https://playground.babylonjs.com/#QYBWV4#59
    * @param scale defines the scaling factor
    * @returns the current updated Vector2
    */
  def scaleInPlace(scale: Double): Vector2 = js.native
  
  /**
    * Scale the current Vector2 values by a factor to a given Vector2
    * Example Playground https://playground.babylonjs.com/#QYBWV4#57
    * @param scale defines the scale factor
    * @param result defines the Vector2 object where to store the result
    * @returns the unmodified current Vector2
    */
  def scaleToRef(scale: Double, result: Vector2): Vector2 = js.native
  
  /**
    * Sets the Vector2 coordinates with the given floats
    * Example Playground https://playground.babylonjs.com/#QYBWV4#62
    * @param x defines the first coordinate
    * @param y defines the second coordinate
    * @returns the current updated Vector2
    */
  def set(x: Double, y: Double): Vector2 = js.native
  
  /**
    * Gets a new Vector2 set with the subtracted coordinates of the given one from the current Vector2
    * Example Playground https://playground.babylonjs.com/#QYBWV4#61
    * @param otherVector defines the other vector
    * @returns a new Vector2
    */
  def subtract(otherVector: Vector2): Vector2 = js.native
  
  /**
    * Sets the current Vector2 coordinates by subtracting from it the given one coordinates
    * Example Playground https://playground.babylonjs.com/#QYBWV4#88
    * @param otherVector defines the other vector
    * @returns the current updated Vector2
    */
  def subtractInPlace(otherVector: DeepImmutable[Vector2]): Vector2 = js.native
  
  /**
    * Sets the "result" coordinates with the subtraction of the given one from the current Vector2 coordinates.
    * Example Playground https://playground.babylonjs.com/#QYBWV4#63
    * @param otherVector defines the other vector
    * @param result defines the target vector
    * @returns the unmodified current Vector2
    */
  def subtractToRef(otherVector: DeepImmutable[Vector2], result: Vector2): Vector2 = js.native
  
  /**
    * Sets the Vector2 coordinates in the given array or Float32Array from the given index.
    * Example Playground https://playground.babylonjs.com/#QYBWV4#15
    * @param array defines the source array
    * @param index defines the offset in source array
    * @returns the current Vector2
    */
  def toArray(array: FloatArray): Vector2 = js.native
  def toArray(array: FloatArray, index: Double): Vector2 = js.native
  
  /** defines the first coordinate */
  var x: Double = js.native
  
  /** defines the second coordinate */
  var y: Double = js.native
}
