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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRandomMod {
  
  @JSImport("@ctrl/tinycolor/dist/random", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ctrl/tinycolor/dist/random", "bounds")
  @js.native
  val bounds: js.Array[ColorBound] = js.native
  
  inline def random(): TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[TinyColor_]
  inline def random(options: RandomCountOptions): js.Array[TinyColor_] = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[TinyColor_]]
  inline def random(options: RandomOptions): TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(options.asInstanceOf[js.Any]).asInstanceOf[TinyColor_]
  
  inline def random_Array(): js.Array[TinyColor_] = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[js.Array[TinyColor_]]
  
  trait ColorBound extends StObject {
    
    var hueRange: (js.Tuple2[Double, Double]) | Null
    
    var lowerBounds: js.Array[js.Tuple2[Double, Double]]
    
    var name: String
  }
  object ColorBound {
    
    inline def apply(lowerBounds: js.Array[js.Tuple2[Double, Double]], name: String): ColorBound = {
      val __obj = js.Dynamic.literal(lowerBounds = lowerBounds.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], hueRange = null)
      __obj.asInstanceOf[ColorBound]
    }
    
    extension [Self <: ColorBound](x: Self) {
      
      inline def setHueRange(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "hueRange", value.asInstanceOf[js.Any])
      
      inline def setHueRangeNull: Self = StObject.set(x, "hueRange", null)
      
      inline def setLowerBounds(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "lowerBounds", value.asInstanceOf[js.Any])
      
      inline def setLowerBoundsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "lowerBounds", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait RandomCountOptions
    extends StObject
       with RandomOptions {
    
    var count: js.UndefOr[Double | Null] = js.undefined
  }
  object RandomCountOptions {
    
    inline def apply(): RandomCountOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RandomCountOptions]
    }
    
    extension [Self <: RandomCountOptions](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountNull: Self = StObject.set(x, "count", null)
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    }
  }
  
  trait RandomOptions extends StObject {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var hue: js.UndefOr[
        Double | String | red | orange | yellow | green | blue | purple | pink | monochrome
      ] = js.undefined
    
    var luminosity: js.UndefOr[random | bright | dark | light] = js.undefined
    
    var seed: js.UndefOr[Double] = js.undefined
  }
  object RandomOptions {
    
    inline def apply(): RandomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RandomOptions]
    }
    
    extension [Self <: RandomOptions](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setHue(value: Double | String | red | orange | yellow | green | blue | purple | pink | monochrome): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
      
      inline def setHueUndefined: Self = StObject.set(x, "hue", js.undefined)
      
      inline def setLuminosity(value: random | bright | dark | light): Self = StObject.set(x, "luminosity", value.asInstanceOf[js.Any])
      
      inline def setLuminosityUndefined: Self = StObject.set(x, "luminosity", js.undefined)
      
      inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    }
  }
}
