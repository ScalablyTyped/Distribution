package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.HEX_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `112` extends StObject {
  
  def raw(from: HEX_): APPLE_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HEX_, APPLE_]
}
object `112` {
  
  inline def apply(raw: /* from */ HEX_ => APPLE_): `112` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`112`]
  }
  
  extension [Self <: `112`](x: Self) {
    
    inline def setRaw(value: /* from */ HEX_ => APPLE_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
