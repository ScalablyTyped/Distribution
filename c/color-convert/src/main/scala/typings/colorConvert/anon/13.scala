package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HSL_
import typings.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13` extends StObject {
  
  def raw(from: HSL_): RGB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSL_, RGB_]
}
object `13` {
  
  @scala.inline
  def apply(raw: /* from */ HSL_ => RGB_): `13` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`13`]
  }
  
  @scala.inline
  implicit class `13MutableBuilder`[Self <: `13`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ HSL_ => RGB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
