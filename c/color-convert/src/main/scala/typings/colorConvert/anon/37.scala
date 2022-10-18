package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.HEX_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `37` extends StObject {
  
  def raw(from: APPLE_): HEX_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ APPLE_, HEX_]
}
object `37` {
  
  inline def apply(raw: /* from */ APPLE_ => HEX_): `37` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`37`]
  }
  
  extension [Self <: `37`](x: Self) {
    
    inline def setRaw(value: /* from */ APPLE_ => HEX_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
