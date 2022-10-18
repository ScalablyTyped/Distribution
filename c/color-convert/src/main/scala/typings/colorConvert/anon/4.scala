package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.HWB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  def raw(from: ANSI16_): HWB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI16_, HWB_]
}
object `4` {
  
  inline def apply(raw: /* from */ ANSI16_ => HWB_): `4` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setRaw(value: /* from */ ANSI16_ => HWB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
