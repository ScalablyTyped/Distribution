package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.GRAY_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `56` extends StObject {
  
  def raw(from: GRAY_): APPLE_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ GRAY_, APPLE_]
}
object `56` {
  
  inline def apply(raw: /* from */ GRAY_ => APPLE_): `56` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`56`]
  }
  
  extension [Self <: `56`](x: Self) {
    
    inline def setRaw(value: /* from */ GRAY_ => APPLE_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
