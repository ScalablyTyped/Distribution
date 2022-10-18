package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.GRAY_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `58` extends StObject {
  
  def raw(from: GRAY_): ANSI256_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ GRAY_, ANSI256_]
}
object `58` {
  
  inline def apply(raw: /* from */ GRAY_ => ANSI256_): `58` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`58`]
  }
  
  extension [Self <: `58`](x: Self) {
    
    inline def setRaw(value: /* from */ GRAY_ => ANSI256_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
