package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.HSV_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `123` extends StObject {
  
  def raw(from: HSV_): ANSI16_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSV_, ANSI16_]
}
object `123` {
  
  inline def apply(raw: /* from */ HSV_ => ANSI16_): `123` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`123`]
  }
  
  extension [Self <: `123`](x: Self) {
    
    inline def setRaw(value: /* from */ HSV_ => ANSI16_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
