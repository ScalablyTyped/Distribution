package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HEX_
import typings.colorConvert.conversionsMod.KEYWORD_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `85` extends StObject {
  
  def raw(from: HEX_): KEYWORD_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HEX_, KEYWORD_]
}
object `85` {
  
  inline def apply(raw: /* from */ HEX_ => KEYWORD_): `85` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`85`]
  }
  
  extension [Self <: `85`](x: Self) {
    
    inline def setRaw(value: /* from */ HEX_ => KEYWORD_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
