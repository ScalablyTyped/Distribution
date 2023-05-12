package typings.culori.anon

import typings.culori.srcLchTypesMod.Lch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `65` extends StObject {
  
  def rgb(c: OmitRgbmode): Lch
}
object `65` {
  
  inline def apply(rgb: OmitRgbmode => Lch): `65` = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[`65`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `65`] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: OmitRgbmode => Lch): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
