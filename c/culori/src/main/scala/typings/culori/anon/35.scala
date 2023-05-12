package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `35` extends StObject {
  
  def rgb(color: OmitP3mode): typings.culori.srcRgbTypesMod.Rgb
  
  def xyz65(color: OmitP3mode): typings.culori.srcXyz65TypesMod.Xyz65
  @JSName("xyz65")
  var xyz65_Original: js.Function1[/* color */ OmitP3mode, typings.culori.srcXyz65TypesMod.Xyz65]
}
object `35` {
  
  inline def apply(
    rgb: OmitP3mode => typings.culori.srcRgbTypesMod.Rgb,
    xyz65: /* color */ OmitP3mode => typings.culori.srcXyz65TypesMod.Xyz65
  ): `35` = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb), xyz65 = js.Any.fromFunction1(xyz65))
    __obj.asInstanceOf[`35`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `35`] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: OmitP3mode => typings.culori.srcRgbTypesMod.Rgb): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    
    inline def setXyz65(value: /* color */ OmitP3mode => typings.culori.srcXyz65TypesMod.Xyz65): Self = StObject.set(x, "xyz65", js.Any.fromFunction1(value))
  }
}
