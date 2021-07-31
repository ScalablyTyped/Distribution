package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.HEX_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `115` extends StObject {
  
  def raw(from: HEX_): ANSI256_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HEX_, ANSI256_]
}
object `115` {
  
  @scala.inline
  def apply(raw: /* from */ HEX_ => ANSI256_): `115` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`115`]
  }
  
  @scala.inline
  implicit class `115MutableBuilder`[Self <: `115`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ HEX_ => ANSI256_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
