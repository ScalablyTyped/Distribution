package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  def rgb(color: OmitHslmode): typings.culori.srcRgbTypesMod.Rgb
  @JSName("rgb")
  var rgb_Original: js.Function1[/* color */ OmitHslmode, typings.culori.srcRgbTypesMod.Rgb]
}
object `8` {
  
  inline def apply(rgb: /* color */ OmitHslmode => typings.culori.srcRgbTypesMod.Rgb): `8` = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[`8`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `8`] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: /* color */ OmitHslmode => typings.culori.srcRgbTypesMod.Rgb): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
