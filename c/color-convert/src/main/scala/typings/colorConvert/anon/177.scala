package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HEX_
import typings.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `177` extends StObject {
  
  def raw(from: LCH_): HEX_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LCH_, HEX_]
}
object `177` {
  
  inline def apply(raw: /* from */ LCH_ => HEX_): `177` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`177`]
  }
  
  extension [Self <: `177`](x: Self) {
    
    inline def setRaw(value: /* from */ LCH_ => HEX_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
