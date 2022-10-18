package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HCG_
import typings.colorConvert.conversionsMod.HSL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `80` extends StObject {
  
  def raw(from: HCG_): HSL_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HCG_, HSL_]
}
object `80` {
  
  inline def apply(raw: /* from */ HCG_ => HSL_): `80` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`80`]
  }
  
  extension [Self <: `80`](x: Self) {
    
    inline def setRaw(value: /* from */ HCG_ => HSL_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
