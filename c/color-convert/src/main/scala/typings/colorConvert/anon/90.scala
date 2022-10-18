package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HCG_
import typings.colorConvert.conversionsMod.HEX_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `90` extends StObject {
  
  def raw(from: HEX_): HCG_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HEX_, HCG_]
}
object `90` {
  
  inline def apply(raw: /* from */ HEX_ => HCG_): `90` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`90`]
  }
  
  extension [Self <: `90`](x: Self) {
    
    inline def setRaw(value: /* from */ HEX_ => HCG_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
