package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.HCG_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `179` extends StObject {
  
  def raw(from: HCG_): ANSI16_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HCG_, ANSI16_]
}
object `179` {
  
  inline def apply(raw: /* from */ HCG_ => ANSI16_): `179` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`179`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `179`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ HCG_ => ANSI16_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
