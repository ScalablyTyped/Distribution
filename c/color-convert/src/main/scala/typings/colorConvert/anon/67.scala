package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.CMYK_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `67` extends StObject {
  
  def raw(from: CMYK_): ANSI16_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ CMYK_, ANSI16_]
}
object `67` {
  
  inline def apply(raw: /* from */ CMYK_ => ANSI16_): `67` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`67`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `67`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ CMYK_ => ANSI16_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
