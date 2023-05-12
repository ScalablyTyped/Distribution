package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Xyz65 extends StObject {
  
  def rgb(color: OmitA98mode): typings.culori.srcRgbTypesMod.Rgb
  
  def xyz65(color: OmitA98mode): typings.culori.srcXyz50TypesMod.Xyz50
  @JSName("xyz65")
  var xyz65_Original: js.Function1[/* color */ OmitA98mode, typings.culori.srcXyz50TypesMod.Xyz50]
}
object Xyz65 {
  
  inline def apply(
    rgb: OmitA98mode => typings.culori.srcRgbTypesMod.Rgb,
    xyz65: /* color */ OmitA98mode => typings.culori.srcXyz50TypesMod.Xyz50
  ): Xyz65 = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb), xyz65 = js.Any.fromFunction1(xyz65))
    __obj.asInstanceOf[Xyz65]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Xyz65] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: OmitA98mode => typings.culori.srcRgbTypesMod.Rgb): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    
    inline def setXyz65(value: /* color */ OmitA98mode => typings.culori.srcXyz50TypesMod.Xyz50): Self = StObject.set(x, "xyz65", js.Any.fromFunction1(value))
  }
}
