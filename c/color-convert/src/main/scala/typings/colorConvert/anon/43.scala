package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HWB_
import typings.colorConvert.conversionsMod.KEYWORD_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `43` extends StObject {
  
  def raw(from: HWB_): KEYWORD_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HWB_, KEYWORD_]
}
object `43` {
  
  inline def apply(raw: /* from */ HWB_ => KEYWORD_): `43` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`43`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `43`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ HWB_ => KEYWORD_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
