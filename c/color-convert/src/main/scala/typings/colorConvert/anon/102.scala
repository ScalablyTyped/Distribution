package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HWB_
import typings.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `102` extends StObject {
  
  def raw(from: LCH_): HWB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LCH_, HWB_]
}
object `102` {
  
  inline def apply(raw: /* from */ LCH_ => HWB_): `102` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`102`]
  }
  
  extension [Self <: `102`](x: Self) {
    
    inline def setRaw(value: /* from */ LCH_ => HWB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
