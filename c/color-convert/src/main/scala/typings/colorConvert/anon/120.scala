package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HEX_
import typings.colorConvert.conversionsMod.HSV_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `120` extends StObject {
  
  def raw(from: HEX_): HSV_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HEX_, HSV_]
}
object `120` {
  
  inline def apply(raw: /* from */ HEX_ => HSV_): `120` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`120`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `120`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ HEX_ => HSV_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
