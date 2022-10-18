package typings.babylonjs.mod

import typings.babylonjs.typesMod.DeepImmutable
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "Color3")
@js.native
/**
  * Creates a new Color3 object from red, green, blue values, all between 0 and 1
  * @param r defines the red component (between 0 and 1, default is 0)
  * @param g defines the green component (between 0 and 1, default is 0)
  * @param b defines the blue component (between 0 and 1, default is 0)
  */
open class Color3 ()
  extends typings.babylonjs.legacyLegacyMod.Color3 {
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
}
/* static members */
object Color3 {
  
  @JSImport("babylonjs", "Color3")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a Color3 value containing a black color
    * @returns a new Color3 object
    */
  inline def Black(): typings.babylonjs.mathsMathDotcolorMod.Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Black")().asInstanceOf[typings.babylonjs.mathsMathDotcolorMod.Color3]
  
  /**
    * Returns a Color3 value containing a blue color
    * @returns a new Color3 object
    */
  inline def Blue(): typings.babylonjs.mathsMathDotcolorMod.Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Blue")().asInstanceOf[typings.babylonjs.mathsMathDotcolorMod.Color3]
  
  /**
    * Creates a new Color3 from the starting index of the given array
    * @param array defines the source array
    * @param offset defines an offset in the source array
    * @returns a new Color3 object
    */
  inline def FromArray(array: DeepImmutable[ArrayLike[Double]]): typings.babylonjs.mathsMathDotcolorMod.Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathsMathDotcolorMod.Color3]
  inline def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): typings.babylonjs.mathsMathDotcolorMod.Color3 = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotcolorMod.Color3]
  
  /**
    * Creates a new Color3 from the starting index element of the given array
    * @param array defines the source array to read from
    * @param offset defines the offset in the source array
    * @param result defines the target Color3 object
    */
  inline def FromArrayToRef(
    array: DeepImmutable[ArrayLike[Double]],
    offset: Double,
    result: typings.babylonjs.mathsMathDotcolorMod.Color3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArrayToRef")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def FromArrayToRef(
    array: DeepImmutable[ArrayLike[Double]],
    offset: Unit,
    result: typings.babylonjs.mathsMathDotcolorMod.Color3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArrayToRef")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Converts Hue, saturation and value to a new Color3 (RGB)
    * @param hue defines the hue (value between 0 and 360)
    * @param saturation defines the saturation (value between 0 and 1)
    * @param value defines the value (value between 0 and 1)
    * @returns a new Color3 object
    */
  inline def FromHSV(hue: Double, saturation: Double, value: Double): typings.babylonjs.mathsMathDotcolorMod.Color3 = (^.asInstanceOf[js.Dynamic].applyDynamic("FromHSV")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotcolorMod.Color3]
  
  /**
    * Creates a new Color3 from the string containing valid hexadecimal values
    * @param hex defines a string containing valid hexadecimal values
    * @returns a new Color3 object
    */
  inline def FromHexString(hex: String): typings.babylonjs.mathsMathDotcolorMod.Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("FromHexString")(hex.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathsMathDotcolorMod.Color3]
  
  /**
    * Creates a new Color3 from integer values (< 256)
    * @param r defines the red component to read from (value between 0 and 255)
    * @param g defines the green component to read from (value between 0 and 255)
    * @param b defines the blue component to read from (value between 0 and 255)
    * @returns a new Color3 object
    */
  inline def FromInts(r: Double, g: Double, b: Double): typings.babylonjs.mathsMathDotcolorMod.Color3 = (^.asInstanceOf[js.Dynamic].applyDynamic("FromInts")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotcolorMod.Color3]
  
  /**
    * Returns a Color3 value containing a gray color
    * @returns a new Color3 object
    */
  inline def Gray(): typings.babylonjs.mathsMathDotcolorMod.Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Gray")().asInstanceOf[typings.babylonjs.mathsMathDotcolorMod.Color3]
  
  /**
    * Returns a Color3 value containing a green color
    * @returns a new Color3 object
    */
  inline def Green(): typings.babylonjs.mathsMathDotcolorMod.Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Green")().asInstanceOf[typings.babylonjs.mathsMathDotcolorMod.Color3]
  
  /**
    * Converts Hue, saturation and value to a Color3 (RGB)
    * @param hue defines the hue
    * @param saturation defines the saturation
    * @param value defines the value
    * @param result defines the Color3 where to store the RGB values
    */
  inline def HSVtoRGBToRef(
    hue: Double,
    saturation: Double,
    value: Double,
    result: typings.babylonjs.mathsMathDotcolorMod.Color3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HSVtoRGBToRef")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], value.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
    value1: DeepImmutable[typings.babylonjs.mathsMathDotcolorMod.Color3],
    tangent1: DeepImmutable[typings.babylonjs.mathsMathDotcolorMod.Color3],
    value2: DeepImmutable[typings.babylonjs.mathsMathDotcolorMod.Color3],
    tangent2: DeepImmutable[typings.babylonjs.mathsMathDotcolorMod.Color3],
    amount: Double
  ): typings.babylonjs.mathsMathDotcolorMod.Color3 = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotcolorMod.Color3]
  
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
    value1: DeepImmutable[typings.babylonjs.mathsMathDotcolorMod.Color3],
    tangent1: DeepImmutable[typings.babylonjs.mathsMathDotcolorMod.Color3],
    value2: DeepImmutable[typings.babylonjs.mathsMathDotcolorMod.Color3],
    tangent2: DeepImmutable[typings.babylonjs.mathsMathDotcolorMod.Color3],
    time: Double
  ): typings.babylonjs.mathsMathDotcolorMod.Color3 = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite1stDerivative")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotcolorMod.Color3]
  
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
    value1: DeepImmutable[typings.babylonjs.mathsMathDotcolorMod.Color3],
    tangent1: DeepImmutable[typings.babylonjs.mathsMathDotcolorMod.Color3],
    value2: DeepImmutable[typings.babylonjs.mathsMathDotcolorMod.Color3],
    tangent2: DeepImmutable[typings.babylonjs.mathsMathDotcolorMod.Color3],
    time: Double,
    result: typings.babylonjs.mathsMathDotcolorMod.Color3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite1stDerivativeToRef")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], time.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a new Color3 with values linearly interpolated of "amount" between the start Color3 and the end Color3
    * @param start defines the start Color3 value
    * @param end defines the end Color3 value
    * @param amount defines the gradient value between start and end
    * @returns a new Color3 object
    */
  inline def Lerp(
    start: DeepImmutable[typings.babylonjs.mathsMathDotcolorMod.Color3],
    end: DeepImmutable[typings.babylonjs.mathsMathDotcolorMod.Color3],
    amount: Double
  ): typings.babylonjs.mathsMathDotcolorMod.Color3 = (^.asInstanceOf[js.Dynamic].applyDynamic("Lerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotcolorMod.Color3]
  
  /**
    * Creates a new Color3 with values linearly interpolated of "amount" between the start Color3 and the end Color3
    * @param left defines the start value
    * @param right defines the end value
    * @param amount defines the gradient factor
    * @param result defines the Color3 object where to store the result
    */
  inline def LerpToRef(
    left: DeepImmutable[typings.babylonjs.mathsMathDotcolorMod.Color3],
    right: DeepImmutable[typings.babylonjs.mathsMathDotcolorMod.Color3],
    amount: Double,
    result: typings.babylonjs.mathsMathDotcolorMod.Color3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("LerpToRef")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], amount.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns a Color3 value containing a magenta color
    * @returns a new Color3 object
    */
  inline def Magenta(): typings.babylonjs.mathsMathDotcolorMod.Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Magenta")().asInstanceOf[typings.babylonjs.mathsMathDotcolorMod.Color3]
  
  /**
    * Returns a Color3 value containing a purple color
    * @returns a new Color3 object
    */
  inline def Purple(): typings.babylonjs.mathsMathDotcolorMod.Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Purple")().asInstanceOf[typings.babylonjs.mathsMathDotcolorMod.Color3]
  
  /**
    * Returns a Color3 value containing a random color
    * @returns a new Color3 object
    */
  inline def Random(): typings.babylonjs.mathsMathDotcolorMod.Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Random")().asInstanceOf[typings.babylonjs.mathsMathDotcolorMod.Color3]
  
  /**
    * Returns a Color3 value containing a red color
    * @returns a new Color3 object
    */
  inline def Red(): typings.babylonjs.mathsMathDotcolorMod.Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Red")().asInstanceOf[typings.babylonjs.mathsMathDotcolorMod.Color3]
  
  /**
    * Returns a Color3 value containing a teal color
    * @returns a new Color3 object
    */
  inline def Teal(): typings.babylonjs.mathsMathDotcolorMod.Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Teal")().asInstanceOf[typings.babylonjs.mathsMathDotcolorMod.Color3]
  
  /**
    * Returns a Color3 value containing a white color
    * @returns a new Color3 object
    */
  inline def White(): typings.babylonjs.mathsMathDotcolorMod.Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("White")().asInstanceOf[typings.babylonjs.mathsMathDotcolorMod.Color3]
  
  /**
    * Returns a Color3 value containing a yellow color
    * @returns a new Color3 object
    */
  inline def Yellow(): typings.babylonjs.mathsMathDotcolorMod.Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Yellow")().asInstanceOf[typings.babylonjs.mathsMathDotcolorMod.Color3]
  
  @JSImport("babylonjs", "Color3._BlackReadOnly")
  @js.native
  def _BlackReadOnly: Any = js.native
  inline def _BlackReadOnly_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BlackReadOnly")(x.asInstanceOf[js.Any])
}
