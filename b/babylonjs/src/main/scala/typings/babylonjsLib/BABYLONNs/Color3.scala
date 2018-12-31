package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to hold a RBG color
  */
@JSGlobal("BABYLON.Color3")
@js.native
/**
  * Creates a new Color3 object from red, green, blue values, all between 0 and 1
  * @param r defines the red component (between 0 and 1, default is 0)
  * @param g defines the green component (between 0 and 1, default is 0)
  * @param b defines the blue component (between 0 and 1, default is 0)
  */
class Color3 () extends js.Object {
  def this(/**
    * Defines the red component (between 0 and 1, default is 0)
    */
  r: scala.Double) = this()
  def this(/**
    * Defines the red component (between 0 and 1, default is 0)
    */
  r: scala.Double, /**
    * Defines the green component (between 0 and 1, default is 0)
    */
  g: scala.Double) = this()
  def this(/**
    * Defines the red component (between 0 and 1, default is 0)
    */
  r: scala.Double, /**
    * Defines the green component (between 0 and 1, default is 0)
    */
  g: scala.Double, /**
    * Defines the blue component (between 0 and 1, default is 0)
    */
  b: scala.Double) = this()
  /**
    * Defines the blue component (between 0 and 1, default is 0)
    */
  var b: scala.Double = js.native
  /**
    * Defines the green component (between 0 and 1, default is 0)
    */
  var g: scala.Double = js.native
  /**
    * Defines the red component (between 0 and 1, default is 0)
    */
  var r: scala.Double = js.native
  /**
    * Creates a new Color3 set with the added values of the current Color3 and of the given one
    * @param otherColor defines the second operand
    * @returns the new Color3
    */
  def add(otherColor: Color3): Color3 = js.native
  /**
    * Stores the result of the addition of the current Color3 and given one rgb values into "result"
    * @param otherColor defines the second operand
    * @param result defines Color3 object to store the result into
    * @returns the unmodified current Color3
    */
  def addToRef(otherColor: Color3, result: Color3): Color3 = js.native
  /**
    * Returns a new array populated with 3 numeric elements : red, green and blue values
    * @returns the new array
    */
  def asArray(): js.Array[scala.Double] = js.native
  def clampToRef(min: js.UndefOr[scala.Nothing], max: js.UndefOr[scala.Nothing], result: Color3): Color3 = js.native
  def clampToRef(min: js.UndefOr[scala.Nothing], max: scala.Double, result: Color3): Color3 = js.native
  def clampToRef(min: scala.Double, max: js.UndefOr[scala.Nothing], result: Color3): Color3 = js.native
  /**
    * Clamps the rgb values by the min and max values and stores the result into "result"
    * @param min defines minimum clamping value (default is 0)
    * @param max defines maximum clamping value (default is 1)
    * @param result defines color to store the result into
    * @returns the original Color3
    */
  def clampToRef(min: scala.Double, max: scala.Double, result: Color3): Color3 = js.native
  /**
    * Copies the rgb values from the source in the current Color3
    * @param source defines the source Color3 object
    * @returns the updated Color3 object
    */
  def copyFrom(source: Color3): Color3 = js.native
  /**
    * Updates the Color3 rgb values from the given floats
    * @param r defines the red component to read from
    * @param g defines the green component to read from
    * @param b defines the blue component to read from
    * @returns the current Color3 object
    */
  def copyFromFloats(r: scala.Double, g: scala.Double, b: scala.Double): Color3 = js.native
  /**
    * Determines equality between Color3 objects
    * @param otherColor defines the second operand
    * @returns true if the rgb values are equal to the given ones
    */
  def equals(otherColor: Color3): scala.Boolean = js.native
  /**
    * Determines equality between the current Color3 object and a set of r,b,g values
    * @param r defines the red component to check
    * @param g defines the green component to check
    * @param b defines the blue component to check
    * @returns true if the rgb values are equal to the given ones
    */
  def equalsFloats(r: scala.Double, g: scala.Double, b: scala.Double): scala.Boolean = js.native
  /**
    * Returns the string "Color3"
    * @returns "Color3"
    */
  def getClassName(): java.lang.String = js.native
  /**
    * Compute the Color3 hash code
    * @returns an unique number that can be used to hash Color3 objects
    */
  def getHashCode(): scala.Double = js.native
  /**
    * Multiply each Color3 rgb values by the given Color3 rgb values in a new Color3 object
    * @param otherColor defines the second operand
    * @returns the new Color3 object
    */
  def multiply(otherColor: Color3): Color3 = js.native
  /**
    * Multiply the rgb values of the Color3 and the given Color3 and stores the result in the object "result"
    * @param otherColor defines the second operand
    * @param result defines the Color3 object where to store the result
    * @returns the current Color3
    */
  def multiplyToRef(otherColor: Color3, result: Color3): Color3 = js.native
  /**
    * Multiplies in place each rgb value by scale
    * @param scale defines the scaling factor
    * @returns the updated Color3
    */
  def scale(scale: scala.Double): Color3 = js.native
  /**
    * Scale the current Color3 values by a factor and add the result to a given Color3
    * @param scale defines the scale factor
    * @param result defines color to store the result into
    * @returns the unmodified current Color3
    */
  def scaleAndAddToRef(scale: scala.Double, result: Color3): Color3 = js.native
  /**
    * Multiplies the rgb values by scale and stores the result into "result"
    * @param scale defines the scaling factor
    * @param result defines the Color3 object where to store the result
    * @returns the unmodified current Color3
    */
  def scaleToRef(scale: scala.Double, result: Color3): Color3 = js.native
  /**
    * Updates the Color3 rgb values from the given floats
    * @param r defines the red component to read from
    * @param g defines the green component to read from
    * @param b defines the blue component to read from
    * @returns the current Color3 object
    */
  def set(r: scala.Double, g: scala.Double, b: scala.Double): Color3 = js.native
  /**
    * Returns a new Color3 set with the subtracted values of the given one from the current Color3
    * @param otherColor defines the second operand
    * @returns the new Color3
    */
  def subtract(otherColor: Color3): Color3 = js.native
  /**
    * Stores the result of the subtraction of given one from the current Color3 rgb values into "result"
    * @param otherColor defines the second operand
    * @param result defines Color3 object to store the result into
    * @returns the unmodified current Color3
    */
  def subtractToRef(otherColor: Color3, result: Color3): Color3 = js.native
  /**
    * Stores in the given array from the given starting index the red, green, blue values as successive elements
    * @param array defines the array where to store the r,g,b components
    * @param index defines an optional index in the target array to define where to start storing values
    * @returns the current Color3 object
    */
  def toArray(array: FloatArray): Color3 = js.native
  def toArray(array: FloatArray, index: scala.Double): Color3 = js.native
  /**
    * Returns a new Color4 object from the current Color3 and the given alpha
    * @param alpha defines the alpha component on the new Color4 object (default is 1)
    * @returns a new Color4 object
    */
  def toColor4(): Color4 = js.native
  def toColor4(alpha: scala.Double): Color4 = js.native
  /**
    * Computes a new Color3 converted from the current one to gamma space
    * @returns a new Color3 object
    */
  def toGammaSpace(): Color3 = js.native
  /**
    * Converts the Color3 values to gamma space and stores the result in "convertedColor"
    * @param convertedColor defines the Color3 object where to store the gamma space version
    * @returns the unmodified Color3
    */
  def toGammaSpaceToRef(convertedColor: Color3): Color3 = js.native
  /**
    * Compute the Color3 hexadecimal code as a string
    * @returns a string containing the hexadecimal representation of the Color3 object
    */
  def toHexString(): java.lang.String = js.native
  /**
    * Computes a new Color3 converted from the current one to linear space
    * @returns a new Color3 object
    */
  def toLinearSpace(): Color3 = js.native
  /**
    * Converts the Color3 values to linear space and stores the result in "convertedColor"
    * @param convertedColor defines the Color3 object where to store the linear space version
    * @returns the unmodified Color3
    */
  def toLinearSpaceToRef(convertedColor: Color3): Color3 = js.native
  /**
    * Returns the luminance value
    * @returns a float value
    */
  def toLuminance(): scala.Double = js.native
}

