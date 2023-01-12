package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HSV_
import typings.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `27` extends StObject {
  
  def raw(from: HSV_): RGB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSV_, RGB_]
}
object `27` {
  
  inline def apply(raw: /* from */ HSV_ => RGB_): `27` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`27`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `27`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ HSV_ => RGB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
