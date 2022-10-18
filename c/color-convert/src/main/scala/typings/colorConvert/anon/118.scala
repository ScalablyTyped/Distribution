package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HCG_
import typings.colorConvert.conversionsMod.HSV_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `118` extends StObject {
  
  def raw(from: HSV_): HCG_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSV_, HCG_]
}
object `118` {
  
  inline def apply(raw: /* from */ HSV_ => HCG_): `118` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`118`]
  }
  
  extension [Self <: `118`](x: Self) {
    
    inline def setRaw(value: /* from */ HSV_ => HCG_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
