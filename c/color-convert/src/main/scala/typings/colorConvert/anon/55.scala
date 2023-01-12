package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `55` extends StObject {
  
  def raw(from: CMYK_): RGB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ CMYK_, RGB_]
}
object `55` {
  
  inline def apply(raw: /* from */ CMYK_ => RGB_): `55` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`55`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `55`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ CMYK_ => RGB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
