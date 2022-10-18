package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HCG_
import typings.colorConvert.conversionsMod.HEX_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `79` extends StObject {
  
  def raw(from: HCG_): HEX_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HCG_, HEX_]
}
object `79` {
  
  inline def apply(raw: /* from */ HCG_ => HEX_): `79` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`79`]
  }
  
  extension [Self <: `79`](x: Self) {
    
    inline def setRaw(value: /* from */ HCG_ => HEX_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
