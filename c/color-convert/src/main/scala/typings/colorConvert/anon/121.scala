package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HEX_
import typings.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `121` extends StObject {
  
  def raw(from: HEX_): LCH_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HEX_, LCH_]
}
object `121` {
  
  inline def apply(raw: /* from */ HEX_ => LCH_): `121` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`121`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `121`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ HEX_ => LCH_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
