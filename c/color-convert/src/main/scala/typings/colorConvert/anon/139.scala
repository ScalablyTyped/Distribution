package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `139` extends StObject {
  
  def raw(from: ANSI16_): RGB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI16_, RGB_]
}
object `139` {
  
  inline def apply(raw: /* from */ ANSI16_ => RGB_): `139` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`139`]
  }
  
  extension [Self <: `139`](x: Self) {
    
    inline def setRaw(value: /* from */ ANSI16_ => RGB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
