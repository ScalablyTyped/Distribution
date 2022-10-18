package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `48` extends StObject {
  
  def raw(from: CMYK_): XYZ_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ CMYK_, XYZ_]
}
object `48` {
  
  inline def apply(raw: /* from */ CMYK_ => XYZ_): `48` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`48`]
  }
  
  extension [Self <: `48`](x: Self) {
    
    inline def setRaw(value: /* from */ CMYK_ => XYZ_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
