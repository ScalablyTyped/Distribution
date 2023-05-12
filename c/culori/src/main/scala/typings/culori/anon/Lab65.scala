package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lab65 extends StObject {
  
  def lab65(c: OmitDlabmode): typings.culori.srcLab65TypesMod.Lab65
  
  def rgb(c: OmitDlabmode): typings.culori.srcRgbTypesMod.Rgb
}
object Lab65 {
  
  inline def apply(
    lab65: OmitDlabmode => typings.culori.srcLab65TypesMod.Lab65,
    rgb: OmitDlabmode => typings.culori.srcRgbTypesMod.Rgb
  ): Lab65 = {
    val __obj = js.Dynamic.literal(lab65 = js.Any.fromFunction1(lab65), rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[Lab65]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Lab65] (val x: Self) extends AnyVal {
    
    inline def setLab65(value: OmitDlabmode => typings.culori.srcLab65TypesMod.Lab65): Self = StObject.set(x, "lab65", js.Any.fromFunction1(value))
    
    inline def setRgb(value: OmitDlabmode => typings.culori.srcRgbTypesMod.Rgb): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
