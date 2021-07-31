package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HEX_
import typings.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `111` extends StObject {
  
  def raw(from: HEX_): RGB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HEX_, RGB_]
}
object `111` {
  
  @scala.inline
  def apply(raw: /* from */ HEX_ => RGB_): `111` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`111`]
  }
  
  @scala.inline
  implicit class `111MutableBuilder`[Self <: `111`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ HEX_ => RGB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
