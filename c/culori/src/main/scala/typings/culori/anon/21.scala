package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21` extends StObject {
  
  def lab65(c: OmitLchmode): typings.culori.srcLab65TypesMod.Lab65
  
  def rgb(c: OmitLchmode): typings.culori.srcRgbTypesMod.Rgb
}
object `21` {
  
  inline def apply(
    lab65: OmitLchmode => typings.culori.srcLab65TypesMod.Lab65,
    rgb: OmitLchmode => typings.culori.srcRgbTypesMod.Rgb
  ): `21` = {
    val __obj = js.Dynamic.literal(lab65 = js.Any.fromFunction1(lab65), rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[`21`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `21`] (val x: Self) extends AnyVal {
    
    inline def setLab65(value: OmitLchmode => typings.culori.srcLab65TypesMod.Lab65): Self = StObject.set(x, "lab65", js.Any.fromFunction1(value))
    
    inline def setRgb(value: OmitLchmode => typings.culori.srcRgbTypesMod.Rgb): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
