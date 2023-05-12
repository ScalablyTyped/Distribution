package typings.culori.anon

import typings.culori.srcHsvTypesMod.Hsv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11` extends StObject {
  
  def rgb(color: OmitRgbmode): Hsv
  @JSName("rgb")
  var rgb_Original: js.Function1[/* color */ OmitRgbmode, Hsv]
}
object `11` {
  
  inline def apply(rgb: /* color */ OmitRgbmode => Hsv): `11` = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[`11`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `11`] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: /* color */ OmitRgbmode => Hsv): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
