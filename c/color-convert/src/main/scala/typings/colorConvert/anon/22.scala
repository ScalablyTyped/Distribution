package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HSL_
import typings.colorConvert.conversionsMod.HSV_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `22` extends StObject {
  
  def raw(from: HSL_): HSV_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSL_, HSV_]
}
object `22` {
  
  inline def apply(raw: /* from */ HSL_ => HSV_): `22` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`22`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `22`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ HSL_ => HSV_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
