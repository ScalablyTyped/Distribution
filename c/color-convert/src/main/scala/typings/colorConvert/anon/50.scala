package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HWB_
import typings.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `50` extends StObject {
  
  def raw(from: HWB_): LCH_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HWB_, LCH_]
}
object `50` {
  
  inline def apply(raw: /* from */ HWB_ => LCH_): `50` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`50`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `50`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ HWB_ => LCH_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
