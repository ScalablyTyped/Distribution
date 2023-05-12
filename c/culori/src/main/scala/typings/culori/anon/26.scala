package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `26` extends StObject {
  
  def rgb(c: OmitLuvmode): typings.culori.srcRgbTypesMod.Rgb
  
  def xyz50(color: OmitLuvmode): typings.culori.srcXyz50TypesMod.Xyz50
  @JSName("xyz50")
  var xyz50_Original: js.Function1[/* color */ OmitLuvmode, typings.culori.srcXyz50TypesMod.Xyz50]
}
object `26` {
  
  inline def apply(
    rgb: OmitLuvmode => typings.culori.srcRgbTypesMod.Rgb,
    xyz50: /* color */ OmitLuvmode => typings.culori.srcXyz50TypesMod.Xyz50
  ): `26` = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb), xyz50 = js.Any.fromFunction1(xyz50))
    __obj.asInstanceOf[`26`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `26`] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: OmitLuvmode => typings.culori.srcRgbTypesMod.Rgb): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    
    inline def setXyz50(value: /* color */ OmitLuvmode => typings.culori.srcXyz50TypesMod.Xyz50): Self = StObject.set(x, "xyz50", js.Any.fromFunction1(value))
  }
}
