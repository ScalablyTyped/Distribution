package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HSV_
import typings.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `176` extends StObject {
  
  def raw(from: LCH_): HSV_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LCH_, HSV_]
}
object `176` {
  
  inline def apply(raw: /* from */ LCH_ => HSV_): `176` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`176`]
  }
  
  extension [Self <: `176`](x: Self) {
    
    inline def setRaw(value: /* from */ LCH_ => HSV_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
