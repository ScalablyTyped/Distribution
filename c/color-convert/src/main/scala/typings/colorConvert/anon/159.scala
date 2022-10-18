package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `159` extends StObject {
  
  def raw(from: LAB_): CMYK_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LAB_, CMYK_]
}
object `159` {
  
  inline def apply(raw: /* from */ LAB_ => CMYK_): `159` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`159`]
  }
  
  extension [Self <: `159`](x: Self) {
    
    inline def setRaw(value: /* from */ LAB_ => CMYK_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
