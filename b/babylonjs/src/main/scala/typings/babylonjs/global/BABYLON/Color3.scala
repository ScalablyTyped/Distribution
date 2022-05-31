package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.DeepImmutable
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Color3")
@js.native
/**
  * Creates a new Color3 object from red, green, blue values, all between 0 and 1
  * @param r defines the red component (between 0 and 1, default is 0)
  * @param g defines the green component (between 0 and 1, default is 0)
  * @param b defines the blue component (between 0 and 1, default is 0)
  */
class Color3 ()
  extends StObject
     with typings.babylonjs.BABYLON.Color3 {
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
  
  @JSGlobal("BABYLON.Color3")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a Color3 value containing a black color
    * @returns a new Color3 object
    */
  inline def Black(): typings.babylonjs.BABYLON.Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Black")().asInstanceOf[typings.babylonjs.BABYLON.Color3]
  
  /**
    * Returns a Color3 value containing a blue color
    * @returns a new Color3 object
    */
  inline def Blue(): typings.babylonjs.BABYLON.Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Blue")().asInstanceOf[typings.babylonjs.BABYLON.Color3]
  
  /**
    * Creates a new Color3 from the starting index of the given array
    * @param array defines the source array
    * @param offset defines an offset in the source array
    * @returns a new Color3 object
    */
  inline def FromArray(array: DeepImmutable[ArrayLike[Double]]): typings.babylonjs.BABYLON.Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Color3]
  inline def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): typings.babylonjs.BABYLON.Color3 = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Color3]
  
  /**
    * Creates a new Color3 from the starting index element of the given array
    * @param array defines the source array to read from
    * @param offset defines the offset in the source array
    * @param result defines the target Color3 object
    */
  inline def FromArrayToRef(array: DeepImmutable[ArrayLike[Double]], offset: Double, result: typings.babylonjs.BABYLON.Color3): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArrayToRef")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def FromArrayToRef(array: DeepImmutable[ArrayLike[Double]], offset: Unit, result: typings.babylonjs.BABYLON.Color3): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArrayToRef")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a new Color3 from the string containing valid hexadecimal values
    * @param hex defines a string containing valid hexadecimal values
    * @returns a new Color3 object
    */
  inline def FromHexString(hex: String): typings.babylonjs.BABYLON.Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("FromHexString")(hex.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Color3]
  
  /**
    * Creates a new Color3 from integer values (< 256)
    * @param r defines the red component to read from (value between 0 and 255)
    * @param g defines the green component to read from (value between 0 and 255)
    * @param b defines the blue component to read from (value between 0 and 255)
    * @returns a new Color3 object
    */
  inline def FromInts(r: Double, g: Double, b: Double): typings.babylonjs.BABYLON.Color3 = (^.asInstanceOf[js.Dynamic].applyDynamic("FromInts")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Color3]
  
  /**
    * Returns a Color3 value containing a gray color
    * @returns a new Color3 object
    */
  inline def Gray(): typings.babylonjs.BABYLON.Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Gray")().asInstanceOf[typings.babylonjs.BABYLON.Color3]
  
  /**
    * Returns a Color3 value containing a green color
    * @returns a new Color3 object
    */
  inline def Green(): typings.babylonjs.BABYLON.Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Green")().asInstanceOf[typings.babylonjs.BABYLON.Color3]
  
  /**
    * Convert Hue, saturation and value to a Color3 (RGB)
    * @param hue defines the hue
    * @param saturation defines the saturation
    * @param value defines the value
    * @param result defines the Color3 where to store the RGB values
    */
  inline def HSVtoRGBToRef(hue: Double, saturation: Double, value: Double, result: typings.babylonjs.BABYLON.Color3): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HSVtoRGBToRef")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], value.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a new Color3 with values linearly interpolated of "amount" between the start Color3 and the end Color3
    * @param start defines the start Color3 value
    * @param end defines the end Color3 value
    * @param amount defines the gradient value between start and end
    * @returns a new Color3 object
    */
  inline def Lerp(
    start: DeepImmutable[typings.babylonjs.BABYLON.Color3],
    end: DeepImmutable[typings.babylonjs.BABYLON.Color3],
    amount: Double
  ): typings.babylonjs.BABYLON.Color3 = (^.asInstanceOf[js.Dynamic].applyDynamic("Lerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Color3]
  
  /**
    * Creates a new Color3 with values linearly interpolated of "amount" between the start Color3 and the end Color3
    * @param left defines the start value
    * @param right defines the end value
    * @param amount defines the gradient factor
    * @param result defines the Color3 object where to store the result
    */
  inline def LerpToRef(
    left: DeepImmutable[typings.babylonjs.BABYLON.Color3],
    right: DeepImmutable[typings.babylonjs.BABYLON.Color3],
    amount: Double,
    result: typings.babylonjs.BABYLON.Color3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("LerpToRef")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], amount.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns a Color3 value containing a magenta color
    * @returns a new Color3 object
    */
  inline def Magenta(): typings.babylonjs.BABYLON.Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Magenta")().asInstanceOf[typings.babylonjs.BABYLON.Color3]
  
  /**
    * Returns a Color3 value containing a purple color
    * @returns a new Color3 object
    */
  inline def Purple(): typings.babylonjs.BABYLON.Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Purple")().asInstanceOf[typings.babylonjs.BABYLON.Color3]
  
  /**
    * Returns a Color3 value containing a random color
    * @returns a new Color3 object
    */
  inline def Random(): typings.babylonjs.BABYLON.Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Random")().asInstanceOf[typings.babylonjs.BABYLON.Color3]
  
  /**
    * Returns a Color3 value containing a red color
    * @returns a new Color3 object
    */
  inline def Red(): typings.babylonjs.BABYLON.Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Red")().asInstanceOf[typings.babylonjs.BABYLON.Color3]
  
  /**
    * Returns a Color3 value containing a teal color
    * @returns a new Color3 object
    */
  inline def Teal(): typings.babylonjs.BABYLON.Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Teal")().asInstanceOf[typings.babylonjs.BABYLON.Color3]
  
  /**
    * Returns a Color3 value containing a white color
    * @returns a new Color3 object
    */
  inline def White(): typings.babylonjs.BABYLON.Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("White")().asInstanceOf[typings.babylonjs.BABYLON.Color3]
  
  /**
    * Returns a Color3 value containing a yellow color
    * @returns a new Color3 object
    */
  inline def Yellow(): typings.babylonjs.BABYLON.Color3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Yellow")().asInstanceOf[typings.babylonjs.BABYLON.Color3]
  
  @JSGlobal("BABYLON.Color3._BlackReadOnly")
  @js.native
  def _BlackReadOnly: js.Any = js.native
  inline def _BlackReadOnly_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BlackReadOnly")(x.asInstanceOf[js.Any])
}
