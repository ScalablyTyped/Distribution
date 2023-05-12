package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `68` extends StObject {
  
  def rgb(c: OmitLuvmode): typings.culori.srcRgbTypesMod.Rgb
}
object `68` {
  
  inline def apply(rgb: OmitLuvmode => typings.culori.srcRgbTypesMod.Rgb): `68` = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[`68`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `68`] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: OmitLuvmode => typings.culori.srcRgbTypesMod.Rgb): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
