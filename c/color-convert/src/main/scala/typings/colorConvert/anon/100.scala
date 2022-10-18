package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.GRAY_
import typings.colorConvert.conversionsMod.HSL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `100` extends StObject {
  
  def raw(from: HSL_): GRAY_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSL_, GRAY_]
}
object `100` {
  
  inline def apply(raw: /* from */ HSL_ => GRAY_): `100` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`100`]
  }
  
  extension [Self <: `100`](x: Self) {
    
    inline def setRaw(value: /* from */ HSL_ => GRAY_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
