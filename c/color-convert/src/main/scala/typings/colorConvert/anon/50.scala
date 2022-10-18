package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `50` extends StObject {
  
  def raw(from: CMYK_): LCH_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ CMYK_, LCH_]
}
object `50` {
  
  inline def apply(raw: /* from */ CMYK_ => LCH_): `50` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`50`]
  }
  
  extension [Self <: `50`](x: Self) {
    
    inline def setRaw(value: /* from */ CMYK_ => LCH_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
