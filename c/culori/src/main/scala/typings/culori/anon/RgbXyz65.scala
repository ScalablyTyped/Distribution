package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RgbXyz65 extends StObject {
  
  def rgb(color: OmitRgbmode): typings.culori.srcJabTypesMod.Jab
  @JSName("rgb")
  var rgb_Original: js.Function1[/* color */ OmitRgbmode, typings.culori.srcJabTypesMod.Jab]
  
  def xyz65(color: OmitXyz65mode): typings.culori.srcJabTypesMod.Jab
  @JSName("xyz65")
  var xyz65_Original: js.Function1[/* color */ OmitXyz65mode, typings.culori.srcJabTypesMod.Jab]
}
object RgbXyz65 {
  
  inline def apply(
    rgb: /* color */ OmitRgbmode => typings.culori.srcJabTypesMod.Jab,
    xyz65: /* color */ OmitXyz65mode => typings.culori.srcJabTypesMod.Jab
  ): RgbXyz65 = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb), xyz65 = js.Any.fromFunction1(xyz65))
    __obj.asInstanceOf[RgbXyz65]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RgbXyz65] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: /* color */ OmitRgbmode => typings.culori.srcJabTypesMod.Jab): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    
    inline def setXyz65(value: /* color */ OmitXyz65mode => typings.culori.srcJabTypesMod.Jab): Self = StObject.set(x, "xyz65", js.Any.fromFunction1(value))
  }
}
