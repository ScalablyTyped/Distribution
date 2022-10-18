package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HEX_
import typings.colorConvert.conversionsMod.HWB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `135` extends StObject {
  
  def raw(from: HWB_): HEX_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HWB_, HEX_]
}
object `135` {
  
  inline def apply(raw: /* from */ HWB_ => HEX_): `135` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`135`]
  }
  
  extension [Self <: `135`](x: Self) {
    
    inline def setRaw(value: /* from */ HWB_ => HEX_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
