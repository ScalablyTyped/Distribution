package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13` extends StObject {
  
  def raw(from: ANSI256_): RGB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI256_, RGB_]
}
object `13` {
  
  inline def apply(raw: /* from */ ANSI256_ => RGB_): `13` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`13`]
  }
  
  extension [Self <: `13`](x: Self) {
    
    inline def setRaw(value: /* from */ ANSI256_ => RGB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
