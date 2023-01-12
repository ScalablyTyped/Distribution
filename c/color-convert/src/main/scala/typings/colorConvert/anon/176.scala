package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HCG_
import typings.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `176` extends StObject {
  
  def raw(from: HCG_): LCH_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HCG_, LCH_]
}
object `176` {
  
  inline def apply(raw: /* from */ HCG_ => LCH_): `176` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`176`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `176`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ HCG_ => LCH_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
