package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `69` extends StObject {
  
  def rgb(c: OmitRgbmode): typings.culori.srcLuvTypesMod.Luv
}
object `69` {
  
  inline def apply(rgb: OmitRgbmode => typings.culori.srcLuvTypesMod.Luv): `69` = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[`69`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `69`] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: OmitRgbmode => typings.culori.srcLuvTypesMod.Luv): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
