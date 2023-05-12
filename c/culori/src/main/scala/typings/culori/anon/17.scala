package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `17` extends StObject {
  
  def rgb(color: OmitRgbmode): typings.culori.srcLab65TypesMod.Lab65
  @JSName("rgb")
  var rgb_Original: js.Function1[/* color */ OmitRgbmode, typings.culori.srcLab65TypesMod.Lab65]
  
  def xyz65(color: OmitXyz65mode): typings.culori.srcLab65TypesMod.Lab65
  @JSName("xyz65")
  var xyz65_Original: js.Function1[/* color */ OmitXyz65mode, typings.culori.srcLab65TypesMod.Lab65]
}
object `17` {
  
  inline def apply(
    rgb: /* color */ OmitRgbmode => typings.culori.srcLab65TypesMod.Lab65,
    xyz65: /* color */ OmitXyz65mode => typings.culori.srcLab65TypesMod.Lab65
  ): `17` = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb), xyz65 = js.Any.fromFunction1(xyz65))
    __obj.asInstanceOf[`17`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `17`] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: /* color */ OmitRgbmode => typings.culori.srcLab65TypesMod.Lab65): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    
    inline def setXyz65(value: /* color */ OmitXyz65mode => typings.culori.srcLab65TypesMod.Lab65): Self = StObject.set(x, "xyz65", js.Any.fromFunction1(value))
  }
}
