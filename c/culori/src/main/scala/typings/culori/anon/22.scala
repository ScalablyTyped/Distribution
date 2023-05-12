package typings.culori.anon

import typings.culori.srcLch65TypesMod.Lch65
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `22` extends StObject {
  
  def lab65(c: OmitLab65mode): Lch65
  
  def rgb(c: OmitRgbmode): Lch65
}
object `22` {
  
  inline def apply(lab65: OmitLab65mode => Lch65, rgb: OmitRgbmode => Lch65): `22` = {
    val __obj = js.Dynamic.literal(lab65 = js.Any.fromFunction1(lab65), rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[`22`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `22`] (val x: Self) extends AnyVal {
    
    inline def setLab65(value: OmitLab65mode => Lch65): Self = StObject.set(x, "lab65", js.Any.fromFunction1(value))
    
    inline def setRgb(value: OmitRgbmode => Lch65): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
