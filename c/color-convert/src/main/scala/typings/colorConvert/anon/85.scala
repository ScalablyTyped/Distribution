package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.KEYWORD_
import typings.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `85` extends StObject {
  
  def raw(from: LAB_): KEYWORD_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LAB_, KEYWORD_]
}
object `85` {
  
  @scala.inline
  def apply(raw: /* from */ LAB_ => KEYWORD_): `85` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`85`]
  }
  
  @scala.inline
  implicit class `85MutableBuilder`[Self <: `85`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ LAB_ => KEYWORD_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
