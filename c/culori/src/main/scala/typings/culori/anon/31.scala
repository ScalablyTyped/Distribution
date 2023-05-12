package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `31` extends StObject {
  
  def oklab(c: OmitOklchmode): typings.culori.srcOklabTypesMod.Oklab
  
  def rgb(c: OmitOklchmode): typings.culori.srcRgbTypesMod.Rgb
}
object `31` {
  
  inline def apply(
    oklab: OmitOklchmode => typings.culori.srcOklabTypesMod.Oklab,
    rgb: OmitOklchmode => typings.culori.srcRgbTypesMod.Rgb
  ): `31` = {
    val __obj = js.Dynamic.literal(oklab = js.Any.fromFunction1(oklab), rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[`31`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `31`] (val x: Self) extends AnyVal {
    
    inline def setOklab(value: OmitOklchmode => typings.culori.srcOklabTypesMod.Oklab): Self = StObject.set(x, "oklab", js.Any.fromFunction1(value))
    
    inline def setRgb(value: OmitOklchmode => typings.culori.srcRgbTypesMod.Rgb): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
