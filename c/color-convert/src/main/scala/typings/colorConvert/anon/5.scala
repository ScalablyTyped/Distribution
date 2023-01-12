package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HCG_
import typings.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  def raw(from: RGB_): HCG_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ RGB_, HCG_]
}
object `5` {
  
  inline def apply(raw: /* from */ RGB_ => HCG_): `5` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`5`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `5`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ RGB_ => HCG_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
