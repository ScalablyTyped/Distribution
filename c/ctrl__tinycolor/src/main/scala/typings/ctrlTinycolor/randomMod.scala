package typings.ctrlTinycolor

import typings.ctrlTinycolor.ctrlTinycolorStrings.blue
import typings.ctrlTinycolor.ctrlTinycolorStrings.bright
import typings.ctrlTinycolor.ctrlTinycolorStrings.dark
import typings.ctrlTinycolor.ctrlTinycolorStrings.green
import typings.ctrlTinycolor.ctrlTinycolorStrings.light
import typings.ctrlTinycolor.ctrlTinycolorStrings.monochrome
import typings.ctrlTinycolor.ctrlTinycolorStrings.orange
import typings.ctrlTinycolor.ctrlTinycolorStrings.pink
import typings.ctrlTinycolor.ctrlTinycolorStrings.purple
import typings.ctrlTinycolor.ctrlTinycolorStrings.random
import typings.ctrlTinycolor.ctrlTinycolorStrings.red
import typings.ctrlTinycolor.ctrlTinycolorStrings.yellow
import typings.ctrlTinycolor.distMod.TinyColor_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object randomMod {
  
  @JSImport("@ctrl/tinycolor/dist/random", "bounds")
  @js.native
  val bounds: js.Array[ColorBound] = js.native
  
  @JSImport("@ctrl/tinycolor/dist/random", "random")
  @js.native
  def random(): TinyColor_ = js.native
  @JSImport("@ctrl/tinycolor/dist/random", "random")
  @js.native
  def random(options: RandomCountOptions): js.Array[TinyColor_] = js.native
  @JSImport("@ctrl/tinycolor/dist/random", "random")
  @js.native
  def random(options: RandomOptions): TinyColor_ = js.native
  @JSImport("@ctrl/tinycolor/dist/random", "random")
  @js.native
  def random_Array(): js.Array[TinyColor_] = js.native
  
  @js.native
  trait ColorBound extends StObject {
    
    var hueRange: (js.Tuple2[Double, Double]) | Null = js.native
    
    var lowerBounds: js.Array[js.Tuple2[Double, Double]] = js.native
    
    var name: String = js.native
  }
  object ColorBound {
    
    @scala.inline
    def apply(lowerBounds: js.Array[js.Tuple2[Double, Double]], name: String): ColorBound = {
      val __obj = js.Dynamic.literal(lowerBounds = lowerBounds.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorBound]
    }
    
    @scala.inline
    implicit class ColorBoundMutableBuilder[Self <: ColorBound] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHueRange(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "hueRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHueRangeNull: Self = StObject.set(x, "hueRange", null)
      
      @scala.inline
      def setLowerBounds(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "lowerBounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowerBoundsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "lowerBounds", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RandomCountOptions extends RandomOptions {
    
    var count: js.UndefOr[Double | Null] = js.native
  }
  object RandomCountOptions {
    
    @scala.inline
    def apply(): RandomCountOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RandomCountOptions]
    }
    
    @scala.inline
    implicit class RandomCountOptionsMutableBuilder[Self <: RandomCountOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountNull: Self = StObject.set(x, "count", null)
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    }
  }
  
  @js.native
  trait RandomOptions extends StObject {
    
    var alpha: js.UndefOr[Double] = js.native
    
    var hue: js.UndefOr[
        Double | String | red | orange | yellow | green | blue | purple | pink | monochrome
      ] = js.native
    
    var luminosity: js.UndefOr[random | bright | dark | light] = js.native
    
    var seed: js.UndefOr[Double] = js.native
  }
  object RandomOptions {
    
    @scala.inline
    def apply(): RandomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RandomOptions]
    }
    
    @scala.inline
    implicit class RandomOptionsMutableBuilder[Self <: RandomOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      @scala.inline
      def setHue(value: Double | String | red | orange | yellow | green | blue | purple | pink | monochrome): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHueUndefined: Self = StObject.set(x, "hue", js.undefined)
      
      @scala.inline
      def setLuminosity(value: random | bright | dark | light): Self = StObject.set(x, "luminosity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLuminosityUndefined: Self = StObject.set(x, "luminosity", js.undefined)
      
      @scala.inline
      def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    }
  }
}
