package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HSL_
import typings.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `95` extends StObject {
  
  def raw(from: LAB_): HSL_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LAB_, HSL_]
}
object `95` {
  
  inline def apply(raw: /* from */ LAB_ => HSL_): `95` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`95`]
  }
  
  extension [Self <: `95`](x: Self) {
    
    inline def setRaw(value: /* from */ LAB_ => HSL_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
