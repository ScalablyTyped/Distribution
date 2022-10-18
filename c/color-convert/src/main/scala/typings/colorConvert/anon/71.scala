package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HCG_
import typings.colorConvert.conversionsMod.KEYWORD_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `71` extends StObject {
  
  def raw(from: HCG_): KEYWORD_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HCG_, KEYWORD_]
}
object `71` {
  
  inline def apply(raw: /* from */ HCG_ => KEYWORD_): `71` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`71`]
  }
  
  extension [Self <: `71`](x: Self) {
    
    inline def setRaw(value: /* from */ HCG_ => KEYWORD_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
