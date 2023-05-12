package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `42` extends StObject {
  
  def rgb(color: OmitXyz65mode): typings.culori.srcRgbTypesMod.Rgb
  @JSName("rgb")
  var rgb_Original: js.Function1[/* color */ OmitXyz65mode, typings.culori.srcRgbTypesMod.Rgb]
  
  def xyz50(color: OmitXyz65mode): typings.culori.srcXyz50TypesMod.Xyz50
  @JSName("xyz50")
  var xyz50_Original: js.Function1[/* color */ OmitXyz65mode, typings.culori.srcXyz50TypesMod.Xyz50]
}
object `42` {
  
  inline def apply(
    rgb: /* color */ OmitXyz65mode => typings.culori.srcRgbTypesMod.Rgb,
    xyz50: /* color */ OmitXyz65mode => typings.culori.srcXyz50TypesMod.Xyz50
  ): `42` = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb), xyz50 = js.Any.fromFunction1(xyz50))
    __obj.asInstanceOf[`42`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `42`] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: /* color */ OmitXyz65mode => typings.culori.srcRgbTypesMod.Rgb): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    
    inline def setXyz50(value: /* color */ OmitXyz65mode => typings.culori.srcXyz50TypesMod.Xyz50): Self = StObject.set(x, "xyz50", js.Any.fromFunction1(value))
  }
}
