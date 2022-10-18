package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.GRAY_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `16` extends StObject {
  
  def raw(from: ANSI256_): GRAY_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI256_, GRAY_]
}
object `16` {
  
  inline def apply(raw: /* from */ ANSI256_ => GRAY_): `16` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`16`]
  }
  
  extension [Self <: `16`](x: Self) {
    
    inline def setRaw(value: /* from */ ANSI256_ => GRAY_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
