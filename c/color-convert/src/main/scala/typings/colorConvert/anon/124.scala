package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HSV_
import typings.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `124` extends StObject {
  
  def raw(from: HSV_): LAB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSV_, LAB_]
}
object `124` {
  
  inline def apply(raw: /* from */ HSV_ => LAB_): `124` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`124`]
  }
  
  extension [Self <: `124`](x: Self) {
    
    inline def setRaw(value: /* from */ HSV_ => LAB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
