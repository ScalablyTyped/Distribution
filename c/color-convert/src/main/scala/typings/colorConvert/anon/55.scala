package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.GRAY_
import typings.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `55` extends StObject {
  
  def raw(from: GRAY_): RGB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ GRAY_, RGB_]
}
object `55` {
  
  inline def apply(raw: /* from */ GRAY_ => RGB_): `55` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`55`]
  }
  
  extension [Self <: `55`](x: Self) {
    
    inline def setRaw(value: /* from */ GRAY_ => RGB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
