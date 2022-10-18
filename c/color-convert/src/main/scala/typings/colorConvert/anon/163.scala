package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.LAB_
import typings.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `163` extends StObject {
  
  def raw(from: LAB_): LCH_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LAB_, LCH_]
}
object `163` {
  
  inline def apply(raw: /* from */ LAB_ => LCH_): `163` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`163`]
  }
  
  extension [Self <: `163`](x: Self) {
    
    inline def setRaw(value: /* from */ LAB_ => LCH_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
