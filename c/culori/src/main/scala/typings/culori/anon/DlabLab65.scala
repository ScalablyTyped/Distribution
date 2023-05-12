package typings.culori.anon

import typings.culori.srcDlchTypesMod.Dlch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DlabLab65 extends StObject {
  
  def dlab(c: OmitDlabmode): Dlch
  
  def lab65(color: OmitLab65mode): Dlch
  @JSName("lab65")
  var lab65_Original: js.Function1[/* color */ OmitLab65mode, Dlch]
  
  def rgb(c: OmitRgbmode): Dlch
}
object DlabLab65 {
  
  inline def apply(dlab: OmitDlabmode => Dlch, lab65: /* color */ OmitLab65mode => Dlch, rgb: OmitRgbmode => Dlch): DlabLab65 = {
    val __obj = js.Dynamic.literal(dlab = js.Any.fromFunction1(dlab), lab65 = js.Any.fromFunction1(lab65), rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[DlabLab65]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DlabLab65] (val x: Self) extends AnyVal {
    
    inline def setDlab(value: OmitDlabmode => Dlch): Self = StObject.set(x, "dlab", js.Any.fromFunction1(value))
    
    inline def setLab65(value: /* color */ OmitLab65mode => Dlch): Self = StObject.set(x, "lab65", js.Any.fromFunction1(value))
    
    inline def setRgb(value: OmitRgbmode => Dlch): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
