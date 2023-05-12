package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `64` extends StObject {
  
  def rgb(c: OmitLchmode): typings.culori.srcRgbTypesMod.Rgb
}
object `64` {
  
  inline def apply(rgb: OmitLchmode => typings.culori.srcRgbTypesMod.Rgb): `64` = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[`64`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `64`] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: OmitLchmode => typings.culori.srcRgbTypesMod.Rgb): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
