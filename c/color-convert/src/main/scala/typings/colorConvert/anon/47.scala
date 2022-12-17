package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HCG_
import typings.colorConvert.conversionsMod.HWB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `47` extends StObject {
  
  def raw(from: HWB_): HCG_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HWB_, HCG_]
}
object `47` {
  
  inline def apply(raw: /* from */ HWB_ => HCG_): `47` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`47`]
  }
  
  extension [Self <: `47`](x: Self) {
    
    inline def setRaw(value: /* from */ HWB_ => HCG_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
