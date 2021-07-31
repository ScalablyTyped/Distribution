package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.HWB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `45` extends StObject {
  
  def raw(from: HWB_): ANSI256_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HWB_, ANSI256_]
}
object `45` {
  
  @scala.inline
  def apply(raw: /* from */ HWB_ => ANSI256_): `45` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`45`]
  }
  
  @scala.inline
  implicit class `45MutableBuilder`[Self <: `45`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ HWB_ => ANSI256_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
