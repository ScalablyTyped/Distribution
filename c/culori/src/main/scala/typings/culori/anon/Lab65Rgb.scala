package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lab65Rgb extends StObject {
  
  def lab65(c: OmitLab65mode): typings.culori.srcDlabTypesMod.Dlab
  
  def rgb(c: OmitRgbmode): typings.culori.srcDlabTypesMod.Dlab
}
object Lab65Rgb {
  
  inline def apply(
    lab65: OmitLab65mode => typings.culori.srcDlabTypesMod.Dlab,
    rgb: OmitRgbmode => typings.culori.srcDlabTypesMod.Dlab
  ): Lab65Rgb = {
    val __obj = js.Dynamic.literal(lab65 = js.Any.fromFunction1(lab65), rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[Lab65Rgb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Lab65Rgb] (val x: Self) extends AnyVal {
    
    inline def setLab65(value: OmitLab65mode => typings.culori.srcDlabTypesMod.Dlab): Self = StObject.set(x, "lab65", js.Any.fromFunction1(value))
    
    inline def setRgb(value: OmitRgbmode => typings.culori.srcDlabTypesMod.Dlab): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
