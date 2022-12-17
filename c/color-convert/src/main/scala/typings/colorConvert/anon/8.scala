package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.LCH_
import typings.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  def raw(from: RGB_): LCH_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ RGB_, LCH_]
}
object `8` {
  
  inline def apply(raw: /* from */ RGB_ => LCH_): `8` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`8`]
  }
  
  extension [Self <: `8`](x: Self) {
    
    inline def setRaw(value: /* from */ RGB_ => LCH_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
