package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HEX_
import typings.colorConvert.conversionsMod.KEYWORD_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `135` extends StObject {
  
  def raw(from: KEYWORD_): HEX_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ KEYWORD_, HEX_]
}
object `135` {
  
  @scala.inline
  def apply(raw: /* from */ KEYWORD_ => HEX_): `135` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`135`]
  }
  
  @scala.inline
  implicit class `135MutableBuilder`[Self <: `135`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ KEYWORD_ => HEX_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
