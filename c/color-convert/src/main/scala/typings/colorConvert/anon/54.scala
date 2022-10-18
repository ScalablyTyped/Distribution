package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `54` extends StObject {
  
  def raw(from: CMYK_): LAB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ CMYK_, LAB_]
}
object `54` {
  
  inline def apply(raw: /* from */ CMYK_ => LAB_): `54` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`54`]
  }
  
  extension [Self <: `54`](x: Self) {
    
    inline def setRaw(value: /* from */ CMYK_ => LAB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
