package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `153` extends StObject {
  
  def raw(from: ANSI256_): RGB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI256_, RGB_]
}
object `153` {
  
  @scala.inline
  def apply(raw: /* from */ ANSI256_ => RGB_): `153` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`153`]
  }
  
  @scala.inline
  implicit class `153MutableBuilder`[Self <: `153`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ ANSI256_ => RGB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
