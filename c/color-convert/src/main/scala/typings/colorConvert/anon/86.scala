package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.GRAY_
import typings.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `86` extends StObject {
  
  def raw(from: LAB_): GRAY_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LAB_, GRAY_]
}
object `86` {
  
  inline def apply(raw: /* from */ LAB_ => GRAY_): `86` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`86`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `86`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ LAB_ => GRAY_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
