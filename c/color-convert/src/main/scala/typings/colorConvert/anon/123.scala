package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.HEX_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `123` extends StObject {
  
  def raw(from: HEX_): ANSI16_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HEX_, ANSI16_]
}
object `123` {
  
  inline def apply(raw: /* from */ HEX_ => ANSI16_): `123` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`123`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `123`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ HEX_ => ANSI16_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
