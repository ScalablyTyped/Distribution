package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HWB_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `132` extends StObject {
  
  def raw(from: HWB_): XYZ_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HWB_, XYZ_]
}
object `132` {
  
  inline def apply(raw: /* from */ HWB_ => XYZ_): `132` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`132`]
  }
  
  extension [Self <: `132`](x: Self) {
    
    inline def setRaw(value: /* from */ HWB_ => XYZ_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
