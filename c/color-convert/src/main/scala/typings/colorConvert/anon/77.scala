package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HSV_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `77` extends StObject {
  
  def raw(from: XYZ_): HSV_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ XYZ_, HSV_]
}
object `77` {
  
  inline def apply(raw: /* from */ XYZ_ => HSV_): `77` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`77`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `77`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ XYZ_ => HSV_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
