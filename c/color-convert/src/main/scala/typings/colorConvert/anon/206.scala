package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HSL_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `206` extends StObject {
  
  def raw(from: XYZ_): HSL_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ XYZ_, HSL_]
}
object `206` {
  
  inline def apply(raw: /* from */ XYZ_ => HSL_): `206` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`206`]
  }
  
  extension [Self <: `206`](x: Self) {
    
    inline def setRaw(value: /* from */ XYZ_ => HSL_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
