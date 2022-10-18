package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.HCG_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `33` extends StObject {
  
  def raw(from: APPLE_): HCG_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ APPLE_, HCG_]
}
object `33` {
  
  inline def apply(raw: /* from */ APPLE_ => HCG_): `33` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`33`]
  }
  
  extension [Self <: `33`](x: Self) {
    
    inline def setRaw(value: /* from */ APPLE_ => HCG_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
