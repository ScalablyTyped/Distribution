package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `40` extends StObject {
  
  def raw(from: APPLE_): LAB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ APPLE_, LAB_]
}
object `40` {
  
  inline def apply(raw: /* from */ APPLE_ => LAB_): `40` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`40`]
  }
  
  extension [Self <: `40`](x: Self) {
    
    inline def setRaw(value: /* from */ APPLE_ => LAB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
