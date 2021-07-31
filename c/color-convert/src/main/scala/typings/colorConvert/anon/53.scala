package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.HWB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `53` extends StObject {
  
  def raw(from: HWB_): ANSI16_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HWB_, ANSI16_]
}
object `53` {
  
  @scala.inline
  def apply(raw: /* from */ HWB_ => ANSI16_): `53` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`53`]
  }
  
  @scala.inline
  implicit class `53MutableBuilder`[Self <: `53`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ HWB_ => ANSI16_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
