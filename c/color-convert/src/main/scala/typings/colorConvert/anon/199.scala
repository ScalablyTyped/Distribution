package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.GRAY_
import typings.colorConvert.conversionsMod.HWB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `199` extends StObject {
  
  def raw(from: GRAY_): HWB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ GRAY_, HWB_]
}
object `199` {
  
  inline def apply(raw: /* from */ GRAY_ => HWB_): `199` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`199`]
  }
  
  extension [Self <: `199`](x: Self) {
    
    inline def setRaw(value: /* from */ GRAY_ => HWB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
