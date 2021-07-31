package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.HEX_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `117` extends StObject {
  
  def raw(from: HEX_): CMYK_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HEX_, CMYK_]
}
object `117` {
  
  @scala.inline
  def apply(raw: /* from */ HEX_ => CMYK_): `117` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`117`]
  }
  
  @scala.inline
  implicit class `117MutableBuilder`[Self <: `117`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ HEX_ => CMYK_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
