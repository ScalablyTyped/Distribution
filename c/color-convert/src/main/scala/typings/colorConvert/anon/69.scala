package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HCG_
import typings.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `69` extends StObject {
  
  def raw(from: HCG_): RGB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HCG_, RGB_]
}
object `69` {
  
  inline def apply(raw: /* from */ HCG_ => RGB_): `69` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`69`]
  }
  
  extension [Self <: `69`](x: Self) {
    
    inline def setRaw(value: /* from */ HCG_ => RGB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
