package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `25` extends StObject {
  
  def rgb(color: OmitRgbmode): typings.culori.srcLrgbTypesMod.Lrgb
  @JSName("rgb")
  var rgb_Original: js.Function1[/* color */ OmitRgbmode, typings.culori.srcLrgbTypesMod.Lrgb]
}
object `25` {
  
  inline def apply(rgb: /* color */ OmitRgbmode => typings.culori.srcLrgbTypesMod.Lrgb): `25` = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[`25`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `25`] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: /* color */ OmitRgbmode => typings.culori.srcLrgbTypesMod.Lrgb): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
