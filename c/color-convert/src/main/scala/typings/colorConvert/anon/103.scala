package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.HSL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `103` extends StObject {
  
  def raw(from: HSL_): CMYK_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSL_, CMYK_]
}
object `103` {
  
  inline def apply(raw: /* from */ HSL_ => CMYK_): `103` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`103`]
  }
  
  extension [Self <: `103`](x: Self) {
    
    inline def setRaw(value: /* from */ HSL_ => CMYK_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
