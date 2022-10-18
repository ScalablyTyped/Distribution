package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.GRAY_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `198` extends StObject {
  
  def raw(from: XYZ_): GRAY_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ XYZ_, GRAY_]
}
object `198` {
  
  inline def apply(raw: /* from */ XYZ_ => GRAY_): `198` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`198`]
  }
  
  extension [Self <: `198`](x: Self) {
    
    inline def setRaw(value: /* from */ XYZ_ => GRAY_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
