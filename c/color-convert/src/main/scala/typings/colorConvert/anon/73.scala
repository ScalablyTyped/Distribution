package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `73` extends StObject {
  
  def raw(from: XYZ_): ANSI256_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ XYZ_, ANSI256_]
}
object `73` {
  
  inline def apply(raw: /* from */ XYZ_ => ANSI256_): `73` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`73`]
  }
  
  extension [Self <: `73`](x: Self) {
    
    inline def setRaw(value: /* from */ XYZ_ => ANSI256_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
