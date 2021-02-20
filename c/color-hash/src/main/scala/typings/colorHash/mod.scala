package typings.colorHash

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("color-hash", JSImport.Namespace)
  @js.native
  class ^ () extends ColorHash {
    def this(options: ColorHashOptions) = this()
  }
  
  @js.native
  trait ColorHash extends StObject {
    
    /**
      * Returns the hash in hex.
      *
      * @param input string to hash
      * @returns hex with #
      */
    def hex(input: String): String = js.native
    
    /**
      * Returns the hash in [h, s, l].
      * Note that H ∈ [0, 360); S ∈ [0, 1]; L ∈ [0, 1];
      *
      * @param input string to hash
      * @returns [h, s, l]
      */
    def hsl(input: String): ColorValueArray = js.native
    
    /**
      * Returns the hash in [r, g, b].
      * Note that R, G, B ∈ [0, 255]
      *
      * @param input string to hash
      * @returns [r, g, b]
      */
    def rgb(input: String): ColorValueArray = js.native
  }
  object ColorHash {
    
    @scala.inline
    def apply(hex: String => String, hsl: String => ColorValueArray, rgb: String => ColorValueArray): ColorHash = {
      val __obj = js.Dynamic.literal(hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), rgb = js.Any.fromFunction1(rgb))
      __obj.asInstanceOf[ColorHash]
    }
    
    @scala.inline
    implicit class ColorHashMutableBuilder[Self <: ColorHash] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHex(value: String => String): Self = StObject.set(x, "hex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHsl(value: String => ColorValueArray): Self = StObject.set(x, "hsl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRgb(value: String => ColorValueArray): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ColorHashOptions extends StObject {
    
    var hash: js.UndefOr[HashFunction] = js.native
    
    var hue: js.UndefOr[Hue] = js.native
    
    var lightness: js.UndefOr[Lightness] = js.native
    
    var saturation: js.UndefOr[Saturation] = js.native
  }
  object ColorHashOptions {
    
    @scala.inline
    def apply(): ColorHashOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorHashOptions]
    }
    
    @scala.inline
    implicit class ColorHashOptionsMutableBuilder[Self <: ColorHashOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: /* input */ String => Double): Self = StObject.set(x, "hash", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setHue(value: Hue): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHueUndefined: Self = StObject.set(x, "hue", js.undefined)
      
      @scala.inline
      def setHueVarargs(value: HueObject*): Self = StObject.set(x, "hue", js.Array(value :_*))
      
      @scala.inline
      def setLightness(value: Lightness): Self = StObject.set(x, "lightness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightnessUndefined: Self = StObject.set(x, "lightness", js.undefined)
      
      @scala.inline
      def setSaturation(value: Saturation): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
    }
  }
  
  type ColorValueArray = js.Tuple3[Double, Double, Double]
  
  type HashFunction = js.Function1[/* input */ String, Double]
  
  type Hue = Double | HueObject | js.Array[HueObject]
  
  @js.native
  trait HueObject extends StObject {
    
    var max: Double = js.native
    
    var min: Double = js.native
  }
  object HueObject {
    
    @scala.inline
    def apply(max: Double, min: Double): HueObject = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[HueObject]
    }
    
    @scala.inline
    implicit class HueObjectMutableBuilder[Self <: HueObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  type Lightness = Double | ColorValueArray
  
  type Saturation = Double | ColorValueArray
}
