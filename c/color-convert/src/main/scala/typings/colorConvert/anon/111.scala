package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HSV_
import typings.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `111` extends StObject {
  
  def raw(from: HSV_): RGB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSV_, RGB_]
}
object `111` {
  
  inline def apply(raw: /* from */ HSV_ => RGB_): `111` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`111`]
  }
  
  extension [Self <: `111`](x: Self) {
    
    inline def setRaw(value: /* from */ HSV_ => RGB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
