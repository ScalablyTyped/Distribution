package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HEX_
import typings.colorConvert.conversionsMod.HSV_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `121` extends StObject {
  
  def raw(from: HSV_): HEX_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSV_, HEX_]
}
object `121` {
  
  inline def apply(raw: /* from */ HSV_ => HEX_): `121` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`121`]
  }
  
  extension [Self <: `121`](x: Self) {
    
    inline def setRaw(value: /* from */ HSV_ => HEX_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