/**
  * Class used to hold a RBG color
  */
@JSGlobal("BABYLON.Color3")
@js.native
object Color3 extends js.Object {
  /**
    * Returns a Color3 value containing a black color
    * @returns a new Color3 object
    */
  def Black(): babylonjsLib.BABYLONNs.Color3 = js.native
  /**
    * Returns a Color3 value containing a blue color
    * @returns a new Color3 object
    */
  def Blue(): babylonjsLib.BABYLONNs.Color3 = js.native
  /**
    * Creates a new Vector3 from the starting index of the given array
    * @param array defines the source array
    * @param offset defines an offset in the source array
    * @returns a new Color3 object
    */
  def FromArray(array: stdLib.ArrayLike[scala.Double]): babylonjsLib.BABYLONNs.Color3 = js.native
  def FromArray(array: stdLib.ArrayLike[scala.Double], offset: scala.Double): babylonjsLib.BABYLONNs.Color3 = js.native
  /**
    * Creates a new Color3 from the string containing valid hexadecimal values
    * @param hex defines a string containing valid hexadecimal values
    * @returns a new Color3 object
    */
  def FromHexString(hex: java.lang.String): babylonjsLib.BABYLONNs.Color3 = js.native
  /**
    * Creates a new Color3 from integer values (< 256)
    * @param r defines the red component to read from (value between 0 and 255)
    * @param g defines the green component to read from (value between 0 and 255)
    * @param b defines the blue component to read from (value between 0 and 255)
    * @returns a new Color3 object
    */
  def FromInts(r: scala.Double, g: scala.Double, b: scala.Double): babylonjsLib.BABYLONNs.Color3 = js.native
  /**
    * Returns a Color3 value containing a gray color
    * @returns a new Color3 object
    */
  def Gray(): babylonjsLib.BABYLONNs.Color3 = js.native
  /**
    * Returns a Color3 value containing a green color
    * @returns a new Color3 object
    */
  def Green(): babylonjsLib.BABYLONNs.Color3 = js.native
  /**
    * Creates a new Color3 with values linearly interpolated of "amount" between the start Color3 and the end Color3
    * @param start defines the start Color3 value
    * @param end defines the end Color3 value
    * @param amount defines the gradient value between start and end
    * @returns a new Color3 object
    */
  def Lerp(start: babylonjsLib.BABYLONNs.Color3, end: babylonjsLib.BABYLONNs.Color3, amount: scala.Double): babylonjsLib.BABYLONNs.Color3 = js.native
  /**
    * Creates a new Color3 with values linearly interpolated of "amount" between the start Color3 and the end Color3
    * @param left defines the start value
    * @param right defines the end value
    * @param amount defines the gradient factor
    * @param result defines the Color3 object where to store the result
    */
  def LerpToRef(
    left: babylonjsLib.BABYLONNs.Color3,
    right: babylonjsLib.BABYLONNs.Color3,
    amount: scala.Double,
    result: babylonjsLib.BABYLONNs.Color3
  ): scala.Unit = js.native
  /**
    * Returns a Color3 value containing a magenta color
    * @returns a new Color3 object
    */
  def Magenta(): babylonjsLib.BABYLONNs.Color3 = js.native
  /**
    * Returns a Color3 value containing a purple color
    * @returns a new Color3 object
    */
  def Purple(): babylonjsLib.BABYLONNs.Color3 = js.native
  /**
    * Returns a Color3 value containing a random color
    * @returns a new Color3 object
    */
  def Random(): babylonjsLib.BABYLONNs.Color3 = js.native
  /**
    * Returns a Color3 value containing a red color
    * @returns a new Color3 object
    */
  def Red(): babylonjsLib.BABYLONNs.Color3 = js.native
  /**
    * Returns a Color3 value containing a teal color
    * @returns a new Color3 object
    */
  def Teal(): babylonjsLib.BABYLONNs.Color3 = js.native
  /**
    * Returns a Color3 value containing a white color
    * @returns a new Color3 object
    */
  def White(): babylonjsLib.BABYLONNs.Color3 = js.native
  /**
    * Returns a Color3 value containing a yellow color
    * @returns a new Color3 object
    */
  def Yellow(): babylonjsLib.BABYLONNs.Color3 = js.native
}

