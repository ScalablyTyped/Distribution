package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7` extends StObject {
  
  def raw(from: ANSI16_): XYZ_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI16_, XYZ_]
}
object `7` {
  
  inline def apply(raw: /* from */ ANSI16_ => XYZ_): `7` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`7`]
  }
  
  extension [Self <: `7`](x: Self) {
    
    inline def setRaw(value: /* from */ ANSI16_ => XYZ_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
