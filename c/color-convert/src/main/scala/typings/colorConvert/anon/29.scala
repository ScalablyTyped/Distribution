package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.GRAY_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `29` extends StObject {
  
  def raw(from: APPLE_): GRAY_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ APPLE_, GRAY_]
}
object `29` {
  
  inline def apply(raw: /* from */ APPLE_ => GRAY_): `29` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`29`]
  }
  
  extension [Self <: `29`](x: Self) {
    
    inline def setRaw(value: /* from */ APPLE_ => GRAY_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
