package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lab extends StObject {
  
  def lab(color: OmitLchmode): typings.culori.srcLabTypesMod.Lab
  @JSName("lab")
  var lab_Original: js.Function1[/* color */ OmitLchmode, typings.culori.srcLabTypesMod.Lab]
  
  def rgb(c: OmitLchmode): typings.culori.srcRgbTypesMod.Rgb
}
object Lab {
  
  inline def apply(
    lab: /* color */ OmitLchmode => typings.culori.srcLabTypesMod.Lab,
    rgb: OmitLchmode => typings.culori.srcRgbTypesMod.Rgb
  ): Lab = {
    val __obj = js.Dynamic.literal(lab = js.Any.fromFunction1(lab), rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[Lab]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Lab] (val x: Self) extends AnyVal {
    
    inline def setLab(value: /* color */ OmitLchmode => typings.culori.srcLabTypesMod.Lab): Self = StObject.set(x, "lab", js.Any.fromFunction1(value))
    
    inline def setRgb(value: OmitLchmode => typings.culori.srcRgbTypesMod.Rgb): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
