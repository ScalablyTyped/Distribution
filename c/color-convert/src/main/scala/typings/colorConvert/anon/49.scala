package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.HSV_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `49` extends StObject {
  
  def raw(from: CMYK_): HSV_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ CMYK_, HSV_]
}
object `49` {
  
  inline def apply(raw: /* from */ CMYK_ => HSV_): `49` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`49`]
  }
  
  extension [Self <: `49`](x: Self) {
    
    inline def setRaw(value: /* from */ CMYK_ => HSV_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
