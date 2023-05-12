package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `40` extends StObject {
  
  def lab(color: OmitXyz50mode): typings.culori.srcLabTypesMod.Lab
  @JSName("lab")
  var lab_Original: js.Function1[/* color */ OmitXyz50mode, typings.culori.srcLabTypesMod.Lab]
  
  def rgb(color: OmitXyz50mode): typings.culori.srcRgbTypesMod.Rgb
  @JSName("rgb")
  var rgb_Original: js.Function1[/* color */ OmitXyz50mode, typings.culori.srcRgbTypesMod.Rgb]
}
object `40` {
  
  inline def apply(
    lab: /* color */ OmitXyz50mode => typings.culori.srcLabTypesMod.Lab,
    rgb: /* color */ OmitXyz50mode => typings.culori.srcRgbTypesMod.Rgb
  ): `40` = {
    val __obj = js.Dynamic.literal(lab = js.Any.fromFunction1(lab), rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[`40`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `40`] (val x: Self) extends AnyVal {
    
    inline def setLab(value: /* color */ OmitXyz50mode => typings.culori.srcLabTypesMod.Lab): Self = StObject.set(x, "lab", js.Any.fromFunction1(value))
    
    inline def setRgb(value: /* color */ OmitXyz50mode => typings.culori.srcRgbTypesMod.Rgb): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
