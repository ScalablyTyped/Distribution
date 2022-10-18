package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HWB_
import typings.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `138` extends StObject {
  
  def raw(from: HWB_): LAB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HWB_, LAB_]
}
object `138` {
  
  inline def apply(raw: /* from */ HWB_ => LAB_): `138` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`138`]
  }
  
  extension [Self <: `138`](x: Self) {
    
    inline def setRaw(value: /* from */ HWB_ => LAB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
