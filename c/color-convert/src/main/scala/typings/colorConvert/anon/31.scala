package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.HWB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `31` extends StObject {
  
  def raw(from: APPLE_): HWB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ APPLE_, HWB_]
}
object `31` {
  
  inline def apply(raw: /* from */ APPLE_ => HWB_): `31` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`31`]
  }
  
  extension [Self <: `31`](x: Self) {
    
    inline def setRaw(value: /* from */ APPLE_ => HWB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
