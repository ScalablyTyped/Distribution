package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HSL_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `105` extends StObject {
  
  def raw(from: HSL_): XYZ_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSL_, XYZ_]
}
object `105` {
  
  inline def apply(raw: /* from */ HSL_ => XYZ_): `105` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`105`]
  }
  
  extension [Self <: `105`](x: Self) {
    
    inline def setRaw(value: /* from */ HSL_ => XYZ_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
