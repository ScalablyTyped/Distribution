package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.HCG_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `173` extends StObject {
  
  def raw(from: HCG_): CMYK_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HCG_, CMYK_]
}
object `173` {
  
  @scala.inline
  def apply(raw: /* from */ HCG_ => CMYK_): `173` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`173`]
  }
  
  @scala.inline
  implicit class `173MutableBuilder`[Self <: `173`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ HCG_ => CMYK_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
