package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.KEYWORD_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `126` extends StObject {
  
  def raw(from: KEYWORD_): APPLE_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ KEYWORD_, APPLE_]
}
object `126` {
  
  inline def apply(raw: /* from */ KEYWORD_ => APPLE_): `126` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`126`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `126`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ KEYWORD_ => APPLE_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
