package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `43` extends StObject {
  
  def rgb(color: OmitRgbmode): typings.culori.srcXyz65TypesMod.Xyz65
  @JSName("rgb")
  var rgb_Original: js.Function1[/* color */ OmitRgbmode, typings.culori.srcXyz65TypesMod.Xyz65]
  
  def xyz50(color: OmitXyz50mode): typings.culori.srcXyz65TypesMod.Xyz65
  @JSName("xyz50")
  var xyz50_Original: js.Function1[/* color */ OmitXyz50mode, typings.culori.srcXyz65TypesMod.Xyz65]
}
object `43` {
  
  inline def apply(
    rgb: /* color */ OmitRgbmode => typings.culori.srcXyz65TypesMod.Xyz65,
    xyz50: /* color */ OmitXyz50mode => typings.culori.srcXyz65TypesMod.Xyz65
  ): `43` = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb), xyz50 = js.Any.fromFunction1(xyz50))
    __obj.asInstanceOf[`43`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `43`] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: /* color */ OmitRgbmode => typings.culori.srcXyz65TypesMod.Xyz65): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    
    inline def setXyz50(value: /* color */ OmitXyz50mode => typings.culori.srcXyz65TypesMod.Xyz65): Self = StObject.set(x, "xyz50", js.Any.fromFunction1(value))
  }
}
