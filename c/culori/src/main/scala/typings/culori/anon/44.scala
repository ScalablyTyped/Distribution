package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `44` extends StObject {
  
  def rgb(color: OmitYiqmode): typings.culori.srcRgbTypesMod.Rgb
  @JSName("rgb")
  var rgb_Original: js.Function1[/* color */ OmitYiqmode, typings.culori.srcRgbTypesMod.Rgb]
}
object `44` {
  
  inline def apply(rgb: /* color */ OmitYiqmode => typings.culori.srcRgbTypesMod.Rgb): `44` = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[`44`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `44`] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: /* color */ OmitYiqmode => typings.culori.srcRgbTypesMod.Rgb): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
