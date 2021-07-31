package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.CMYK_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `158` extends StObject {
  
  def raw(from: ANSI256_): CMYK_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI256_, CMYK_]
}
object `158` {
  
  @scala.inline
  def apply(raw: /* from */ ANSI256_ => CMYK_): `158` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`158`]
  }
  
  @scala.inline
  implicit class `158MutableBuilder`[Self <: `158`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ ANSI256_ => CMYK_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
