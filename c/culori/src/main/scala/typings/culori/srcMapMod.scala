package typings.culori

import typings.culori.culoriBooleans.`false`
import typings.culori.culoriBooleans.`true`
import typings.culori.culoriStrings.rgb
import typings.culori.srcCommonMod.Color
import typings.culori.srcCommonMod.FindColorByMode
import typings.culori.srcCommonMod.Mode
import typings.culori.srcRgbTypesMod.Rgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMapMod {
  
  @JSImport("culori/src/map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mapAlphaDivide(v: Double, ch: Channel, c: Color): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mapAlphaDivide")(v.asInstanceOf[js.Any], ch.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def mapAlphaMultiply(v: Double, ch: Channel, c: Color): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mapAlphaMultiply")(v.asInstanceOf[js.Any], ch.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def mapTransferGamma(): js.Function2[/* v */ Double, /* ch */ Channel, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapTransferGamma")().asInstanceOf[js.Function2[/* v */ Double, /* ch */ Channel, Double]]
  inline def mapTransferGamma(amplitude: Double): js.Function2[/* v */ Double, /* ch */ Channel, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapTransferGamma")(amplitude.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* v */ Double, /* ch */ Channel, Double]]
  inline def mapTransferGamma(amplitude: Double, exponent: Double): js.Function2[/* v */ Double, /* ch */ Channel, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapTransferGamma")(amplitude.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* v */ Double, /* ch */ Channel, Double]]
  inline def mapTransferGamma(amplitude: Double, exponent: Double, offset: Double): js.Function2[/* v */ Double, /* ch */ Channel, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapTransferGamma")(amplitude.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* v */ Double, /* ch */ Channel, Double]]
  inline def mapTransferGamma(amplitude: Double, exponent: Unit, offset: Double): js.Function2[/* v */ Double, /* ch */ Channel, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapTransferGamma")(amplitude.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* v */ Double, /* ch */ Channel, Double]]
  inline def mapTransferGamma(amplitude: Unit, exponent: Double): js.Function2[/* v */ Double, /* ch */ Channel, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapTransferGamma")(amplitude.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* v */ Double, /* ch */ Channel, Double]]
  inline def mapTransferGamma(amplitude: Unit, exponent: Double, offset: Double): js.Function2[/* v */ Double, /* ch */ Channel, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapTransferGamma")(amplitude.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* v */ Double, /* ch */ Channel, Double]]
  inline def mapTransferGamma(amplitude: Unit, exponent: Unit, offset: Double): js.Function2[/* v */ Double, /* ch */ Channel, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapTransferGamma")(amplitude.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* v */ Double, /* ch */ Channel, Double]]
  
  inline def mapTransferLinear(): js.Function2[/* v */ Double, /* ch */ Channel, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapTransferLinear")().asInstanceOf[js.Function2[/* v */ Double, /* ch */ Channel, Double]]
  inline def mapTransferLinear(slope: Double): js.Function2[/* v */ Double, /* ch */ Channel, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapTransferLinear")(slope.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* v */ Double, /* ch */ Channel, Double]]
  inline def mapTransferLinear(slope: Double, intercept: Double): js.Function2[/* v */ Double, /* ch */ Channel, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapTransferLinear")(slope.asInstanceOf[js.Any], intercept.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* v */ Double, /* ch */ Channel, Double]]
  inline def mapTransferLinear(slope: Unit, intercept: Double): js.Function2[/* v */ Double, /* ch */ Channel, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapTransferLinear")(slope.asInstanceOf[js.Any], intercept.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* v */ Double, /* ch */ Channel, Double]]
  
  inline def mapper(fn: MapFn[rgb], mode: Unit, preserve_mode: `false`): ColorToRgbMapper = (^.asInstanceOf[js.Dynamic].applyDynamic("mapper")(fn.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], preserve_mode.asInstanceOf[js.Any])).asInstanceOf[ColorToRgbMapper]
  inline def mapper(fn: MapFn[rgb], mode: Unit, preserve_mode: `true`): ColorToSameColorMapper = (^.asInstanceOf[js.Dynamic].applyDynamic("mapper")(fn.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], preserve_mode.asInstanceOf[js.Any])).asInstanceOf[ColorToSameColorMapper]
  inline def mapper[M /* <: Mode */](fn: MapFn[M], mode: M): ColorToPredefinedColorMapper[M] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapper")(fn.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[ColorToPredefinedColorMapper[M]]
  
  inline def mapper_false[M /* <: Mode */](fn: MapFn[M], mode: M, preserve_mode: `false`): ColorToPredefinedColorMapper[M] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapper")(fn.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], preserve_mode.asInstanceOf[js.Any])).asInstanceOf[ColorToPredefinedColorMapper[M]]
  
  inline def mapper_rgb(fn: MapFn[rgb]): ColorToRgbMapper = ^.asInstanceOf[js.Dynamic].applyDynamic("mapper")(fn.asInstanceOf[js.Any]).asInstanceOf[ColorToRgbMapper]
  
  inline def mapper_true[M /* <: Mode */](fn: MapFn[M], mode: M, preserve_mode: `true`): ColorToSameColorMapper = (^.asInstanceOf[js.Dynamic].applyDynamic("mapper")(fn.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], preserve_mode.asInstanceOf[js.Any])).asInstanceOf[ColorToSameColorMapper]
  
  type Channel = String
  
  @js.native
  trait ColorToPredefinedColorMapper[M /* <: Mode */] extends StObject {
    
    def apply(color: String): js.UndefOr[FindColorByMode[M, Color]] = js.native
    def apply(color: Color): FindColorByMode[M, Color] = js.native
  }
  
  @js.native
  trait ColorToRgbMapper extends StObject {
    
    def apply(color: String): js.UndefOr[Rgb] = js.native
    def apply(color: Color): Rgb = js.native
  }
  
  @js.native
  trait ColorToSameColorMapper extends StObject {
    
    def apply(color: String): js.UndefOr[Color] = js.native
    def apply[M /* <: Mode */](color: FindColorByMode[M, Color]): FindColorByMode[M, Color] = js.native
  }
  
  type MapFn[M /* <: Mode */] = js.Function4[
    /* v */ Double, 
    /* ch */ String, 
    /* import warning: importer.ImportType#apply Failed type conversion: M extends culori.culori/src/common.Mode ? culori.culori/src/common.FindColorByMode<M, culori.culori/src/common.Color> : culori.culori/src/common.Color */ /* conv_color */ js.Any, 
    /* mode */ M, 
    Double
  ]
}
