package typings.culori.anon

import typings.culori.srcHsiTypesMod.Hsi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  def rgb(color: OmitRgbmode): Hsi
  @JSName("rgb")
  var rgb_Original: js.Function1[/* color */ OmitRgbmode, Hsi]
}
object `6` {
  
  inline def apply(rgb: /* color */ OmitRgbmode => Hsi): `6` = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[`6`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `6`] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: /* color */ OmitRgbmode => Hsi): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
