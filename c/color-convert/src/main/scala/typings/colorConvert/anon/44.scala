package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.GRAY_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `44` extends StObject {
  
  def raw(from: CMYK_): GRAY_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ CMYK_, GRAY_]
}
object `44` {
  
  inline def apply(raw: /* from */ CMYK_ => GRAY_): `44` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`44`]
  }
  
  extension [Self <: `44`](x: Self) {
    
    inline def setRaw(value: /* from */ CMYK_ => GRAY_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
