package typings.culori.anon

import typings.culori.srcDlchTypesMod.Dlch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `48` extends StObject {
  
  def dlab(c: OmitDlabmode): Dlch
  
  def rgb(c: OmitRgbmode): Dlch
}
object `48` {
  
  inline def apply(dlab: OmitDlabmode => Dlch, rgb: OmitRgbmode => Dlch): `48` = {
    val __obj = js.Dynamic.literal(dlab = js.Any.fromFunction1(dlab), rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[`48`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `48`] (val x: Self) extends AnyVal {
    
    inline def setDlab(value: OmitDlabmode => Dlch): Self = StObject.set(x, "dlab", js.Any.fromFunction1(value))
    
    inline def setRgb(value: OmitRgbmode => Dlch): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
