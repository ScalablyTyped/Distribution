package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HSV_
import typings.colorConvert.conversionsMod.HWB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `49` extends StObject {
  
  def raw(from: HWB_): HSV_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HWB_, HSV_]
}
object `49` {
  
  inline def apply(raw: /* from */ HWB_ => HSV_): `49` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`49`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `49`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ HWB_ => HSV_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
