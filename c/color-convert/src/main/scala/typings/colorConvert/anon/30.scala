package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.GRAY_
import typings.colorConvert.conversionsMod.HSV_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `30` extends StObject {
  
  def raw(from: HSV_): GRAY_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSV_, GRAY_]
}
object `30` {
  
  inline def apply(raw: /* from */ HSV_ => GRAY_): `30` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`30`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `30`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ HSV_ => GRAY_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
