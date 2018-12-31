package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to hold a RBG color
  */
@JSImport("babylonjs", "Color3")
@js.native
/**
  * Creates a new Color3 object from red, green, blue values, all between 0 and 1
  * @param r defines the red component (between 0 and 1, default is 0)
  * @param g defines the green component (between 0 and 1, default is 0)
  * @param b defines the blue component (between 0 and 1, default is 0)
  */
class Color3 ()
  extends babylonjsLib.BABYLONNs.Color3 {
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
}

/**
  * Class used to hold a RBG color
  */
@JSImport("babylonjs", "Color3")
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

