package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `41` extends StObject {
  
  def raw(from: CMYK_): RGB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ CMYK_, RGB_]
}
object `41` {
  
  inline def apply(raw: /* from */ CMYK_ => RGB_): `41` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`41`]
  }
  
  extension [Self <: `41`](x: Self) {
    
    inline def setRaw(value: /* from */ CMYK_ => RGB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
