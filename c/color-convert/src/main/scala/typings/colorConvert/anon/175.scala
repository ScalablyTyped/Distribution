package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.LCH_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `175` extends StObject {
  
  def raw(from: LCH_): XYZ_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LCH_, XYZ_]
}
object `175` {
  
  inline def apply(raw: /* from */ LCH_ => XYZ_): `175` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`175`]
  }
  
  extension [Self <: `175`](x: Self) {
    
    inline def setRaw(value: /* from */ LCH_ => XYZ_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
