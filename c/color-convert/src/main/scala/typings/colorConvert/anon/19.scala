package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.HSL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19` extends StObject {
  
  def raw(from: HSL_): CMYK_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSL_, CMYK_]
}
object `19` {
  
  @scala.inline
  def apply(raw: /* from */ HSL_ => CMYK_): `19` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`19`]
  }
  
  @scala.inline
  implicit class `19MutableBuilder`[Self <: `19`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ HSL_ => CMYK_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
