package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dlab extends StObject {
  
  def dlab(c: OmitDlchmode): typings.culori.srcDlabTypesMod.Dlab
  
  def lab65(color: OmitDlchmode): typings.culori.srcLab65TypesMod.Lab65
  @JSName("lab65")
  var lab65_Original: js.Function1[/* color */ OmitDlchmode, typings.culori.srcLab65TypesMod.Lab65]
  
  def rgb(c: OmitDlchmode): typings.culori.srcRgbTypesMod.Rgb
}
object Dlab {
  
  inline def apply(
    dlab: OmitDlchmode => typings.culori.srcDlabTypesMod.Dlab,
    lab65: /* color */ OmitDlchmode => typings.culori.srcLab65TypesMod.Lab65,
    rgb: OmitDlchmode => typings.culori.srcRgbTypesMod.Rgb
  ): Dlab = {
    val __obj = js.Dynamic.literal(dlab = js.Any.fromFunction1(dlab), lab65 = js.Any.fromFunction1(lab65), rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[Dlab]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dlab] (val x: Self) extends AnyVal {
    
    inline def setDlab(value: OmitDlchmode => typings.culori.srcDlabTypesMod.Dlab): Self = StObject.set(x, "dlab", js.Any.fromFunction1(value))
    
    inline def setLab65(value: /* color */ OmitDlchmode => typings.culori.srcLab65TypesMod.Lab65): Self = StObject.set(x, "lab65", js.Any.fromFunction1(value))
    
    inline def setRgb(value: OmitDlchmode => typings.culori.srcRgbTypesMod.Rgb): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
