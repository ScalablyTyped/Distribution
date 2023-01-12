package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HSV_
import typings.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7` extends StObject {
  
  def raw(from: RGB_): HSV_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ RGB_, HSV_]
}
object `7` {
  
  inline def apply(raw: /* from */ RGB_ => HSV_): `7` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`7`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `7`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ RGB_ => HSV_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
