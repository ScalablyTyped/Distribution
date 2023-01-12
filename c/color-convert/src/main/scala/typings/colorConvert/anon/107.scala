package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HEX_
import typings.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `107` extends StObject {
  
  def raw(from: LCH_): HEX_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LCH_, HEX_]
}
object `107` {
  
  inline def apply(raw: /* from */ LCH_ => HEX_): `107` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`107`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `107`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ LCH_ => HEX_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
