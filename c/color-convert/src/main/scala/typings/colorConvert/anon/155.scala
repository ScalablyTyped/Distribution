package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.KEYWORD_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `155` extends StObject {
  
  def raw(from: ANSI256_): KEYWORD_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI256_, KEYWORD_]
}
object `155` {
  
  @scala.inline
  def apply(raw: /* from */ ANSI256_ => KEYWORD_): `155` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`155`]
  }
  
  @scala.inline
  implicit class `155MutableBuilder`[Self <: `155`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ ANSI256_ => KEYWORD_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
