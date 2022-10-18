package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.HSV_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21` extends StObject {
  
  def raw(from: ANSI256_): HSV_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI256_, HSV_]
}
object `21` {
  
  inline def apply(raw: /* from */ ANSI256_ => HSV_): `21` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`21`]
  }
  
  extension [Self <: `21`](x: Self) {
    
    inline def setRaw(value: /* from */ ANSI256_ => HSV_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
