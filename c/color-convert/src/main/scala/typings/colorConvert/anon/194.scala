package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.LAB_
import typings.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `194` extends StObject {
  
  def raw(from: RGB_): LAB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ RGB_, LAB_]
}
object `194` {
  
  inline def apply(raw: /* from */ RGB_ => LAB_): `194` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`194`]
  }
  
  extension [Self <: `194`](x: Self) {
    
    inline def setRaw(value: /* from */ RGB_ => LAB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
