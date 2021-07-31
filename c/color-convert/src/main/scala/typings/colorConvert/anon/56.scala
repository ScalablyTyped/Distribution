package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.CMYK_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `56` extends StObject {
  
  def raw(from: CMYK_): APPLE_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ CMYK_, APPLE_]
}
object `56` {
  
  @scala.inline
  def apply(raw: /* from */ CMYK_ => APPLE_): `56` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`56`]
  }
  
  @scala.inline
  implicit class `56MutableBuilder`[Self <: `56`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ CMYK_ => APPLE_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
