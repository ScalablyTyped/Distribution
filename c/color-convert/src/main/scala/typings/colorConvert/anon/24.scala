package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.HSL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `24` extends StObject {
  
  def raw(from: ANSI256_): HSL_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI256_, HSL_]
}
object `24` {
  
  inline def apply(raw: /* from */ ANSI256_ => HSL_): `24` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`24`]
  }
  
  extension [Self <: `24`](x: Self) {
    
    inline def setRaw(value: /* from */ ANSI256_ => HSL_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
