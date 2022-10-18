package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.HEX_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `89` extends StObject {
  
  def raw(from: HEX_): CMYK_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HEX_, CMYK_]
}
object `89` {
  
  inline def apply(raw: /* from */ HEX_ => CMYK_): `89` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`89`]
  }
  
  extension [Self <: `89`](x: Self) {
    
    inline def setRaw(value: /* from */ HEX_ => CMYK_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
