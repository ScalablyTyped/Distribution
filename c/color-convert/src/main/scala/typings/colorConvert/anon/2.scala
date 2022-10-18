package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.GRAY_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  def raw(from: ANSI16_): GRAY_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI16_, GRAY_]
}
object `2` {
  
  inline def apply(raw: /* from */ ANSI16_ => GRAY_): `2` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setRaw(value: /* from */ ANSI16_ => GRAY_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
