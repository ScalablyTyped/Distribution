package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HWB_
import typings.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `158` extends StObject {
  
  def raw(from: LAB_): HWB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LAB_, HWB_]
}
object `158` {
  
  inline def apply(raw: /* from */ LAB_ => HWB_): `158` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`158`]
  }
  
  extension [Self <: `158`](x: Self) {
    
    inline def setRaw(value: /* from */ LAB_ => HWB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
