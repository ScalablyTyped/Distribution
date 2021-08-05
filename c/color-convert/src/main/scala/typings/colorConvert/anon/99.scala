package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.KEYWORD_
import typings.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `99` extends StObject {
  
  def raw(from: LCH_): KEYWORD_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LCH_, KEYWORD_]
}
object `99` {
  
  inline def apply(raw: /* from */ LCH_ => KEYWORD_): `99` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`99`]
  }
  
  extension [Self <: `99`](x: Self) {
    
    inline def setRaw(value: /* from */ LCH_ => KEYWORD_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
