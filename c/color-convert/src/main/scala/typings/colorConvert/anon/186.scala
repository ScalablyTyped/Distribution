package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.CMYK_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `186` extends StObject {
  
  def raw(from: APPLE_): CMYK_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ APPLE_, CMYK_]
}
object `186` {
  
  @scala.inline
  def apply(raw: /* from */ APPLE_ => CMYK_): `186` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`186`]
  }
  
  @scala.inline
  implicit class `186MutableBuilder`[Self <: `186`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ APPLE_ => CMYK_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
