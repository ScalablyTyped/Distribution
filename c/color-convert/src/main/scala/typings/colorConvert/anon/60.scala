package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.HWB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `60` extends StObject {
  
  def raw(from: CMYK_): HWB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ CMYK_, HWB_]
}
object `60` {
  
  @scala.inline
  def apply(raw: /* from */ CMYK_ => HWB_): `60` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`60`]
  }
  
  @scala.inline
  implicit class `60MutableBuilder`[Self <: `60`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ CMYK_ => HWB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
