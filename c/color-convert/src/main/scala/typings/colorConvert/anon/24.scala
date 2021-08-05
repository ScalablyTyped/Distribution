package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HEX_
import typings.colorConvert.conversionsMod.HSL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `24` extends StObject {
  
  def raw(from: HSL_): HEX_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSL_, HEX_]
}
object `24` {
  
  inline def apply(raw: /* from */ HSL_ => HEX_): `24` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`24`]
  }
  
  extension [Self <: `24`](x: Self) {
    
    inline def setRaw(value: /* from */ HSL_ => HEX_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
