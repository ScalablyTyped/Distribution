package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OklabRgb extends StObject {
  
  def oklab(hsl: OmitOkhslmode): typings.culori.srcOklabTypesMod.Oklab
  @JSName("oklab")
  var oklab_Original: js.Function1[/* hsl */ OmitOkhslmode, typings.culori.srcOklabTypesMod.Oklab]
  
  def rgb(c: OmitOkhslmode): typings.culori.srcRgbTypesMod.Rgb
}
object OklabRgb {
  
  inline def apply(
    oklab: /* hsl */ OmitOkhslmode => typings.culori.srcOklabTypesMod.Oklab,
    rgb: OmitOkhslmode => typings.culori.srcRgbTypesMod.Rgb
  ): OklabRgb = {
    val __obj = js.Dynamic.literal(oklab = js.Any.fromFunction1(oklab), rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[OklabRgb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OklabRgb] (val x: Self) extends AnyVal {
    
    inline def setOklab(value: /* hsl */ OmitOkhslmode => typings.culori.srcOklabTypesMod.Oklab): Self = StObject.set(x, "oklab", js.Any.fromFunction1(value))
    
    inline def setRgb(value: OmitOkhslmode => typings.culori.srcRgbTypesMod.Rgb): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
