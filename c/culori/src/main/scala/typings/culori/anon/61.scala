package typings.culori.anon

import typings.culori.srcJchTypesMod.Jch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `61` extends StObject {
  
  def rgb(c: OmitRgbmode): Jch
}
object `61` {
  
  inline def apply(rgb: OmitRgbmode => Jch): `61` = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[`61`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `61`] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: OmitRgbmode => Jch): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
