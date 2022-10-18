package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HWB_
import typings.colorConvert.conversionsMod.KEYWORD_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `143` extends StObject {
  
  def raw(from: KEYWORD_): HWB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ KEYWORD_, HWB_]
}
object `143` {
  
  inline def apply(raw: /* from */ KEYWORD_ => HWB_): `143` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`143`]
  }
  
  extension [Self <: `143`](x: Self) {
    
    inline def setRaw(value: /* from */ KEYWORD_ => HWB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
