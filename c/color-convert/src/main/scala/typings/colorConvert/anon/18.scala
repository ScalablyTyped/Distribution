package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HSL_
import typings.colorConvert.conversionsMod.HWB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18` extends StObject {
  
  def raw(from: HSL_): HWB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSL_, HWB_]
}
object `18` {
  
  inline def apply(raw: /* from */ HSL_ => HWB_): `18` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`18`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `18`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ HSL_ => HWB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
