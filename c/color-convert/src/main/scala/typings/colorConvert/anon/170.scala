package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.GRAY_
import typings.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `170` extends StObject {
  
  def raw(from: LCH_): GRAY_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LCH_, GRAY_]
}
object `170` {
  
  inline def apply(raw: /* from */ LCH_ => GRAY_): `170` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`170`]
  }
  
  extension [Self <: `170`](x: Self) {
    
    inline def setRaw(value: /* from */ LCH_ => GRAY_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
