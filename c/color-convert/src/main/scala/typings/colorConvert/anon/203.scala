package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HSV_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `203` extends StObject {
  
  def raw(from: XYZ_): HSV_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ XYZ_, HSV_]
}
object `203` {
  
  inline def apply(raw: /* from */ XYZ_ => HSV_): `203` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`203`]
  }
  
  extension [Self <: `203`](x: Self) {
    
    inline def setRaw(value: /* from */ XYZ_ => HSV_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
