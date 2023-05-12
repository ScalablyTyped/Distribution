package typings.culori.anon

import typings.culori.srcP3TypesMod.P3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `34` extends StObject {
  
  def rgb(color: OmitRgbmode): P3
  
  def xyz65(color: OmitXyz65mode): P3
  @JSName("xyz65")
  var xyz65_Original: js.Function1[/* color */ OmitXyz65mode, P3]
}
object `34` {
  
  inline def apply(rgb: OmitRgbmode => P3, xyz65: /* color */ OmitXyz65mode => P3): `34` = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb), xyz65 = js.Any.fromFunction1(xyz65))
    __obj.asInstanceOf[`34`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `34`] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: OmitRgbmode => P3): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    
    inline def setXyz65(value: /* color */ OmitXyz65mode => P3): Self = StObject.set(x, "xyz65", js.Any.fromFunction1(value))
  }
}
