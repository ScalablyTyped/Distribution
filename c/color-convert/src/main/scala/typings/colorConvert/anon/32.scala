package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.CMYK_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `32` extends StObject {
  
  def raw(from: APPLE_): CMYK_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ APPLE_, CMYK_]
}
object `32` {
  
  inline def apply(raw: /* from */ APPLE_ => CMYK_): `32` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`32`]
  }
  
  extension [Self <: `32`](x: Self) {
    
    inline def setRaw(value: /* from */ APPLE_ => CMYK_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
