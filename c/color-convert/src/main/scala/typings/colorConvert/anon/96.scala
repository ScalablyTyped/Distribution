package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `96` extends StObject {
  
  def raw(from: LAB_): ANSI16_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LAB_, ANSI16_]
}
object `96` {
  
  @scala.inline
  def apply(raw: /* from */ LAB_ => ANSI16_): `96` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`96`]
  }
  
  @scala.inline
  implicit class `96MutableBuilder`[Self <: `96`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ LAB_ => ANSI16_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
