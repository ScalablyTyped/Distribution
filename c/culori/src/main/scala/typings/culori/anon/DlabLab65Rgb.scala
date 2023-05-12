package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DlabLab65Rgb extends StObject {
  
  def dlab(c: OmitDlchmode): typings.culori.srcDlabTypesMod.Dlab
  
  def rgb(c: OmitDlchmode): typings.culori.srcRgbTypesMod.Rgb
}
object DlabLab65Rgb {
  
  inline def apply(
    dlab: OmitDlchmode => typings.culori.srcDlabTypesMod.Dlab,
    rgb: OmitDlchmode => typings.culori.srcRgbTypesMod.Rgb
  ): DlabLab65Rgb = {
    val __obj = js.Dynamic.literal(dlab = js.Any.fromFunction1(dlab), rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[DlabLab65Rgb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DlabLab65Rgb] (val x: Self) extends AnyVal {
    
    inline def setDlab(value: OmitDlchmode => typings.culori.srcDlabTypesMod.Dlab): Self = StObject.set(x, "dlab", js.Any.fromFunction1(value))
    
    inline def setRgb(value: OmitDlchmode => typings.culori.srcRgbTypesMod.Rgb): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
