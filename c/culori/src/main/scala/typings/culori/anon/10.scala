package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  def rgb(color: OmitHsvmode): typings.culori.srcRgbTypesMod.Rgb
  @JSName("rgb")
  var rgb_Original: js.Function1[/* color */ OmitHsvmode, typings.culori.srcRgbTypesMod.Rgb]
}
object `10` {
  
  inline def apply(rgb: /* color */ OmitHsvmode => typings.culori.srcRgbTypesMod.Rgb): `10` = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[`10`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `10`] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: /* color */ OmitHsvmode => typings.culori.srcRgbTypesMod.Rgb): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
