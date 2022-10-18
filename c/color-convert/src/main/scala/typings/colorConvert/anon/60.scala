package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.GRAY_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `60` extends StObject {
  
  def raw(from: GRAY_): CMYK_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ GRAY_, CMYK_]
}
object `60` {
  
  inline def apply(raw: /* from */ GRAY_ => CMYK_): `60` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`60`]
  }
  
  extension [Self <: `60`](x: Self) {
    
    inline def setRaw(value: /* from */ GRAY_ => CMYK_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
