package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.APPLE_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `154` extends StObject {
  
  def raw(from: ANSI256_): APPLE_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI256_, APPLE_]
}
object `154` {
  
  inline def apply(raw: /* from */ ANSI256_ => APPLE_): `154` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`154`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `154`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ ANSI256_ => APPLE_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
