package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.GRAY_
import typings.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  def raw(from: RGB_): GRAY_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ RGB_, GRAY_]
}
object `1` {
  
  inline def apply(raw: /* from */ RGB_ => GRAY_): `1` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ RGB_ => GRAY_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
