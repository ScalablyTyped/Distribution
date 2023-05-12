package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RgbXyz50 extends StObject {
  
  def rgb(color: OmitRgbmode): typings.culori.srcLabTypesMod.Lab
  @JSName("rgb")
  var rgb_Original: js.Function1[/* color */ OmitRgbmode, typings.culori.srcLabTypesMod.Lab]
  
  def xyz50(color: OmitXyz50mode): typings.culori.srcLabTypesMod.Lab
  @JSName("xyz50")
  var xyz50_Original: js.Function1[/* color */ OmitXyz50mode, typings.culori.srcLabTypesMod.Lab]
}
object RgbXyz50 {
  
  inline def apply(
    rgb: /* color */ OmitRgbmode => typings.culori.srcLabTypesMod.Lab,
    xyz50: /* color */ OmitXyz50mode => typings.culori.srcLabTypesMod.Lab
  ): RgbXyz50 = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb), xyz50 = js.Any.fromFunction1(xyz50))
    __obj.asInstanceOf[RgbXyz50]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RgbXyz50] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: /* color */ OmitRgbmode => typings.culori.srcLabTypesMod.Lab): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    
    inline def setXyz50(value: /* color */ OmitXyz50mode => typings.culori.srcLabTypesMod.Lab): Self = StObject.set(x, "xyz50", js.Any.fromFunction1(value))
  }
}
