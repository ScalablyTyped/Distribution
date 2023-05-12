package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `27` extends StObject {
  
  def rgb(c: OmitRgbmode): typings.culori.srcLuvTypesMod.Luv
  
  def xyz50(color: OmitXyz50mode): typings.culori.srcLuvTypesMod.Luv
  @JSName("xyz50")
  var xyz50_Original: js.Function1[/* color */ OmitXyz50mode, typings.culori.srcLuvTypesMod.Luv]
}
object `27` {
  
  inline def apply(
    rgb: OmitRgbmode => typings.culori.srcLuvTypesMod.Luv,
    xyz50: /* color */ OmitXyz50mode => typings.culori.srcLuvTypesMod.Luv
  ): `27` = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb), xyz50 = js.Any.fromFunction1(xyz50))
    __obj.asInstanceOf[`27`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `27`] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: OmitRgbmode => typings.culori.srcLuvTypesMod.Luv): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    
    inline def setXyz50(value: /* color */ OmitXyz50mode => typings.culori.srcLuvTypesMod.Luv): Self = StObject.set(x, "xyz50", js.Any.fromFunction1(value))
  }
}
