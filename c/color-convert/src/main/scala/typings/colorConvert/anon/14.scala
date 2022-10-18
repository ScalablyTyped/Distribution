package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.APPLE_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  def raw(from: ANSI256_): APPLE_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI256_, APPLE_]
}
object `14` {
  
  inline def apply(raw: /* from */ ANSI256_ => APPLE_): `14` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`14`]
  }
  
  extension [Self <: `14`](x: Self) {
    
    inline def setRaw(value: /* from */ ANSI256_ => APPLE_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
