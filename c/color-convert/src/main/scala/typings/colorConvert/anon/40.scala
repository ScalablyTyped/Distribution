package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HSV_
import typings.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `40` extends StObject {
  
  def raw(from: HSV_): LAB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSV_, LAB_]
}
object `40` {
  
  inline def apply(raw: /* from */ HSV_ => LAB_): `40` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`40`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `40`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ HSV_ => LAB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
