package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Raw extends StObject {
  
  def raw(from: RGB_): APPLE_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ RGB_, APPLE_]
}
object Raw {
  
  inline def apply(raw: /* from */ RGB_ => APPLE_): Raw = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[Raw]
  }
  
  extension [Self <: Raw](x: Self) {
    
    inline def setRaw(value: /* from */ RGB_ => APPLE_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
