package typings.culori.anon

import typings.culori.srcHwbTypesMod.Hwb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13` extends StObject {
  
  def rgb(color: OmitRgbmode): Hwb
  @JSName("rgb")
  var rgb_Original: js.Function1[/* color */ OmitRgbmode, Hwb]
}
object `13` {
  
  inline def apply(rgb: /* color */ OmitRgbmode => Hwb): `13` = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[`13`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `13`] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: /* color */ OmitRgbmode => Hwb): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
