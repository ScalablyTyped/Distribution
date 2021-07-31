package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HWB_
import typings.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `41` extends StObject {
  
  def raw(from: HWB_): RGB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HWB_, RGB_]
}
object `41` {
  
  @scala.inline
  def apply(raw: /* from */ HWB_ => RGB_): `41` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`41`]
  }
  
  @scala.inline
  implicit class `41MutableBuilder`[Self <: `41`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ HWB_ => RGB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
