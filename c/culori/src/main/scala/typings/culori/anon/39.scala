package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `39` extends StObject {
  
  def rgb(color: OmitRec2020mode): typings.culori.srcRgbTypesMod.Rgb
  
  def xyz65(color: OmitRec2020mode): typings.culori.srcXyz65TypesMod.Xyz65
  @JSName("xyz65")
  var xyz65_Original: js.Function1[/* color */ OmitRec2020mode, typings.culori.srcXyz65TypesMod.Xyz65]
}
object `39` {
  
  inline def apply(
    rgb: OmitRec2020mode => typings.culori.srcRgbTypesMod.Rgb,
    xyz65: /* color */ OmitRec2020mode => typings.culori.srcXyz65TypesMod.Xyz65
  ): `39` = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb), xyz65 = js.Any.fromFunction1(xyz65))
    __obj.asInstanceOf[`39`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `39`] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: OmitRec2020mode => typings.culori.srcRgbTypesMod.Rgb): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    
    inline def setXyz65(value: /* color */ OmitRec2020mode => typings.culori.srcXyz65TypesMod.Xyz65): Self = StObject.set(x, "xyz65", js.Any.fromFunction1(value))
  }
}
