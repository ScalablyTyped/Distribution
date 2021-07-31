package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.ANSI256_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `165` extends StObject {
  
  def raw(from: ANSI256_): ANSI16_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI256_, ANSI16_]
}
object `165` {
  
  @scala.inline
  def apply(raw: /* from */ ANSI256_ => ANSI16_): `165` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`165`]
  }
  
  @scala.inline
  implicit class `165MutableBuilder`[Self <: `165`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ ANSI256_ => ANSI16_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
