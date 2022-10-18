package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.HEX_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `23` extends StObject {
  
  def raw(from: ANSI256_): HEX_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI256_, HEX_]
}
object `23` {
  
  inline def apply(raw: /* from */ ANSI256_ => HEX_): `23` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`23`]
  }
  
  extension [Self <: `23`](x: Self) {
    
    inline def setRaw(value: /* from */ ANSI256_ => HEX_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
