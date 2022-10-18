package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HSV_
import typings.colorConvert.conversionsMod.HWB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `133` extends StObject {
  
  def raw(from: HWB_): HSV_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HWB_, HSV_]
}
object `133` {
  
  inline def apply(raw: /* from */ HWB_ => HSV_): `133` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`133`]
  }
  
  extension [Self <: `133`](x: Self) {
    
    inline def setRaw(value: /* from */ HWB_ => HSV_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
