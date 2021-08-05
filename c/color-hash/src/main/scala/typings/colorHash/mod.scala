package typings.colorHash

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("color-hash", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with ColorHash {
    def this(options: ColorHashOptions) = this()
    
    /**
      * Returns the hash in hex.
      *
      * @param input string to hash
      * @returns hex with #
      */
    /* CompleteClass */
    override def hex(input: String): String = js.native
    
    /**
      * Returns the hash in [h, s, l].
      * Note that H ∈ [0, 360); S ∈ [0, 1]; L ∈ [0, 1];
      *
      * @param input string to hash
      * @returns [h, s, l]
      */
    /* CompleteClass */
    override def hsl(input: String): ColorValueArray = js.native
    
    /**
      * Returns the hash in [r, g, b].
      * Note that R, G, B ∈ [0, 255]
      *
      * @param input string to hash
      * @returns [r, g, b]
      */
    /* CompleteClass */
    override def rgb(input: String): ColorValueArray = js.native
  }
  
  trait ColorHash extends StObject {
    
    /**
      * Returns the hash in hex.
      *
      * @param input string to hash
      * @returns hex with #
      */
    def hex(input: String): String
    
    /**
      * Returns the hash in [h, s, l].
      * Note that H ∈ [0, 360); S ∈ [0, 1]; L ∈ [0, 1];
      *
      * @param input string to hash
      * @returns [h, s, l]
      */
    def hsl(input: String): ColorValueArray
    
    /**
      * Returns the hash in [r, g, b].
      * Note that R, G, B ∈ [0, 255]
      *
      * @param input string to hash
      * @returns [r, g, b]
      */
    def rgb(input: String): ColorValueArray
  }
  object ColorHash {
    
    inline def apply(hex: String => String, hsl: String => ColorValueArray, rgb: String => ColorValueArray): ColorHash = {
      val __obj = js.Dynamic.literal(hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), rgb = js.Any.fromFunction1(rgb))
      __obj.asInstanceOf[ColorHash]
    }
    
    extension [Self <: ColorHash](x: Self) {
      
      inline def setHex(value: String => String): Self = StObject.set(x, "hex", js.Any.fromFunction1(value))
      
      inline def setHsl(value: String => ColorValueArray): Self = StObject.set(x, "hsl", js.Any.fromFunction1(value))
      
      inline def setRgb(value: String => ColorValueArray): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    }
  }
  
  trait ColorHashOptions extends StObject {
    
    var hash: js.UndefOr[HashFunction] = js.undefined
    
    var hue: js.UndefOr[Hue] = js.undefined
    
    var lightness: js.UndefOr[Lightness] = js.undefined
    
    var saturation: js.UndefOr[Saturation] = js.undefined
  }
  object ColorHashOptions {
    
    inline def apply(): ColorHashOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorHashOptions]
    }
    
    extension [Self <: ColorHashOptions](x: Self) {
      
      inline def setHash(value: /* input */ String => Double): Self = StObject.set(x, "hash", js.Any.fromFunction1(value))
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setHue(value: Hue): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
      
      inline def setHueUndefined: Self = StObject.set(x, "hue", js.undefined)
      
      inline def setHueVarargs(value: HueObject*): Self = StObject.set(x, "hue", js.Array(value :_*))
      
      inline def setLightness(value: Lightness): Self = StObject.set(x, "lightness", value.asInstanceOf[js.Any])
      
      inline def setLightnessUndefined: Self = StObject.set(x, "lightness", js.undefined)
      
      inline def setSaturation(value: Saturation): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
      
      inline def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
    }
  }
  
  type ColorValueArray = js.Tuple3[Double, Double, Double]
  
  type HashFunction = js.Function1[/* input */ String, Double]
  
  type Hue = Double | HueObject | js.Array[HueObject]
  
  trait HueObject extends StObject {
    
    var max: Double
    
    var min: Double
  }
  object HueObject {
    
    inline def apply(max: Double, min: Double): HueObject = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[HueObject]
    }
    
    extension [Self <: HueObject](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  type Lightness = Double | ColorValueArray
  
  type Saturation = Double | ColorValueArray
}
