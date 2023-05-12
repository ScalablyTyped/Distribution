package typings.culori.anon

import typings.culori.srcRec2020TypesMod.Rec2020
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `38` extends StObject {
  
  def rgb(color: typings.culori.srcRgbTypesMod.Rgb): Rec2020
  
  def xyz65(color: OmitXyz65mode): Rec2020
  @JSName("xyz65")
  var xyz65_Original: js.Function1[/* color */ OmitXyz65mode, Rec2020]
}
object `38` {
  
  inline def apply(rgb: typings.culori.srcRgbTypesMod.Rgb => Rec2020, xyz65: /* color */ OmitXyz65mode => Rec2020): `38` = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb), xyz65 = js.Any.fromFunction1(xyz65))
    __obj.asInstanceOf[`38`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `38`] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: typings.culori.srcRgbTypesMod.Rgb => Rec2020): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    
    inline def setXyz65(value: /* color */ OmitXyz65mode => Rec2020): Self = StObject.set(x, "xyz65", js.Any.fromFunction1(value))
  }
}
