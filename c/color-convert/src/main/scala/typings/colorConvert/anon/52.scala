package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.HSL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `52` extends StObject {
  
  def raw(from: CMYK_): HSL_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ CMYK_, HSL_]
}
object `52` {
  
  inline def apply(raw: /* from */ CMYK_ => HSL_): `52` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`52`]
  }
  
  extension [Self <: `52`](x: Self) {
    
    inline def setRaw(value: /* from */ CMYK_ => HSL_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
