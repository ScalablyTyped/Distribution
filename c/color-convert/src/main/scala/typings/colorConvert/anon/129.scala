package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.HWB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `129` extends StObject {
  
  def raw(from: HWB_): ANSI256_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HWB_, ANSI256_]
}
object `129` {
  
  inline def apply(raw: /* from */ HWB_ => ANSI256_): `129` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`129`]
  }
  
  extension [Self <: `129`](x: Self) {
    
    inline def setRaw(value: /* from */ HWB_ => ANSI256_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
