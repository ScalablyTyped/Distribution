package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lrgb extends StObject {
  
  def lrgb(color: OmitOklabmode): typings.culori.srcLrgbTypesMod.Lrgb
  @JSName("lrgb")
  var lrgb_Original: js.Function1[/* color */ OmitOklabmode, typings.culori.srcLrgbTypesMod.Lrgb]
  
  def rgb(color: OmitOklabmode): typings.culori.srcRgbTypesMod.Rgb
  @JSName("rgb")
  var rgb_Original: js.Function1[/* color */ OmitOklabmode, typings.culori.srcRgbTypesMod.Rgb]
}
object Lrgb {
  
  inline def apply(
    lrgb: /* color */ OmitOklabmode => typings.culori.srcLrgbTypesMod.Lrgb,
    rgb: /* color */ OmitOklabmode => typings.culori.srcRgbTypesMod.Rgb
  ): Lrgb = {
    val __obj = js.Dynamic.literal(lrgb = js.Any.fromFunction1(lrgb), rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[Lrgb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Lrgb] (val x: Self) extends AnyVal {
    
    inline def setLrgb(value: /* color */ OmitOklabmode => typings.culori.srcLrgbTypesMod.Lrgb): Self = StObject.set(x, "lrgb", js.Any.fromFunction1(value))
    
    inline def setRgb(value: /* color */ OmitOklabmode => typings.culori.srcRgbTypesMod.Rgb): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
