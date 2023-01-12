package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HCG_
import typings.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `104` extends StObject {
  
  def raw(from: LCH_): HCG_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LCH_, HCG_]
}
object `104` {
  
  inline def apply(raw: /* from */ LCH_ => HCG_): `104` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`104`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `104`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ LCH_ => HCG_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
