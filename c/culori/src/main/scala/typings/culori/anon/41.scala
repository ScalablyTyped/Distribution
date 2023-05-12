package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `41` extends StObject {
  
  def lab(color: OmitLabmode): typings.culori.srcXyz50TypesMod.Xyz50
  @JSName("lab")
  var lab_Original: js.Function1[/* color */ OmitLabmode, typings.culori.srcXyz50TypesMod.Xyz50]
  
  def rgb(rgb: OmitRgbmode): typings.culori.srcXyz50TypesMod.Xyz50
  @JSName("rgb")
  var rgb_Original: js.Function1[/* rgb */ OmitRgbmode, typings.culori.srcXyz50TypesMod.Xyz50]
}
object `41` {
  
  inline def apply(
    lab: /* color */ OmitLabmode => typings.culori.srcXyz50TypesMod.Xyz50,
    rgb: /* rgb */ OmitRgbmode => typings.culori.srcXyz50TypesMod.Xyz50
  ): `41` = {
    val __obj = js.Dynamic.literal(lab = js.Any.fromFunction1(lab), rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[`41`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `41`] (val x: Self) extends AnyVal {
    
    inline def setLab(value: /* color */ OmitLabmode => typings.culori.srcXyz50TypesMod.Xyz50): Self = StObject.set(x, "lab", js.Any.fromFunction1(value))
    
    inline def setRgb(value: /* rgb */ OmitRgbmode => typings.culori.srcXyz50TypesMod.Xyz50): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
