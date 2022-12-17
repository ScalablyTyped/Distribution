package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HEX_
import typings.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  def raw(from: RGB_): HEX_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ RGB_, HEX_]
}
object `9` {
  
  inline def apply(raw: /* from */ RGB_ => HEX_): `9` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`9`]
  }
  
  extension [Self <: `9`](x: Self) {
    
    inline def setRaw(value: /* from */ RGB_ => HEX_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
