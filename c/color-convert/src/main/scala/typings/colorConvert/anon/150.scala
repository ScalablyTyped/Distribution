package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.HEX_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `150` extends StObject {
  
  def raw(from: ANSI16_): HEX_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI16_, HEX_]
}
object `150` {
  
  inline def apply(raw: /* from */ ANSI16_ => HEX_): `150` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`150`]
  }
  
  extension [Self <: `150`](x: Self) {
    
    inline def setRaw(value: /* from */ ANSI16_ => HEX_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
