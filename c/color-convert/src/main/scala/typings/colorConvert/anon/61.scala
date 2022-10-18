package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.GRAY_
import typings.colorConvert.conversionsMod.HCG_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `61` extends StObject {
  
  def raw(from: GRAY_): HCG_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ GRAY_, HCG_]
}
object `61` {
  
  inline def apply(raw: /* from */ GRAY_ => HCG_): `61` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`61`]
  }
  
  extension [Self <: `61`](x: Self) {
    
    inline def setRaw(value: /* from */ GRAY_ => HCG_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
