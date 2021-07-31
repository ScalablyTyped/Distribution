package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.KEYWORD_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `141` extends StObject {
  
  def raw(from: ANSI16_): KEYWORD_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI16_, KEYWORD_]
}
object `141` {
  
  @scala.inline
  def apply(raw: /* from */ ANSI16_ => KEYWORD_): `141` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`141`]
  }
  
  @scala.inline
  implicit class `141MutableBuilder`[Self <: `141`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ ANSI16_ => KEYWORD_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
