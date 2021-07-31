package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.KEYWORD_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `128` extends StObject {
  
  def raw(from: KEYWORD_): ANSI256_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ KEYWORD_, ANSI256_]
}
object `128` {
  
  @scala.inline
  def apply(raw: /* from */ KEYWORD_ => ANSI256_): `128` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`128`]
  }
  
  @scala.inline
  implicit class `128MutableBuilder`[Self <: `128`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ KEYWORD_ => ANSI256_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
