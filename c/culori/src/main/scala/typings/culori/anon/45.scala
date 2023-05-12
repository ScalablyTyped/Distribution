package typings.culori.anon

import typings.culori.srcYiqTypesMod.Yiq
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `45` extends StObject {
  
  def rgb(color: OmitRgbmode): Yiq
  @JSName("rgb")
  var rgb_Original: js.Function1[/* color */ OmitRgbmode, Yiq]
}
object `45` {
  
  inline def apply(rgb: /* color */ OmitRgbmode => Yiq): `45` = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[`45`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `45`] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: /* color */ OmitRgbmode => Yiq): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
