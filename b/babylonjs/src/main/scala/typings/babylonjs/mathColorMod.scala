package typings.babylonjs

import typings.babylonjs.typesMod.DeepImmutable
import typings.babylonjs.typesMod.FloatArray
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathColorMod {
  
  @JSImport("babylonjs/Maths/math.color", "Color3")
  @js.native
  /**
    * Creates a new Color3 object from red, green, blue values, all between 0 and 1
    * @param r defines the red component (between 0 and 1, default is 0)
    * @param g defines the green component (between 0 and 1, default is 0)
    * @param b defines the blue component (between 0 and 1, default is 0)
    */
  open class Color3 () extends StObject {
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
    r: Unit,
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
    g: Unit,
      /**
      * Defines the blue component (between 0 and 1, default is 0)
      */
    b: Double
    ) = this()
    def this(
      /**
      * Defines the red component (between 0 and 1, default is 0)
      */
    r: Unit,
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
    r: Unit,
      /**
      * Defines the green component (between 0 and 1, default is 0)
      */
    g: Unit,
      /**
      * Defines the blue component (between 0 and 1, default is 0)
      */
    b: Double
    ) = this()
    
    /**
      * Creates a new Color3 set with the added values of the current Color3 and of the given one
      * @param otherColor defines the second operand
      * @returns the new Color3
      */
    def add(otherColor: DeepImmutable[Color3]): Color3 = js.native
    
    /**
      * Stores the result of the addition of the current Color3 and given one rgb values into "result"
      * @param otherColor defines the second operand
      * @param result defines Color3 object to store the result into
      * @returns the unmodified current Color3
      */
    def addToRef(otherColor: DeepImmutable[Color3], result: Color3): Color3 = js.native
    
    /**
      * Returns a new array populated with 3 numeric elements : red, green and blue values
      * @returns the new array
      */
    def asArray(): js.Array[Double] = js.native
    
    /**
      * Defines the blue component (between 0 and 1, default is 0)
      */
    var b: Double = js.native
    
    /**
      * Clamps the rgb values by the min and max values and stores the result into "result"
      * @param min defines minimum clamping value (default is 0)
      * @param max defines maximum clamping value (default is 1)
      * @param result defines color to store the result into
      * @returns the original Color3
      */
    def clampToRef(min: Double, max: Double, result: Color3): Color3 = js.native
    def clampToRef(min: Double, max: Unit, result: Color3): Color3 = js.native
    def clampToRef(min: Unit, max: Double, result: Color3): Color3 = js.native
    def clampToRef(min: Unit, max: Unit, result: Color3): Color3 = js.native
    
    /**
      * Copies the rgb values from the source in the current Color3
      * @param source defines the source Color3 object
      * @returns the updated Color3 object
      */
    def copyFrom(source: DeepImmutable[Color3]): Color3 = js.native
    
    /**
      * Updates the Color3 rgb values from the given floats
      * @param r defines the red component to read from
      * @param g defines the green component to read from
      * @param b defines the blue component to read from
      * @returns the current Color3 object
      */
    def copyFromFloats(r: Double, g: Double, b: Double): Color3 = js.native
    
    /**
      * Determines equality between Color3 objects
      * @param otherColor defines the second operand
      * @returns true if the rgb values are equal to the given ones
      */
    def equals(otherColor: DeepImmutable[Color3]): Boolean = js.native
    
    /**
      * Determines equality between the current Color3 object and a set of r,b,g values
      * @param r defines the red component to check
      * @param g defines the green component to check
      * @param b defines the blue component to check
      * @returns true if the rgb values are equal to the given ones
      */
    def equalsFloats(r: Double, g: Double, b: Double): Boolean = js.native
    
    /**
      * Update the current color with values stored in an array from the starting index of the given array
      * @param array defines the source array
      * @param offset defines an offset in the source array
      * @returns the current Color3 object
      */
    def fromArray(array: DeepImmutable[ArrayLike[Double]]): Color3 = js.native
    def fromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): Color3 = js.native
    
    /**
      * Defines the green component (between 0 and 1, default is 0)
      */
    var g: Double = js.native
    
    /**
      * Returns the string "Color3"
      * @returns "Color3"
      */
    def getClassName(): String = js.native
    
    /**
      * Compute the Color3 hash code
      * @returns an unique number that can be used to hash Color3 objects
      */
    def getHashCode(): Double = js.native
    
    /**
      * Multiply each Color3 rgb values by the given Color3 rgb values in a new Color3 object
      * @param otherColor defines the second operand
      * @returns the new Color3 object
      */
    def multiply(otherColor: DeepImmutable[Color3]): Color3 = js.native
    
    /**
      * Multiply the rgb values of the Color3 and the given Color3 and stores the result in the object "result"
      * @param otherColor defines the second operand
      * @param result defines the Color3 object where to store the result
      * @returns the current Color3
      */
    def multiplyToRef(otherColor: DeepImmutable[Color3], result: Color3): Color3 = js.native
    
    /**
      * Defines the red component (between 0 and 1, default is 0)
      */
    var r: Double = js.native
    
    /**
      * Creates a new Color3 with the current Color3 values multiplied by scale
      * @param scale defines the scaling factor to apply
      * @returns a new Color3 object
      */
    def scale(scale: Double): Color3 = js.native
    
    /**
      * Scale the current Color3 values by a factor and add the result to a given Color3
      * @param scale defines the scale factor
      * @param result defines color to store the result into
      * @returns the unmodified current Color3
      */
    def scaleAndAddToRef(scale: Double, result: Color3): Color3 = js.native
    
    /**
      * Multiplies the Color3 values by the float "scale"
      * @param scale defines the scaling factor to apply
      * @returns the current updated Color3
      */
    def scaleInPlace(scale: Double): Color3 = js.native
    
    /**
      * Multiplies the rgb values by scale and stores the result into "result"
      * @param scale defines the scaling factor
      * @param result defines the Color3 object where to store the result
      * @returns the unmodified current Color3
      */
    def scaleToRef(scale: Double, result: Color3): Color3 = js.native
    
    /**
      * Updates the Color3 rgb values from the given floats
      * @param r defines the red component to read from
      * @param g defines the green component to read from
      * @param b defines the blue component to read from
      * @returns the current Color3 object
      */
    def set(r: Double, g: Double, b: Double): Color3 = js.native
    
    /**
      * Returns a new Color3 set with the subtracted values of the given one from the current Color3
      * @param otherColor defines the second operand
      * @returns the new Color3
      */
    def subtract(otherColor: DeepImmutable[Color3]): Color3 = js.native
    
    /**
      * Stores the result of the subtraction of given one from the current Color3 rgb values into "result"
      * @param otherColor defines the second operand
      * @param result defines Color3 object to store the result into
      * @returns the unmodified current Color3
      */
    def subtractToRef(otherColor: DeepImmutable[Color3], result: Color3): Color3 = js.native
    
    /**
      * Stores in the given array from the given starting index the red, green, blue values as successive elements
      * @param array defines the array where to store the r,g,b components
      * @param index defines an optional index in the target array to define where to start storing values
      * @returns the current Color3 object
      */
    def toArray(array: FloatArray): Color3 = js.native
    def toArray(array: FloatArray, index: Double): Color3 = js.native
    
    /**
      * Returns a new Color4 object from the current Color3 and the given alpha
      * @param alpha defines the alpha component on the new Color4 object (default is 1)
      * @returns a new Color4 object
      */
    def toColor4(): Color4 = js.native
    def toColor4(alpha: Double): Color4 = js.native
    
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
      * Converts current color in rgb space to HSV values
      * @returns a new color3 representing the HSV values
      */
    def toHSV(): Color3 = js.native
    
    /**
      * Converts current color in rgb space to HSV values
      * @param result defines the Color3 where to store the HSV values
      */
    def toHSVToRef(result: Color3): Unit = js.native
    
    /**
      * Compute the Color3 hexadecimal code as a string
      * @returns a string containing the hexadecimal representation of the Color3 object
      */
    def toHexString(): String = js.native
    
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
    def toLuminance(): Double = js.native
  }
  /* static members */
  object Color3 {
    
    @JSImport("babylonjs/Maths/math.color", "Color3")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a Color3 value containing a black color
      * @returns a new Color3 object
      */
    inline def Black(): Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Black")().asInstanceOf[Color3]
    
    /**
      * Returns a Color3 value containing a blue color
      * @returns a new Color3 object
      */
    inline def Blue(): Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Blue")().asInstanceOf[Color3]
    
    /**
      * Creates a new Color3 from the starting index of the given array
      * @param array defines the source array
      * @param offset defines an offset in the source array
      * @returns a new Color3 object
      */
    inline def FromArray(array: DeepImmutable[ArrayLike[Double]]): Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Color3]
    inline def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): Color3 = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Color3]
    
    /**
      * Creates a new Color3 from the starting index element of the given array
      * @param array defines the source array to read from
      * @param offset defines the offset in the source array
      * @param result defines the target Color3 object
      */
    inline def FromArrayToRef(array: DeepImmutable[ArrayLike[Double]], offset: Double, result: Color3): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArrayToRef")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def FromArrayToRef(array: DeepImmutable[ArrayLike[Double]], offset: Unit, result: Color3): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArrayToRef")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Converts Hue, saturation and value to a new Color3 (RGB)
      * @param hue defines the hue (value between 0 and 360)
      * @param saturation defines the saturation (value between 0 and 1)
      * @param value defines the value (value between 0 and 1)
      * @returns a new Color3 object
      */
    inline def FromHSV(hue: Double, saturation: Double, value: Double): Color3 = (^.asInstanceOf[js.Dynamic].applyDynamic("FromHSV")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Color3]
    
    /**
      * Creates a new Color3 from the string containing valid hexadecimal values
      * @param hex defines a string containing valid hexadecimal values
      * @returns a new Color3 object
      */
    inline def FromHexString(hex: String): Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("FromHexString")(hex.asInstanceOf[js.Any]).asInstanceOf[Color3]
    
    /**
      * Creates a new Color3 from integer values (< 256)
      * @param r defines the red component to read from (value between 0 and 255)
      * @param g defines the green component to read from (value between 0 and 255)
      * @param b defines the blue component to read from (value between 0 and 255)
      * @returns a new Color3 object
      */
    inline def FromInts(r: Double, g: Double, b: Double): Color3 = (^.asInstanceOf[js.Dynamic].applyDynamic("FromInts")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Color3]
    
    /**
      * Returns a Color3 value containing a gray color
      * @returns a new Color3 object
      */
    inline def Gray(): Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Gray")().asInstanceOf[Color3]
    
    /**
      * Returns a Color3 value containing a green color
      * @returns a new Color3 object
      */
    inline def Green(): Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Green")().asInstanceOf[Color3]
    
    /**
      * Converts Hue, saturation and value to a Color3 (RGB)
      * @param hue defines the hue
      * @param saturation defines the saturation
      * @param value defines the value
      * @param result defines the Color3 where to store the RGB values
      */
    inline def HSVtoRGBToRef(hue: Double, saturation: Double, value: Double, result: Color3): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HSVtoRGBToRef")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], value.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Returns a new Color3 located for "amount" (float) on the Hermite interpolation spline defined by the vectors "value1", "tangent1", "value2", "tangent2"
      * @param value1 defines the first control point
      * @param tangent1 defines the first tangent Color3
      * @param value2 defines the second control point
      * @param tangent2 defines the second tangent Color3
      * @param amount defines the amount on the interpolation spline (between 0 and 1)
      * @returns the new Color3
      */
    inline def Hermite(
      value1: DeepImmutable[Color3],
      tangent1: DeepImmutable[Color3],
      value2: DeepImmutable[Color3],
      tangent2: DeepImmutable[Color3],
      amount: Double
    ): Color3 = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Color3]
    
    /**
      * Returns a new Color3 which is the 1st derivative of the Hermite spline defined by the colors "value1", "value2", "tangent1", "tangent2".
      * @param value1 defines the first control point
      * @param tangent1 defines the first tangent
      * @param value2 defines the second control point
      * @param tangent2 defines the second tangent
      * @param time define where the derivative must be done
      * @returns 1st derivative
      */
    inline def Hermite1stDerivative(
      value1: DeepImmutable[Color3],
      tangent1: DeepImmutable[Color3],
      value2: DeepImmutable[Color3],
      tangent2: DeepImmutable[Color3],
      time: Double
    ): Color3 = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite1stDerivative")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Color3]
    
    /**
      * Returns a new Color3 which is the 1st derivative of the Hermite spline defined by the colors "value1", "value2", "tangent1", "tangent2".
      * @param value1 defines the first control point
      * @param tangent1 defines the first tangent
      * @param value2 defines the second control point
      * @param tangent2 defines the second tangent
      * @param time define where the derivative must be done
      * @param result define where to store the derivative
      */
    inline def Hermite1stDerivativeToRef(
      value1: DeepImmutable[Color3],
      tangent1: DeepImmutable[Color3],
      value2: DeepImmutable[Color3],
      tangent2: DeepImmutable[Color3],
      time: Double,
      result: Color3
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite1stDerivativeToRef")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], time.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Creates a new Color3 with values linearly interpolated of "amount" between the start Color3 and the end Color3
      * @param start defines the start Color3 value
      * @param end defines the end Color3 value
      * @param amount defines the gradient value between start and end
      * @returns a new Color3 object
      */
    inline def Lerp(start: DeepImmutable[Color3], end: DeepImmutable[Color3], amount: Double): Color3 = (^.asInstanceOf[js.Dynamic].applyDynamic("Lerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Color3]
    
    /**
      * Creates a new Color3 with values linearly interpolated of "amount" between the start Color3 and the end Color3
      * @param left defines the start value
      * @param right defines the end value
      * @param amount defines the gradient factor
      * @param result defines the Color3 object where to store the result
      */
    inline def LerpToRef(left: DeepImmutable[Color3], right: DeepImmutable[Color3], amount: Double, result: Color3): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("LerpToRef")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], amount.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Returns a Color3 value containing a magenta color
      * @returns a new Color3 object
      */
    inline def Magenta(): Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Magenta")().asInstanceOf[Color3]
    
    /**
      * Returns a Color3 value containing a purple color
      * @returns a new Color3 object
      */
    inline def Purple(): Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Purple")().asInstanceOf[Color3]
    
    /**
      * Returns a Color3 value containing a random color
      * @returns a new Color3 object
      */
    inline def Random(): Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Random")().asInstanceOf[Color3]
    
    /**
      * Returns a Color3 value containing a red color
      * @returns a new Color3 object
      */
    inline def Red(): Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Red")().asInstanceOf[Color3]
    
    /**
      * Returns a Color3 value containing a teal color
      * @returns a new Color3 object
      */
    inline def Teal(): Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Teal")().asInstanceOf[Color3]
    
    /**
      * Returns a Color3 value containing a white color
      * @returns a new Color3 object
      */
    inline def White(): Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("White")().asInstanceOf[Color3]
    
    /**
      * Returns a Color3 value containing a yellow color
      * @returns a new Color3 object
      */
    inline def Yellow(): Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Yellow")().asInstanceOf[Color3]
    
    @JSImport("babylonjs/Maths/math.color", "Color3._BlackReadOnly")
    @js.native
    def _BlackReadOnly: Any = js.native
    inline def _BlackReadOnly_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BlackReadOnly")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Maths/math.color", "Color4")
  @js.native
  /**
    * Creates a new Color4 object from red, green, blue values, all between 0 and 1
    * @param r defines the red component (between 0 and 1, default is 0)
    * @param g defines the green component (between 0 and 1, default is 0)
    * @param b defines the blue component (between 0 and 1, default is 0)
    * @param a defines the alpha component (between 0 and 1, default is 1)
    */
  open class Color4 () extends StObject {
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
    r: Unit,
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
    g: Unit,
      /**
      * Defines the blue component (between 0 and 1, default is 0)
      */
    b: Double
    ) = this()
    def this(
      /**
      * Defines the red component (between 0 and 1, default is 0)
      */
    r: Unit,
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
    r: Unit,
      /**
      * Defines the green component (between 0 and 1, default is 0)
      */
    g: Unit,
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
    b: Unit,
      /**
      * Defines the alpha component (between 0 and 1, default is 1)
      */
    a: Double
    ) = this()
    def this(
      /**
      * Defines the red component (between 0 and 1, default is 0)
      */
    r: Double,
      /**
      * Defines the green component (between 0 and 1, default is 0)
      */
    g: Unit,
      /**
      * Defines the blue component (between 0 and 1, default is 0)
      */
    b: Double,
      /**
      * Defines the alpha component (between 0 and 1, default is 1)
      */
    a: Double
    ) = this()
    def this(
      /**
      * Defines the red component (between 0 and 1, default is 0)
      */
    r: Double,
      /**
      * Defines the green component (between 0 and 1, default is 0)
      */
    g: Unit,
      /**
      * Defines the blue component (between 0 and 1, default is 0)
      */
    b: Unit,
      /**
      * Defines the alpha component (between 0 and 1, default is 1)
      */
    a: Double
    ) = this()
    def this(
      /**
      * Defines the red component (between 0 and 1, default is 0)
      */
    r: Unit,
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
    def this(
      /**
      * Defines the red component (between 0 and 1, default is 0)
      */
    r: Unit,
      /**
      * Defines the green component (between 0 and 1, default is 0)
      */
    g: Double,
      /**
      * Defines the blue component (between 0 and 1, default is 0)
      */
    b: Unit,
      /**
      * Defines the alpha component (between 0 and 1, default is 1)
      */
    a: Double
    ) = this()
    def this(
      /**
      * Defines the red component (between 0 and 1, default is 0)
      */
    r: Unit,
      /**
      * Defines the green component (between 0 and 1, default is 0)
      */
    g: Unit,
      /**
      * Defines the blue component (between 0 and 1, default is 0)
      */
    b: Double,
      /**
      * Defines the alpha component (between 0 and 1, default is 1)
      */
    a: Double
    ) = this()
    def this(
      /**
      * Defines the red component (between 0 and 1, default is 0)
      */
    r: Unit,
      /**
      * Defines the green component (between 0 and 1, default is 0)
      */
    g: Unit,
      /**
      * Defines the blue component (between 0 and 1, default is 0)
      */
    b: Unit,
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
    
    /**
      * Defines the blue component (between 0 and 1, default is 0)
      */
    var b: Double = js.native
    
    /**
      * Clamps the rgb values by the min and max values and stores the result into "result"
      * @param min defines minimum clamping value (default is 0)
      * @param max defines maximum clamping value (default is 1)
      * @param result defines color to store the result into.
      * @returns the current Color4
      */
    def clampToRef(min: Double, max: Double, result: Color4): Color4 = js.native
    def clampToRef(min: Double, max: Unit, result: Color4): Color4 = js.native
    def clampToRef(min: Unit, max: Double, result: Color4): Color4 = js.native
    def clampToRef(min: Unit, max: Unit, result: Color4): Color4 = js.native
    
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
      * Update the current color with values stored in an array from the starting index of the given array
      * @param array defines the source array
      * @param offset defines an offset in the source array
      * @returns the current Color4 object
      */
    def fromArray(array: DeepImmutable[ArrayLike[Double]]): Color4 = js.native
    def fromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): Color4 = js.native
    
    /**
      * Defines the green component (between 0 and 1, default is 0)
      */
    var g: Double = js.native
    
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
      * Multiply an Color4 value by another and return a new Color4 object
      * @param color defines the Color4 value to multiply by
      * @returns a new Color4 object
      */
    def multiply(color: Color4): Color4 = js.native
    
    /**
      * Multiply a Color4 value by another and push the result in a reference value
      * @param color defines the Color4 value to multiply by
      * @param result defines the Color4 to fill the result in
      * @returns the result Color4
      */
    def multiplyToRef(color: Color4, result: Color4): Color4 = js.native
    
    /**
      * Defines the red component (between 0 and 1, default is 0)
      */
    var r: Double = js.native
    
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
      * Multiplies the Color4 values by the float "scale"
      * @param scale defines the scaling factor to apply
      * @returns the current updated Color4
      */
    def scaleInPlace(scale: Double): Color4 = js.native
    
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
    def toArray(array: FloatArray): Color4 = js.native
    def toArray(array: FloatArray, index: Double): Color4 = js.native
    
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
      * @param returnAsColor3 defines if the string should only contains RGB values (off by default)
      * @returns a string containing the hexadecimal representation of the Color4 object
      */
    def toHexString(): String = js.native
    def toHexString(returnAsColor3: Boolean): String = js.native
    
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
  object Color4 {
    
    @JSImport("babylonjs/Maths/math.color", "Color4")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Check the content of a given array and convert it to an array containing RGBA data
      * If the original array was already containing count * 4 values then it is returned directly
      * @param colors defines the array to check
      * @param count defines the number of RGBA data to expect
      * @returns an array containing count * 4 values (RGBA)
      */
    inline def CheckColors4(colors: js.Array[Double], count: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("CheckColors4")(colors.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * Creates a new Color4 from the starting index element of the given array
      * @param array defines the source array to read from
      * @param offset defines the offset in the source array
      * @returns a new Color4 object
      */
    inline def FromArray(array: DeepImmutable[ArrayLike[Double]]): Color4 = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Color4]
    inline def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): Color4 = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Color4]
    
    /**
      * Creates a new Color4 from the starting index element of the given array
      * @param array defines the source array to read from
      * @param offset defines the offset in the source array
      * @param result defines the target Color4 object
      */
    inline def FromArrayToRef(array: DeepImmutable[ArrayLike[Double]], offset: Double, result: Color4): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArrayToRef")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def FromArrayToRef(array: DeepImmutable[ArrayLike[Double]], offset: Unit, result: Color4): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArrayToRef")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Creates a new Color4 from a Color3 and an alpha value
      * @param color3 defines the source Color3 to read from
      * @param alpha defines the alpha component (1.0 by default)
      * @returns a new Color4 object
      */
    inline def FromColor3(color3: DeepImmutable[Color3]): Color4 = ^.asInstanceOf[js.Dynamic].applyDynamic("FromColor3")(color3.asInstanceOf[js.Any]).asInstanceOf[Color4]
    inline def FromColor3(color3: DeepImmutable[Color3], alpha: Double): Color4 = (^.asInstanceOf[js.Dynamic].applyDynamic("FromColor3")(color3.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color4]
    
    /**
      * Creates a new Color4 from the string containing valid hexadecimal values.
      *
      * A valid hex string is either in the format #RRGGBB or #RRGGBBAA.
      *
      * When a hex string without alpha is passed, the resulting Color4 has
      * its alpha value set to 1.0.
      *
      * An invalid string results in a Color with all its channels set to 0.0,
      * i.e. "transparent black".
      *
      * @param hex defines a string containing valid hexadecimal values
      * @returns a new Color4 object
      */
    inline def FromHexString(hex: String): Color4 = ^.asInstanceOf[js.Dynamic].applyDynamic("FromHexString")(hex.asInstanceOf[js.Any]).asInstanceOf[Color4]
    
    /**
      * Creates a new Color3 from integer values (< 256)
      * @param r defines the red component to read from (value between 0 and 255)
      * @param g defines the green component to read from (value between 0 and 255)
      * @param b defines the blue component to read from (value between 0 and 255)
      * @param a defines the alpha component to read from (value between 0 and 255)
      * @returns a new Color3 object
      */
    inline def FromInts(r: Double, g: Double, b: Double, a: Double): Color4 = (^.asInstanceOf[js.Dynamic].applyDynamic("FromInts")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Color4]
    
    /**
      * Interpolate between two Color4 using Hermite interpolation
      * @param value1 defines first Color4
      * @param tangent1 defines the incoming tangent
      * @param value2 defines second Color4
      * @param tangent2 defines the outgoing tangent
      * @param amount defines the target Color4
      * @returns the new interpolated Color4
      */
    inline def Hermite(
      value1: DeepImmutable[Color4],
      tangent1: DeepImmutable[Color4],
      value2: DeepImmutable[Color4],
      tangent2: DeepImmutable[Color4],
      amount: Double
    ): Color4 = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Color4]
    
    /**
      * Returns a new Color4 which is the 1st derivative of the Hermite spline defined by the colors "value1", "value2", "tangent1", "tangent2".
      * @param value1 defines the first control point
      * @param tangent1 defines the first tangent
      * @param value2 defines the second control point
      * @param tangent2 defines the second tangent
      * @param time define where the derivative must be done
      * @returns 1st derivative
      */
    inline def Hermite1stDerivative(
      value1: DeepImmutable[Color4],
      tangent1: DeepImmutable[Color4],
      value2: DeepImmutable[Color4],
      tangent2: DeepImmutable[Color4],
      time: Double
    ): Color4 = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite1stDerivative")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Color4]
    
    /**
      * Update a Color4 with the 1st derivative of the Hermite spline defined by the colors "value1", "value2", "tangent1", "tangent2".
      * @param value1 defines the first control point
      * @param tangent1 defines the first tangent
      * @param value2 defines the second control point
      * @param tangent2 defines the second tangent
      * @param time define where the derivative must be done
      * @param result define where to store the derivative
      */
    inline def Hermite1stDerivativeToRef(
      value1: DeepImmutable[Color4],
      tangent1: DeepImmutable[Color4],
      value2: DeepImmutable[Color4],
      tangent2: DeepImmutable[Color4],
      time: Double,
      result: Color4
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite1stDerivativeToRef")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], time.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Creates a new Color4 object set with the linearly interpolated values of "amount" between the left Color4 object and the right Color4 object
      * @param left defines the start value
      * @param right defines the end value
      * @param amount defines the gradient factor
      * @returns a new Color4 object
      */
    inline def Lerp(left: DeepImmutable[Color4], right: DeepImmutable[Color4], amount: Double): Color4 = (^.asInstanceOf[js.Dynamic].applyDynamic("Lerp")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Color4]
    
    /**
      * Set the given "result" with the linearly interpolated values of "amount" between the left Color4 object and the right Color4 object
      * @param left defines the start value
      * @param right defines the end value
      * @param amount defines the gradient factor
      * @param result defines the Color4 object where to store data
      */
    inline def LerpToRef(left: DeepImmutable[Color4], right: DeepImmutable[Color4], amount: Double, result: Color4): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("LerpToRef")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], amount.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("babylonjs/Maths/math.color", "TmpColors")
  @js.native
  open class TmpColors () extends StObject
  /* static members */
  object TmpColors {
    
    @JSImport("babylonjs/Maths/math.color", "TmpColors")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Maths/math.color", "TmpColors.Color3")
    @js.native
    def Color3: js.Array[typings.babylonjs.mathColorMod.Color3] = js.native
    inline def Color3_=(x: js.Array[Color3]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Color3")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Maths/math.color", "TmpColors.Color4")
    @js.native
    def Color4: js.Array[typings.babylonjs.mathColorMod.Color4] = js.native
    inline def Color4_=(x: js.Array[Color4]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Color4")(x.asInstanceOf[js.Any])
  }
}
