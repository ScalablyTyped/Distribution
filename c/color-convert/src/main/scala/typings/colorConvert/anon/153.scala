package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.LAB_
import typings.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `153` extends StObject {
  
  def raw(from: LAB_): RGB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LAB_, RGB_]
}
object `153` {
  
  inline def apply(raw: /* from */ LAB_ => RGB_): `153` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`153`]
  }
  
  extension [Self <: `153`](x: Self) {
    
    inline def setRaw(value: /* from */ LAB_ => RGB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
