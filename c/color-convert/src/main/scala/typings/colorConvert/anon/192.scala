package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.HSL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `192` extends StObject {
  
  def raw(from: APPLE_): HSL_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ APPLE_, HSL_]
}
object `192` {
  
  inline def apply(raw: /* from */ APPLE_ => HSL_): `192` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`192`]
  }
  
  extension [Self <: `192`](x: Self) {
    
    inline def setRaw(value: /* from */ APPLE_ => HSL_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
