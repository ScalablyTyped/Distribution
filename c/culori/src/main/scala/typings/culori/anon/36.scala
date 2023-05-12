package typings.culori.anon

import typings.culori.srcProphotoTypesMod.Prophoto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `36` extends StObject {
  
  def rgb(rgb: OmitRgbmode): Prophoto
  
  def xyz50(color: OmitXyz50mode): Prophoto
  @JSName("xyz50")
  var xyz50_Original: js.Function1[/* color */ OmitXyz50mode, Prophoto]
}
object `36` {
  
  inline def apply(rgb: OmitRgbmode => Prophoto, xyz50: /* color */ OmitXyz50mode => Prophoto): `36` = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb), xyz50 = js.Any.fromFunction1(xyz50))
    __obj.asInstanceOf[`36`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `36`] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: OmitRgbmode => Prophoto): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    
    inline def setXyz50(value: /* color */ OmitXyz50mode => Prophoto): Self = StObject.set(x, "xyz50", js.Any.fromFunction1(value))
  }
}
