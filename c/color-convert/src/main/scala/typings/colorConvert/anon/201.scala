package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201` extends StObject {
  
  def raw(from: XYZ_): CMYK_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ XYZ_, CMYK_]
}
object `201` {
  
  inline def apply(raw: /* from */ XYZ_ => CMYK_): `201` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`201`]
  }
  
  extension [Self <: `201`](x: Self) {
    
    inline def setRaw(value: /* from */ XYZ_ => CMYK_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
