package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.KEYWORD_
import typings.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `182` extends StObject {
  
  def raw(from: RGB_): KEYWORD_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ RGB_, KEYWORD_]
}
object `182` {
  
  inline def apply(raw: /* from */ RGB_ => KEYWORD_): `182` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`182`]
  }
  
  extension [Self <: `182`](x: Self) {
    
    inline def setRaw(value: /* from */ RGB_ => KEYWORD_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
