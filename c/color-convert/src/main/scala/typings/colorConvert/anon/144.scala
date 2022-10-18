package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.KEYWORD_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `144` extends StObject {
  
  def raw(from: KEYWORD_): CMYK_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ KEYWORD_, CMYK_]
}
object `144` {
  
  inline def apply(raw: /* from */ KEYWORD_ => CMYK_): `144` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`144`]
  }
  
  extension [Self <: `144`](x: Self) {
    
    inline def setRaw(value: /* from */ KEYWORD_ => CMYK_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
