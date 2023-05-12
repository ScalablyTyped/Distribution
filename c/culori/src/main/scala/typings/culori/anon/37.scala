package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `37` extends StObject {
  
  def rgb(rgb: OmitProphotomode): typings.culori.srcRgbTypesMod.Rgb
  
  def xyz50(color: OmitProphotomode): typings.culori.srcXyz50TypesMod.Xyz50
  @JSName("xyz50")
  var xyz50_Original: js.Function1[/* color */ OmitProphotomode, typings.culori.srcXyz50TypesMod.Xyz50]
}
object `37` {
  
  inline def apply(
    rgb: OmitProphotomode => typings.culori.srcRgbTypesMod.Rgb,
    xyz50: /* color */ OmitProphotomode => typings.culori.srcXyz50TypesMod.Xyz50
  ): `37` = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb), xyz50 = js.Any.fromFunction1(xyz50))
    __obj.asInstanceOf[`37`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `37`] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: OmitProphotomode => typings.culori.srcRgbTypesMod.Rgb): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    
    inline def setXyz50(value: /* color */ OmitProphotomode => typings.culori.srcXyz50TypesMod.Xyz50): Self = StObject.set(x, "xyz50", js.Any.fromFunction1(value))
  }
}
