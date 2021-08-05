package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.APPLE_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `193` extends StObject {
  
  def raw(from: APPLE_): ANSI16_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ APPLE_, ANSI16_]
}
object `193` {
  
  inline def apply(raw: /* from */ APPLE_ => ANSI16_): `193` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`193`]
  }
  
  extension [Self <: `193`](x: Self) {
    
    inline def setRaw(value: /* from */ APPLE_ => ANSI16_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
