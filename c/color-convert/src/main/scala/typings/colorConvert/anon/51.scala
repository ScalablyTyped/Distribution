package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.HEX_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `51` extends StObject {
  
  def raw(from: CMYK_): HEX_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ CMYK_, HEX_]
}
object `51` {
  
  inline def apply(raw: /* from */ CMYK_ => HEX_): `51` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`51`]
  }
  
  extension [Self <: `51`](x: Self) {
    
    inline def setRaw(value: /* from */ CMYK_ => HEX_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
