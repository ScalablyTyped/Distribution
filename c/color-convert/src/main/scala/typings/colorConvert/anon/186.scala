package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `186` extends StObject {
  
  def raw(from: RGB_): CMYK_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ RGB_, CMYK_]
}
object `186` {
  
  inline def apply(raw: /* from */ RGB_ => CMYK_): `186` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`186`]
  }
  
  extension [Self <: `186`](x: Self) {
    
    inline def setRaw(value: /* from */ RGB_ => CMYK_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
