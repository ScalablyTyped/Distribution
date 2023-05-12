package typings.culori.anon

import typings.culori.srcHslTypesMod.Hsl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  def rgb(color: OmitRgbmode): Hsl
  @JSName("rgb")
  var rgb_Original: js.Function1[/* color */ OmitRgbmode, Hsl]
}
object `9` {
  
  inline def apply(rgb: /* color */ OmitRgbmode => Hsl): `9` = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[`9`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `9`] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: /* color */ OmitRgbmode => Hsl): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
