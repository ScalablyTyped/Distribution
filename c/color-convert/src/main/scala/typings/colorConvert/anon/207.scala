package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.GRAY_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `207` extends StObject {
  
  def raw(from: GRAY_): ANSI16_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ GRAY_, ANSI16_]
}
object `207` {
  
  inline def apply(raw: /* from */ GRAY_ => ANSI16_): `207` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`207`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `207`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ GRAY_ => ANSI16_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
