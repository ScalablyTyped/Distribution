package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.APPLE_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `140` extends StObject {
  
  def raw(from: ANSI16_): APPLE_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI16_, APPLE_]
}
object `140` {
  
  inline def apply(raw: /* from */ ANSI16_ => APPLE_): `140` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`140`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `140`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ ANSI16_ => APPLE_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
