package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.KEYWORD_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `151` extends StObject {
  
  def raw(from: KEYWORD_): ANSI16_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ KEYWORD_, ANSI16_]
}
object `151` {
  
  inline def apply(raw: /* from */ KEYWORD_ => ANSI16_): `151` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`151`]
  }
  
  extension [Self <: `151`](x: Self) {
    
    inline def setRaw(value: /* from */ KEYWORD_ => ANSI16_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
