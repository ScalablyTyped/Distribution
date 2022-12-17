package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `98` extends StObject {
  
  def raw(from: LCH_): APPLE_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LCH_, APPLE_]
}
object `98` {
  
  inline def apply(raw: /* from */ LCH_ => APPLE_): `98` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`98`]
  }
  
  extension [Self <: `98`](x: Self) {
    
    inline def setRaw(value: /* from */ LCH_ => APPLE_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
