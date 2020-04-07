package typings.babylonjs.BABYLON

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.Color4")
@js.native
/**
  * Creates a new Color4 object from red, green, blue values, all between 0 and 1
  * @param r defines the red component (between 0 and 1, default is 0)
  * @param g defines the green component (between 0 and 1, default is 0)
  * @param b defines the blue component (between 0 and 1, default is 0)
  * @param a defines the alpha component (between 0 and 1, default is 1)
  */
class Color4 () extends js.Object {
  def this(/**
    * Defines the red component (between 0 and 1, default is 0)
    */
  r: Double) = this()
  def this(
    /**
    * Defines the red component (between 0 and 1, default is 0)
    */
  r: Double,
    /**
    * Defines the green component (between 0 and 1, default is 0)
    */
  g: Double
  ) = this()
  def this(
    /**
    * Defines the red component (between 0 and 1, default is 0)
    */
  r: Double,
    /**
    * Defines the green component (between 0 and 1, default is 0)
    */
  g: Double,
    /**
    * Defines the blue component (between 0 and 1, default is 0)
    */
  b: Double
  ) = this()
  def this(
    /**
    * Defines the red component (between 0 and 1, default is 0)
    */
  r: Double,
    /**
    * Defines the green component (between 0 and 1, default is 0)
    */
  g: Double,
    /**
    * Defines the blue component (between 0 and 1, default is 0)
    */
  b: Double,
    /**
    * Defines the alpha component (between 0 and 1, default is 1)
    */
  a: Double
  ) = this()
  /**
    * Defines the alpha component (between 0 and 1, default is 1)
    */
  var a: Double = js.native
  /**
    * Defines the blue component (between 0 and 1, default is 0)
    */
  var b: Double = js.native
  /**
    * Defines the green component (between 0 and 1, default is 0)
    */
  var g: Double = js.native
  /**
    * Defines the red component (between 0 and 1, default is 0)
    */
  var r: Double = js.native
  /**
    * Creates a new Color4 set with the added values of the current Color4 and of the given one
    * @param right defines the second operand
    * @returns a new Color4 object
    */
  def add(right: DeepImmutable[Color4]): Color4 = js.native
  /**
    * Adds in place the given Color4 values to the current Color4 object
    * @param right defines the second operand
    * @returns the current updated Color4 object
    */
  def addInPlace(right: DeepImmutable[Color4]): Color4 = js.native
  /**
    * Creates a new array populated with 4 numeric elements : red, green, blue, alpha values
    * @returns the new array
    */
  def asArray(): js.Array[Double] = js.native
  def clampToRef(min: js.UndefOr[scala.Nothing], max: js.UndefOr[scala.Nothing], result: Color4): Color4 = js.native
  def clampToRef(min: js.UndefOr[scala.Nothing], max: Double, result: Color4): Color4 = js.native
  def clampToRef(min: Double, max: js.UndefOr[scala.Nothing], result: Color4): Color4 = js.native
  /**
    * Clamps the rgb values by the min and max values and stores the result into "result"
    * @param min defines minimum clamping value (default is 0)
    * @param max defines maximum clamping value (default is 1)
    * @param result defines color to store the result into.
    * @returns the cuurent Color4
    */
  def clampToRef(min: Double, max: Double, result: Color4): Color4 = js.native
  /**
    * Copies the given Color4 values into the current one
    * @param source defines the source Color4 object
    * @returns the current updated Color4 object
    */
  def copyFrom(source: Color4): Color4 = js.native
  /**
    * Copies the given float values into the current one
    * @param r defines the red component to read from
    * @param g defines the green component to read from
    * @param b defines the blue component to read from
    * @param a defines the alpha component to read from
    * @returns the current updated Color4 object
    */
  def copyFromFloats(r: Double, g: Double, b: Double, a: Double): Color4 = js.native
  /**
    * Determines equality between Color4 objects
    * @param otherColor defines the second operand
    * @returns true if the rgba values are equal to the given ones
    */
  def equals(otherColor: DeepImmutable[Color4]): Boolean = js.native
  /**
    * Returns the string "Color4"
    * @returns "Color4"
    */
  def getClassName(): String = js.native
  /**
    * Compute the Color4 hash code
    * @returns an unique number that can be used to hash Color4 objects
    */
  def getHashCode(): Double = js.native
  /**
    * Multipy an Color4 value by another and return a new Color4 object
    * @param color defines the Color4 value to multiply by
    * @returns a new Color4 object
    */
  def multiply(color: Color4): Color4 = js.native
  /**
    * Multipy a Color4 value by another and push the result in a reference value
    * @param color defines the Color4 value to multiply by
    * @param result defines the Color4 to fill the result in
    * @returns the result Color4
    */
  def multiplyToRef(color: Color4, result: Color4): Color4 = js.native
  /**
    * Creates a new Color4 with the current Color4 values multiplied by scale
    * @param scale defines the scaling factor to apply
    * @returns a new Color4 object
    */
  def scale(scale: Double): Color4 = js.native
  /**
    * Scale the current Color4 values by a factor and add the result to a given Color4
    * @param scale defines the scale factor
    * @param result defines the Color4 object where to store the result
    * @returns the unmodified current Color4
    */
  def scaleAndAddToRef(scale: Double, result: Color4): Color4 = js.native
  /**
    * Multiplies the current Color4 values by scale and stores the result in "result"
    * @param scale defines the scaling factor to apply
    * @param result defines the Color4 object where to store the result
    * @returns the current unmodified Color4
    */
  def scaleToRef(scale: Double, result: Color4): Color4 = js.native
  /**
    * Copies the given float values into the current one
    * @param r defines the red component to read from
    * @param g defines the green component to read from
    * @param b defines the blue component to read from
    * @param a defines the alpha component to read from
    * @returns the current updated Color4 object
    */
  def set(r: Double, g: Double, b: Double, a: Double): Color4 = js.native
  /**
    * Creates a new Color4 set with the subtracted values of the given one from the current Color4
    * @param right defines the second operand
    * @returns a new Color4 object
    */
  def subtract(right: DeepImmutable[Color4]): Color4 = js.native
  /**
    * Subtracts the given ones from the current Color4 values and stores the results in "result"
    * @param right defines the second operand
    * @param result defines the Color4 object where to store the result
    * @returns the current Color4 object
    */
  def subtractToRef(right: DeepImmutable[Color4], result: Color4): Color4 = js.native
  /**
    * Stores from the starting index in the given array the Color4 successive values
    * @param array defines the array where to store the r,g,b components
    * @param index defines an optional index in the target array to define where to start storing values
    * @returns the current Color4 object
    */
  def toArray(array: js.Array[Double]): Color4 = js.native
  def toArray(array: js.Array[Double], index: Double): Color4 = js.native
  /**
    * Computes a new Color4 converted from the current one to gamma space
    * @returns a new Color4 object
    */
  def toGammaSpace(): Color4 = js.native
  /**
    * Converts the Color4 values to gamma space and stores the result in "convertedColor"
    * @param convertedColor defines the Color4 object where to store the gamma space version
    * @returns the unmodified Color4
    */
  def toGammaSpaceToRef(convertedColor: Color4): Color4 = js.native
  /**
    * Compute the Color4 hexadecimal code as a string
    * @returns a string containing the hexadecimal representation of the Color4 object
    */
  def toHexString(): String = js.native
  /**
    * Computes a new Color4 converted from the current one to linear space
    * @returns a new Color4 object
    */
  def toLinearSpace(): Color4 = js.native
  /**
    * Converts the Color4 values to linear space and stores the result in "convertedColor"
    * @param convertedColor defines the Color4 object where to store the linear space version
    * @returns the unmodified Color4
    */
  def toLinearSpaceToRef(convertedColor: Color4): Color4 = js.native
}

