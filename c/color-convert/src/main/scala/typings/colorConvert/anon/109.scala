package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `109` extends StObject {
  
  def raw(from: LCH_): ANSI16_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LCH_, ANSI16_]
}
object `109` {
  
  inline def apply(raw: /* from */ LCH_ => ANSI16_): `109` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`109`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `109`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ LCH_ => ANSI16_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
