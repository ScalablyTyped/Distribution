package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HSV_
import typings.colorConvert.conversionsMod.KEYWORD_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `147` extends StObject {
  
  def raw(from: KEYWORD_): HSV_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ KEYWORD_, HSV_]
}
object `147` {
  
  inline def apply(raw: /* from */ KEYWORD_ => HSV_): `147` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`147`]
  }
  
  extension [Self <: `147`](x: Self) {
    
    inline def setRaw(value: /* from */ KEYWORD_ => HSV_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
