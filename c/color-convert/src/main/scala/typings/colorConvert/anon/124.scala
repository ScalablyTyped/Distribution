package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HEX_
import typings.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `124` extends StObject {
  
  def raw(from: HEX_): LAB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HEX_, LAB_]
}
object `124` {
  
  inline def apply(raw: /* from */ HEX_ => LAB_): `124` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`124`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `124`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ HEX_ => LAB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
