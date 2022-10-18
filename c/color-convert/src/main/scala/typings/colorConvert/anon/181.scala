package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `181` extends StObject {
  
  def raw(from: RGB_): APPLE_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ RGB_, APPLE_]
}
object `181` {
  
  inline def apply(raw: /* from */ RGB_ => APPLE_): `181` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`181`]
  }
  
  extension [Self <: `181`](x: Self) {
    
    inline def setRaw(value: /* from */ RGB_ => APPLE_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
