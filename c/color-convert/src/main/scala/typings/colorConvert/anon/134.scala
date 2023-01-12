package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.KEYWORD_
import typings.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `134` extends StObject {
  
  def raw(from: KEYWORD_): LCH_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ KEYWORD_, LCH_]
}
object `134` {
  
  inline def apply(raw: /* from */ KEYWORD_ => LCH_): `134` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`134`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `134`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ KEYWORD_ => LCH_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
