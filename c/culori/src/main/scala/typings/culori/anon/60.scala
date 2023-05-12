package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `60` extends StObject {
  
  def rgb(c: OmitJchmode): typings.culori.srcRgbTypesMod.Rgb
}
object `60` {
  
  inline def apply(rgb: OmitJchmode => typings.culori.srcRgbTypesMod.Rgb): `60` = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[`60`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `60`] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: OmitJchmode => typings.culori.srcRgbTypesMod.Rgb): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
