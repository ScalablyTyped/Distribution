package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.HWB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `46` extends StObject {
  
  def raw(from: HWB_): CMYK_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HWB_, CMYK_]
}
object `46` {
  
  @scala.inline
  def apply(raw: /* from */ HWB_ => CMYK_): `46` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`46`]
  }
  
  @scala.inline
  implicit class `46MutableBuilder`[Self <: `46`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ HWB_ => CMYK_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
