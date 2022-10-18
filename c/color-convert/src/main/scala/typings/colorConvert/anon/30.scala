package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.APPLE_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `30` extends StObject {
  
  def raw(from: APPLE_): ANSI256_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ APPLE_, ANSI256_]
}
object `30` {
  
  inline def apply(raw: /* from */ APPLE_ => ANSI256_): `30` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`30`]
  }
  
  extension [Self <: `30`](x: Self) {
    
    inline def setRaw(value: /* from */ APPLE_ => ANSI256_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
