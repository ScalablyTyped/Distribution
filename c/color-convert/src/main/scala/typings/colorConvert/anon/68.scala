package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `68` extends StObject {
  
  def raw(from: CMYK_): LAB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ CMYK_, LAB_]
}
object `68` {
  
  inline def apply(raw: /* from */ CMYK_ => LAB_): `68` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`68`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `68`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ CMYK_ => LAB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
