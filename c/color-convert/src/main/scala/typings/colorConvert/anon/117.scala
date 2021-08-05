package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.HEX_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `117` extends StObject {
  
  def raw(from: HEX_): CMYK_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HEX_, CMYK_]
}
object `117` {
  
  inline def apply(raw: /* from */ HEX_ => CMYK_): `117` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`117`]
  }
  
  extension [Self <: `117`](x: Self) {
    
    inline def setRaw(value: /* from */ HEX_ => CMYK_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
