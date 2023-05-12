package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LrgbRgb extends StObject {
  
  def lrgb(color: OmitLrgbmode): typings.culori.srcOklabTypesMod.Oklab
  @JSName("lrgb")
  var lrgb_Original: js.Function1[/* color */ OmitLrgbmode, typings.culori.srcOklabTypesMod.Oklab]
  
  def rgb(color: OmitRgbmode): typings.culori.srcOklabTypesMod.Oklab
  @JSName("rgb")
  var rgb_Original: js.Function1[/* color */ OmitRgbmode, typings.culori.srcOklabTypesMod.Oklab]
}
object LrgbRgb {
  
  inline def apply(
    lrgb: /* color */ OmitLrgbmode => typings.culori.srcOklabTypesMod.Oklab,
    rgb: /* color */ OmitRgbmode => typings.culori.srcOklabTypesMod.Oklab
  ): LrgbRgb = {
    val __obj = js.Dynamic.literal(lrgb = js.Any.fromFunction1(lrgb), rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[LrgbRgb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LrgbRgb] (val x: Self) extends AnyVal {
    
    inline def setLrgb(value: /* color */ OmitLrgbmode => typings.culori.srcOklabTypesMod.Oklab): Self = StObject.set(x, "lrgb", js.Any.fromFunction1(value))
    
    inline def setRgb(value: /* color */ OmitRgbmode => typings.culori.srcOklabTypesMod.Oklab): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