/* static members */
@JSGlobal("BABYLON.Color4")
@js.native
object Color4 extends js.Object {
  /**
    * Check the content of a given array and convert it to an array containing RGBA data
    * If the original array was already containing count * 4 values then it is returned directly
    * @param colors defines the array to check
    * @param count defines the number of RGBA data to expect
    * @returns an array containing count * 4 values (RGBA)
    */
  def CheckColors4(colors: js.Array[Double], count: Double): js.Array[Double] = js.native
  /**
    * Creates a new Color4 from the starting index element of the given array
    * @param array defines the source array to read from
    * @param offset defines the offset in the source array
    * @returns a new Color4 object
    */
  def FromArray(array: DeepImmutable[ArrayLike[Double]]): Color4 = js.native
  def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): Color4 = js.native
  /**
    * Creates a new Color4 from a Color3 and an alpha value
    * @param color3 defines the source Color3 to read from
    * @param alpha defines the alpha component (1.0 by default)
    * @returns a new Color4 object
    */
  def FromColor3(color3: DeepImmutable[Color3]): Color4 = js.native
  def FromColor3(color3: DeepImmutable[Color3], alpha: Double): Color4 = js.native
  /**
    * Creates a new Color4 from the string containing valid hexadecimal values
    * @param hex defines a string containing valid hexadecimal values
    * @returns a new Color4 object
    */
  def FromHexString(hex: String): Color4 = js.native
  /**
    * Creates a new Color3 from integer values (< 256)
    * @param r defines the red component to read from (value between 0 and 255)
    * @param g defines the green component to read from (value between 0 and 255)
    * @param b defines the blue component to read from (value between 0 and 255)
    * @param a defines the alpha component to read from (value between 0 and 255)
    * @returns a new Color3 object
    */
  def FromInts(r: Double, g: Double, b: Double, a: Double): Color4 = js.native
  /**
    * Creates a new Color4 object set with the linearly interpolated values of "amount" between the left Color4 object and the right Color4 object
    * @param left defines the start value
    * @param right defines the end value
    * @param amount defines the gradient factor
    * @returns a new Color4 object
    */
  def Lerp(left: DeepImmutable[Color4], right: DeepImmutable[Color4], amount: Double): Color4 = js.native
  /**
    * Set the given "result" with the linearly interpolated values of "amount" between the left Color4 object and the right Color4 object
    * @param left defines the start value
    * @param right defines the end value
    * @param amount defines the gradient factor
    * @param result defines the Color4 object where to store data
    */
  def LerpToRef(left: DeepImmutable[Color4], right: DeepImmutable[Color4], amount: Double, result: Color4): Unit = js.native
}

