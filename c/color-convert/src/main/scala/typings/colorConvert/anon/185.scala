package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HWB_
import typings.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `185` extends StObject {
  
  def raw(from: RGB_): HWB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ RGB_, HWB_]
}
object `185` {
  
  inline def apply(raw: /* from */ RGB_ => HWB_): `185` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`185`]
  }
  
  extension [Self <: `185`](x: Self) {
    
    inline def setRaw(value: /* from */ RGB_ => HWB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
