package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.RGB_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `188` extends StObject {
  
  def raw(from: RGB_): XYZ_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ RGB_, XYZ_]
}
object `188` {
  
  inline def apply(raw: /* from */ RGB_ => XYZ_): `188` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`188`]
  }
  
  extension [Self <: `188`](x: Self) {
    
    inline def setRaw(value: /* from */ RGB_ => XYZ_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
