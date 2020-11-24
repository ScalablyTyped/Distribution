package typings.babylonjs.mathsIndexMod

import typings.babylonjs.typesMod.DeepImmutable
import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Maths/index", "Color3")
@js.native
/**
  * Creates a new Color3 object from red, green, blue values, all between 0 and 1
  * @param r defines the red component (between 0 and 1, default is 0)
  * @param g defines the green component (between 0 and 1, default is 0)
  * @param b defines the blue component (between 0 and 1, default is 0)
  */
class Color3 ()
  extends typings.babylonjs.mathMod.Color3 {
  def this(/**
    * Defines the red component (between 0 and 1, default is 0)
    */
  r: Double) = this()
  def this(
    /**
    * Defines the red component (between 0 and 1, default is 0)
    */
  r: js.UndefOr[scala.Nothing],
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
  g: Double
  ) = this()
  def this(
    /**
    * Defines the red component (between 0 and 1, default is 0)
    */
  r: js.UndefOr[scala.Nothing],
    /**
    * Defines the green component (between 0 and 1, default is 0)
    */
  g: js.UndefOr[scala.Nothing],
    /**
    * Defines the blue component (between 0 and 1, default is 0)
    */
  b: Double
  ) = this()
  def this(
    /**
    * Defines the red component (between 0 and 1, default is 0)
    */
  r: js.UndefOr[scala.Nothing],
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
  g: js.UndefOr[scala.Nothing],
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
  b: Double
  ) = this()
}
/* static members */
@JSImport("babylonjs/Maths/index", "Color3")
@js.native
object Color3 extends js.Object {
  
  /**
    * Returns a Color3 value containing a black color
    * @returns a new Color3 object
    */
  def Black(): typings.babylonjs.mathColorMod.Color3 = js.native
  
  /**
    * Gets a Color3 value containing a black color that must not be updated
    */
  def BlackReadOnly: DeepImmutable[typings.babylonjs.mathColorMod.Color3] = js.native
  
  /**
    * Returns a Color3 value containing a blue color
    * @returns a new Color3 object
    */
  def Blue(): typings.babylonjs.mathColorMod.Color3 = js.native
  
  /**
    * Creates a new Color3 from the starting index of the given array
    * @param array defines the source array
    * @param offset defines an offset in the source array
    * @returns a new Color3 object
    */
  def FromArray(array: DeepImmutable[ArrayLike[Double]]): typings.babylonjs.mathColorMod.Color3 = js.native
  def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): typings.babylonjs.mathColorMod.Color3 = js.native
  
  def FromArrayToRef(
    array: DeepImmutable[ArrayLike[Double]],
    offset: js.UndefOr[scala.Nothing],
    result: typings.babylonjs.mathColorMod.Color3
  ): Unit = js.native
  /**
    * Creates a new Color3 from the starting index element of the given array
    * @param array defines the source array to read from
    * @param offset defines the offset in the source array
    * @param result defines the target Color3 object
    */
  def FromArrayToRef(
    array: DeepImmutable[ArrayLike[Double]],
    offset: Double,
    result: typings.babylonjs.mathColorMod.Color3
  ): Unit = js.native
  
  /**
    * Creates a new Color3 from the string containing valid hexadecimal values
    * @param hex defines a string containing valid hexadecimal values
    * @returns a new Color3 object
    */
  def FromHexString(hex: String): typings.babylonjs.mathColorMod.Color3 = js.native
  
  /**
    * Creates a new Color3 from integer values (< 256)
    * @param r defines the red component to read from (value between 0 and 255)
    * @param g defines the green component to read from (value between 0 and 255)
    * @param b defines the blue component to read from (value between 0 and 255)
    * @returns a new Color3 object
    */
  def FromInts(r: Double, g: Double, b: Double): typings.babylonjs.mathColorMod.Color3 = js.native
  
  /**
    * Returns a Color3 value containing a gray color
    * @returns a new Color3 object
    */
  def Gray(): typings.babylonjs.mathColorMod.Color3 = js.native
  
  /**
    * Returns a Color3 value containing a green color
    * @returns a new Color3 object
    */
  def Green(): typings.babylonjs.mathColorMod.Color3 = js.native
  
  /**
    * Convert Hue, saturation and value to a Color3 (RGB)
    * @param hue defines the hue
    * @param saturation defines the saturation
    * @param value defines the value
    * @param result defines the Color3 where to store the RGB values
    */
  def HSVtoRGBToRef(hue: Double, saturation: Double, value: Double, result: typings.babylonjs.mathColorMod.Color3): Unit = js.native
  
  /**
    * Creates a new Color3 with values linearly interpolated of "amount" between the start Color3 and the end Color3
    * @param start defines the start Color3 value
    * @param end defines the end Color3 value
    * @param amount defines the gradient value between start and end
    * @returns a new Color3 object
    */
  def Lerp(
    start: DeepImmutable[typings.babylonjs.mathColorMod.Color3],
    end: DeepImmutable[typings.babylonjs.mathColorMod.Color3],
    amount: Double
  ): typings.babylonjs.mathColorMod.Color3 = js.native
  
  /**
    * Creates a new Color3 with values linearly interpolated of "amount" between the start Color3 and the end Color3
    * @param left defines the start value
    * @param right defines the end value
    * @param amount defines the gradient factor
    * @param result defines the Color3 object where to store the result
    */
  def LerpToRef(
    left: DeepImmutable[typings.babylonjs.mathColorMod.Color3],
    right: DeepImmutable[typings.babylonjs.mathColorMod.Color3],
    amount: Double,
    result: typings.babylonjs.mathColorMod.Color3
  ): Unit = js.native
  
  /**
    * Returns a Color3 value containing a magenta color
    * @returns a new Color3 object
    */
  def Magenta(): typings.babylonjs.mathColorMod.Color3 = js.native
  
  /**
    * Returns a Color3 value containing a purple color
    * @returns a new Color3 object
    */
  def Purple(): typings.babylonjs.mathColorMod.Color3 = js.native
  
  /**
    * Returns a Color3 value containing a random color
    * @returns a new Color3 object
    */
  def Random(): typings.babylonjs.mathColorMod.Color3 = js.native
  
  /**
    * Returns a Color3 value containing a red color
    * @returns a new Color3 object
    */
  def Red(): typings.babylonjs.mathColorMod.Color3 = js.native
  
  /**
    * Returns a Color3 value containing a teal color
    * @returns a new Color3 object
    */
  def Teal(): typings.babylonjs.mathColorMod.Color3 = js.native
  
  /**
    * Returns a Color3 value containing a white color
    * @returns a new Color3 object
    */
  def White(): typings.babylonjs.mathColorMod.Color3 = js.native
  
  /**
    * Returns a Color3 value containing a yellow color
    * @returns a new Color3 object
    */
  def Yellow(): typings.babylonjs.mathColorMod.Color3 = js.native
  
  var _BlackReadOnly: js.Any = js.native
}
