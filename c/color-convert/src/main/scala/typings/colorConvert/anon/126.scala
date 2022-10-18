package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.HWB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `126` extends StObject {
  
  def raw(from: HWB_): APPLE_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HWB_, APPLE_]
}
object `126` {
  
  inline def apply(raw: /* from */ HWB_ => APPLE_): `126` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`126`]
  }
  
  extension [Self <: `126`](x: Self) {
    
    inline def setRaw(value: /* from */ HWB_ => APPLE_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
