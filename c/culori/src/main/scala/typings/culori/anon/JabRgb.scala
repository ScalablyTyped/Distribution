package typings.culori.anon

import typings.culori.srcJchTypesMod.Jch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JabRgb extends StObject {
  
  def jab(color: OmitJabmode): Jch
  @JSName("jab")
  var jab_Original: js.Function1[/* color */ OmitJabmode, Jch]
  
  def rgb(c: OmitRgbmode): Jch
}
object JabRgb {
  
  inline def apply(jab: /* color */ OmitJabmode => Jch, rgb: OmitRgbmode => Jch): JabRgb = {
    val __obj = js.Dynamic.literal(jab = js.Any.fromFunction1(jab), rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[JabRgb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JabRgb] (val x: Self) extends AnyVal {
    
    inline def setJab(value: /* color */ OmitJabmode => Jch): Self = StObject.set(x, "jab", js.Any.fromFunction1(value))
    
    inline def setRgb(value: OmitRgbmode => Jch): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
