package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.HSV_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `115` extends StObject {
  
  def raw(from: HSV_): ANSI256_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSV_, ANSI256_]
}
object `115` {
  
  inline def apply(raw: /* from */ HSV_ => ANSI256_): `115` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`115`]
  }
  
  extension [Self <: `115`](x: Self) {
    
    inline def setRaw(value: /* from */ HSV_ => ANSI256_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
