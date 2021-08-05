package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HEX_
import typings.colorConvert.conversionsMod.HSL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `122` extends StObject {
  
  def raw(from: HEX_): HSL_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HEX_, HSL_]
}
object `122` {
  
  inline def apply(raw: /* from */ HEX_ => HSL_): `122` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`122`]
  }
  
  extension [Self <: `122`](x: Self) {
    
    inline def setRaw(value: /* from */ HEX_ => HSL_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
