package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HEX_
import typings.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `164` extends StObject {
  
  def raw(from: LAB_): HEX_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LAB_, HEX_]
}
object `164` {
  
  inline def apply(raw: /* from */ LAB_ => HEX_): `164` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`164`]
  }
  
  extension [Self <: `164`](x: Self) {
    
    inline def setRaw(value: /* from */ LAB_ => HEX_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
