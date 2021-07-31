package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.CMYK_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `59` extends StObject {
  
  def raw(from: CMYK_): ANSI256_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ CMYK_, ANSI256_]
}
object `59` {
  
  @scala.inline
  def apply(raw: /* from */ CMYK_ => ANSI256_): `59` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`59`]
  }
  
  @scala.inline
  implicit class `59MutableBuilder`[Self <: `59`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ CMYK_ => ANSI256_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
